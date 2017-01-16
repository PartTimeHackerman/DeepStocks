package data.packetHandlers;

import data.Packet;
import data.StockData;
import data.StockProvider;
import data.binaryAPI.commands.active_symbols.ActiveSymbol;
import data.binaryAPI.commands.active_symbols.ActiveSymbolsReceive;
import rx.functions.Func1;

import java.util.List;

public class ActiveSymbolsHandler implements PacketHandler {
	
	private List<StockData> stocks;
	
	public ActiveSymbolsHandler(List<StockData> stocks){
		this.stocks = stocks;
	}
	
	@Override
	public void handle(Packet packet) {
		ActiveSymbolsReceive activeSymbolsReceive = (ActiveSymbolsReceive) packet.getReceiver();
		addBinaryToStocks(activeSymbolsReceive.getActiveSymbols());
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return filterByClass(ActiveSymbolsReceive.class);
	}
	
	private void addBinaryToStocks(List<ActiveSymbol> binaryStocks) {
		for (ActiveSymbol binaryStock : binaryStocks) {
			String name = binaryStock.getDisplayName();
			StockData stockData = stocks.stream()
					.filter(s ->
									s.getName().equals(name))
					.findFirst()
					.orElse(new StockData(name));
			stockData.setBinaryData(binaryStock);
			
			if(!stockData.getSymbols().containsKey(StockProvider.BINARY))
				stockData.getSymbols().put(StockProvider.BINARY, binaryStock.getSymbol());
			
			if(!stocks.contains(stockData))
				stocks.add(stockData);
		}
	}
}
