package model.binaryAPI;

import model.connection.*;
import model.utils.Interval;
import model.utils.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import model.utils.MainLogger;
import org.springframework.stereotype.Service;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Service
public class BinaryPacketsService implements ProviderSender, ProviderReceiver {
	
	private final List<Packet> pendingMessages = new ArrayList<>();
	
	private final BinaryAPIFactory binaryAPIFactory;
	private final ReceivedPacketsStream packetStream;
	
	private final List<BinaryAPI> apis = new ArrayList<>();
	private final Integer maxApis = 100;
	
	private final ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
	private final AtomicLong executorQueueSize = new AtomicLong(0);
	
	@Autowired
	public BinaryPacketsService(BinaryAPIFactory binaryAPIFactory, ReceivedPacketsStream packetStream) {
		this.binaryAPIFactory = binaryAPIFactory;
		this.packetStream = packetStream;
		//addAPI(binaryAPIFactory.createDirectApi());
		Interval.doEvery(3L, TimeUnit.SECONDS, () ->
				MainLogger.log().debug("Packets queue executor queue size: {} \nApis: {}", executorQueueSize, apis.size()));
	}
	
	//TODO need something like packets queue and limited apis list
	@Override
	public void send(Packet packet) {
		executorQueueSize.incrementAndGet();
		threadExecutor.submit(() -> {
			sendByApi(packet);
			executorQueueSize.decrementAndGet();
		});
	}
	
	private void sendByApi(Packet packet) {
		ConnectionType connectionType = packet.getSender() instanceof UpdateMessage ? ConnectionType.PROXY : ConnectionType.DIRECT;
		getApiByType(connectionType).send(packet);
	}
	
	private BinaryAPI getApiByType(ConnectionType connectionType) {
		BinaryAPI api = apis.stream()
				.filter(BinaryAPI::canSend)
				.filter(binaryAPI ->
								binaryAPI.getConnectionType() == connectionType)
				.findFirst().orElse(null);
		
		if (api == null) {
			MainLogger.log().info("No api avaiable, creating new one");
			if (apis.size() >= maxApis) {
				Waiter.wait(500L, TimeUnit.MILLISECONDS);
				MainLogger.log().info("All apis are busy and apis list is full, waiting for a free one");
				api = getApiByType(connectionType);
			} else {
				try {
					api = binaryAPIFactory.createApiByConnectionType(connectionType);
					addAPI(api);
				} catch (IOException | DeploymentException e) {
					MainLogger.log().fatal("Can't create binary api, cause: {}", e);
					Waiter.wait(500L, TimeUnit.MILLISECONDS);
					api = getApiByType(connectionType);
				}
			}
		}
		return api;
	}
	
	void addToPending(Packet packet) {
		pendingMessages.add(packet);
	}
	
	@Override
	public void receive(Packet packet) {
		//MainLogger.log().info("Received: {}", packet.getReceiver().getClass());
		
		pendingMessages.remove(packet);
		if (packet.isWait())
			notifyMessage(packet);
		else
			packetStream.submit(packet);
	}
	
	private void addAPI(BinaryAPI api) {
		apis.add(api);
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
