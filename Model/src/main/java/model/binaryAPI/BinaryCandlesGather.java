package model.binaryAPI;

import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.PacketSender;
import model.connection.Packet;
import model.data.Candle;
import model.data.Stock;
import model.data.StockProvider;
import model.jdbc.dao.CandleDAOImpl;
import model.packetHandler.TicksHistoryHandler;
import model.utils.EpochUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BinaryCandlesGather {
	
	private final CandleDAOImpl candleDAO;
	
	private final PacketSender packetSender;
	
	private Integer count = 1000;
	
	@Autowired
	public BinaryCandlesGather(PacketSender packetSender, CandleDAOImpl candleDAO) {
		this.packetSender = packetSender;
		this.candleDAO = candleDAO;
	}
	
	public void assocCandlesConcurrent(Stock stock, Long start, Long end) {
		Integer count = this.count * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			packetSender.send(packet);
		}
	}
	
	public void assocCandles(Stock stock, Long start, Long end) {
		TicksHistoryHandler ticksHistoryHandler = new TicksHistoryHandler(new ArrayList<>(Arrays.asList(stock)));
		
		Integer count = this.count * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			packetSender.sendAndGet(packet);
			ticksHistoryHandler.handle(packet);
		}
	}
	
	public void assocLatestCandles(Stock stock) {
		Long currentTime = EpochUtil.getCurrentTime();
		stock.getStockCandles().sort(null);
		Long start = stock.getStockCandles().isEmpty()
				? EpochUtil.FirstJanuary2016
				: stock.getStockCandles().get(stock.getStockCandles().size() - 1).getEpoch();
		assocCandles(stock, start, currentTime);
	}
	
	public List<Candle> getCandles(Stock stock, Long start, Long end){
		TicksHistoryHandler ticksHistoryHandler = new TicksHistoryHandler(new ArrayList<>(Arrays.asList(stock)));
		List<Candle> candles = new ArrayList<>();
		
		Integer count = this.count * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			packetSender.sendAndGet(packet);
			candles.addAll(ticksHistoryHandler.getCandles(packet));
		}
		return candles;
	}
	
	public List<Candle> getLatestCandles(Stock stock) {
		Long currentTime = EpochUtil.getCurrentTime();
		Candle latest = candleDAO.getCrudDAO().findTopByStockOrderByEpochDesc(stock);
		
		Long start = latest == null
				? EpochUtil.FirstJanuary2016
				: latest.getEpoch();
		
		return getCandles(stock, start, currentTime);
	}
	
	private Packet getPacket(Stock stock, Long start, Long end) {
		return getPacket(stock, start, end, count);
	}
	
	private Packet getPacket(Stock stock, Long start, Long end, Integer count) {
		TicksHistorySend ticksHistory = new TicksHistorySend();
		ticksHistory.setTicksHistory(stock.getSymbols().stream()
											 .filter(s ->
															 s.getProvider() == StockProvider.BINARY)
											 .findAny()
											 .get()
											 .getSymbol());
		ticksHistory.setStart(start);
		ticksHistory.setEnd(end.toString());
		ticksHistory.setCount(count);
		ticksHistory.setGranularity(60);
		ticksHistory.setStyle(TicksHistorySend.Style.CANDLES);
		//ticksHistory.setAdjustStartTime(1);
		return new Packet(ticksHistory, stock.hashCode());
	}
}
