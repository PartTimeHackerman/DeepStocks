package data.packetHandlers;

import data.Packet;
import data.PacketStream;
import utils.MainLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PacketManager {
	
	//private List<Packet> doneMessages = new ArrayList<>();
	
	private List<Packet> pendingMessages = new ArrayList<>();
	
	private PacketStream packetStream;
	
	public PacketManager(PacketStream packetStream) {
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
