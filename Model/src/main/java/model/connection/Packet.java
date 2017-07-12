package model.connection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Packet {
	
	private Message sender;
	
	private Message receiver;
	
	private Class toClass;
	
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
	
	public boolean equals(Object o){
		if(o instanceof Packet)
			return this.sender.equals(((Packet) o).getSender());
		return false;
	}
	
	public void setReceiver(Object receiver) {
		this.receiver = (Message) receiver;
	}
}
