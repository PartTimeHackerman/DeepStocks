package model.binaryAPI.commands.ticks_history;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
 */
public class Passthrough implements Serializable {
	
	private static final long serialVersionUID = 7386317363659254509L;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Passthrough) == false) {
			return false;
		}
		Passthrough rhs = ((Passthrough) other);
		return new EqualsBuilder().isEquals();
	}

}
