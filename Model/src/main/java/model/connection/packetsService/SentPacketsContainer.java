package model.connection.packetsService;

import model.binaryAPI.BinaryMessage;
import model.connection.Packet;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class SentPacketsContainer implements PacketsService {
	
	private final List<Packet> sentPackets = Collections.synchronizedList(new LinkedList<>());
	
	public SentPacketsContainer() {
		Vaer.get().group(getClass().getSimpleName()).variable("Packets to receive").setVariableGetter(sentPackets::size);
	}
	
	public void addPacket(Packet packet) {
		if (!sentPackets.contains(packet))
			sentPackets.add(packet);
	}
	
	public boolean removePacket(Packet packet) {
		return sentPackets.remove(packet);
	}
	
	public Optional<Packet> getByBinaryId(Integer id) {
		synchronized (sentPackets) {
			return sentPackets
					.stream()
					.filter(m -> ((BinaryMessage) m.getSender()).getReqId().equals(id))
					.findFirst();
		}
	}
	
}
