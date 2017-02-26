
package data.binaryAPI.commandsUnused.copytrading_statistics;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Represents the net change in equity per year.
 * 
 */
public class YearlyProfitableTrades implements Serializable
{

    private final static long serialVersionUID = -5134763530674700259L;

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
        if ((other instanceof YearlyProfitableTrades) == false) {
            return false;
        }
        YearlyProfitableTrades rhs = ((YearlyProfitableTrades) other);
        return new EqualsBuilder().isEquals();
    }

}
