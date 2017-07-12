package model.binaryAPI.commands;

import model.binaryAPI.IMessagesCounter;
import model.connection.websocketClient.WebsocketClient;
import model.connection.ConnectionType;

public class WebSocketManager {
	
	private WebsocketClient websocketClient;
	
	private IMessagesCounter messageCounter;
	
	private ConnectionType connectionType;
	
	public WebSocketManager(WebsocketClient websocketClient, IMessagesCounter messageCounter, ConnectionType connectionType){
		this.websocketClient = websocketClient;
		this.messageCounter = messageCounter;
		this.connectionType = connectionType;
	}
	
	public boolean canSend(){
		return messageCounter.getRemaining() > 1;
	}
	
	public WebsocketClient getWebsocketClient() {
		return websocketClient;
	}
	
	public IMessagesCounter getMessageCounter() {
		return messageCounter;
	}
	
	public ConnectionType getConnectionType() {
		return connectionType;
	}
	
	
}
