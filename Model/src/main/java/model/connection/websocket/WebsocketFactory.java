package model.connection.websocket;

import model.connection.ConnectionType;
import model.connection.proxy.UnrepeatedProxyProvider;
import model.utils.MainLogger;
import model.utils.Timeout;
import org.scraper.main.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.net.URI;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class WebsocketFactory {
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	public WebsocketClient getWebsocketClient(URI uri) throws Exception {
		return getWebsocketClient(uri, ConnectionType.DIRECT);
	}
	
	public WebsocketClient getWebsocketClient(URI uri, ConnectionType connectionType) throws IOException, DeploymentException {
		if (connectionType == ConnectionType.DIRECT) {
			return new WebsocketClient(uri);
		} else {
			Proxy proxy = unrepeatedProxyProvider.getProxy();
			String ip = proxy.getIp();
			String port = proxy.getPort().toString();
			
			Optional<WebsocketClient> websocketClientOptional = Timeout.after(() -> new WebsocketClient(uri, ip, port), 5L, TimeUnit.SECONDS);
			if (websocketClientOptional.isPresent())
				return websocketClientOptional.get();
			else {
				MainLogger.log().warn("Websocket connection timeout");
				return getWebsocketClient(uri, connectionType);
			}
		}
	}
	
}
