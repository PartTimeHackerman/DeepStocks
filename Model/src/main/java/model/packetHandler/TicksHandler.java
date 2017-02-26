package model.packetHandler;

import model.binaryAPI.commands.ticks.TicksReceive;
import model.connection.Packet;
import model.data.Stock;
import model.data.StockProvider;
import rx.functions.Func1;

import java.util.List;


public class TicksHandler implements PacketHandler {
	
	private List<Stock> stocks;
	
	public TicksHandler(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	@Override
	public void handle(Packet packet) {
		TicksReceive ticksReceive = (TicksReceive) packet.getReceiver();
		Stock stock = getStock(ticksReceive.getTick().getSymbol());
		if (stock == null) return;
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return m -> m.getReceiver()
				.getClass()
				.equals(TicksReceive.class);
	}
	
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
	}
	
	//TODO
	private void updateStock(Packet message) {
		Integer hash = (Integer) message.getOptional();
		Stock stock = stocks.stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
		if (stock == null)
			return;
		
		((TicksReceive) message.getReceiver()).getTick();
		
	}
}
