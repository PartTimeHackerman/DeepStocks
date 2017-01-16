
package data.binaryAPI.commands.ticks_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Candle implements Serializable
{

    /**
     * It is an epoch value
     * 
     */
    @SerializedName("epoch")
    @Expose
    private Long epoch;
    /**
     * It is the open price value for the given time
     * 
     */
    @SerializedName("open")
    @Expose
    private Double open;
    /**
     * It is the high price value for the given time
     * 
     */
    @SerializedName("high")
    @Expose
    private Double high;
    /**
     * It is the low price value for the given time
     * 
     */
    @SerializedName("low")
    @Expose
    private Double low;
    /**
     * It is the close price value for the given time
     * 
     */
    @SerializedName("close")
    @Expose
    private Double close;
    private final static long serialVersionUID = -8683231578361442030L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Candle() {
    }

    /**
     * 
     * @param high
     * @param low
     * @param epoch
     * @param close
     * @param open
     */
    public Candle(Long epoch, Double open, Double high, Double low, Double close) {
        super();
        this.epoch = epoch;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }

    /**
     * It is an epoch value
     * 
     */
    public Long getEpoch() {
        return epoch;
    }

    /**
     * It is an epoch value
     * 
     */
    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    /**
     * It is the open price value for the given time
     * 
     */
    public Double getOpen() {
        return open;
    }

    /**
     * It is the open price value for the given time
     * 
     */
    public void setOpen(Double open) {
        this.open = open;
    }

    /**
     * It is the high price value for the given time
     * 
     */
    public Double getHigh() {
        return high;
    }

    /**
     * It is the high price value for the given time
     * 
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * It is the low price value for the given time
     * 
     */
    public Double getLow() {
        return low;
    }

    /**
     * It is the low price value for the given time
     * 
     */
    public void setLow(Double low) {
        this.low = low;
    }

    /**
     * It is the close price value for the given time
     * 
     */
    public Double getClose() {
        return close;
    }

    /**
     * It is the close price value for the given time
     * 
     */
    public void setClose(Double close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(epoch).append(open).append(high).append(low).append(close).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Candle) == false) {
            return false;
        }
        Candle rhs = ((Candle) other);
        return new EqualsBuilder().append(epoch, rhs.epoch).append(open, rhs.open).append(high, rhs.high).append(low, rhs.low).append(close, rhs.close).isEquals();
    }

}
