package model.binaryAPI;

public class MinuteMessagesCounter implements IMessagesCounter {
	
	private final Integer messagesLimit = 240;
	
	private final Integer timeLimitMillis = 60 * 1000;
	
	private Integer sendMessages = 0;
	
	private Integer elapsedTime = 0;
	
	private Long lastTime = 0L;
	
	private void setTime() {
		Long currentTime = System.currentTimeMillis();
		if (lastTime != 0)
			elapsedTime += (int) (lastTime - currentTime);
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
	public Integer getRemained() {
		setTime();
		return messagesLimit - sendMessages;
	}
}
