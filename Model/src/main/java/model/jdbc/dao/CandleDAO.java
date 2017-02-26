package model.jdbc.dao;

import model.data.Candle;
import model.data.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CandleDAO extends CrudRepository<Candle, Candle.CandlePK> {
	
	Candle findTopByStockOrderByEpochDesc(Stock stock);
	
	List<Candle> findByStockAndEpochBetween(Stock stockId, Long epoch1, Long epoch2);
}
