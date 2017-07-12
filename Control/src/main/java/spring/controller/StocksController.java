package spring.controller;

import model.data.Stock;
import model.dao.StockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class StocksController {
	
	private final StockDAO stockDAO;
	
	@Autowired
	public StocksController(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}
	
	@RequestMapping(value = "/stocksPage", method = RequestMethod.GET)
	public Page<Stock> getStocksPage(Pageable page){
		Page<Stock> stocks = stockDAO.findAll(page);
		return stocks;
	}
}
