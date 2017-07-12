package model.binaryAPI;

import com.google.gson.Gson;
import model.connection.*;
import model.connection.packetsService.SentPacketsContainer;
import model.connection.websocketClient.WebsocketClient;
import model.exception.AuthorizationException;
import model.exception.InvalidSymbolException;
import model.exception.RateLimitException;
import model.exception.StreamingNotAllowedException;
import model.utils.GsonService;
import vaer.Vaer;
import vaer.model.Group;

import java.util.Optional;

public class BinaryAPI implements ProviderAPI {
	private static final Gson gson = GsonService.getGson();
	
	private ProviderReceiver receiver;
	
	private ConnectionType connectionType;
	private WebsocketClient websocketClient;
	private IMessagesCounter messageCounter;
	private final SentPacketsContainer sentPacketsContainer;
	
	public BinaryAPI(ProviderReceiver binaryPacketSender, WebsocketClient websocketClient, SentPacketsContainer sentPacketsContainer) {
		this(binaryPacketSender, websocketClient, ConnectionType.DIRECT, sentPacketsContainer);
	}
	
	public BinaryAPI(ProviderReceiver receiver, WebsocketClient websocketClient, ConnectionType connectionType, SentPacketsContainer sentPacketsContainer) {
		this.receiver = receiver;
		this.connectionType = connectionType;
		this.websocketClient = websocketClient;
		this.sentPacketsContainer = sentPacketsContainer;
		this.websocketClient.addMessageHandler(this::onMessage);
		messageCounter = new MinuteMessagesCounter();
		
		Group apis = Vaer.get("Binary APIs").group(websocketClient.getProxy().toString());
		apis.variable("Messages remained").setVariableGetter(messageCounter::getRemaining);
		apis.variable("Time elapsed").setVariableGetter(messageCounter::getElapsedTime);
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
		
		sentPacketsContainer.addPacket(packet);
		String json = gson.toJson(message);
		websocketClient.sendMessage(json);
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
		Optional<Packet> optionalPacket = sentPacketsContainer.getByBinaryId(id);
		if (optionalPacket.isPresent()) {
			Packet packet = optionalPacket.get();
			handleResponseError(packet, response);
			packet.setReceiver(gson.fromJson(json, packet.getToClass()));
			receive(packet);
		}
	}
	
	@Override
	public void receive(Packet packet) {
		receiver.receive(packet);
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
				case "RateLimit":
					packet.setException(new RateLimitException());
					break;
				default:
					packet.setException(new Exception(response.error.code));
			}
		}
	}
	
	public synchronized boolean canSend() {
		return messageCounter.getRemaining() > 0;
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
