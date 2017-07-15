package model.binaryAPI;

import model.binaryAPI.commands.trading_times.TradingTimesSend;
import model.connection.PacketSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.Cache;

import java.util.Calendar;
import java.util.Date;

@Service
public class BinaryTradingTimesGather {
	
	private final PacketSender packetSender;
	
	@Autowired
	public BinaryTradingTimesGather(PacketSender packetSender) {
		this.packetSender = packetSender;
	}
	
	public void fetchTradingTimesFrom(Calendar fromCalendar){
		Calendar today = Calendar.getInstance();
		Calendar incrementedCalendar = Calendar.getInstance();
		incrementedCalendar.setTimeInMillis(fromCalendar.getTimeInMillis());
		while(incrementedCalendar.getTimeInMillis() < today.getTimeInMillis()){
			packetSender.send(new TradingTimesSend(incrementedCalendar.getTimeInMillis()));
			incrementedCalendar.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
