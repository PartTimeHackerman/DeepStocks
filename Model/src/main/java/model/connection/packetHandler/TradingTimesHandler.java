package model.connection.packetHandler;

import com.google.gson.internal.LinkedTreeMap;
import model.binaryAPI.commands.trading_times.TradingTimes;
import model.binaryAPI.commands.trading_times.TradingTimesReceive;
import model.connection.Packet;
import model.connection.SimpleStream;
import model.utils.MainLogger;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Predicate;

@Service
public class TradingTimesHandler extends SimpleStream<TradingTimes> implements PacketHandler {
	
	@Override
	public void handle(Packet packet) {
		TradingTimesReceive tradingTimesReceive = (TradingTimesReceive) packet.getReceiver();
		TradingTimes tradingTimes = tradingTimesReceive.getTradingTimes();
		LinkedTreeMap<String, String> echoReq = (LinkedTreeMap<String, String>) tradingTimesReceive.getEchoReq();
		String stringDate = echoReq.get("trading_times");
		Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
		} catch (ParseException e) {
			MainLogger.log(this).fatal(e);
			return;
		}
		tradingTimes.setDate(date);
		submit(tradingTimes);
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(TradingTimesReceive.class);
	}
}
