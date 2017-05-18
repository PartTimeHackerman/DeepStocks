package model.binaryAPI;

import model.connection.*;
import model.utils.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import model.utils.MainLogger;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

@Service
public class BinaryPacketsService implements ProviderSender, ProviderReceiver {
	
	private final ReceivedPacketsStream packetStream;
	private final BinaryAPIProvider binaryAPIProvider;
	
	private final List<Packet> pendingMessages = new Vector<>();
	
	private final ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
	private final AtomicLong executorQueueSize = new AtomicLong(0);
	
	@Autowired
	public BinaryPacketsService(ReceivedPacketsStream packetStream, BinaryAPIProvider binaryAPIProvider) {
		this.packetStream = packetStream;
		this.binaryAPIProvider = binaryAPIProvider;
		
		Vaer.get().group(getClass().getSimpleName()).variable("Messages to send").setVariableGetter(executorQueueSize::get);
		Vaer.get().group(getClass().getSimpleName()).variable("Messages to receive").setVariableGetter(pendingMessages::size);
	}
	
	@Override
	public void send(Packet packet) {
		executorQueueSize.incrementAndGet();
		//MainLogger.log(this).info("!!!!!!!!Sent packet!!!!!!!");
		threadExecutor.submit(() -> {
			sendByApi(packet);
			executorQueueSize.decrementAndGet();
		});
	}
	
	private void sendByApi(Packet packet) {
		ConnectionType connectionType = packet.getSender() instanceof UpdateMessage ? ConnectionType.PROXY : ConnectionType.DIRECT;
		BinaryAPI binaryAPI = binaryAPIProvider.getApiByType(connectionType);
		binaryAPI.send(packet);
	}
	
	
	void addToPending(Packet packet) {
		pendingMessages.add(packet);
	}
	
	@Override
	public void receive(Packet packet) {
		//MainLogger.log(this).info("Received: {}", packet.getReceiver().getClass());
		pendingMessages.remove(packet);
		if (packet.isWait())
			notifyMessage(packet);
		else
			packetStream.receive(packet);
	}
	
	
	Packet getFiltered(Predicate<Packet> predicate) {
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
	
	
	public List<Packet> getPendingMessages() {
		return pendingMessages;
	}
}
