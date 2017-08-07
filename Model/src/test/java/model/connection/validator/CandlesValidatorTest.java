package model.connection.validator;

import model.SpringTest;
import model.data.Stock;
import model.data.StockRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.List;

public class CandlesValidatorTest extends SpringTest {
	
	@Autowired
	private StockRepo stockRepo;
	
	@Autowired
	private CandlesValidator candlesValidator;
	
	@Test
	public void validateStockFrom() throws Exception {
		List<Stock> stocks = stockRepo.getStocks();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -7);
		stocks.forEach(stock -> candlesValidator.validateStockFrom(stock, calendar));
		System.in.read();
	}
	
}