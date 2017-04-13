
package data.binaryAPI.commandsUnused.copy_stop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Copy Stop Send
 * <p>
 * Stop copy trader bets
 * 
 */
public class CopyStopSend implements Serializable
{

    /**
     * API tokens identifying the accounts which needs not to be copied
     * 
     */
    @SerializedName("copy_stop")
    @Expose
    private String copyStop;
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
    private final static long serialVersionUID = 525433555674548654L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopyStopSend() {
    }

    /**
     * 
     * @param copyStop
     * @param passthrough
     * @param reqId
     */
    public CopyStopSend(String copyStop, Passthrough passthrough, Integer reqId) {
        super();
        this.copyStop = copyStop;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * API tokens identifying the accounts which needs not to be copied
     * 
     */
    public String getCopyStop() {
        return copyStop;
    }

    /**
     * API tokens identifying the accounts which needs not to be copied
     * 
     */
    public void setCopyStop(String copyStop) {
        this.copyStop = copyStop;
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
        return new HashCodeBuilder().append(copyStop).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopyStopSend) == false) {
            return false;
        }
        CopyStopSend rhs = ((CopyStopSend) other);
        return new EqualsBuilder().append(copyStop, rhs.copyStop).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
