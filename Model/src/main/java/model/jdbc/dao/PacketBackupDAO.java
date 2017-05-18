package model.jdbc.dao;

import model.data.PacketBackup;
import org.springframework.data.repository.CrudRepository;

public interface PacketBackupDAO extends CrudRepository<PacketBackup, Long> {


}
