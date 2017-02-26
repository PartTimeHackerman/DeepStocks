package model.data;

import model.jdbc.dao.StockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockRepo {
	
	private final StockDAO stockDataDAO;
	
	private final List<Stock> stocks = new ArrayList<>();
	
	@Autowired
	public StockRepo(StockDAO stockDataDAO) {
		this.stockDataDAO = stockDataDAO;
	}
	
	public void findAll(){
		stockDataDAO.findAll().forEach(stocks::add);
	}
	
	public List<Stock> getStocks(){
		return stocks;
	}
}
