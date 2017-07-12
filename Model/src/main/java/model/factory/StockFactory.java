package model.factory;

import model.data.Stock;
import model.data.StockRepo;
import model.data.Symbol;
import model.dao.CandleDAO;
import model.dao.StockDAO;
import model.dao.SymbolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockFactory {
	
	private final StockDAO stockDAO;
	private final StockRepo stockRepo;
	private final SymbolDAO symbolDAO;
	private final CandleDAO candleDAO;
	
	@Autowired
	public StockFactory(StockDAO stockDAO, StockRepo stockRepo, SymbolDAO symbolDAO, CandleDAO candleDAO) {
		this.stockDAO = stockDAO;
		this.stockRepo = stockRepo;
		this.symbolDAO = symbolDAO;
		this.candleDAO = candleDAO;
	}
	
	public Stock getByName(String name) {
		Stock stock = stockDAO.findByName(name);
		
		if (stock == null) {
			stock = new Stock(name);
			stockRepo.save(stock);
		}
		
		stock.setCandleDAO(candleDAO);
		return stock;
	}
	
	public Stock getBySymbol(String symbolName) {
		Symbol symbol = symbolDAO.findBySymbol(symbolName);
		
		if (symbol == null)
			return null;
		
		return symbol.getStock();
	}
}
