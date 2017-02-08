package jdbc.dao;

import data.StockData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface StockDataDAO extends CrudRepository<StockData, Integer> {
}
