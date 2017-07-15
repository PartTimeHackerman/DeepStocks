package model.connection;

import model.binaryAPI.BinaryMessage;
import model.connection.packetsService.PacketsService;
import model.data.StockProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vaer.Vaer;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class PacketSender {
	
	private final ProviderSender binaryPacketSender;
	
	private final ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
	private final AtomicLong sendQueueSize = new AtomicLong(0);
	
	private final PacketsService requestValidator;
	private final PacketsService packetsTimeoutResender;
	private final PacketsService sentPacketsContainer;
	
	@Autowired
	public PacketSender(ProviderSender binaryPacketSender, PacketsService requestValidator, PacketsService packetsTimeoutResender, PacketsService sentPacketsContainer) {
		this.binaryPacketSender = binaryPacketSender;
		this.requestValidator = requestValidator;
		this.packetsTimeoutResender = packetsTimeoutResender;
		this.sentPacketsContainer = sentPacketsContainer;
		
		Vaer.get().group(getClass().getSimpleName()).variable("Messages to send").setVariableGetter(sendQueueSize::get);
	}
	
	public void send(Message message) {
		send(new Packet(message));
	}
	
	public void send(Packet packet) {
		StockProvider provider = getProvider(packet);
		if (provider == null)
			return;
		
		sendQueueSize.incrementAndGet();
		threadExecutor.submit(() -> {
			addToServices(packet);
			sendByProvider(packet, provider);
			sendQueueSize.decrementAndGet();
		});
	}
	
	public Packet sendAndGet(Message message) {
		return sendAndGet(new Packet(message));
	}
	
	public Packet sendAndGet(Packet packet) {
		packet.setWait(true);
		synchronized (packet) {
			try {
				send(packet);
				packet.wait();
				return packet;
			} catch (InterruptedException e) {
				System.out.println(e);
				return null;
			}
		}
	}
	
	private void addToServices(Packet packet){
		requestValidator.addPacket(packet);
		packetsTimeoutResender.addPacket(packet);
		sentPacketsContainer.addPacket(packet);
	}
	
	private void sendByProvider(Packet packet, StockProvider provider){
		switch (provider) {
			case BINARY:
				binaryPacketSender.send(packet);
				break;
		}
	}
	
	private StockProvider getProvider(Packet packet) {
		Message message = packet.getSender();
		if (message instanceof BinaryMessage)
			return StockProvider.BINARY;
		return null;
	}
}
