
package binaryAPI.commands.ticks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Tick Stream Request
 * <p>
 * Initiate a continuous stream of spot price updates for a given symbol
 * 
 */
public class TicksSend implements Serializable, BinaryMessage
{

    /**
     * The short symbol name or array of symbols. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    @SerializedName("ticks")
    @Expose
    private Object ticks;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * If set to 1, will send updates whenever the price changes
     * 
     */
    @SerializedName("subscribe")
    @Expose
    private Integer subscribe;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 8351304081911561720L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicksSend() {
    }

    /**
     * 
     * @param ticks
     * @param subscribe
     * @param passthrough
     * @param reqId
     */
    public TicksSend(Object ticks, Passthrough passthrough, Integer subscribe, Integer reqId) {
        super();
        this.ticks = ticks;
        this.passthrough = passthrough;
        this.subscribe = subscribe;
        this.reqId = reqId;
    }

    /**
     * The short symbol name or array of symbols. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    public Object getTicks() {
        return ticks;
    }

    /**
     * The short symbol name or array of symbols. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    public void setTicks(Object ticks) {
        this.ticks = ticks;
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
     * If set to 1, will send updates whenever the price changes
     * 
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * If set to 1, will send updates whenever the price changes
     * 
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
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
        return new HashCodeBuilder().append(ticks).append(passthrough).append(subscribe).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicksSend) == false) {
            return false;
        }
        TicksSend rhs = ((TicksSend) other);
        return new EqualsBuilder().append(ticks, rhs.ticks).append(passthrough, rhs.passthrough).append(subscribe, rhs.subscribe).append(reqId, rhs.reqId).isEquals();
    }

}
