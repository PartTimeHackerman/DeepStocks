package data.packetHandlers;

import data.Packet;
import data.StockData;
import data.StockProvider;
import data.binaryAPI.commands.ticks.TicksReceive;
import rx.functions.Func1;

import java.util.List;

public class TicksHandler implements PacketHandler {
	
	private List<StockData> stocks;
	
	public TicksHandler(List<StockData> stocks){
		this.stocks = stocks;
	}
	
	@Override
	public void handle(Packet packet) {
		TicksReceive ticksReceive = (TicksReceive) packet.getReceiver();
		StockData stock = getStock(ticksReceive.getTick().getSymbol());
		if(stock == null) return;
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return m -> m.getReceiver()
				.getClass()
				.equals(TicksReceive.class);
	}
	
	private StockData getStock(String symbol){
		return stocks.stream()
				.filter(s ->
								s.getSymbols().get(StockProvider.BINARY).equals(symbol))
				.findFirst()
				.orElse(null);
	}
	
	private void updateStock(Packet message){
		Integer hash = (Integer) message.getOptional();
		StockData stock = stocks.stream()
				.filter(s ->
								s.hashCode() == hash).findFirst()
				.orElse(null);
		if(stock == null)
			return;
		
		((TicksReceive)message.getReceiver()).getTick();
		
	}
}
