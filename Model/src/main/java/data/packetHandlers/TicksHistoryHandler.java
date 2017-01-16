package data.packetHandlers;

import data.Packet;
import data.StockData;
import data.binaryAPI.commands.ticks_history.Candle;
import data.binaryAPI.commands.ticks_history.TicksHistoryReceive;
import rx.functions.Func1;

import java.util.List;

public class TicksHistoryHandler implements PacketHandler {
	
	private List<StockData> stocks;
	
	public TicksHistoryHandler(List<StockData> stocks) {
		this.stocks = stocks;
	}
	
	@Override
	public void handle(Packet packet) {
		TicksHistoryReceive ticksReceive = (TicksHistoryReceive) packet.getReceiver();
		StockData stock = getStock((Integer) packet.getOptional());
		if (stock == null) return;
		
		List<Candle> candles = ticksReceive.getCandles();
		synchronized (stock) {
			candles.forEach(c ->
									stock.getStockCandles().put(c.getEpoch(), c));
		}
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return filterByClass(TicksHistoryReceive.class);
	}
	
	private StockData getStock(Integer hash) {
		return stocks.stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
	}
}
