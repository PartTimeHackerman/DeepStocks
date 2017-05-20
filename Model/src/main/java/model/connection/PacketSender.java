package model.connection;

import model.binaryAPI.BinaryMessage;
import model.connection.validation.RequestValidator;
import model.data.StockProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacketSender {
	
	private final ProviderSender binaryPacketSender;
	private final RequestValidator requestValidator;
	
	@Autowired
	public PacketSender(ProviderSender binaryPacketSender, RequestValidator requestValidator) {
		this.binaryPacketSender = binaryPacketSender;
		this.requestValidator = requestValidator;
	}
	
	public void send(Message message) {
		send(new Packet(message));
	}
	
	public void send(Packet packet) {
		requestValidator.addToSent(packet);
		StockProvider provider = getProvider(packet);
		if (provider == null)
			return;
		switch (provider) {
			case BINARY:
				binaryPacketSender.send(packet);
		}
	}
	
	public Message sendAndGet(Message message) {
		return sendAndGet(new Packet(message)).getReceiver();
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
	
	private StockProvider getProvider(Packet packet) {
		Message message = packet.getSender();
		if (message instanceof BinaryMessage)
			return StockProvider.BINARY;
		return null;
	}
}
