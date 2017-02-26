
package data.binaryAPI.commandsUnused.copytrading_statistics;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Represents the net change in equity per month.
 * 
 */
public class MonthlyProfitableTrades implements Serializable
{

    private final static long serialVersionUID = -7195245144068955532L;

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
        if ((other instanceof MonthlyProfitableTrades) == false) {
            return false;
        }
        MonthlyProfitableTrades rhs = ((MonthlyProfitableTrades) other);
        return new EqualsBuilder().isEquals();
    }

}
