package model.binaryAPI.commands;

import model.binaryAPI.IMessagesCounter;
import model.binaryAPI.WebsocketClient;

public class WebSocketManager {
	
	private WebsocketClient websocketClient;
	
	private IMessagesCounter messageCounter;
	
	public WebSocketManager(WebsocketClient websocketClient, IMessagesCounter messageCounter){
		this.websocketClient = websocketClient;
		this.messageCounter = messageCounter;
	}
	
	public boolean canSend(){
		return messageCounter.getRemained() > 1;
	}
	
	public WebsocketClient getWebsocketClient() {
		return websocketClient;
	}
	
	public IMessagesCounter getMessageCounter() {
		return messageCounter;
	}
	
}
