package model.connection.consumer.tradingTimesConsumer;

import model.binaryAPI.commands.trading_times.TradingTimes;
import model.connection.consumer.Consumer;
import model.dataBaseUpdater.StockTradingTimesDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradingTimesDBConsumer implements Consumer<TradingTimes> {
	
	private final StockTradingTimesDBUpdater stockTradingTimesDBUpdater;
	
	@Autowired
	public TradingTimesDBConsumer(StockTradingTimesDBUpdater stockTradingTimesDBUpdater) {
		this.stockTradingTimesDBUpdater = stockTradingTimesDBUpdater;
	}
	
	@Override
	public void consume(TradingTimes tradingTimes) {
		stockTradingTimesDBUpdater.update(tradingTimes);
	}
	
}
