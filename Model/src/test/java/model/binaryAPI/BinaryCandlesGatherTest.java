package model.binaryAPI;

import model.SpringTest;
import model.data.Stock;
import model.data.StockRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

@org.springframework.transaction.annotation.Transactional
public class BinaryCandlesGatherTest extends SpringTest {
	
	@Autowired
	BinaryCandlesGather binaryCandlesGather;
	
	@Autowired
	StockRepo stockRepo;
	
	@Test
	public void assocLatestCandles() throws Exception {
		Stock stock = stockRepo.getStocks().get(0);
		Integer lastSize = stock.getStockCandles().size();
		binaryCandlesGather.getLatestCandles(stock);
		Integer afterSize = stock.getStockCandles().size();
		assertTrue(afterSize - lastSize > 0);
	}
	
}