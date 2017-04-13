
package data.binaryAPI.commandsUnused.sell_expired;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Sell expired contracts
 * <p>
 * This call will try to sell any expired contracts and return the number of sold contracts.
 * 
 */
public class SellExpiredSend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("sell_expired")
    @Expose
    private Integer sellExpired;
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
    private final static long serialVersionUID = -2738235446218797091L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellExpiredSend() {
    }

    /**
     * 
     * @param sellExpired
     * @param passthrough
     * @param reqId
     */
    public SellExpiredSend(Integer sellExpired, Passthrough passthrough, Integer reqId) {
        super();
        this.sellExpired = sellExpired;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getSellExpired() {
        return sellExpired;
    }

    /**
     * Must be 1.
     * 
     */
    public void setSellExpired(Integer sellExpired) {
        this.sellExpired = sellExpired;
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
        return new HashCodeBuilder().append(sellExpired).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellExpiredSend) == false) {
            return false;
        }
        SellExpiredSend rhs = ((SellExpiredSend) other);
        return new EqualsBuilder().append(sellExpired, rhs.sellExpired).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
