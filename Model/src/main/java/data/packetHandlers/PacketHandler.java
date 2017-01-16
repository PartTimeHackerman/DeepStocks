package data.packetHandlers;

import data.Packet;
import rx.functions.Func1;

public interface PacketHandler {
	
	void handle(Packet t);
	
	Func1<Packet, Boolean> getFilter();
	
	default Func1<Packet, Boolean> filterByClass(Class clazz){
		return p -> p.getReceiver()
				.getClass()
				.equals(clazz);
	}
	
}
