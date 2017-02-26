
package data.binaryAPI.commandsUnused.reality_check;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Reality check send
 * <p>
 * Retrieve summary of client's trades and account for the Reality Check facility. A 'reality check' means a display of time elapsed since the session began, and associated client profit/loss. The Reality Check facility is a regulatory requirement for certain landing companies.
 * 
 */
public class RealityCheckSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("reality_check")
    @Expose
    private Integer realityCheck;
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
    private final static long serialVersionUID = 5654376391871715937L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RealityCheckSend() {
    }

    /**
     * 
     * @param passthrough
     * @param realityCheck
     * @param reqId
     */
    public RealityCheckSend(Integer realityCheck, Passthrough passthrough, Integer reqId) {
        super();
        this.realityCheck = realityCheck;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getRealityCheck() {
        return realityCheck;
    }

    /**
     * Must be 1
     * 
     */
    public void setRealityCheck(Integer realityCheck) {
        this.realityCheck = realityCheck;
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
        return new HashCodeBuilder().append(realityCheck).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RealityCheckSend) == false) {
            return false;
        }
        RealityCheckSend rhs = ((RealityCheckSend) other);
        return new EqualsBuilder().append(realityCheck, rhs.realityCheck).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
