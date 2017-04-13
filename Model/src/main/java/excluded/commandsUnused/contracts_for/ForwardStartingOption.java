
package data.binaryAPI.commandsUnused.contracts_for;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class ForwardStartingOption implements Serializable
{

    private final static long serialVersionUID = 5767621932898861844L;

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
        if ((other instanceof ForwardStartingOption) == false) {
            return false;
        }
        ForwardStartingOption rhs = ((ForwardStartingOption) other);
        return new EqualsBuilder().isEquals();
    }

}
