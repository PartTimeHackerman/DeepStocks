package data;

import data.binaryAPI.BinaryAPI;
import data.binaryAPI.BinaryMessage;
import data.binaryAPI.commands.authorize.AuthorizeSend;
import data.packetHandlers.PacketManager;

public class Request {
	
	private PacketStream packetStream;
	
	private PacketManager packetManager;
	
	private BinaryAPI api;
	
	public Request(PacketStream packetStream){
		this.packetStream = packetStream;
		packetManager = new PacketManager(packetStream);
		api = new BinaryAPI(packetManager);
		
		send(new Packet(new AuthorizeSend(BinaryAPI.token, null, null, null)));
	}
	
	public void send(Message message){
		send(new Packet(message));
	}
	
	public void send(Packet packet){
		StockProvider provider = getProvider(packet.getSender());
		
		switch (provider){
			case BINARY:
				api.send(packet);
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
