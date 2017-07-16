package model.exception;

public class AuthorizationException extends Exception {
	public AuthorizationException() {
		super("Authorization required");
	}
}
