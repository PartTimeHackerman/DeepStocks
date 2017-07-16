package model.exception;

public class RateLimitException extends Exception {
	
	public RateLimitException() {
		super("Rate limit");
	}
}
