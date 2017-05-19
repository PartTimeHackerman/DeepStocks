package model.connection.packetHandler;

import lombok.Data;
import model.connection.validation.RequestValidator;
import model.connection.SimpleStream;
import model.data.Candle;
import model.binaryAPI.commands.ticks_history.TicksHistoryReceive;
import model.connection.Packet;
import model.data.Stock;
import model.data.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TicksHistoryHandler extends SimpleStream<TicksHistoryHandler.StockCandlesWrapper> implements PacketHandler {
	
	private final StockRepo stockRepo;
	private final RequestValidator requestValidator;
	//private final Flowable<Candle> flowable;
	
	@Autowired
	public TicksHistoryHandler(StockRepo stockRepo, RequestValidator requestValidator) {
		this.stockRepo = stockRepo;
		this.requestValidator = requestValidator;
	}
	
	@Override
	public void handle(Packet packet) {
		Stock stock = getStock((Integer) packet.getOptional());
		List<Candle> candles = getCandles(packet);
		validateResponse(stock, candles);
		
		StockCandlesWrapper stockCandlesWrapper = new StockCandlesWrapper(stock, candles);
		submit(stockCandlesWrapper);
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(TicksHistoryReceive.class);
	}
	
	private Stock getStock(Integer hash) {
		return stockRepo.getStocks().stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
	}
	
	public List<Candle> getCandles(Packet packet) {
		TicksHistoryReceive ticksReceive = (TicksHistoryReceive) packet.getReceiver();
		return ticksReceive.getCandles();
	}
	
	private void validateResponse(Stock stock, Collection<Candle> candles) {
		if (candles.isEmpty())
			return;
		Long epochFrom = candles.stream().map(Candle::getEpoch).min(Comparator.comparingLong(v -> v)).get();
		Long epochTo = candles.stream().map(Candle::getEpoch).max(Comparator.comparingLong(v -> v)).get();
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
