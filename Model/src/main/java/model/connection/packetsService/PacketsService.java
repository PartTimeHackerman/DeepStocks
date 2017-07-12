package model.connection.packetsService;

import model.connection.Packet;

public interface PacketsService {
	
	void addPacket(Packet packet);
	
	boolean removePacket(Packet packet);
}
