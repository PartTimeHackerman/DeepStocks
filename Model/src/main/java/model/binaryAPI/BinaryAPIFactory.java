package model.binaryAPI;

import model.binaryAPI.commands.authorize.AuthorizeSend;
import model.connection.APIsfactory;
import model.connection.ConnectionType;
import model.connection.Packet;
import model.connection.packetsService.SentPacketsContainer;
import model.connection.websocketClient.WebsocketClient;
import model.connection.websocketClient.WebsocketFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.net.URI;

@Component
public class BinaryAPIFactory implements APIsfactory<BinaryAPI> {
	private static final URI binaryWebsocketUri = URI.create("wss://ws.binaryws.com/websockets/v3?app_id=2663");
	private static final String userToken = "QuZpbffDx7DUipF";
	private final SentPacketsContainer sentPacketsContainer;
	private BinaryPacketsService binaryPacketSender;
	private WebsocketFactory websocketFactory;
	
	@Autowired
	public BinaryAPIFactory(SentPacketsContainer sentPacketsContainer) {
		this.sentPacketsContainer = sentPacketsContainer;
	}
	
	@Override
	public BinaryAPI createDirectApi() throws IOException, DeploymentException {
		return createApiByConnectionType(ConnectionType.DIRECT);
	}
	
	@Override
	public BinaryAPI createApiByConnectionType(ConnectionType connectionType) throws IOException, DeploymentException {
		WebsocketClient websocketClient = websocketFactory.getWebsocketClient(binaryWebsocketUri, connectionType);
		BinaryAPI binaryAPI = new BinaryAPI(binaryPacketSender, websocketClient, connectionType, sentPacketsContainer);
		if (connectionType.equals(ConnectionType.DIRECT))
			binaryAPI.send(new Packet(new AuthorizeSend(userToken)));
		return binaryAPI;
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
