package model.connection.websocketServer;

import model.data.BinaryData;
import model.data.Candle;
import model.data.Stock;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.function.Consumer;

@Controller
public class STOMPStocksController {
	
	private final SimpMessagingTemplate messager;
	
	private final STOMPConnectEventListener stompConnectEventListener;
	
	private final STOMPSessionsManager stompSessionsManager;
	
	@Autowired
	public STOMPStocksController(
			SimpMessagingTemplate messager,
			STOMPConnectEventListener stompConnectEventListener,
			STOMPSessionsManager stompSessionsManager) {
		this.messager = messager;
		this.stompConnectEventListener = stompConnectEventListener;
		this.stompSessionsManager = stompSessionsManager;
	}
	
	@MessageMapping("/endpoint/message")
	@SendToUser(destinations = "/queue/message", broadcast = false)
	public Long wsTest(Long epoch, Message<Object> message) throws Exception {
		MainLogger.log(this).debug(message);
		return epoch + 111;
	}
	
	public void updateStockBinaryDataCollection(Collection<BinaryData> binaryDataCollection) {
		binaryDataCollection.forEach(this::updateStockBinaryData);
	}
	
	public void updateStockBinaryData(BinaryData data) {
		messager.convertAndSend("/data/stocks/" + data.getStockId(), data);
	}
	
	public void updateStockLastCandles(Collection<Candle> candles) {
		candles.forEach(this::updateStockLastCandle);
	}
	
	public void updateStockLastCandle(Candle candle) {
		Stock candleStock = candle.getStock();
		messager.convertAndSend("/data/lastCandle/" + candleStock.getId(), candle);
	}
	
	public void sendTimeToAllUsers(Long epoch) {
		Consumer<String> sendTime = sessionID -> {
			MainLogger.log(this).debug("Epoch sent to: {}", sessionID);
			MessageHeaders messageHeaders = getMessageHeaders(sessionID);
			messager.convertAndSendToUser(sessionID, "/queue/message", epoch, messageHeaders);
		};
		
		stompSessionsManager.getAllUsers()
				.forEach(user ->
								 stompSessionsManager.getSessionsFor(user)
										 .forEach(sendTime));
		
	}
	
	public void sendTimeToAllSubscribed(Long epoch) {
		messager.convertAndSend("/queue/message", 0 - epoch);
	}
	
	private MessageHeaders getMessageHeaders(String sessionID) {
		SimpMessageHeaderAccessor headerAccessor = SimpMessageHeaderAccessor.create(SimpMessageType.MESSAGE);
		headerAccessor.setSessionId(sessionID);
		headerAccessor.setLeaveMutable(true);
		return headerAccessor.getMessageHeaders();
	}
}
