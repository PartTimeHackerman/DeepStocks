package model.connection.websocketClient;

import model.utils.MainLogger;
import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.client.ClientProperties;
import scraper.Proxy;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.function.Consumer;

@ClientEndpoint
public class WebsocketClient {
	
	private Session userSession = null;
	private Consumer<String> messageHandler;
	private ClientManager client;
	
	private URI uri;
	private Proxy proxy;
	
	public WebsocketClient(URI uri) throws IOException, DeploymentException {
		this(uri, null);
	}
	
	public WebsocketClient(URI uri, Proxy proxy) throws IOException, DeploymentException {
		MainLogger.log(this).debug("Creating new websocket");
		Long time = setUpWebsocket(uri, proxy);
		MainLogger.log(this).debug("Websocket api created in {} millis.", time);
	}
	
	private Long setUpWebsocket(URI uri, Proxy proxy) throws IOException, DeploymentException {
		this.uri = uri;
		this.proxy = proxy;
		this.client = ClientManager.createClient();
		Long time = System.currentTimeMillis();
		setUpClient();
		if (proxy != null)
			setUpClientProxy(client, proxy);
		else
			this.proxy = new Proxy("127.0.0.1:80");
		client.connectToServer(this, uri);
		return System.currentTimeMillis() - time;
	}
	
	private void setUpClient() throws IOException, DeploymentException {
		client.setDefaultMaxTextMessageBufferSize(3276800);
		client.setDefaultMaxBinaryMessageBufferSize(3276800);
		client.setDefaultMaxSessionIdleTimeout(0);
	}
	
	private void setUpClientProxy(ClientManager client, Proxy proxy) throws IOException, DeploymentException {
		String proxyAddress = "http://" + proxy.getIp() + ":" + proxy.getPort();
		client.getProperties().put(ClientProperties.PROXY_URI, proxyAddress);
	}
	
	public void sendMessage(String message) {
		try {
			this.userSession.getBasicRemote().sendText(message);
		} catch (IOException e) {
			MainLogger.log(this).error(e);
		}
	}
	
	@OnMessage
	public void onMessage(String message) {
		if (this.messageHandler != null) {
			this.messageHandler.accept(message);
		}
	}
	
	@OnOpen
	public void onOpen(Session userSession) {
		MainLogger.log(this).info("Opening websocket, {}", client);
		this.userSession = userSession;
	}
	
	@OnClose
	public void onClose(Session userSession, CloseReason reason) {
		MainLogger.log(this).warn("Closing websocket, {}, {}", client, reason);
		this.userSession = null;
	}
	
	public void addMessageHandler(Consumer<String> msgHandler) {
		this.messageHandler = msgHandler;
	}
	
	public ClientManager getClient() {
		return client;
	}
	
	public Boolean isConnected() {
		return userSession != null;
	}
	
	public Boolean reconnect() {
		MainLogger.log(this).info("Reconnecting websocket {}", client);
		try {
			setUpWebsocket(this.uri, this.proxy);
			MainLogger.log(this).info("Reconnected websocket {}", client);
			return true;
		} catch (IOException | DeploymentException e) {
			return false;
		}
	}
	
	
	public Proxy getProxy() {
		return proxy;
	}
}