package model.connection.packetHandler;

import lombok.Data;
import model.binaryAPI.commands.ticks_history.TicksHistoryReceive;
import model.connection.Packet;
import model.connection.SimpleStream;
import model.connection.handleUpdater.CandlesStockUpdater;
import model.data.Candle;
import model.data.Stock;
import model.data.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Service
public class TicksHistoryHandler extends SimpleStream<TicksHistoryHandler.StockCandlesWrapper> implements PacketHandler {
	
	private final StockRepo stockRepo;
	private final CandlesStockUpdater candlesStockUpdater;
	
	@Autowired
	public TicksHistoryHandler(StockRepo stockRepo, CandlesStockUpdater candlesStockUpdater) {
		this.stockRepo = stockRepo;
		this.candlesStockUpdater = candlesStockUpdater;
	}
	
	@Override
	public void handle(Packet packet) {
		Stock stock = getStock((Long) packet.getOptional());
		List<Candle> candles = getCandles(packet);
		//validateResponse(packet);
		if (candles.size() > 0) {
			StockCandlesWrapper stockCandlesWrapper = new StockCandlesWrapper(stock, candles);
			candlesStockUpdater.update(stockCandlesWrapper);
			submit(stockCandlesWrapper);
		}
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(TicksHistoryReceive.class);
	}
	
	private Stock getStock(Long hash) {
		return stockRepo.getStocks().stream()
				.filter(s ->
								Objects.equals(s.getId(), hash)).findFirst()
				.orElse(null);
	}
	
	public List<Candle> getCandles(Packet packet) {
		Stock stock = getStock((Long) packet.getOptional());
		TicksHistoryReceive ticksReceive = (TicksHistoryReceive) packet.getReceiver();
		List<Candle> candles = ticksReceive.getCandles();
		candles.forEach(candle -> candle.setStock(stock));
		return candles;
	}
	
	@Data
	public static final class StockCandlesWrapper {
		
		private final Stock stock;
		private final List<Candle> candles;
		
		public StockCandlesWrapper(Stock stock, List<Candle> candles) {
			this.stock = stock;
			this.candles = candles;
		}
		
	}
}
