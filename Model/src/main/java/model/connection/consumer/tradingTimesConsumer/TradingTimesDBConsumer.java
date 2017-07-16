package model.connection.consumer.tradingTimesConsumer;

import model.binaryAPI.commands.trading_times.*;
import model.connection.consumer.Consumer;
import model.dao.StockTradingTimesDAO;
import model.data.Stock;
import model.data.StockRepo;
import model.data.StockTradingTimes;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;
import java.util.stream.Collectors;

@Service
public class TradingTimesDBConsumer implements Consumer<TradingTimes> {
	
	private final StockTradingTimesDAO stockTradingTimesDAO;
	private final StockRepo stockRepo;
	
	@Autowired
	public TradingTimesDBConsumer(StockTradingTimesDAO stockTradingTimesDAO, StockRepo stockRepo) {
		this.stockTradingTimesDAO = stockTradingTimesDAO;
		this.stockRepo = stockRepo;
	}
	
	@Override
	public void consume(TradingTimes tradingTimes) {
		Long dayEpoch = tradingTimes.getDate().getTime();
		
		List<TradingTimesSymbol> symbolTradingTimes = tradingTimes.getMarkets().stream()
				.map(Market::getSubMarkets)
				.flatMap(Collection::stream)
				.map(SubMarket::getSymbols)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		List<StockTradingTimes> stockTradingTimes = symbolTradingTimes.stream()
				.map(symboltimes -> getStockTradingTimes(dayEpoch, symboltimes))
				.collect(Collectors.toList());
		
		stockTradingTimesDAO.save(stockTradingTimes);
	}
	
	private Long getEpochFromDayEpochAndTime(Long dayEpoch, String timeString) {
		if (timeString.equals("--"))
			return 0L;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Long time;
		try {
			time = dateFormat.parse("1970-01-01 " + timeString).getTime();
		} catch (ParseException e) {
			MainLogger.log(this).fatal(e);
			return 0L;
		}
		return dayEpoch + time;
	}
	
	private StockTradingTimes getStockTradingTimes(Long dayEpoch, TradingTimesSymbol tradingTimesSymbol) {
		Stock stock;
		Optional<Stock> stockOptional = stockRepo.findBySymbol(tradingTimesSymbol.getSymbol());
		if (!stockOptional.isPresent()) {
			stock = new Stock(tradingTimesSymbol.getName());
			stockRepo.save(stock);
		} else {
			stock = stockOptional.get();
		}
		
		SymbolTradingTimes symbolTradingTimes = tradingTimesSymbol.getTimes();
		
		Long openEpoch = getEpochFromDayEpochAndTime(dayEpoch, symbolTradingTimes.getOpen().get(0));
		Long closeEpoch = getEpochFromDayEpochAndTime(dayEpoch, symbolTradingTimes.getClose().get(0));
		
		StockTradingTimes stockTradingTimes = new StockTradingTimes(stock, dayEpoch, openEpoch, closeEpoch);
		return stockTradingTimes;
	}
}
