package model.binaryAPI;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.stream.IntStream;

public class MinuteMessagesCounterTest {
	
	private IMessagesCounter messagesCounter = new MinuteMessagesCounter(10, 1000);
	
	@Test
	public void send() throws Exception {
		IntStream.range(0, 11).forEach(i -> messagesCounter.send());
		assertTrue(messagesCounter.getRemaining() < 0);
		Thread.sleep(1500);
		assertTrue(messagesCounter.getRemaining() == 10);
	}
	
	@Test
	public void reset() throws Exception {
		messagesCounter.reset();
		assertTrue(messagesCounter.getRemaining() == 10);
	}
	
}