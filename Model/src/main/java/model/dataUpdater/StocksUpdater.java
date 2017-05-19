package model.dataUpdater;

import model.binaryAPI.commands.active_symbols.ActiveSymbolsSend;
import model.connection.Packet;
import model.connection.PacketSender;
import model.data.BinaryData;
import model.data.Stock;
import model.data.StockProvider;
import model.data.Symbol;
import model.factory.StockFactory;
import model.connection.packetHandler.ActiveSymbolsHandler;
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
	
	/* Update only provided stock binary data*/
	@Override
	public void updateStock(Stock stock) {
		Collection<BinaryData> binaryDatas = fetchBinaryDatas();
		BinaryData binaryData = binaryDatas.stream()
				.filter(bd ->
								bd.getDisplayName().equals(stock.getName()))
				.findFirst()
				.orElse(null);
		
		if (binaryData != null)
			stock.setBinaryData(binaryData);
		
	}
	
	@Override
	public void updateStocks(Collection<Stock> stocks) {
		Collection<BinaryData> binaryDatas = fetchBinaryDatas();
		updateStocksBinaryData(stocks, binaryDatas);
	}
	
	/*Fetch all binary datas from binary ws*/
	private Collection<BinaryData> fetchBinaryDatas() {
		Packet packet = packetSender.sendAndGet(new Packet(new ActiveSymbolsSend()));
		ActiveSymbolsHandler activeSymbolsHandler = new ActiveSymbolsHandler();
		activeSymbolsHandler.handle(packet);
		return activeSymbolsHandler.getBinaryData();
	}
	
	/* Update all stocks binary datas, if stock doesn't exists get new one from stock factory */
	private void updateStocksBinaryData(Collection<Stock> stocks, Collection<BinaryData> binaryDatas) {
		for (BinaryData binaryData : binaryDatas) {
			String name = binaryData.getDisplayName();
			Stock stock = stocks.stream()
					.filter(s ->
									s.getName().equals(name))
					.findFirst()
					.orElse(null);
			
			if (stock == null)
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
