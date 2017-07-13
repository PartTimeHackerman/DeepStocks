package model.connection.handleUpdater;

import model.data.*;
import model.factory.StockFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StocksBinaryDataUpdater implements HandleUpdater<Collection<BinaryData>> {
	
	private final StockFactory stockFactory;
	private final StockRepo stockRepo;
	
	@Autowired
	public StocksBinaryDataUpdater(StockFactory stockFactory, StockRepo stockRepo) {
		this.stockFactory = stockFactory;
		this.stockRepo = stockRepo;
	}
	
	@Override
	public void update(Collection<BinaryData> binaryData) {
		List<Stock> stocks = stockRepo.getStocks();
		updateStocksBinaryData(stocks, binaryData);
	}
	
	private void updateStocksBinaryData(Collection<Stock> stocks, Collection<BinaryData> binaryDatas) {
		for (BinaryData binaryData : binaryDatas) {
			String name = binaryData.getDisplayName();
			Stock stock = getStockByName(stocks, name);
			stock.setBinaryData(binaryData);
			addSymbolToStockIfNeeded(stock, binaryData);
			addNewStockToExistingCollesctionIfNeeded(stock, stocks);
		}
	}
	
	private Stock getStockByName(Collection<Stock> stocks, String name) {
		return stocks.stream()
				.filter(s ->
								s.getName().equals(name))
				.findFirst()
				.orElse(getNewStockByName(name));
	}
	
	private Stock getNewStockByName(String name) {
		return stockFactory.getByName(name);
	}
	
	private void addSymbolToStockIfNeeded(Stock stock, BinaryData binaryData) {
		Symbol symbol = new Symbol(StockProvider.BINARY, binaryData.getSymbol());
		if (!stock.getSymbols().contains(symbol)) {
			stock.addSymbol(symbol);
		}
	}
	
	private void addNewStockToExistingCollesctionIfNeeded(Stock stock, Collection<Stock> stocks) {
		if (!stocks.contains(stock))
			stocks.add(stock);
	}
	
}
