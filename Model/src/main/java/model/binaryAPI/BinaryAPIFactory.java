package model.binaryAPI;

import model.connection.APIsfactory;
import model.connection.ConnectionType;
import model.connection.websocket.WebsocketClient;
import model.connection.websocket.WebsocketFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.net.URI;

@Component
public class BinaryAPIFactory implements APIsfactory<BinaryAPI> {
	
	private static final URI binaryWebsocketUri = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	
	private BinaryPacketsService binaryPacketSender;
	
	private WebsocketFactory websocketFactory;
	
	private BinaryAPIFactory() {
	}
	
	@Override
	public BinaryAPI createDirectApi() throws IOException, DeploymentException {
		return createApiByConnectionType(ConnectionType.DIRECT);
	}
	
	@Override
	public BinaryAPI createApiByConnectionType(ConnectionType connectionType) throws IOException, DeploymentException {
		WebsocketClient websocketClient = websocketFactory.getWebsocketClient(binaryWebsocketUri, connectionType);
		return new BinaryAPI(binaryPacketSender, websocketClient, connectionType);
	}
	
	@Autowired
	@Lazy
	public void setBinaryPacketSender(BinaryPacketsService binaryPacketSender) {
		this.binaryPacketSender = binaryPacketSender;
	}
	
	@Autowired
	public void setWebsocketFactory(WebsocketFactory websocketFactory) {
		this.websocketFactory = websocketFactory;
	}
}
