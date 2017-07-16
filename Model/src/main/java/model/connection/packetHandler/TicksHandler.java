package model.connection.packetHandler;

import lombok.Data;
import model.binaryAPI.commands.ticks.TicksReceive;
import model.connection.Packet;
import model.connection.SimpleStream;
import model.data.Candle;
import model.data.Stock;
import model.data.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class TicksHandler extends SimpleStream<TicksHandler.StockCandleWrapper> implements PacketHandler {
	
	private final StockRepo stockRepo;
	
	@Autowired
	public TicksHandler(StockRepo stockRepo) {
		this.stockRepo = stockRepo;
	}
	
	@Override
	public void handle(Packet packet) {
		TicksReceive ticksReceive = (TicksReceive) packet.getReceiver();
		Stock stock = getStock((Integer) packet.getOptional());
		
		StockCandleWrapper stockCandleWrapper = new StockCandleWrapper(stock, ticksReceive.getCandle());
		submit(stockCandleWrapper);
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return m -> m.getReceiver()
				.getClass()
				.equals(TicksReceive.class);
	}
	
	private Stock getStock(Integer hash) {
		return stockRepo.getStocks().stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
	}
	
	/*
	private Stock getStock(String symbol) {
		return stocks.stream()
				.filter(s ->
								s.getSymbols().stream()
										.filter(s2 ->
														s2.getProvider() == StockProvider.BINARY)
										.findFirst()
										.get()
										.getSymbol()
										.equals(symbol))
				.findFirst()
				.orElse(null);
	}*/
	
	/*
	private void updateStock(Packet message) {
		Integer hash = (Integer) message.getOptional();
		Stock stock = stocks.stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
		if (stock == null)
			return;
		
		((TicksReceive) message.getReceiver()).getCandle();
		
	}*/
	
	@Data
	public final class StockCandleWrapper {
		
		private final Stock stock;
		private final Candle candles;
		
		public StockCandleWrapper(Stock stock, Candle candles) {
			this.stock = stock;
			this.candles = candles;
		}
		
	}
}
