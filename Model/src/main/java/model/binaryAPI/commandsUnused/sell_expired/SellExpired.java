
package data.binaryAPI.commandsUnused.sell_expired;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Sell expired contract object containing count of contracts sold
 * 
 */
public class SellExpired implements Serializable
{

    /**
     * Example: 10
     * 
     */
    @SerializedName("count")
    @Expose
    private Integer count;
    private final static long serialVersionUID = 1366852202653889017L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellExpired() {
    }

    /**
     * 
     * @param count
     */
    public SellExpired(Integer count) {
        super();
        this.count = count;
    }

    /**
     * Example: 10
     * 
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Example: 10
     * 
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellExpired) == false) {
            return false;
        }
        SellExpired rhs = ((SellExpired) other);
        return new EqualsBuilder().append(count, rhs.count).isEquals();
    }

}
