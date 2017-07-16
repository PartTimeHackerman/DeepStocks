package model.connection;

public interface APIsfactory<T extends ProviderAPI> {
	
	T createDirectApi() throws Exception;
	
	T createApiByConnectionType(ConnectionType connectionType) throws Exception;
}
