package model.dao;

import model.data.Stock;
import model.data.StockTradingTimes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockTradingTimesDAO extends CrudRepository<StockTradingTimes, StockTradingTimes.StockTradingTimesPK> {
	
	List<StockTradingTimes> findByStock(Stock stock);
	
	List<StockTradingTimes> findByStockAndDayEpochIsGreaterThan(Stock stock, Long dayEpoch);
	
}
