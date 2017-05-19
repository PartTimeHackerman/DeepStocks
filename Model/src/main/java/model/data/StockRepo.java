package model.data;

import model.jdbc.dao.CandleDAO;
import model.jdbc.dao.StockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class StockRepo {
	
	private final StockDAO stockDataDAO;
	
	private final List<Stock> stocks = new ArrayList<>();
	
	private final CandleDAO candleDAO;
	
	@Autowired
	public StockRepo(StockDAO stockDataDAO, CandleDAO candleDAO) {
		this.stockDataDAO = stockDataDAO;
		this.candleDAO = candleDAO;
	}
	
	public void findAll() {
		stockDataDAO.findAll().forEach(stock ->
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
	
	public Optional<Stock> findBySymbol(String symbol){
		return stocks.stream()
				.map(Stock::getSymbols)
				.flatMap(Collection::stream)
				.filter(s -> s.getSymbol().equals(symbol))
				.map(Symbol::getStock)
				.findFirst();
	}
}
