
package data.binaryAPI.commandsUnused.mt5_password_check;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 user main password check
 * <p>
 * This call validates the main password for the MT5 user
 * 
 */
public class Mt5PasswordCheckSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_password_check")
    @Expose
    private Integer mt5PasswordCheck;
    /**
     * MT5 user login
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
    /**
     * the master password of the account.
     * 
     */
    @SerializedName("password")
    @Expose
    private String password;
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
    private final static long serialVersionUID = 3143022790385047281L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5PasswordCheckSend() {
    }

    /**
     * 
     * @param password
     * @param mt5PasswordCheck
     * @param passthrough
     * @param login
     * @param reqId
     */
    public Mt5PasswordCheckSend(Integer mt5PasswordCheck, String login, String password, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5PasswordCheck = mt5PasswordCheck;
        this.login = login;
        this.password = password;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5PasswordCheck() {
        return mt5PasswordCheck;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5PasswordCheck(Integer mt5PasswordCheck) {
        this.mt5PasswordCheck = mt5PasswordCheck;
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
     * the master password of the account.
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * the master password of the account.
     * 
     */
    public void setPassword(String password) {
        this.password = password;
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
        return new HashCodeBuilder().append(mt5PasswordCheck).append(login).append(password).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5PasswordCheckSend) == false) {
            return false;
        }
        Mt5PasswordCheckSend rhs = ((Mt5PasswordCheckSend) other);
        return new EqualsBuilder().append(mt5PasswordCheck, rhs.mt5PasswordCheck).append(login, rhs.login).append(password, rhs.password).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
