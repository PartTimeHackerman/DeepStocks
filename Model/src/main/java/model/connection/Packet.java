package model.connection;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Packet {
	
	private Message sender;
	
	private Message receiver;
	
	private Class to;
	
	private Object optional;
	
	private ConnectionType connectionType = ConnectionType.DIRECT;
	
	private Exception exception;
	
	private boolean wait;
	
	public Packet(Message sender){
		this.sender = sender;
	}
	
	public Packet(Message sender, Object optional){
		this.sender = sender;
		this.optional = optional;
	}
	
	public Message getSender() {
		return sender;
	}
	
	public void setSender(Message sender) {
		this.sender = sender;
	}
	
	public Message getReceiver() {
		return receiver;
	}
	
	public void setReceiver(Message receiver) {
		this.receiver = receiver;
	}
	
	public void setReceiver(Object receiver) {
		this.receiver = (Message) receiver;
	}
	
	public Class getTo() {
		return to;
	}
	
	public void setTo(Class to) {
		this.to = to;
	}
	
	public Object getOptional() {
		return optional;
	}
	
	public void setOptional(Object optional) {
		this.optional = optional;
	}
	
	public boolean isWait() {
		return wait;
	}
	
	public void setWait(boolean wait) {
		this.wait = wait;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	public Exception getException() {
		return exception;
	}
	
	public void setException(Exception exception) {
		this.exception = exception;
	}
}
