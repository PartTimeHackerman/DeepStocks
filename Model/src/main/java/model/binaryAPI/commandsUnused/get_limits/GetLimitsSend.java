
package data.binaryAPI.commandsUnused.get_limits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get Limits Send
 * <p>
 * Trading and Withdrawal Limits for a given user
 * 
 */
public class GetLimitsSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("get_limits")
    @Expose
    private Integer getLimits;
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
    private final static long serialVersionUID = -4389880180011858224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetLimitsSend() {
    }

    /**
     * 
     * @param getLimits
     * @param passthrough
     * @param reqId
     */
    public GetLimitsSend(Integer getLimits, Passthrough passthrough, Integer reqId) {
        super();
        this.getLimits = getLimits;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getGetLimits() {
        return getLimits;
    }

    /**
     * Must be 1
     * 
     */
    public void setGetLimits(Integer getLimits) {
        this.getLimits = getLimits;
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
        return new HashCodeBuilder().append(getLimits).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLimitsSend) == false) {
            return false;
        }
        GetLimitsSend rhs = ((GetLimitsSend) other);
        return new EqualsBuilder().append(getLimits, rhs.getLimits).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
