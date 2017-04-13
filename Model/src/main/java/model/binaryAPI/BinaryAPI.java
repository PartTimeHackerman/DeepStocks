package model.binaryAPI;

import com.google.gson.Gson;
import model.connection.*;
import model.connection.websocket.WebsocketClient;
import model.utils.GsonService;
import model.utils.MainLogger;

import java.net.URI;

public class BinaryAPI implements ProviderAPI{
	
	private static final URI websocketURI = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	private static final String userToken = "QuZpbffDx7DUipF";
	private static final Gson gson = GsonService.getGson();
	
	private BinaryPacketSender binaryPacketSender;
	
	private ConnectionType connectionType;
	private WebsocketClient websocketClient;
	private IMessagesCounter messageCounter;
	
	public BinaryAPI(BinaryPacketSender binaryPacketSender, WebsocketClient websocketClient) {
		this(binaryPacketSender, websocketClient, ConnectionType.DIRECT);
	}
	
	public BinaryAPI(BinaryPacketSender binaryPacketSender, WebsocketClient websocketClient, ConnectionType connectionType) {
		this.binaryPacketSender = binaryPacketSender;
		this.connectionType = connectionType;
		this.websocketClient = websocketClient;
		websocketClient.addMessageHandler(this::onMessage);
		messageCounter = new MinuteMessagesCounter();
		
		
		/*if(connectionType == ConnectionType.DIRECT)
			send(new Packet(new AuthorizeSend(userToken, null, null, null)));*/
	}
	
	public void send(Packet packet) {
		Message message = packet.getSender();
		((BinaryMessage) message).setReqId(IdGenerator.getIdInteger());
		
		try {
			packet.setTo(getReceiverClass(packet));
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
		try {
			Integer id = getReceivedId(json);
			Packet packet = binaryPacketSender.getFiltered(m ->
															  ((BinaryMessage) m.getSender()).getReqId().equals(id));
			packet.setReceiver(gson.fromJson(json, packet.getTo()));
			receive(packet);
		} catch (Exception e) {
			MainLogger.log().error(e);
		}
	}
	
	@Override
	public void receive(Packet packet) {
		binaryPacketSender.receive(packet);
	}
	
	private Integer getReceivedId(String json) throws Exception {
		Response response = gson.fromJson(json, Response.class);
		if (response.error != null) {
			MainLogger.log().error("Error: {}", response.error.code);
			switch (response.error.code) {
				case "AuthorizationRequired":
					throw new Exception("Authorization required");
			}
		}
		return response.req_id;
	}
	
	public boolean canSend(){
		return messageCounter.getRemaining() > 1;
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
