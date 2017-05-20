package model.connection.validation;

import model.connection.Packet;
import model.data.PacketBackup;
import model.jdbc.dao.PacketBackupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RequestValidator {
	
	private final PacketBackupDAO packetBackupDAO;
	private final List<PacketBackup> backups = new Vector<>();
	
	@Autowired
	public RequestValidator(PacketBackupDAO packetBackupDAO) {
		this.packetBackupDAO = packetBackupDAO;
		packetBackupDAO.findAll().forEach(backups::add);
	}
	
	public synchronized void addToSent(Packet packet) {
		if (backups.stream()
				.noneMatch(packetBackup -> packet.hashCode() == packetBackup.getHash()))
			persist(packet);
	}
	
	public synchronized void setPacketReceived(Packet packet) {
		backups.stream()
				.filter(packetBackup ->
								packet.hashCode() == packetBackup.getHash())
				.findAny()
				.ifPresent(bckup -> {
					packetBackupDAO.delete(bckup);
					backups.remove(bckup);
				});
	}
	
	private PacketBackup persist(Packet packet) {
		PacketBackup backup = new PacketBackup(packet);
		backups.add(backup);
		packetBackupDAO.save(backup);
		return backup;
	}
	
}
