
package data.binaryAPI.commandsUnused.change_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Change Password Request
 * <p>
 * Change Password. Note: this call is NOT available when authenticated to a per-app token. It is only available for in-house Binary.com apps.
 * 
 */
public class ChangePasswordSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("change_password")
    @Expose
    private String changePassword;
    /**
     * Old password for validation (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    @SerializedName("old_password")
    @Expose
    private String oldPassword;
    /**
     * New password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    @SerializedName("new_password")
    @Expose
    private String newPassword;
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
    private final static long serialVersionUID = -4291346656112160979L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChangePasswordSend() {
    }

    /**
     * 
     * @param oldPassword
     * @param passthrough
     * @param newPassword
     * @param changePassword
     * @param reqId
     */
    public ChangePasswordSend(String changePassword, String oldPassword, String newPassword, Passthrough passthrough, Integer reqId) {
        super();
        this.changePassword = changePassword;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public String getChangePassword() {
        return changePassword;
    }

    /**
     * Must be 1
     * 
     */
    public void setChangePassword(String changePassword) {
        this.changePassword = changePassword;
    }

    /**
     * Old password for validation (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Old password for validation (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * New password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * New password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
        return new HashCodeBuilder().append(changePassword).append(oldPassword).append(newPassword).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangePasswordSend) == false) {
            return false;
        }
        ChangePasswordSend rhs = ((ChangePasswordSend) other);
        return new EqualsBuilder().append(changePassword, rhs.changePassword).append(oldPassword, rhs.oldPassword).append(newPassword, rhs.newPassword).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
