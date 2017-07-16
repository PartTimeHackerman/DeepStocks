package model.connection.packetHandler;

import model.binaryAPI.commands.active_symbols.ActiveSymbolsReceive;
import model.connection.Packet;
import model.connection.SimpleStream;
import model.connection.handleUpdater.StocksBinaryDataUpdater;
import model.data.BinaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ActiveSymbolsHandler extends SimpleStream<Collection<BinaryData>> implements PacketHandler {
	
	private final StocksBinaryDataUpdater stocksBinaryDataUpdater;
	
	@Autowired
	public ActiveSymbolsHandler(StocksBinaryDataUpdater stocksBinaryDataUpdater) {
		super();
		this.stocksBinaryDataUpdater = stocksBinaryDataUpdater;
	}
	
	@Override
	public void handle(Packet packet) {
		List<BinaryData> binaryDataList = getAndAssocBinaryDatas(packet);
		submit(binaryDataList);
	}
	
	public List<BinaryData> getAndAssocBinaryDatas(Packet packet) {
		ActiveSymbolsReceive activeSymbolsReceive = (ActiveSymbolsReceive) packet.getReceiver();
		List<BinaryData> binaryDataList = activeSymbolsReceive.getActiveSymbols();
		stocksBinaryDataUpdater.update(binaryDataList);
		return binaryDataList;
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return filterByClass(ActiveSymbolsReceive.class);
	}
}
