
package data.binaryAPI.commandsUnused.proposal_array;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Error message
 * 
 */
public class Error implements Serializable
{

    private final static long serialVersionUID = 4814335646945337367L;

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
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return new EqualsBuilder().isEquals();
    }

}
