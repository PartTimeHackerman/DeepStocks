package model;

import data.StockData;

import java.util.ArrayList;
import java.util.List;

public class StocksContainer {
	
	private List<StockData> stocks;
	
	public StocksContainer(){
		stocks = new ArrayList<>();
	}
	
	
	public List<StockData> getStocks() {
		return stocks;
	}
}
