package model.connection.packetHandler;

import io.reactivex.subscribers.DisposableSubscriber;
import lombok.Data;
import model.connection.SimpleStream;
import model.data.Candle;
import model.binaryAPI.commands.ticks_history.TicksHistoryReceive;
import model.connection.Packet;
import model.data.Stock;
import model.data.StockRepo;
import model.utils.MainLogger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class TicksHistoryHandler extends SimpleStream<TicksHistoryHandler.StockCandlesWrapper> implements PacketHandler {
	
	private final StockRepo stockRepo;
	
	//private final Flowable<Candle> flowable;
	
	@Autowired
	public TicksHistoryHandler(StockRepo stockRepo) {
		this.stockRepo = stockRepo;
	}
	
	@Override
	public void handle(Packet packet) {
		List<Candle> candles = getCandles(packet);
		Stock stock = getStock((Integer) packet.getOptional());
		
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
	
	@Data
	public static final class StockCandlesWrapper{
		
		private final Stock stock;
		private final List<Candle> candles;
		
		public StockCandlesWrapper(Stock stock, List<Candle> candles){
			this.stock = stock;
			this.candles = candles;
		}
		
	}
}
