package model.binaryAPI;

import model.connection.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinaryPacketsService implements ProviderSender, ProviderReceiver {
	
	private final ReceivedPacketsStream packetStream;
	private final BinaryAPIProvider binaryAPIProvider;
	
	@Autowired
	public BinaryPacketsService(ReceivedPacketsStream packetStream, BinaryAPIProvider binaryAPIProvider) {
		this.packetStream = packetStream;
		this.binaryAPIProvider = binaryAPIProvider;
	}
	
	@Override
	public void send(Packet packet) {
		sendByApi(packet);
	}
	
	private void sendByApi(Packet packet) {
		ConnectionType connectionType = packet.getSender() instanceof UpdateMessage ? ConnectionType.PROXY : ConnectionType.DIRECT;
		BinaryAPI binaryAPI = binaryAPIProvider.getApiByType(connectionType);
		binaryAPI.send(packet);
	}
	
	@Override
	public void receive(Packet packet) {
		packetStream.receive(packet);
	}
}
