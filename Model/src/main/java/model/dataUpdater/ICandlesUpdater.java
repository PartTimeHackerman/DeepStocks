package model.dataUpdater;

import model.data.Stock;

import java.util.Collection;

public interface ICandlesUpdater {
	
	void updateForStock(Stock stock);
	
	void updateForStocks(Collection<Stock> stocks);
	
}
