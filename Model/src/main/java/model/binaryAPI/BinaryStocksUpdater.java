package model.binaryAPI;

import model.data.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinaryStocksUpdater {
	
	private final StockRepo stockRepo;
	
	@Autowired
	public BinaryStocksUpdater(StockRepo stockRepo) {
		this.stockRepo = stockRepo;
	}
	
}
