package model.connection.packetHandler;

import model.connection.Packet;

import java.util.function.Predicate;

public interface PacketHandler {
	
	void handle(Packet packet);
	
	default Predicate<Packet> getFilter() {
		return p -> true;
	}
	
	default Predicate<Packet> filterByClass(Class clazz) {
		return p -> p.getReceiver()
				.getClass()
				.equals(clazz)
				&& p.getException() == null;
	}
}
