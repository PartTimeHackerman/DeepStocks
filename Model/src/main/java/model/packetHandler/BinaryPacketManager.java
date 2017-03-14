package model.packetHandler;

import com.google.gson.Gson;
import model.binaryAPI.BinaryAPI;
import model.binaryAPI.commands.WebSocketManager;
import model.connection.IPacketManager;
import model.connection.Packet;
import model.connection.ReceivedPacketsStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.utils.MainLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class BinaryPacketManager implements IPacketManager {
	
	private final List<Packet> pendingMessages = new ArrayList<>();
	
	private final ReceivedPacketsStream packetStream;
	
	private final List<BinaryAPI> apis = new ArrayList<>();
	
	@Autowired
	public BinaryPacketManager(ReceivedPacketsStream packetStream) {
		this.packetStream = packetStream;
		addAPI(new BinaryAPI(this, new Gson()));
	}
	
	public void addAPI(BinaryAPI api){
		apis.add(api);
	}
	
	public void addToPending(Packet packet) {
		MainLogger.log().info("Sending: {}", packet);
		//MainLogger.log().debug("Pending: {}", pendingMessages.size());
		
		pendingMessages.add(packet);
	}
	
	public void addToDone(Packet packet) {
		MainLogger.log().info("Received: {}", packet);
		
		pendingMessages.remove(packet);
		if (packet.isWait())
			notifyMessage(packet);
		else
			packetStream.submit(packet);
	}
	
	public Packet getFiltered(Predicate<Packet> predicate) {
		return pendingMessages.stream()
				.filter(predicate)
				.findFirst()
				.orElse(null);
	}
	
	private void notifyMessage(Packet packet) {
		synchronized (packet) {
			packet.notify();
		}
	}
	
	@Override
	public void send(Packet packet) {
		BinaryAPI api = apis.stream()
				.filter(binaryAPI ->
								binaryAPI.getWebSocketManager().canSend())
				.findFirst()
				.get();
		
		if (api == null) {
			try {
				Thread.sleep(1000);
				send(packet);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			api.send(packet);
		}
		
	}
}
