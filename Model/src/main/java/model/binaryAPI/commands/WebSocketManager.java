package model.binaryAPI.commands;

import model.binaryAPI.IMessagesCounter;
import model.binaryAPI.WebsocketClient;

public class WebSocketManager {
	
	private WebsocketClient websocketClient;
	
	private IMessagesCounter messageCounter;
	
	private Access access;
	
	public WebSocketManager(WebsocketClient websocketClient, IMessagesCounter messageCounter, Access access){
		this.websocketClient = websocketClient;
		this.messageCounter = messageCounter;
		this.access = access;
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
	
	public Access getAccess() {
		return access;
	}
	
	public enum Access{
		USER,
		PROXY
	}
	
}
