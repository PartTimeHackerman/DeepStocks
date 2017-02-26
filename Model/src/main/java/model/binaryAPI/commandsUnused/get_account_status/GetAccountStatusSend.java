
package data.binaryAPI.commandsUnused.get_account_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get Account Status Send
 * <p>
 * Get Account Status
 * 
 */
public class GetAccountStatusSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("get_account_status")
    @Expose
    private Integer getAccountStatus;
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
    private final static long serialVersionUID = 1064665951966193189L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetAccountStatusSend() {
    }

    /**
     * 
     * @param getAccountStatus
     * @param passthrough
     * @param reqId
     */
    public GetAccountStatusSend(Integer getAccountStatus, Passthrough passthrough, Integer reqId) {
        super();
        this.getAccountStatus = getAccountStatus;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getGetAccountStatus() {
        return getAccountStatus;
    }

    /**
     * Must be 1
     * 
     */
    public void setGetAccountStatus(Integer getAccountStatus) {
        this.getAccountStatus = getAccountStatus;
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
        return new HashCodeBuilder().append(getAccountStatus).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountStatusSend) == false) {
            return false;
        }
        GetAccountStatusSend rhs = ((GetAccountStatusSend) other);
        return new EqualsBuilder().append(getAccountStatus, rhs.getAccountStatus).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
