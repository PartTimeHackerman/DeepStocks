
package data.binaryAPI.commandsUnused.get_self_exclusion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get User Self-Exclusion Send
 * <p>
 * Binary.com allows users to exclude themselves from the website for certain periods of time, or to set limits on their trading activities. This facility is a regulatory requirement for certain Landing Companies.
 * 
 */
public class GetSelfExclusionSend implements Serializable
{

    /**
     * Must be 1
     * (Required)
     * 
     */
    @SerializedName("get_self_exclusion")
    @Expose
    private Integer getSelfExclusion;
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
    private final static long serialVersionUID = 9137423359401282147L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSelfExclusionSend() {
    }

    /**
     * 
     * @param getSelfExclusion
     * @param passthrough
     * @param reqId
     */
    public GetSelfExclusionSend(Integer getSelfExclusion, Passthrough passthrough, Integer reqId) {
        super();
        this.getSelfExclusion = getSelfExclusion;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * (Required)
     * 
     */
    public Integer getGetSelfExclusion() {
        return getSelfExclusion;
    }

    /**
     * Must be 1
     * (Required)
     * 
     */
    public void setGetSelfExclusion(Integer getSelfExclusion) {
        this.getSelfExclusion = getSelfExclusion;
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
        return new HashCodeBuilder().append(getSelfExclusion).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSelfExclusionSend) == false) {
            return false;
        }
        GetSelfExclusionSend rhs = ((GetSelfExclusionSend) other);
        return new EqualsBuilder().append(getSelfExclusion, rhs.getSelfExclusion).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
