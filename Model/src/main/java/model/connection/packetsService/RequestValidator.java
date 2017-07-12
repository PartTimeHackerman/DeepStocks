package model.connection.packetsService;

import model.connection.Packet;
import model.connection.PacketSender;
import model.data.PacketBackup;
import model.dao.PacketBackupDAO;
import model.utils.ShutdownHook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class RequestValidator implements PacketsService {
	
	private final PacketBackupDAO packetBackupDAO;
	private final List<Packet> backups = Collections.synchronizedList(new Vector<>());
	private final PacketSender packetSender;
	private Boolean resend = false;
	private final AtomicInteger resent = new AtomicInteger(0);
	
	@Autowired
	public RequestValidator(PacketBackupDAO packetBackupDAO, @Lazy PacketSender packetSender) {
		this.packetBackupDAO = packetBackupDAO;
		this.packetSender = packetSender;
		packetBackupDAO.findAll().forEach(backup -> backups.add(backup.getPacket()));
		ShutdownHook.add(this::persistBackups);
		
		Vaer.get().group(getClass().getSimpleName()).variable("Backups").setVariableGetter(backups::size);
		Vaer.get().group(getClass().getSimpleName()).variable("Resent").setVariableGetter(resent::get);
		
	}
	
	public void addPacket(Packet packet) {
		if (!backups.contains(packet))
			backups.add(packet);
	}
	
	public boolean removePacket(Packet packet) {
		if (packet.getException() == null)
			return backups.remove(packet);
		else if (resend) {
			packet.setException(null);
			resent.incrementAndGet();
			packetSender.send(packet);
			return false;
		} else
			return backups.remove(packet);
	}
	
	private void persistBackups() {
		List<PacketBackup> packetBackups = backups
				.stream()
				.map(PacketBackup::new)
				.collect(Collectors.toList());
		packetBackupDAO.save(packetBackups);
	}
	
	public List<Packet> getBackups() {
		return backups;
	}
	
	public void setResend(Boolean resend) {
		this.resend = resend;
	}
}
