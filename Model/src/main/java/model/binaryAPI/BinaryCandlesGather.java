package model.binaryAPI;

import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.PacketSender;
import model.connection.Packet;
import model.connection.validation.RequestValidator;
import model.data.Stock;
import model.data.StockProvider;
import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Symbol;
import model.utils.EpochUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinaryCandlesGather {
	
	private final PacketSender packetSender;
	private Integer count = 1000;
	
	@Autowired
	public BinaryCandlesGather(PacketSender packetSender) {
		this.packetSender = packetSender;
	}
	
	public void getCandles(Stock stock, Long epochFrom, Long epochTo) {
		Integer count = this.count * 60;
		
		while (epochFrom < epochTo) {
			Packet packet = getPacket(stock, epochFrom, epochFrom + count);
			epochFrom += count;
			packetSender.send(packet);
		}
	}
	
	public void getLatestCandles(Stock stock) {
		if (stock.getSymbols().stream().filter(symbol -> symbol.getProvider() == StockProvider.BINARY).map(Symbol::getExcluded).findAny().orElse(false))
			return;
		
		Long currentTime = EpochUtil.getCurrentTime();
		
		Long start = stock.getStockCandles().isEmpty()
				? EpochUtil.FirstJanuary2016
				: stock.getStockCandles().get(stock.getStockCandles().size() - 1).getEpoch();
		
		getCandles(stock, start, currentTime);
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
