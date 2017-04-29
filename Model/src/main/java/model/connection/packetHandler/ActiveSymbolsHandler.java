package model.connection.packetHandler;

import model.connection.SimpleStream;
import model.data.BinaryData;
import model.binaryAPI.commands.active_symbols.ActiveSymbolsReceive;
import model.connection.Packet;

import java.util.List;
import java.util.function.Predicate;

public class ActiveSymbolsHandler extends SimpleStream<List<BinaryData>> implements PacketHandler {
	
	private List<BinaryData> binaryData;
	
	public ActiveSymbolsHandler(){
		super();
	}
	
	@Override
	public void handle(Packet packet) {
		ActiveSymbolsReceive activeSymbolsReceive = (ActiveSymbolsReceive) packet.getReceiver();
		binaryData = activeSymbolsReceive.getActiveSymbols();
		submit(binaryData);
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(ActiveSymbolsReceive.class);
	}
	
	/*
	private void addBinaryToStocks(List<BinaryData> binaryStocks) {
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
