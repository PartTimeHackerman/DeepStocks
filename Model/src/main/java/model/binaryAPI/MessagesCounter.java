package model.binaryAPI;

public class MessagesCounter implements IMessagesCounter {
	
	private final Integer messagesLimit;
	
	private final Integer timeLimitMillis;
	
	private Integer sendMessages = 0;
	
	private Integer elapsedTime = 0;
	
	private Long lastTime = 0L;
	
	public MessagesCounter(Integer messagesLimit, Integer timeLimitMillis){
		this.messagesLimit = messagesLimit;
		this.timeLimitMillis = timeLimitMillis;
	}
	
	private void setTime() {
		Long currentTime = System.currentTimeMillis();
		if (lastTime != 0)
			elapsedTime += (int) (currentTime - lastTime);
		lastTime = System.currentTimeMillis();
		
		if (elapsedTime >= timeLimitMillis)
			reset();
	}
	
	@Override
	public void send() {
		sendMessages++;
	}
	
	@Override
	public void reset() {
		sendMessages = 0;
		elapsedTime = 0;
		lastTime = 0L;
	}
	
	@Override
	public Integer getRemaining() {
		setTime();
		return messagesLimit - sendMessages;
	}
	
	@Override
	public Integer getElapsedTime() {
		return elapsedTime;
	}
}
