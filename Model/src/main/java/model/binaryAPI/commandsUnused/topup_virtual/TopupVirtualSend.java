
package data.binaryAPI.commandsUnused.topup_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Top Up Virtual Request
 * <p>
 * When a virtual-money's account balance becomes low, it can be topped up using this call.
 * 
 */
public class TopupVirtualSend implements Serializable
{

    /**
     * it's only allowed for virtual account.
     * 
     */
    @SerializedName("topup_virtual")
    @Expose
    private Integer topupVirtual;
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
    private final static long serialVersionUID = 8509040584101777821L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopupVirtualSend() {
    }

    /**
     * 
     * @param passthrough
     * @param topupVirtual
     * @param reqId
     */
    public TopupVirtualSend(Integer topupVirtual, Passthrough passthrough, Integer reqId) {
        super();
        this.topupVirtual = topupVirtual;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * it's only allowed for virtual account.
     * 
     */
    public Integer getTopupVirtual() {
        return topupVirtual;
    }

    /**
     * it's only allowed for virtual account.
     * 
     */
    public void setTopupVirtual(Integer topupVirtual) {
        this.topupVirtual = topupVirtual;
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
        return new HashCodeBuilder().append(topupVirtual).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopupVirtualSend) == false) {
            return false;
        }
        TopupVirtualSend rhs = ((TopupVirtualSend) other);
        return new EqualsBuilder().append(topupVirtual, rhs.topupVirtual).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
