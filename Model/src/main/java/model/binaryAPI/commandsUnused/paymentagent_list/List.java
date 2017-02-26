
package data.binaryAPI.commandsUnused.paymentagent_list;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class List implements Serializable
{

    private final static long serialVersionUID = 2224743927663090250L;

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
        if ((other instanceof List) == false) {
            return false;
        }
        List rhs = ((List) other);
        return new EqualsBuilder().isEquals();
    }

}
