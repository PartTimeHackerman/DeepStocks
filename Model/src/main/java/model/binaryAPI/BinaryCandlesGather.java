package model.binaryAPI;

import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.PacketSender;
import model.connection.Packet;
import model.data.Candle;
import model.data.Stock;
import model.data.StockProvider;
import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Symbol;
import model.utils.EpochUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Component
public class BinaryCandlesGather {
	
	private final PacketSender packetSender;
	private final TicksHistoryHandler ticksHistoryHandler;
	private Integer count = 5000;
	
	@Autowired
	public BinaryCandlesGather(PacketSender packetSender, TicksHistoryHandler ticksHistoryHandler) {
		this.packetSender = packetSender;
		this.ticksHistoryHandler = ticksHistoryHandler;
	}
	
	public List<Candle> getCandles(Stock stock, Long start, Long end) {
		List<Candle> candles = new ArrayList<>();
		
		Integer count = this.count * 60;
		
		while (start < end) {
			Packet packet = getPacket(stock, start, start + count);
			start += count;
			packetSender.send(packet);
			//packetSender.sendAndGet(packet);
			//ticksHistoryHandler.handle(packet);
			//candles.addAll(ticksHistoryHandler.getCandles(packet));
		}
		return candles;
	}
	
	public List<Candle> getLatestCandles(Stock stock) {
		Long currentTime = EpochUtil.getCurrentTime();
		
		Long start = stock.getStockCandles().isEmpty()
				? EpochUtil.FirstJanuary2016
				: stock.getStockCandles().get(stock.getStockCandles().size() - 1).getEpoch();
		
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
											 .orElse(new Symbol(null, ""))
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
