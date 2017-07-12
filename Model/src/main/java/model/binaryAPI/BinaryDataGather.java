package model.binaryAPI;

import model.binaryAPI.commands.active_symbols.ActiveSymbolsSend;
import model.connection.Packet;
import model.connection.PacketSender;
import model.connection.packetHandler.ActiveSymbolsHandler;
import model.data.BinaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class BinaryDataGather {
	
	private final PacketSender packetSender;
	private final ActiveSymbolsHandler activeSymbolsHandler;
	
	@Autowired
	public BinaryDataGather(PacketSender packetSender, ActiveSymbolsHandler activeSymbolsHandler) {
		this.packetSender = packetSender;
		this.activeSymbolsHandler = activeSymbolsHandler;
	}
	
	/*Fetch all binary datas from binary ws*/
	public void fetchBinaryDatas() {
		packetSender.send(new Packet(new ActiveSymbolsSend()));
	}
	
	public List<BinaryData> fetchAndGetBinaryDatas(){
		Packet packet = packetSender.sendAndGet(new Packet(new ActiveSymbolsSend()));
		return activeSymbolsHandler.getAndAssocBinaryDatas(packet);
	}
}
