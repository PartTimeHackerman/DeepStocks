
package model.binaryAPI.commands.ticks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * TickSpotData
 * <p>
 * Tick by tick list of streamed data
 * 
 */
public class Candle implements Serializable
{

    /**
     * Epoch time of the tick
     * 
     */
    @SerializedName("epoch")
    @Expose
    private Integer epoch;
    /**
     * A stream id that can be used to cancel this stream using the Forget request
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Market value at the epoch
     * 
     */
    @SerializedName("quote")
    @Expose
    private Double quote;
    /**
     * Symbol
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    private final static long serialVersionUID = 1210057949227445694L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Candle() {
    }

    /**
     * 
     * @param symbol
     * @param quote
     * @param epoch
     * @param id
     */
    public Candle(Integer epoch, String id, Double quote, String symbol) {
        super();
        this.epoch = epoch;
        this.id = id;
        this.quote = quote;
        this.symbol = symbol;
    }

    /**
     * Epoch time of the tick
     * 
     */
    public Integer getEpoch() {
        return epoch;
    }

    /**
     * Epoch time of the tick
     * 
     */
    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Market value at the epoch
     * 
     */
    public Double getQuote() {
        return quote;
    }

    /**
     * Market value at the epoch
     * 
     */
    public void setQuote(Double quote) {
        this.quote = quote;
    }

    /**
     * Symbol
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Symbol
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(epoch).append(id).append(quote).append(symbol).toHashCode();
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
        return new EqualsBuilder().append(epoch, rhs.epoch).append(id, rhs.id).append(quote, rhs.quote).append(symbol, rhs.symbol).isEquals();
    }

}
