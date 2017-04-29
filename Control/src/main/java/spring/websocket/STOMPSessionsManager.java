package spring.websocket;

import model.utils.MainLogger;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class STOMPSessionsManager {
	
	private Map<String, List<String>> usersSessions = new HashMap<>();
	
	public void addSession(String user, String session) {
		if (!usersSessions.containsKey(user))
			usersSessions.put(user, new ArrayList<>());
		
		usersSessions.get(user).add(session);
		
		MainLogger.log().debug(usersSessions);
	}
	
	public void removeUserSession(String user, String session) {
		List<String> userSessions = usersSessions.get(user);
		if (userSessions == null)
			return;
		
		userSessions.remove(session);
		
		if (userSessions.isEmpty())
			removeUser(user);
	}
	
	public void removeSession(String session) {
		getAllUsers().forEach(user -> removeUserSession(user, session));
	}
	
	public void removeUser(String user) {
		usersSessions.remove(user);
	}
	
	public List<String> getAllUsers() {
		return usersSessions
				.entrySet()
				.stream()
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
	
	public List<String> getSessionsFor(String user) {
		return Optional
				.of(usersSessions.get(user))
				.orElse(new ArrayList<>());
	}
	
}
