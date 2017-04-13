package model.connection;

public interface ProviderAPI {
	
	void send(Packet packet);
	
	void receive(Packet packet);
	
	boolean canSend();
	
	ConnectionType getConnectionType();
}
