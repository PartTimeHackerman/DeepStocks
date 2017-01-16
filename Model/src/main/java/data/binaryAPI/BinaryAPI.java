package data.binaryAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import data.Message;
import data.Packet;
import data.packetHandlers.PacketManager;
import utils.MainLogger;

import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;

public class BinaryAPI {
	
	public final URI apiUri = URI.create("wss://ws.binaryws.com/websockets/v3");
	public WebsocketClientEndpoint clientEndPoint;
	
	public static final String token = "u1OU5yxB8W34Ime";
	
	private Gson gson = new Gson();
	//private Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
	
	private PacketManager packetManager;
	
	private AtomicInteger ids = new AtomicInteger(0);
	
	public BinaryAPI(PacketManager packetManager) {
		this.packetManager = packetManager;
		clientEndPoint = new WebsocketClientEndpoint(apiUri);
		clientEndPoint.addMessageHandler(this::onMessage);
	}
	
	public void onMessage(String json) {
		try {
			Integer id = getReceivedId(json);
			Packet packet = packetManager.getFiltered(m ->
																		  ((BinaryMessage)m.getSender()).getReqId().equals(id));
			packet.setReceiver(gson.fromJson(json, packet.getTo()));
			packetManager.addToDone(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void send(Packet packet) {
		Message message = packet.getSender();
		
		((BinaryMessage)message).setReqId(ids.getAndAdd(1));
		try {
			packet.setTo(gerReceiverClass(packet));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		String json = gson.toJson(message);
		packetManager.addToPending(packet);
		clientEndPoint.sendMessage(json);
	}
	
	public String toPrettyFormat(String jsonString) {
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonString).getAsJsonObject();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = gson.toJson(json);
		
		return prettyJson;
	}
	
	public Class gerReceiverClass(Packet packet) throws Exception {
		return Class.forName(
				packet.getSender()
						.getClass()
						.getName()
						.replace("Send", "Receive"));
	}
	
	private Integer getReceivedId (String json) throws Exception{
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
	
	private class Response {
		
		ResErr error;
		public int req_id;
		
		private class ResErr {
			public String code;
			public String message;
		}
	}
}
