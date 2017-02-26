
package data.binaryAPI.commandsUnused.forget;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Cancel an Incoming Stream Send
 * <p>
 * Immediately cancel the real-time stream of messages with id ID
 * 
 */
public class ForgetSend implements Serializable
{

    /**
     * ID of the real-time stream of messages to cancel
     * 
     */
    @SerializedName("forget")
    @Expose
    private String forget;
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
    private final static long serialVersionUID = -8794281912397870062L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForgetSend() {
    }

    /**
     * 
     * @param forget
     * @param passthrough
     * @param reqId
     */
    public ForgetSend(String forget, Passthrough passthrough, Integer reqId) {
        super();
        this.forget = forget;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * ID of the real-time stream of messages to cancel
     * 
     */
    public String getForget() {
        return forget;
    }

    /**
     * ID of the real-time stream of messages to cancel
     * 
     */
    public void setForget(String forget) {
        this.forget = forget;
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
        return new HashCodeBuilder().append(forget).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForgetSend) == false) {
            return false;
        }
        ForgetSend rhs = ((ForgetSend) other);
        return new EqualsBuilder().append(forget, rhs.forget).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
