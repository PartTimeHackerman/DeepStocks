
package data.binaryAPI.commandsUnused.contracts_for;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * A hash of predefined trading period (only return if region set to 'japan')
 * 
 */
public class TradingPeriod implements Serializable
{

    private final static long serialVersionUID = 2282298817806859786L;

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
        if ((other instanceof TradingPeriod) == false) {
            return false;
        }
        TradingPeriod rhs = ((TradingPeriod) other);
        return new EqualsBuilder().isEquals();
    }

}
