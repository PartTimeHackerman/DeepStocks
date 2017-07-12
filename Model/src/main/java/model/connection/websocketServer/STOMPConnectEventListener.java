package model.connection.websocketServer;

import model.connection.websocketServer.STOMPSessionsManager;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.messaging.SessionConnectEvent;

@Service
public class STOMPConnectEventListener implements ApplicationListener<SessionConnectEvent> {
	
	@Autowired
	private STOMPSessionsManager stompSessionManager;
	
	@Override
	public void onApplicationEvent(SessionConnectEvent event) {
		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());
		
		String userID = sha.getNativeHeader("user").get(0);
		String sessionID = sha.getSessionId();
		
		stompSessionManager.addSession(userID, sessionID);
		
		MainLogger.log(this).debug("Connected: {} {}", userID, sessionID);
	}
}
