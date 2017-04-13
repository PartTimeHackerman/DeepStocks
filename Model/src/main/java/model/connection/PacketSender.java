package model.connection;

import model.binaryAPI.BinaryMessage;
import model.data.StockProvider;
import org.springframework.stereotype.Component;

@Component
public class PacketSender {
	
	private ProviderSender binaryPacketSender;
	
	public PacketSender(ProviderSender binaryPacketSender){
		this.binaryPacketSender = binaryPacketSender;
	}
	
	public void send(Message message){
		send(new Packet(message));
	}
	
	public void send(Packet packet){
		StockProvider provider = getProvider(packet.getSender());
		
		switch (provider){
			case BINARY:
				 binaryPacketSender.send(packet);
		}
	}
	
	public Message sendAndGet(Message message){
		return sendAndGet(new Packet(message)).getReceiver();
	}
	
	public Packet sendAndGet(Packet packet){
		packet.setWait(true);
		synchronized (packet){
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
	
	private StockProvider getProvider(Message message){
		if(message instanceof BinaryMessage)
			return StockProvider.BINARY;
		return null;
	}
}
