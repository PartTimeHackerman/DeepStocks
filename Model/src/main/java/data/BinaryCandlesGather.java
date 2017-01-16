package data;

import data.binaryAPI.commands.ticks_history.TicksHistorySend;
import data.packetHandlers.TicksHistoryHandler;
import utils.DigitsRemover;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryCandlesGather {
	
	private Request request;
	
	public BinaryCandlesGather(Request request) {
		this.request = request;
	}
	
	public void getCandles(StockData stock, Long start, Long end) {
		//start = DigitsRemover.removeLastNDigits(start, 3);
		end = DigitsRemover.removeLastNDigits(end, 3);
		Integer count = 10000 * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			request.send(packet);
		}
	}
	
	public void getCandlesT(StockData stock, Long start, Long end) {
		TicksHistoryHandler ticksHistoryHandler = new TicksHistoryHandler(new ArrayList<>(Arrays.asList(stock)));
		
		//start = DigitsRemover.removeLastNDigits(start, 3);
		end = DigitsRemover.removeLastNDigits(end, 3);
		
		Integer count = 10000 * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			request.sendAndGet(packet);
			ticksHistoryHandler.handle(packet);
		}
	}
	
	public void gatherLastestCandles(StockData stock) {
		Long currentTime = DigitsRemover.removeLastNDigits(System.currentTimeMillis(), 3);
		Long end = stock.getStockCandles().isEmpty()
				? currentTime
				: currentTime > stock.getStockCandles().lastKey()
				? currentTime
				: stock.getStockCandles().firstKey();
		Long start = 0L;
		
		getCandles(stock, start, end);
	}
	
	private Packet getPacket(StockData stock, Long start, Long end) {
		TicksHistorySend ticksHistory = new TicksHistorySend();
		ticksHistory.setTicksHistory(stock.getSymbols().get(StockProvider.BINARY));
		ticksHistory.setStart(start);
		ticksHistory.setEnd(end.toString());
		ticksHistory.setCount(10000);
		ticksHistory.setGranularity(60);
		ticksHistory.setStyle(TicksHistorySend.Style.CANDLES);
		//ticksHistory.setAdjustStartTime(1);
		return new Packet(ticksHistory, stock.hashCode());
	}
}
