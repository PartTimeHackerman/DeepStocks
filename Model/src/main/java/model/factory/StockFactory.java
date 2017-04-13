package model.factory;

import model.data.Stock;
import model.data.StockRepo;
import model.data.Symbol;
import model.jdbc.dao.CandleDAO;
import model.jdbc.dao.StockDAO;
import model.jdbc.dao.SymbolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockFactory {
	
	private final StockDAO stockDataDAO;
	
	private final SymbolDAO symbolDAO;
	
	private final StockRepo stockRepo;
	
	private final CandleDAO candleDAO;
	
	@Autowired
	public StockFactory(StockDAO stockDataDAO, SymbolDAO symbolDAO, StockRepo stockRepo, CandleDAO candleDAO) {
		this.stockDataDAO = stockDataDAO;
		this.symbolDAO = symbolDAO;
		this.stockRepo = stockRepo;
		this.candleDAO = candleDAO;
	}
	
	public Stock getByName(String name) {
		Stock stock = stockDataDAO.findByName(name);
		
		if (stock == null)
			stock = new Stock(name);
		
		stock.setCandleDAO(candleDAO);
		return stock;
	}
	
	public Stock getBySymbol(String symbolName){
		Symbol symbol = symbolDAO.findBySymbol(symbolName);
		
		if (symbol == null)
			return null;
		
		return symbol.getStock();
	}
}
