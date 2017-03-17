package model.connection.websocket;

import model.connection.ConnectionType;
import model.connection.proxy.UnrepeatedProxyProvider;
import org.scraper.main.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class WebsocketFactory {
	
	@Autowired
	private UnrepeatedProxyProvider unrepeatedProxyProvider;
	
	public WebsocketClient getWebsocketClient(URI uri) {
		return getWebsocketClient(uri, ConnectionType.DIRECT);
	}
	
	public WebsocketClient getWebsocketClient(URI uri, ConnectionType connectionType) {
		if (connectionType == ConnectionType.DIRECT)
			return new WebsocketClient(uri);
		else {
			Proxy proxy = unrepeatedProxyProvider.getProxy();
			String ip = proxy.getIp();
			String port = proxy.getPort().toString();
			return new WebsocketClient(uri, ip, port);
		}
	}
	
}
