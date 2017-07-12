package model.connection.consumer.binaryDataConsumer;

import model.connection.consumer.Consumer;
import model.connection.websocketServer.STOMPStocksController;
import model.data.BinaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class WebSocketBinaryDataUpdater implements Consumer<Collection<BinaryData>> {
	
	private final STOMPStocksController stompStocksController;
	
	@Autowired
	public WebSocketBinaryDataUpdater(STOMPStocksController stompStocksController) {
		this.stompStocksController = stompStocksController;
	}
	
	@Override
	public void consume(Collection<BinaryData> binaryData) {
		binaryData.forEach(stompStocksController::updateStockBinaryData);
	}
}
