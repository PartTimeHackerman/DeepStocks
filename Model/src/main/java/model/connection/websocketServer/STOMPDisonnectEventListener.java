package model.connection.websocketServer;

import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Service
public class STOMPDisonnectEventListener implements ApplicationListener<SessionDisconnectEvent> {
	
	@Autowired
	private STOMPSessionsManager stompSessionManager;
	
	
	@Override
	public void onApplicationEvent(SessionDisconnectEvent event) {
		StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());
		
		String userID = "";
		String sessionID = sha.getSessionId();
		
		try {
			userID = sha.getNativeHeader("user").get(0);
		} catch (Exception ignored) {
		}
		
		if (userID.equals(""))
			stompSessionManager.removeSession(sessionID);
		else
			stompSessionManager.removeUserSession(userID, sessionID);
		
		MainLogger.log(this).debug("Disconnected {} {}", userID, sessionID);
	}
}
