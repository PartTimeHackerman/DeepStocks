package model.binaryAPI;

import model.connection.ConnectionType;
import model.utils.Interval;
import model.utils.MainLogger;
import model.utils.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

@Service
public class BinaryAPIProvider {
	
	private final Vector<BinaryAPI> apis = new Vector<>();
	private final Integer maxApis = 100;
	private final BinaryAPIFactory binaryAPIFactory;
	
	@Autowired
	public BinaryAPIProvider(BinaryAPIFactory binaryAPIFactory) {
		this.binaryAPIFactory = binaryAPIFactory;
		Vaer.get().group(getClass().getSimpleName()).variable("Apis").setVariableGetter(apis::size);
	}
	
	public BinaryAPI getDirectApi() {
		return getApiByType(ConnectionType.DIRECT);
	}
	
	public BinaryAPI getApiByType(ConnectionType connectionType) {
		BinaryAPI api = getApiThatCanSendMssage(connectionType);
		
		if (api == null) {
			api = createNewApi(connectionType);
		}
		
		if (!api.isConnected()) {
			api = reconnectOrCreateNewApi(api, connectionType);
		}
		
		return api;
	}
	
	private BinaryAPI getApiThatCanSendMssage(ConnectionType connectionType) {
		return apis.stream()
				.filter(BinaryAPI::canSend)
				.filter(binaryAPI ->
								binaryAPI.getConnectionType() == connectionType)
				.findFirst().orElse(null);
	}
	
	private BinaryAPI createNewApi(ConnectionType connectionType) {
		MainLogger.log(this).info("No api avaiable, creating new one");
		BinaryAPI api;
		if (apis.size() >= maxApis) {
			MainLogger.log(this).info("All apis are busy and apis list is full, waiting for a free one");
			api = waitForFreeApi(connectionType);
		} else {
			try {
				api = binaryAPIFactory.createApiByConnectionType(connectionType);
				apis.add(api);
			} catch (IOException | DeploymentException e) {
				MainLogger.log(this).fatal("Can't create binary api, cause: {}", e);
				api = waitForFreeApi(connectionType);
			}
		}
		addToEnd(api);
		return api;
	}
	
	private BinaryAPI waitForFreeApi(ConnectionType connectionType) {
		Waiter.wait(500L, TimeUnit.MILLISECONDS);
		return getApiByType(connectionType);
	}
	
	private BinaryAPI reconnectOrCreateNewApi(BinaryAPI api, ConnectionType connectionType) {
		if (!api.reconnect()) {
			apis.remove(api);
			return getApiByType(connectionType);
		}
		return api;
	}
	
	private void addToEnd(BinaryAPI api){
		apis.remove(api);
		apis.add(api);
	}
}
