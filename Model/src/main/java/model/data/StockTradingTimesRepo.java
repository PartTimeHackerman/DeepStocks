package model.data;

import model.binaryAPI.BinaryTradingTimesGather;
import model.dao.StockTradingTimesDAO;
import model.dataBaseUpdater.StockTradingTimesDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class StockTradingTimesRepo {
	
	private final StockTradingTimesDAO stockTradingTimesDAO;
	private final BinaryTradingTimesGather binaryTradingTimesGather;
	private final StockTradingTimesDBUpdater stockTradingTimesDBUpdater;
	
	@Autowired
	public StockTradingTimesRepo(StockTradingTimesDAO stockTradingTimesDAO, BinaryTradingTimesGather binaryTradingTimesGather, StockTradingTimesDBUpdater stockTradingTimesDBUpdater) {
		this.stockTradingTimesDAO = stockTradingTimesDAO;
		this.binaryTradingTimesGather = binaryTradingTimesGather;
		this.stockTradingTimesDBUpdater = stockTradingTimesDBUpdater;
	}
	
	public List<StockTradingTimes> getStockTradingTimesFrom(Stock stock, Calendar date) {
		StockTradingTimes lastStockTradingTimes = stockTradingTimesDAO.findTopByStockOrderByDayEpochDesc(stock);
		List<StockTradingTimes> oldStockTradingTimes = stockTradingTimesDAO.findByStockAndDayEpochIsGreaterThan(stock, date.getTimeInMillis());
		
		Long lastStockTradingTimesEpoch;
		if (lastStockTradingTimes != null)
			lastStockTradingTimesEpoch = lastStockTradingTimes.getDayEpoch();
		else
			lastStockTradingTimesEpoch = date.getTimeInMillis();
		
		Calendar lastStockTradingTimeDate = Calendar.getInstance();
		lastStockTradingTimeDate.setTimeInMillis(lastStockTradingTimesEpoch);
		lastStockTradingTimeDate.add(Calendar.DAY_OF_MONTH, 1);
		
		List<StockTradingTimes> newStockTradingTimes = new ArrayList<>();
		
		if (lastStockTradingTimeDate.getTimeInMillis() < System.currentTimeMillis()) {
			newStockTradingTimes.addAll(binaryTradingTimesGather.fetchAndGetTradingTimesFrom(lastStockTradingTimeDate));
			stockTradingTimesDAO.save(newStockTradingTimes);
			newStockTradingTimes.removeIf(stockTradingTimes -> !stockTradingTimes.getStock().equals(stock));
		}
		
		return Stream.concat(oldStockTradingTimes.stream(), newStockTradingTimes.stream()).collect(Collectors.toList());
	}
	
}
