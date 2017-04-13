package model.binaryAPI;

import model.connection.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.utils.MainLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class BinaryPacketSender implements ProviderSender, ProviderReceiver {
	
	private final List<Packet> pendingMessages = new ArrayList<>();
	
	private final BinaryAPIFactory binaryAPIFactory;
	private final ReceivedPacketsStream packetStream;
	
	private final List<BinaryAPI> apis = new ArrayList<>();
	
	@Autowired
	public BinaryPacketSender(BinaryAPIFactory binaryAPIFactory, ReceivedPacketsStream packetStream) {
		this.binaryAPIFactory = binaryAPIFactory;
		this.packetStream = packetStream;
		//addAPI(binaryAPIFactory.createDirectApi());
	}
	
	@Override
	public void send(Packet packet) {
		ConnectionType connectionType = packet.getSender() instanceof UpdateMessage ? ConnectionType.PROXY : ConnectionType.DIRECT;
		BinaryAPI api = apis.stream()
				.filter(BinaryAPI::canSend)
				.filter(binaryAPI ->
								binaryAPI.getConnectionType() == connectionType)
				.findFirst()
				.orElseGet(() -> {
					BinaryAPI binaryAPI = binaryAPIFactory.createApiByConnectionType(connectionType);
					addAPI(binaryAPI);
					return binaryAPI;
				});
		
		api.send(packet);
	}
	
	public void addToPending(Packet packet) {
		pendingMessages.add(packet);
	}
	
	@Override
	public void receive(Packet packet) {
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
