package model.binaryAPI;

import model.connection.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.utils.MainLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class BinaryPacketSender implements IProviderSender {
	
	private final List<Packet> pendingMessages = new ArrayList<>();
	
	private final ReceivedPacketsStream packetStream;
	
	private final List<BinaryAPI> apis = new ArrayList<>();
	
	@Autowired
	public BinaryPacketSender(ReceivedPacketsStream packetStream) {
		this.packetStream = packetStream;
		addAPI(new BinaryAPI());
	}
	
	@Override
	public void send(Packet packet) {
		BinaryAPI api = apis.stream()
				.filter(BinaryAPI::canSend)
				.filter(binaryAPI ->
								packet.getSender() instanceof UpdateMessage
										? binaryAPI.getConnectionType() == ConnectionType.PROXY
										: binaryAPI.getConnectionType() == ConnectionType.DIRECT)
				.findFirst()
				.orElseGet(() -> {
					BinaryAPI binaryAPI = new BinaryAPI(ConnectionType.PROXY);
					addAPI(binaryAPI);
					return binaryAPI;
				});
		
		api.send(packet);
		addToPending(packet);
	}
	
	private void addToPending(Packet packet) {
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
	
	public void addAPI(BinaryAPI api) {
		apis.add(api);
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
}
