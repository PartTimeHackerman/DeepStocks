package model.dataUpdater;

import model.data.Stock;

import java.util.Collection;

public interface IStockUpdater {
	
	void updateStock(Stock stock);
	
	void updateStocks(Collection<Stock> stocks);
	
}
