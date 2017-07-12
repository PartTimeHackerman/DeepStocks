package model.connection.consumer.candlesConsumer;

import model.connection.consumer.Consumer;
import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Candle;
import model.dataBaseUpdater.CandlesDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandlesDBConsumer implements Consumer<TicksHistoryHandler.StockCandlesWrapper> {
	
	private final CandlesDBUpdater candlesUpdaterDB;
	@Autowired
	public CandlesDBConsumer(CandlesDBUpdater candlesUpdaterDB) {
		this.candlesUpdaterDB = candlesUpdaterDB;
	}
	
	@Override
	public void consume(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		List<Candle> candles = stockCandlesWrapper.getCandles();
		candlesUpdaterDB.update(candles);
	}
	
}
