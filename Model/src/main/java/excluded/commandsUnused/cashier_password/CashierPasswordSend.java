
package data.binaryAPI.commandsUnused.cashier_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Cashier Password Request
 * <p>
 * Facilities to manage the Cashier Password, which allows users to lock access to their Cashier using a special password.
 * 
 */
public class CashierPasswordSend implements Serializable
{

    /**
     * if neither lock_password nor unlock_password is passed, we'll just return the status for cashier
     * 
     */
    @SerializedName("cashier_password")
    @Expose
    private String cashierPassword;
    /**
     * old password to unlock cashier, required for unlock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    @SerializedName("unlock_password")
    @Expose
    private String unlockPassword;
    /**
     * new password to lock cashier, required for lock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    @SerializedName("lock_password")
    @Expose
    private String lockPassword;
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
    private final static long serialVersionUID = 4961062506920722270L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CashierPasswordSend() {
    }

    /**
     * 
     * @param cashierPassword
     * @param unlockPassword
     * @param lockPassword
     * @param passthrough
     * @param reqId
     */
    public CashierPasswordSend(String cashierPassword, String unlockPassword, String lockPassword, Passthrough passthrough, Integer reqId) {
        super();
        this.cashierPassword = cashierPassword;
        this.unlockPassword = unlockPassword;
        this.lockPassword = lockPassword;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * if neither lock_password nor unlock_password is passed, we'll just return the status for cashier
     * 
     */
    public String getCashierPassword() {
        return cashierPassword;
    }

    /**
     * if neither lock_password nor unlock_password is passed, we'll just return the status for cashier
     * 
     */
    public void setCashierPassword(String cashierPassword) {
        this.cashierPassword = cashierPassword;
    }

    /**
     * old password to unlock cashier, required for unlock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public String getUnlockPassword() {
        return unlockPassword;
    }

    /**
     * old password to unlock cashier, required for unlock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public void setUnlockPassword(String unlockPassword) {
        this.unlockPassword = unlockPassword;
    }

    /**
     * new password to lock cashier, required for lock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public String getLockPassword() {
        return lockPassword;
    }

    /**
     * new password to lock cashier, required for lock (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public void setLockPassword(String lockPassword) {
        this.lockPassword = lockPassword;
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
        return new HashCodeBuilder().append(cashierPassword).append(unlockPassword).append(lockPassword).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashierPasswordSend) == false) {
            return false;
        }
        CashierPasswordSend rhs = ((CashierPasswordSend) other);
        return new EqualsBuilder().append(cashierPassword, rhs.cashierPassword).append(unlockPassword, rhs.unlockPassword).append(lockPassword, rhs.lockPassword).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
