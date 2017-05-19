package model.dataUpdater;

import model.binaryAPI.BinaryCandlesGather;
import model.data.Candle;
import model.data.Stock;
import model.jdbc.dao.CandleDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class CandlesUpdaterDB implements ICandlesUpdater {
	
	private final BinaryCandlesGather binaryCandlesGather;
	
	private final CandleDAOImpl candleDAO;
	
	@Autowired
	public CandlesUpdaterDB(BinaryCandlesGather binaryCandlesGather, CandleDAOImpl candleDAO) {
		this.binaryCandlesGather = binaryCandlesGather;
		this.candleDAO = candleDAO;
	}
	
	@Override
	public void updateForStock(Stock stock) {
		binaryCandlesGather.getLatestCandles(stock);
	}
	
	@Override
	public void updateForStocks(Collection<Stock> stocks) {
		stocks.forEach(this::updateForStock);
	}
}
