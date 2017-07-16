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
import model.utils.MainLogger;
import vaer.Vaer;
import vaer.model.Group;

import java.util.Optional;

public class BinaryAPI implements ProviderAPI {
	public static final Integer maxMessages = 200;
	public static final Integer timeLimit = 61 * 1000;
	private static final Gson gson = GsonService.getGson();
	private final SentPacketsContainer sentPacketsContainer;
	private final ProviderReceiver receiver;
	private final ConnectionType connectionType;
	private final WebsocketClient websocketClient;
	private final IMessagesCounter messageCounter;
	
	public BinaryAPI(ProviderReceiver binaryPacketSender, WebsocketClient websocketClient, SentPacketsContainer sentPacketsContainer) {
		this(binaryPacketSender, websocketClient, ConnectionType.DIRECT, sentPacketsContainer);
	}
	
	public BinaryAPI(ProviderReceiver receiver, WebsocketClient websocketClient, ConnectionType connectionType, SentPacketsContainer sentPacketsContainer) {
		this.receiver = receiver;
		this.connectionType = connectionType;
		this.websocketClient = websocketClient;
		this.sentPacketsContainer = sentPacketsContainer;
		this.websocketClient.addMessageHandler(this::onMessage);
		messageCounter = new MessagesCounter(maxMessages, timeLimit);
		
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
		Response response;
		try {
			response = gson.fromJson(json, Response.class);
		} catch (Exception e) {
			MainLogger.log(this).fatal(e);
			return;
		}
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
	
	public IMessagesCounter getMessageCounter() {
		return messageCounter;
	}
	
	private class Response {
		public int req_id;
		ResErr error;
		
		private class ResErr {
			public String code;
			public String message;
		}
	}
}
