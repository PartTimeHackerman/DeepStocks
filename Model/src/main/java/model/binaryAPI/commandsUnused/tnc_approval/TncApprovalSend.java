
package data.binaryAPI.commandsUnused.tnc_approval;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * T&C Approval Send
 * <p>
 * 
 * 
 */
public class TncApprovalSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("tnc_approval")
    @Expose
    private String tncApproval;
    /**
     * for ASK_UK_FUNDS_PROTECTION in cashier
     * 
     */
    @SerializedName("ukgc_funds_protection")
    @Expose
    private Integer ukgcFundsProtection;
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
    private final static long serialVersionUID = 8027858442558580792L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TncApprovalSend() {
    }

    /**
     * 
     * @param passthrough
     * @param tncApproval
     * @param ukgcFundsProtection
     * @param reqId
     */
    public TncApprovalSend(String tncApproval, Integer ukgcFundsProtection, Passthrough passthrough, Integer reqId) {
        super();
        this.tncApproval = tncApproval;
        this.ukgcFundsProtection = ukgcFundsProtection;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public String getTncApproval() {
        return tncApproval;
    }

    /**
     * Must be 1
     * 
     */
    public void setTncApproval(String tncApproval) {
        this.tncApproval = tncApproval;
    }

    /**
     * for ASK_UK_FUNDS_PROTECTION in cashier
     * 
     */
    public Integer getUkgcFundsProtection() {
        return ukgcFundsProtection;
    }

    /**
     * for ASK_UK_FUNDS_PROTECTION in cashier
     * 
     */
    public void setUkgcFundsProtection(Integer ukgcFundsProtection) {
        this.ukgcFundsProtection = ukgcFundsProtection;
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
        return new HashCodeBuilder().append(tncApproval).append(ukgcFundsProtection).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TncApprovalSend) == false) {
            return false;
        }
        TncApprovalSend rhs = ((TncApprovalSend) other);
        return new EqualsBuilder().append(tncApproval, rhs.tncApproval).append(ukgcFundsProtection, rhs.ukgcFundsProtection).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
