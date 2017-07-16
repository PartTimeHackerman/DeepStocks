package model.connection.packetHandler;


import model.binaryAPI.commands.ticks_history.TicksHistorySend;
import model.connection.Packet;
import model.data.Stock;
import model.data.StockProvider;
import model.data.StockRepo;
import model.exception.StreamingNotAllowedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class StreamingNotAllowedExceptionHandler implements PacketHandler {
	
	
	private final StockRepo stockRepo;
	
	@Autowired
	public StreamingNotAllowedExceptionHandler(StockRepo stockRepo) {
		this.stockRepo = stockRepo;
	}
	
	
	@Override
	public void handle(Packet packet) {
		//Supress it for now, TODO later
		TicksHistorySend sender = (TicksHistorySend) packet.getSender();
		String stockSymbol = sender.getTicksHistory();
		Stock stock = stockRepo.findBySymbol(stockSymbol).get();
		stock.getSymbols().stream()
				.filter(symbol ->
								symbol.getProvider() == StockProvider.BINARY).findAny()
				.ifPresent(symbol ->
								   symbol.setExcluded(true));
	}
	
	@Override
	public Predicate<Packet> getFilter() {
		return p -> p.getException() != null && p.getException() instanceof StreamingNotAllowedException;
	}
}
