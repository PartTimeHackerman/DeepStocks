package model.connection.packetHandler;

import com.google.gson.internal.LinkedTreeMap;
import model.binaryAPI.commands.trading_times.TradingTimes;
import model.binaryAPI.commands.trading_times.TradingTimesReceive;
import model.connection.Packet;
import model.connection.SimpleStream;
import model.connection.consumer.Consumer;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Predicate;

@Service
public class TradingTimesHandler extends SimpleStream<TradingTimes> implements PacketHandler {
	
	@Autowired
	public TradingTimesHandler(Collection<Consumer<TradingTimes>> tradingTimesConsumers) {
		tradingTimesConsumers.forEach(this::subscribe);
	}
	
	@Override
	public void handle(Packet packet) {
		TradingTimes tradingTimes = getTradingTimes(packet);
		if (tradingTimes != null)
			submit(tradingTimes);
	}
	
	public TradingTimes getTradingTimes(Packet packet) {
		TradingTimesReceive tradingTimesReceive = (TradingTimesReceive) packet.getReceiver();
		TradingTimes tradingTimes = tradingTimesReceive.getTradingTimes();
		LinkedTreeMap<String, String> echoReq = (LinkedTreeMap<String, String>) tradingTimesReceive.getEchoReq();
		String stringDate = echoReq.get("trading_times");
		Date date;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
			date = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			MainLogger.log(this).fatal(e);
			return null;
		}
		tradingTimes.setDate(date);
		return tradingTimes;
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(TradingTimesReceive.class);
	}
}
