package model.connection.websocket;

import model.utils.MainLogger;
import org.glassfish.tyrus.client.ClientManager;
import org.glassfish.tyrus.client.ClientProperties;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

@ClientEndpoint
public class WebsocketClient {
	
	private Session userSession = null;
	
	private MessageHandler messageHandler;
	
	private ClientManager client;
	private String proxy = "";
	
	public WebsocketClient(URI uri) throws IOException, DeploymentException {
		client = ClientManager.createClient();
		setUpClient(client, uri);
	}
	
	public WebsocketClient(URI uri, String ip, String port) throws IOException, DeploymentException {
		MainLogger.log().debug("Creating new websocket ip: {} port: {}", ip, port);
		Long time = System.currentTimeMillis();
		
		client = ClientManager.createClient();
		setUpClient(client, uri, ip, port);
		
		MainLogger.log().debug("Websocket api created in {} millis.", System.currentTimeMillis() - time);
	}
	
	private void setUpClient(ClientManager client, URI uri) throws IOException, DeploymentException {
		client.setDefaultMaxTextMessageBufferSize(3276800);
		client.setDefaultMaxBinaryMessageBufferSize(3276800);
		client.setDefaultMaxSessionIdleTimeout(0);
		client.connectToServer(this, uri);
	}
	
	private void setUpClient(ClientManager client, URI uri, String ip, String port) throws IOException, DeploymentException {
		proxy = "http://" + ip + ":" + port;
		client.getProperties().put(ClientProperties.PROXY_URI, proxy);
		setUpClient(client, uri);
	}
	
	/**
	 * Callback hook for Connection open events.
	 *
	 * @param userSession the userSession which is opened.
	 */
	@OnOpen
	public void onOpen(Session userSession) {
		MainLogger.log().info("Opening websocket, {}", userSession);
		this.userSession = userSession;
	}
	
	/**
	 * Callback hook for Connection close events.
	 *
	 * @param userSession the userSession which is getting closed.
	 * @param reason      the reason for connection close
	 */
	@OnClose
	public void onClose(Session userSession, CloseReason reason) {
		MainLogger.log().warn("Closing websocket, {}, {}", userSession, reason);
		this.userSession = null;
	}
	
	/**
	 * Callback hook for Message Events. This method will be invoked when a client send a message.
	 *
	 * @param message The text message
	 */
	@OnMessage
	public void onMessage(String message) {
		if (this.messageHandler != null) {
			this.messageHandler.handleMessage(message);
		}
	}
	
	/**
	 * register message handler
	 *
	 * @param msgHandler
	 */
	public void addMessageHandler(MessageHandler msgHandler) {
		this.messageHandler = msgHandler;
	}
	
	/**
	 * Send a message.
	 *
	 * @param message
	 */
	public void sendMessage(String message) {
		try {
			this.userSession.getBasicRemote().sendText(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ClientManager getClient() {
		return client;
	}
	
	/**
	 * Message handler.
	 */
	public static interface MessageHandler {
		public void handleMessage(String message);
	}
}