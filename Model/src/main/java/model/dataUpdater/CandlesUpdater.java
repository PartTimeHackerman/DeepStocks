package model.dataUpdater;

import model.binaryAPI.BinaryCandlesGather;
import model.data.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CandlesUpdater implements ICandlesUpdater{
	
	private final BinaryCandlesGather binaryCandlesGather;
	
	@Autowired
	public CandlesUpdater(BinaryCandlesGather binaryCandlesGather) {
		this.binaryCandlesGather = binaryCandlesGather;
	}
	
	@Override
	public void updateStock(Stock stock) {
		binaryCandlesGather.assocLatestCandles(stock);
	}
	
	@Override
	public void updateStocks(Collection<Stock> stocks) {
		stocks.stream()
				.filter(stock ->
								stock.getBinaryData() != null)
				.forEach(this::updateStock);
	}
}
