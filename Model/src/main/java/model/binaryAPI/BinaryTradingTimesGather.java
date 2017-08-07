package model.binaryAPI;

import model.binaryAPI.commands.trading_times.TradingTimes;
import model.binaryAPI.commands.trading_times.TradingTimesSend;
import model.connection.Packet;
import model.connection.PacketSender;
import model.connection.packetHandler.TradingTimesHandler;
import model.data.StockTradingTimes;
import model.dataBaseUpdater.StockTradingTimesDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class BinaryTradingTimesGather {
	
	private final PacketSender packetSender;
	private final TradingTimesHandler tradingTimesHandler;
	private final StockTradingTimesDBUpdater stockTradingTimesDBUpdater;
	
	@Autowired
	public BinaryTradingTimesGather(PacketSender packetSender, TradingTimesHandler tradingTimesHandler, StockTradingTimesDBUpdater stockTradingTimesDBUpdater) {
		this.packetSender = packetSender;
		this.tradingTimesHandler = tradingTimesHandler;
		this.stockTradingTimesDBUpdater = stockTradingTimesDBUpdater;
	}
	
	public void fetchTradingTimesFrom(Calendar fromCalendar) {
		Calendar today = Calendar.getInstance();
		Calendar incrementedCalendar = Calendar.getInstance();
		incrementedCalendar.setTimeInMillis(fromCalendar.getTimeInMillis());
		while (incrementedCalendar.getTimeInMillis() < today.getTimeInMillis()) {
			fetch(incrementedCalendar.getTimeInMillis());
			incrementedCalendar.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
	public List<StockTradingTimes> fetchAndGetTradingTimesFrom(Calendar date) {
		Calendar today = Calendar.getInstance();
		Calendar incrementedCalendar = Calendar.getInstance();
		incrementedCalendar.setTimeInMillis(date.getTimeInMillis());
		List<StockTradingTimes> stockTradingTimes = new ArrayList<>();
		while (incrementedCalendar.getTimeInMillis() < today.getTimeInMillis()) {
			stockTradingTimes.addAll(fetchAndGet(incrementedCalendar.getTimeInMillis()));
			incrementedCalendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		return stockTradingTimes;
	}
	
	private void fetch(Long epoch) {
		packetSender.send(new TradingTimesSend(epoch));
	}
	
	private List<StockTradingTimes> fetchAndGet(Long epoch) {
		Packet tradingTimesPacket = packetSender.sendAndGet(new TradingTimesSend(epoch));
		TradingTimes tradingTimes = tradingTimesHandler.getTradingTimes(tradingTimesPacket);
		return stockTradingTimesDBUpdater.getStockTradingTimes(tradingTimes);
	}
	
}
