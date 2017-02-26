package model.jdbc.dao;

import model.data.BinaryData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BinaryDataDAO extends CrudRepository<BinaryData, Long>{
}
