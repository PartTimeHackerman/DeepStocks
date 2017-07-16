package model.connection.consumer.candlesConsumer;

import model.connection.consumer.Consumer;
import model.connection.packetHandler.TicksHistoryHandler;
import model.connection.websocketServer.STOMPStocksController;
import model.data.Candle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSocketCandlesUpdater implements Consumer<TicksHistoryHandler.StockCandlesWrapper> {
	
	private final STOMPStocksController stompStocksController;
	
	@Autowired
	public WebSocketCandlesUpdater(STOMPStocksController stompStocksController) {
		this.stompStocksController = stompStocksController;
	}
	
	@Override
	public void consume(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		List<Candle> candles = stockCandlesWrapper.getCandles();
		Candle lastCandle = candles.get(candles.size() - 1);
		stompStocksController.updateStockLastCandle(lastCandle);
	}
	
}
