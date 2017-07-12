package model.data;

import model.dao.CandleDAO;
import model.dao.StockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class StockRepo {
	private final StockDAO stockDAO;
	private final CandleDAO candleDAO;
	private final List<Stock> stocks = new ArrayList<>();
	
	@Autowired
	public StockRepo(StockDAO stockDAO, CandleDAO candleDAO) {
		this.stockDAO = stockDAO;
		this.candleDAO = candleDAO;
	}
	
	public void findAll() {
		stockDAO.findAll().forEach(stock ->
								   {
									   stock.setCandleDAO(candleDAO);
									   stocks.add(stock);
								   });
	}
	
	public List<Stock> getStocks() {
		if (stocks.isEmpty())
			findAll();
		return stocks;
	}
	
	public void save(Stock stock) {
		stocks.add(stock);
		stockDAO.save(stock);
	}
	
	public Optional<Stock> findBySymbol(String symbol) {
		return stocks.stream()
				.map(Stock::getSymbols)
				.flatMap(Collection::stream)
				.filter(s -> s.getSymbol().equals(symbol))
				.map(Symbol::getStock)
				.findFirst();
	}
}
