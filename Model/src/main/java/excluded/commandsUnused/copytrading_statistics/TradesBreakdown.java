
package data.binaryAPI.commandsUnused.copytrading_statistics;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Represents the portfolio distribution by markets.
 * 
 */
public class TradesBreakdown implements Serializable
{

    private final static long serialVersionUID = -7699742095806141788L;

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
        if ((other instanceof TradesBreakdown) == false) {
            return false;
        }
        TradesBreakdown rhs = ((TradesBreakdown) other);
        return new EqualsBuilder().isEquals();
    }

}
