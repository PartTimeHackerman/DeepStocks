package model.dataUpdater;

import model.binaryAPI.commands.active_symbols.ActiveSymbolsSend;
import model.connection.Packet;
import model.connection.PacketSender;
import model.data.BinaryData;
import model.data.Stock;
import model.data.StockProvider;
import model.data.Symbol;
import model.factory.StockFactory;
import model.packetHandler.ActiveSymbolsHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class StocksUpdater implements IStockUpdater {
	
	private final PacketSender packetSender;
	
	private final StockFactory stockFactory;
	
	@Autowired
	public StocksUpdater(PacketSender packetSender, StockFactory stockFactory) {
		this.packetSender = packetSender;
		this.stockFactory = stockFactory;
	}
	
	@Override
	public void updateStock(Stock stock) {
		Collection<BinaryData> binaryDatas = getBinaryData();
		BinaryData binaryData = binaryDatas.stream()
				.filter(bd ->
								bd.getDisplayName().equals(stock.getName()))
				.findFirst()
				.orElse(null);
		
		if(binaryData != null)
			stock.setBinaryData(binaryData);
			
	}
	
	@Override
	public void updateStocks(Collection<Stock> stocks) {
		Collection<BinaryData> binaryDatas = getBinaryData();
		updateStocksBinaryData(stocks, binaryDatas);
	}
	
	private Collection<BinaryData> getBinaryData() {
		Packet packet = packetSender.sendAndGet(new Packet(new ActiveSymbolsSend()));
		ActiveSymbolsHandler activeSymbolsHandler = new ActiveSymbolsHandler();
		activeSymbolsHandler.handle(packet);
		return activeSymbolsHandler.getBinaryData();
	}
	
	private void updateStocksBinaryData(Collection<Stock> stocks, Collection<BinaryData> binaryDatas) {
		for (BinaryData binaryData : binaryDatas) {
			String name = binaryData.getDisplayName();
			Stock stock = stocks.stream()
					.filter(s ->
									s.getName().equals(name))
					.findFirst()
					.orElse(null);
			if(stock == null)
				stock = stockFactory.getByName(name);
			
			
			stock.setBinaryData(binaryData);
			
			Symbol symbol = new Symbol(StockProvider.BINARY, binaryData.getSymbol());
			if (!stock.getSymbols().contains(symbol)) {
				stock.addSymbol(symbol);
			}
			
			if (!stocks.contains(stock))
				stocks.add(stock);
			
		}
	}
	
}
