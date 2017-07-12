package model.connection.packetsService;

import model.connection.Packet;
import model.connection.PacketSender;
import model.utils.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PacketsTimeoutResender implements PacketsService {
	
	private final PacketSender packetSender;
	
	private final Map<Packet, Long> packetsTimestampMap = Collections.synchronizedMap(new WeakHashMap<>());
	private final Long resendMillis = 120000L;
	private final Vector<Packet> toResend = new Vector<>();
	private final AtomicInteger resent = new AtomicInteger(0);
	
	@Autowired
	public PacketsTimeoutResender(@Lazy PacketSender packetSender) {
		this.packetSender = packetSender;
		Interval.doEvery(5L, TimeUnit.SECONDS, this::resendIfNeeded);
		
		Vaer.get().group(getClass().getSimpleName()).variable("Waiting packets").setVariableGetter(packetsTimestampMap::size);
		Vaer.get().group(getClass().getSimpleName()).variable("Resent").setVariableGetter(resent::get);
	}
	
	public void addPacket(Packet packet) {
		packetsTimestampMap.put(packet, System.currentTimeMillis());
	}
	
	public synchronized boolean removePacket(Packet packet) {
		return packetsTimestampMap.remove(packet) != null;
	}
	
	private void resendIfNeeded() {
		toResend.clear();
		Long currentTimeMillis = System.currentTimeMillis();
		synchronized (packetsTimestampMap) {
			packetsTimestampMap.forEach((packet, time) -> {
				if (currentTimeMillis - time > resendMillis) {
					toResend.add(packet);
					resent.incrementAndGet();
				}
			});
		}
		toResend.forEach(packetSender::send);
	}
	
}
