package model.binaryAPI;

public interface IMessagesCounter {
	
	void send();
	
	void reset();
	
	Integer getRemaining();
}
