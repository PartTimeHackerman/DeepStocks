package model.dao;

import model.data.StockTradingTimes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockTradingTimesDAO extends CrudRepository<StockTradingTimes, StockTradingTimes.StockTradingTimesPK> {
}
