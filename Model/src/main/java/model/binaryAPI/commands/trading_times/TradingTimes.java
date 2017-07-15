
package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.data.BinaryData;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Trading Times Structure
 * <p>
 * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
 * 
 */
@Data
public class TradingTimes implements Serializable
{

    private final static long serialVersionUID = 7016805802055958610L;
    
    @SerializedName("markets")
    @Expose
    private List<Market> markets = new ArrayList<>();
    
    @Expose
    private Date date;

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
