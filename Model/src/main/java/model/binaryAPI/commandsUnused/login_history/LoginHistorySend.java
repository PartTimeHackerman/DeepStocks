
package data.binaryAPI.commandsUnused.login_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Login History
 * <p>
 * Retrieve a summary of login history for user.
 * 
 */
public class LoginHistorySend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("login_history")
    @Expose
    private Integer loginHistory;
    /**
     * Apply limit to count of login history records, default to 10. Max:50
     * 
     */
    @SerializedName("limit")
    @Expose
    private Integer limit = 10;
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
    private final static long serialVersionUID = 5886142345875907404L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoginHistorySend() {
    }

    /**
     * 
     * @param loginHistory
     * @param limit
     * @param passthrough
     * @param reqId
     */
    public LoginHistorySend(Integer loginHistory, Integer limit, Passthrough passthrough, Integer reqId) {
        super();
        this.loginHistory = loginHistory;
        this.limit = limit;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getLoginHistory() {
        return loginHistory;
    }

    /**
     * Must be 1.
     * 
     */
    public void setLoginHistory(Integer loginHistory) {
        this.loginHistory = loginHistory;
    }

    /**
     * Apply limit to count of login history records, default to 10. Max:50
     * 
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Apply limit to count of login history records, default to 10. Max:50
     * 
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
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
        return new HashCodeBuilder().append(loginHistory).append(limit).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginHistorySend) == false) {
            return false;
        }
        LoginHistorySend rhs = ((LoginHistorySend) other);
        return new EqualsBuilder().append(loginHistory, rhs.loginHistory).append(limit, rhs.limit).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
