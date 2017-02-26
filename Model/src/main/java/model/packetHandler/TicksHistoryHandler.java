package model.packetHandler;

import model.data.Candle;
import model.binaryAPI.commands.ticks_history.TicksHistoryReceive;
import model.connection.Packet;
import model.data.Stock;
import rx.functions.Func1;

import java.util.Collection;
import java.util.List;

public class TicksHistoryHandler implements PacketHandler {
	
	private List<Stock> stocks;
	
	public TicksHistoryHandler(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	@Override
	public void handle(Packet packet) {
		List<Candle> candles = getCandles(packet);
		Stock stock = getStock((Integer) packet.getOptional());
		if (stock == null) return;
		
		synchronized (stock) {
			candles.forEach(stock::addCandle);
		}
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return filterByClass(TicksHistoryReceive.class);
	}
	
	private Stock getStock(Integer hash) {
		return stocks.stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
	}
	
	public List<Candle> getCandles(Packet packet) {
		TicksHistoryReceive ticksReceive = (TicksHistoryReceive) packet.getReceiver();
		return ticksReceive.getCandles();
	}
}
