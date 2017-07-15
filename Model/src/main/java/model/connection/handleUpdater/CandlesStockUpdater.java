package model.connection.handleUpdater;

import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Candle;
import model.data.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandlesStockUpdater implements HandleUpdater<TicksHistoryHandler.StockCandlesWrapper> {
	
	@Override
	public void update(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		List<Candle> candles = stockCandlesWrapper.getCandles();
		Stock stock = stockCandlesWrapper.getStock();
		
		candles.forEach(candle -> candle.setStock(stock));
		
		Candle lastFetchedCandle = candles.get(candles.size() - 1);
		Candle lastCandle = stock.getLastCandle();
		if(lastCandle == null || lastFetchedCandle.getEpoch() > lastCandle.getEpoch()){
			stock.setLastCandle(lastFetchedCandle);
		}
	}
}
