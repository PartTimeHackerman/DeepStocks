package model.binaryAPI;

import model.binaryAPI.commands.authorize.AuthorizeSend;
import model.connection.APIsfactory;
import model.connection.ConnectionType;
import model.connection.Packet;
import model.connection.websocket.WebsocketClient;
import model.connection.websocket.WebsocketFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class BinaryAPIFactory implements APIsfactory<BinaryAPI> {
	
	private static final URI binaryWebsocketUri = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	
	private BinaryPacketSender binaryPacketSender;
	
	private WebsocketFactory websocketFactory;
	
	private BinaryAPIFactory() {
	}
	
	@Override
	public BinaryAPI createDirectApi(){
		WebsocketClient websocketClient = websocketFactory.getWebsocketClient(binaryWebsocketUri, ConnectionType.DIRECT);
		return new BinaryAPI(binaryPacketSender, websocketClient);
	}
	
	@Override
	public BinaryAPI createApiByConnectionType(ConnectionType connectionType){
		WebsocketClient websocketClient = websocketFactory.getWebsocketClient(binaryWebsocketUri, connectionType);
		return new BinaryAPI(binaryPacketSender, websocketClient, connectionType);
	}
	
	@Autowired
	@Lazy
	public void setBinaryPacketSender(BinaryPacketSender binaryPacketSender) {
		this.binaryPacketSender = binaryPacketSender;
	}
	
	@Autowired
	public void setWebsocketFactory(WebsocketFactory websocketFactory) {
		this.websocketFactory = websocketFactory;
	}
}
