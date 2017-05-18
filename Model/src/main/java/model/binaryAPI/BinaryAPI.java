package model.binaryAPI;

import com.google.gson.Gson;
import model.connection.*;
import model.connection.websocket.WebsocketClient;
import model.exception.AuthorizationException;
import model.exception.InvalidSymbolException;
import model.exception.StreamingNotAllowedException;
import model.utils.GsonService;
import model.utils.MainLogger;
import vaer.Vaer;
import vaer.model.Group;

import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Optional;

public class BinaryAPI implements ProviderAPI {
	
	private static final URI websocketURI = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	private static final String userToken = "QuZpbffDx7DUipF";
	private static final Gson gson = GsonService.getGson();
	
	private BinaryPacketsService binaryPacketSender;
	
	private ConnectionType connectionType;
	private WebsocketClient websocketClient;
	private IMessagesCounter messageCounter;
	
	public BinaryAPI(BinaryPacketsService binaryPacketSender, WebsocketClient websocketClient) {
		this(binaryPacketSender, websocketClient, ConnectionType.DIRECT);
	}
	
	public BinaryAPI(@NotNull BinaryPacketsService binaryPacketSender, @NotNull WebsocketClient websocketClient, @NotNull ConnectionType connectionType) {
		this.binaryPacketSender = binaryPacketSender;
		this.connectionType = connectionType;
		this.websocketClient = websocketClient;
		this.websocketClient.addMessageHandler(this::onMessage);
		messageCounter = new MinuteMessagesCounter();
		
		Group apis = Vaer.get("Binary APIs").group(websocketClient.getProxy().toString());
		apis.variable("Messages remained").setVariableGetter(messageCounter::getRemaining);
		apis.variable("time elapsed").setVariableGetter(() -> ((MinuteMessagesCounter) messageCounter).elapsedTime);
		
		
		/*if(connectionType == ConnectionType.DIRECT)
			send(new Packet(new AuthorizeSend(userToken, null, null, null)));*/
	}
	
	public void send(Packet packet) {
		Message message = packet.getSender();
		((BinaryMessage) message).setReqId(IdGenerator.getIdInteger());
		
		try {
			packet.setToClass(getReceiverClass(packet));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		String json = gson.toJson(message);
		websocketClient.sendMessage(json);
		binaryPacketSender.addToPending(packet);
		messageCounter.send();
	}
	
	public Class getReceiverClass(Packet packet) throws Exception {
		return Class.forName(
				packet.getSender()
						.getClass()
						.getName()
						.replace("Send", "Receive"));
	}
	
	private void onMessage(String json) {
		Response response = gson.fromJson(json, Response.class);
		Integer id = response.req_id;
		Optional<Packet> optionalPacket;
		synchronized (binaryPacketSender.getPendingMessages()) {
			optionalPacket = binaryPacketSender
					.getPendingMessages()
					.stream()
					.filter(m ->
									m.getSender() instanceof BinaryMessage)
					.filter(m ->
									((BinaryMessage) m.getSender()).getReqId().equals(id))
					.findFirst();
		}
		if (optionalPacket.isPresent()) {
			Packet packet = optionalPacket.get();
			handleResponseError(packet, response);
			packet.setReceiver(gson.fromJson(json, packet.getToClass()));
			receive(packet);
		}
	}
	
	@Override
	public void receive(Packet packet) {
		binaryPacketSender.receive(packet);
	}
	
	private void handleResponseError(Packet packet, Response response) {
		if (response.error != null) {
			switch (response.error.code) {
				case "AuthorizationRequired":
					packet.setException(new AuthorizationException());
					break;
				case "StreamingNotAllowed":
					packet.setException(new StreamingNotAllowedException());
					break;
				case "InvalidSymbol":
					packet.setException(new InvalidSymbolException());
					break;
				default:
					MainLogger.log(this).error(response.error.code);
			}
		}
	}
	
	public boolean canSend() {
		return messageCounter.getRemaining() > 1;
	}
	
	public Boolean isConnected() {
		return websocketClient.isConnected();
	}
	
	public Boolean reconnect() {
		return websocketClient.reconnect();
	}
	
	public ConnectionType getConnectionType() {
		return connectionType;
	}
	
	private class Response {
		ResErr error;
		public int req_id;
		
		private class ResErr {
			public String code;
			public String message;
		}
	}
}
