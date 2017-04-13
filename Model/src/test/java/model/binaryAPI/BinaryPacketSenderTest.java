package model.binaryAPI;

import static org.junit.Assert.*;

import model.SpringTest;
import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.Packet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BinaryPacketSenderTest extends SpringTest {
	
	@Autowired
	private BinaryPacketSender binaryPacketSender;
	
	@Test
	public void send() throws Exception {
		TicksHistorySend ticksHistory = new TicksHistorySend();
		ticksHistory.setTicksHistory("AEX");
		ticksHistory.setStart(1488116600L);
		ticksHistory.setEnd(1488116600L+"");
		ticksHistory.setCount(1);
		ticksHistory.setGranularity(60);
		ticksHistory.setStyle(TicksHistorySend.Style.CANDLES);
		
		binaryPacketSender.send(new Packet(ticksHistory));
		binaryPacketSender.send(new Packet(ticksHistory));
	}
	
	@Test
	public void receive() throws Exception {
	}
	
}