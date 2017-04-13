
package data.binaryAPI.commandsUnused.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Trading Times Send
 * <p>
 * Receive a list of marketing opening times for a given date
 * 
 */
public class TradingTimesSend implements Serializable
{

    /**
     * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
     * 
     */
    @SerializedName("trading_times")
    @Expose
    private String tradingTimes;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -8040453978274868357L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradingTimesSend() {
    }

    /**
     * 
     * @param tradingTimes
     * @param passthrough
     * @param reqId
     */
    public TradingTimesSend(String tradingTimes, Passthrough passthrough, Integer reqId) {
        super();
        this.tradingTimes = tradingTimes;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
     * 
     */
    public String getTradingTimes() {
        return tradingTimes;
    }

    /**
     * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
     * 
     */
    public void setTradingTimes(String tradingTimes) {
        this.tradingTimes = tradingTimes;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public Passthrough getPassthrough() {
        return passthrough;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public void setPassthrough(Passthrough passthrough) {
        this.passthrough = passthrough;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tradingTimes).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradingTimesSend) == false) {
            return false;
        }
        TradingTimesSend rhs = ((TradingTimesSend) other);
        return new EqualsBuilder().append(tradingTimes, rhs.tradingTimes).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
