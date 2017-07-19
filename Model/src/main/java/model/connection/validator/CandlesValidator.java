package model.connection.validator;

import model.binaryAPI.BinaryCandlesGather;
import model.dao.CandleDAO;
import model.dao.StockTradingTimesDAO;
import model.data.Candle;
import model.data.Stock;
import model.data.StockRepo;
import model.data.StockTradingTimes;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

@Service
public class CandlesValidator {
	
	private final StockRepo stockRepo;
	private final StockTradingTimesDAO stockTradingTimesDAO;
	private final CandleDAO candleDAO;
	private final BinaryCandlesGather binaryCandlesGather;
	
	@Autowired
	public CandlesValidator(StockRepo stockRepo, StockTradingTimesDAO stockTradingTimesDAO, CandleDAO candleDAO, BinaryCandlesGather binaryCandlesGather) {
		this.stockRepo = stockRepo;
		this.stockTradingTimesDAO = stockTradingTimesDAO;
		this.candleDAO = candleDAO;
		this.binaryCandlesGather = binaryCandlesGather;
	}
	
	public void validateAllStocks() {
		List<Stock> stocks = stockRepo.getStocks();
		stocks.forEach(this::validateStock);
	}
	
	public void validateStock(Stock stock) {
		Calendar date = Calendar.getInstance();
		date.setTimeInMillis(0L);
		validateStockFrom(stock, date);
	}
	
	public void validateStockFrom(Stock stock, Calendar date) {
		Long calendarEpoch = date.getTimeInMillis();
		List<StockTradingTimes> stockTradingTimes = stockTradingTimesDAO.findByStockAndDayEpochIsGreaterThan(stock, calendarEpoch);
		stockTradingTimes.parallelStream().forEach(this::validateDay);
	}
	
	public void validateDay(StockTradingTimes stockTradingTimes) {
		Stock stock = stockTradingTimes.getStock();
		if (stockTradingTimes.getOpenEpoch() == 0 && stockTradingTimes.getCloseEpoch() == 0) {
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(stockTradingTimes.getDayEpoch());
			MainLogger.log(this).info("Stock {} was closed on {}", stock, date);
			return;
		}
		
		Long openEpoch = stockTradingTimes.getOpenEpoch();
		Long closeEpoch = stockTradingTimes.getCloseEpoch();
		
		List<Candle> candles = candleDAO.findByStockAndEpochBetween(stock, openEpoch, closeEpoch);
		
		HashMap<Long, Long> missedFromToPairs = new HashMap<>();
		
		for (int i = 0; i < candles.size(); i++) {
			Long oldCandleEpoch = candles.get(i).getEpoch();
			Long youngCandleEpoch = candles.get(i + 1).getEpoch();
			if (youngCandleEpoch - oldCandleEpoch > 60) {
				missedFromToPairs.put(oldCandleEpoch, youngCandleEpoch);
			}
		}
		
		missedFromToPairs.entrySet().parallelStream().forEach(pair -> {
			Long oldCandleEpoch = pair.getKey() + 60;
			Long youngCandleEpoch = pair.getKey() - 60;
			binaryCandlesGather.getCandles(stock, oldCandleEpoch, youngCandleEpoch);
		});
		
		
	}
}
