package model.binaryAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.binaryAPI.commands.WebSocketManager;
import model.binaryAPI.commands.authorize.AuthorizeSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.packetHandler.BinaryPacketManager;
import model.connection.Message;
import model.connection.Packet;
import model.utils.MainLogger;

import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BinaryAPI {
	
	public final URI apiUri = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	
	private WebsocketClient client;
	
	private WebSocketManager webSocketManager;
	
	public static final String token = "QuZpbffDx7DUipF";
	
	private Gson gson;
	
	private final BinaryPacketManager packetManager;
	
	private AtomicInteger ids = new AtomicInteger(0);
	
	@Autowired
	public BinaryAPI(BinaryPacketManager packetManager, Gson gson) {
		this(packetManager, gson, null, null);
	}
	
	public BinaryAPI(BinaryPacketManager packetManager, Gson gson, String ip, String port) {
		this.packetManager = packetManager;
		this.gson = gson;
		client = ip == null ? new WebsocketClient(apiUri) : new WebsocketClient(apiUri, ip, port);
		webSocketManager = new WebSocketManager(client, new MinuteMessagesCounter(), ip == null ? WebSocketManager.Access.USER : WebSocketManager.Access.PROXY);
		client.addMessageHandler(this::onMessage);
		
		if(webSocketManager.getAccess() == WebSocketManager.Access.USER)
			send(new Packet(new AuthorizeSend(token, null, null, null)));
		
	}
	
	public void onMessage(String json) {
		try {
			Integer id = getReceivedId(json);
			Packet packet = packetManager.getFiltered(m ->
															  ((BinaryMessage) m.getSender()).getReqId().equals(id));
			packet.setReceiver(gson.fromJson(json, packet.getTo()));
			packetManager.addToDone(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void send(Packet packet) {
		Message message = packet.getSender();
		
		((BinaryMessage) message).setReqId(ids.getAndAdd(1));
		try {
			packet.setTo(getReceiverClass(packet));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		String json = gson.toJson(message);
		packetManager.addToPending(packet);
		client.sendMessage(json);
	}
	
	public String toPrettyFormat(String jsonString) {
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonString).getAsJsonObject();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = gson.toJson(json);
		
		return prettyJson;
	}
	
	public Class getReceiverClass(Packet packet) throws Exception {
		return Class.forName(
				packet.getSender()
						.getClass()
						.getName()
						.replace("Send", "Receive"));
	}
	
	private Integer getReceivedId(String json) throws Exception {
		Response response = gson.fromJson(json, Response.class);
		if (response.error != null) {
			MainLogger.log().error("Error: {}", response.error.code);
			switch (response.error.code) {
				case "AuthorizationRequired":
					throw new Exception("AuthorizationRequired");
			}
		}
		Integer id = response.req_id;
		return id;
	}
	
	public WebSocketManager getWebSocketManager() {
		return webSocketManager;
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
