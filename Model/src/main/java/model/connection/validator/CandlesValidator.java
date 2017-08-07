package model.connection.validator;

import model.binaryAPI.BinaryCandlesGather;
import model.dao.CandleDAO;
import model.data.*;
import model.utils.DigitsUtil;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

@Service
public class CandlesValidator {
	
	private final StockRepo stockRepo;
	private final CandleDAO candleDAO;
	private final BinaryCandlesGather binaryCandlesGather;
	private final StockTradingTimesRepo stockTradingTimesRepo;
	
	@Autowired
	public CandlesValidator(StockRepo stockRepo, CandleDAO candleDAO, BinaryCandlesGather binaryCandlesGather, StockTradingTimesRepo stockTradingTimesRepo) {
		this.stockRepo = stockRepo;
		this.candleDAO = candleDAO;
		this.binaryCandlesGather = binaryCandlesGather;
		this.stockTradingTimesRepo = stockTradingTimesRepo;
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
		List<StockTradingTimes> stockTradingTimes = stockTradingTimesRepo.getStockTradingTimesFrom(stock, date);
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
		
		openEpoch = DigitsUtil.removeLastNDigits(openEpoch, 3);
		closeEpoch = DigitsUtil.removeLastNDigits(closeEpoch, 3);
		
		List<Candle> candles = candleDAO.findByStockAndEpochBetween(stock, openEpoch, closeEpoch);
		
		HashMap<Long, Long> missedFromToPairs = new HashMap<>();
		
		
		Candle oldDummyCandle = new Candle();
		oldDummyCandle.setEpoch(openEpoch);
		Candle youngDummyCandle = new Candle();
		youngDummyCandle.setEpoch(closeEpoch);
		candles.add(0, oldDummyCandle);
		candles.add(youngDummyCandle);
		
		for (int i = 0; i < candles.size() - 1; i++) {
			Long oldCandleEpoch = candles.get(i).getEpoch();
			Long youngCandleEpoch = candles.get(i + 1).getEpoch();
			if (youngCandleEpoch - oldCandleEpoch > 60) {
				missedFromToPairs.put(oldCandleEpoch, youngCandleEpoch);
			}
		}
		
		missedFromToPairs.entrySet().parallelStream().forEach(pair -> {
			Long oldCandleEpochPlus = pair.getKey() + 60;
			Long youngCandleEpochMinus = pair.getValue() - 60;
			binaryCandlesGather.getCandles(stock, oldCandleEpochPlus, youngCandleEpochMinus);
		});
		
	}
}
