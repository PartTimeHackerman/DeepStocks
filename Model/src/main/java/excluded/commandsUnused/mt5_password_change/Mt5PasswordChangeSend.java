
package data.binaryAPI.commandsUnused.mt5_password_change;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 user main password change
 * <p>
 * This call change main password for MT5 user
 * 
 */
public class Mt5PasswordChangeSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_password_change")
    @Expose
    private Integer mt5PasswordChange;
    /**
     * MT5 user login
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
    /**
     * Existing master password of the account.
     * 
     */
    @SerializedName("old_password")
    @Expose
    private String oldPassword;
    /**
     * New master password of the account.
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
    private final static long serialVersionUID = 8166698211520591436L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5PasswordChangeSend() {
    }

    /**
     * 
     * @param oldPassword
     * @param passthrough
     * @param newPassword
     * @param login
     * @param mt5PasswordChange
     * @param reqId
     */
    public Mt5PasswordChangeSend(Integer mt5PasswordChange, String login, String oldPassword, String newPassword, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5PasswordChange = mt5PasswordChange;
        this.login = login;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5PasswordChange() {
        return mt5PasswordChange;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5PasswordChange(Integer mt5PasswordChange) {
        this.mt5PasswordChange = mt5PasswordChange;
    }

    /**
     * MT5 user login
     * 
     */
    public String getLogin() {
        return login;
    }

    /**
     * MT5 user login
     * 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Existing master password of the account.
     * 
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Existing master password of the account.
     * 
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * New master password of the account.
     * 
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * New master password of the account.
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
        return new HashCodeBuilder().append(mt5PasswordChange).append(login).append(oldPassword).append(newPassword).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5PasswordChangeSend) == false) {
            return false;
        }
        Mt5PasswordChangeSend rhs = ((Mt5PasswordChangeSend) other);
        return new EqualsBuilder().append(mt5PasswordChange, rhs.mt5PasswordChange).append(login, rhs.login).append(oldPassword, rhs.oldPassword).append(newPassword, rhs.newPassword).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
