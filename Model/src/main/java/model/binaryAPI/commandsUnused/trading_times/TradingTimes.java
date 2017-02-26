
package data.binaryAPI.commandsUnused.trading_times;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Trading Times Structure
 * <p>
 * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
 * 
 */
public class TradingTimes implements Serializable
{

    private final static long serialVersionUID = 7016805802055958610L;

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
        if ((other instanceof TradingTimes) == false) {
            return false;
        }
        TradingTimes rhs = ((TradingTimes) other);
        return new EqualsBuilder().isEquals();
    }

}
