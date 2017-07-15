package model.binaryAPI;

import model.connection.ConnectionType;
import model.utils.MainLogger;
import model.utils.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import javax.websocket.DeploymentException;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class BinaryAPIProvider {
	
	private final LinkedBlockingQueue<BinaryAPI> apis = new LinkedBlockingQueue<>();
	private final Integer maxApis = 5;
	private final BinaryAPIFactory binaryAPIFactory;
	private final Executor singleThreadExecutor = Executors.newSingleThreadExecutor();
	private final AtomicBoolean creatingApi = new AtomicBoolean(false);
	
	@Autowired
	public BinaryAPIProvider(BinaryAPIFactory binaryAPIFactory) {
		this.binaryAPIFactory = binaryAPIFactory;
		Vaer.get().group(getClass().getSimpleName()).variable("Apis").setVariableGetter(apis::size);
	}
	
	public BinaryAPI getDirectApi() {
		return getApiByType(ConnectionType.DIRECT);
	}
	
	public BinaryAPI getApiByType(ConnectionType connectionType) {
		BinaryAPI api = getApiThatCanSendMessage(connectionType);
		
		if (api == null) {
			api = createNewApi(connectionType);
		}
		
		if (!api.isConnected()) {
			api = reconnectOrCreateNewApi(api, connectionType);
		}
		
		apis.remove(api);
		apis.offer(api);
		
		if (getRemainingMessages() / (double)(apis.size() * BinaryAPI.maxMessages) < 0.5 && apis.size() < maxApis && !creatingApi.get())
			createApi(connectionType);
		
		return api;
	}
	
	private BinaryAPI getApiThatCanSendMessage(ConnectionType connectionType) {
		return apis.stream()
				.filter(BinaryAPI::canSend)
				.filter(binaryAPI ->
								binaryAPI.getConnectionType() == connectionType)
				.findFirst().orElse(null);
	}
	
	private BinaryAPI createNewApi(ConnectionType connectionType) {
		//MainLogger.log(this).info("No api avaiable, creating new one");
		BinaryAPI api = null;
		if (apis.size() >= maxApis) {
			//MainLogger.log(this).info("All apis are busy and apis list is full, waiting for a free one");
			api = waitForFreeApi(connectionType);
		} else if (!creatingApi.get()) {
			createApi(connectionType);
		}
		
		if (api == null)
			api = waitForFreeApi(connectionType);
		
		return api;
	}
	
	private void createApi(ConnectionType connectionType){
		singleThreadExecutor.execute(() -> {
			creatingApi.set(true);
			try {
				BinaryAPI newApi = binaryAPIFactory.createApiByConnectionType(connectionType);
				apis.offer(newApi);
			} catch (IOException | DeploymentException e) {
				MainLogger.log(this).fatal("Can't create binary api, cause: {}", e);
			}
			creatingApi.set(false);
		});
	}
	
	public Integer getRemainingMessages(){
		return apis.stream().mapToInt(api -> api.getMessageCounter().getRemaining()).sum();
	}
	
	private BinaryAPI waitForFreeApi(ConnectionType connectionType) {
		Waiter.wait(1000L, TimeUnit.MILLISECONDS);
		return getApiByType(connectionType);
	}
	
	private BinaryAPI reconnectOrCreateNewApi(BinaryAPI api, ConnectionType connectionType) {
		if (!api.reconnect()) {
			apis.remove(api);
			return getApiByType(connectionType);
		}
		return api;
	}
}
