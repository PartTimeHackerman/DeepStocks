package model.dao;

import model.SpringTest;
import model.data.Candle;
import model.data.Stock;
import model.data.StockRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CandleDAOTest extends SpringTest {
	
	@Autowired
	private CandleDAO candleDAO;
	
	@Autowired
	private StockRepo stockRepo;
	
	@Test
	public void findTopByStockOrderByEpoch() throws Exception {
		Stock stock = stockRepo.getStocks().get(0);
		List<Candle> candles = candleDAO.findTopLimitByStockidOrderByEpoch(stock.getId(), 10);
		assertTrue(candles.get(0).getStock() != null);
	}
	
}