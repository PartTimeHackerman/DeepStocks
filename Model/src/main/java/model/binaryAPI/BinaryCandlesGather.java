package model.binaryAPI;

import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.Packet;
import model.connection.PacketSender;
import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Candle;
import model.data.Stock;
import model.data.StockProvider;
import model.data.Symbol;
import model.utils.EpochUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BinaryCandlesGather {
	
	private final PacketSender packetSender;
	private final TicksHistoryHandler ticksHistoryHandler;
	private final Integer count = 1000;
	private final Integer granularity = 60;
	
	
	@Autowired
	public BinaryCandlesGather(PacketSender packetSender, TicksHistoryHandler ticksHistoryHandler) {
		this.packetSender = packetSender;
		this.ticksHistoryHandler = ticksHistoryHandler;
	}
	
	
	public void getLatestCandles(Stock stock) {
		if (stock.getSymbols().stream().filter(symbol -> symbol.getProvider() == StockProvider.BINARY).map(Symbol::getExcluded).findAny().orElse(false))
			return;
		
		Long currentTime = EpochUtil.getCurrentTimeSeconds();
		
		Long start = stock.getStockCandles().isEmpty()
				? EpochUtil.getWeekAgoTimeSeconds()
				: stock.getLastCandle().getEpoch() + granularity;
		
		getCandles(stock, start, currentTime);
	}
	
	
	public void getCandles(Stock stock, Long epochFrom, Long epochTo) {
		Integer step = (count * granularity);
		
		while (epochFrom <= epochTo) {
			Long epochFromWithStep = epochFrom + step;
			Long epochToCalculated =
					epochFromWithStep <= epochTo
							? epochFromWithStep
							: epochTo;
			Packet packet = getPacket(stock, epochFrom, epochToCalculated);
			epochFrom = epochFromWithStep + 60;
			packetSender.send(packet);
		}
	}
	
	public Optional<Candle> getLatestCandle(Stock stock) {
		return getCandle(stock, "latest");
	}
	
	
	public Optional<Candle> getCandle(Stock stock, Long epoch) {
		return getCandle(stock, epoch.toString());
	}
	
	private Optional<Candle> getCandle(Stock stock, String epoch) {
		if (stock.getSymbols().stream().filter(symbol -> symbol.getProvider() == StockProvider.BINARY).map(Symbol::getExcluded).findAny().orElse(false))
			return Optional.empty();
		Packet packet = getPacket(stock, 0L, epoch, 1);
		packet = packetSender.sendAndGet(packet);
		List<Candle> candles = ticksHistoryHandler.getCandles(packet);
		return candles.size() > 0 ? Optional.of(candles.get(0)) : Optional.empty();
	}
	
	private Packet getPacket(Stock stock, Long start, Long end) {
		return getPacket(stock, start, end, count);
	}
	
	private Packet getPacket(Stock stock, Long start, Long end, Integer count) {
		return getPacket(stock, start, end.toString(), count);
	}
	
	private Packet getPacket(Stock stock, Long start, String end, Integer count) {
		TicksHistorySend ticksHistory = new TicksHistorySend();
		ticksHistory.setTicksHistory(stock.getSymbols().stream()
											 .filter(s ->
															 s.getProvider() == StockProvider.BINARY)
											 .findAny()
											 .orElse(new Symbol(null, ""))
											 .getSymbol());
		ticksHistory.setStart(start);
		ticksHistory.setEnd(end);
		ticksHistory.setCount(count);
		ticksHistory.setGranularity(granularity);
		ticksHistory.setStyle(TicksHistorySend.Style.CANDLES);
		//ticksHistory.setAdjustStartTime(1);
		return new Packet(ticksHistory, stock.getId());
	}
}
