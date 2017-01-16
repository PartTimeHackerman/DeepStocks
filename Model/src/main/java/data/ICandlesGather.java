package data;

import data.binaryAPI.commands.ticks_history.Candle;

import java.util.List;

public interface ICandlesGather {
	
	List<Candle> getCandles(Long start, Long end, StockData stock);
	
}
