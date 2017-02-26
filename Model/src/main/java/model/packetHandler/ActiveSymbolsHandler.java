package model.packetHandler;

import model.data.Symbol;
import model.data.BinaryData;
import model.binaryAPI.commands.active_symbols.ActiveSymbolsReceive;
import model.connection.Packet;
import model.data.Stock;
import model.data.StockProvider;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.List;

public class ActiveSymbolsHandler implements PacketHandler {
	
	private List<BinaryData> binaryData;
	
	public ActiveSymbolsHandler(){
	}
	
	@Override
	public void handle(Packet packet) {
		ActiveSymbolsReceive activeSymbolsReceive = (ActiveSymbolsReceive) packet.getReceiver();
		binaryData = activeSymbolsReceive.getActiveSymbols();
	}
	
	@Override
	public Func1<Packet, Boolean> getFilter() {
		return filterByClass(ActiveSymbolsReceive.class);
	}
	
	/*private void addBinaryToStocks(List<BinaryData> binaryStocks) {
		for (BinaryData binaryData : binaryStocks) {
			String name = binaryData.getDisplayName();
			Stock stock = stocks.stream()
					.filter(s ->
									s.getName().equals(name))
					.findFirst()
					.orElse(new Stock(name));
			stock.setBinaryData(binaryData);
			
			Symbol symbol = new Symbol(StockProvider.BINARY, binaryData.getSymbol());
			if(!stock.getSymbols().contains(symbol)){
				stock.addSymbol(symbol);}
			
			if(!stocks.contains(stock))
				stocks.add(stock);
		}
	}
	
	public List<Stock> getStocks() {
		return stocks;
	}
	*/
	public List<BinaryData> getBinaryData() {
		return binaryData;
	}
}
