package model.packetHandler;

import model.connection.Packet;
import model.connection.ReceivedPacketsStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.utils.MainLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class PacketManager {
	
	//private List<Packet> doneMessages = new ArrayList<>();
	
	private List<Packet> pendingMessages = new ArrayList<>();
	
	private final ReceivedPacketsStream packetStream;
	
	@Autowired
	public PacketManager(ReceivedPacketsStream packetStream) {
		this.packetStream = packetStream;
	}
	
	public void addToPending(Packet packet) {
		MainLogger.log().info("Sending: {}", packet);
		//MainLogger.log().debug("Done: {}", doneMessages.size());
		MainLogger.log().debug("Pending: {}", pendingMessages.size());
		
		pendingMessages.add(packet);
	}
	
	public void addToDone(Packet packet) {
		MainLogger.log().info("Received: {}", packet);
		//MainLogger.log().debug("Done: {}", doneMessages.size());
		MainLogger.log().debug("Pending: {}", pendingMessages.size());
		
		//doneMessages.add(packet);
		pendingMessages.remove(packet);
		if (packet.isWait())
			notifyMessage(packet);
		else
			packetStream.submit(packet);
	}
	
	public Packet getFiltered(Predicate<Packet> predicate) {
		return pendingMessages.stream().filter(predicate).findFirst().orElse(null);
	}
	
	private void notifyMessage(Packet packet) {
		synchronized (packet) {
			packet.notify();
		}
	}
}
