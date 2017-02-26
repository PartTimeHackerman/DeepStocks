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
	public void updateStock(Stock stock) {
		List<Candle> candles = binaryCandlesGather.getLatestCandles(stock);
		candles.forEach(candle -> candle.setStock(stock));
		candleDAO.getCrudDAO().save(candles);
	}
	
	@Override
	public void updateStocks(Collection<Stock> stocks) {
		stocks.forEach(this::updateStock);
	}
}
