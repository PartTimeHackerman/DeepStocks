package model.utils;

import model.data.Stock;
import model.data.StockProvider;

import java.util.Collection;

public class StockExcluder {
	
	public static void excludeVolatility(Collection<Stock> stocks) {
		stocks.stream()
				.filter(stock -> stock.getName().contains("Volatility"))
				.flatMap(stock -> stock.getSymbols().stream())
				.filter(symbol -> symbol.getProvider() == StockProvider.BINARY)
				.forEach(symbol -> symbol.setExcluded(true));
	}
}
