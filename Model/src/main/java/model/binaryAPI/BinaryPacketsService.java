package model.binaryAPI;

import model.connection.*;
import model.utils.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import model.utils.MainLogger;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

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
