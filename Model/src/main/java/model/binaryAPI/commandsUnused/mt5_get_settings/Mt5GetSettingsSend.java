
package data.binaryAPI.commandsUnused.mt5_get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get MT5 user setting
 * <p>
 * Get MT5 user account settings
 * 
 */
public class Mt5GetSettingsSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_get_settings")
    @Expose
    private Integer mt5GetSettings;
    /**
     * MT5 user login
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
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
    private final static long serialVersionUID = 985885351011655468L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5GetSettingsSend() {
    }

    /**
     * 
     * @param mt5GetSettings
     * @param passthrough
     * @param login
     * @param reqId
     */
    public Mt5GetSettingsSend(Integer mt5GetSettings, String login, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5GetSettings = mt5GetSettings;
        this.login = login;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5GetSettings() {
        return mt5GetSettings;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5GetSettings(Integer mt5GetSettings) {
        this.mt5GetSettings = mt5GetSettings;
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
        return new HashCodeBuilder().append(mt5GetSettings).append(login).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5GetSettingsSend) == false) {
            return false;
        }
        Mt5GetSettingsSend rhs = ((Mt5GetSettingsSend) other);
        return new EqualsBuilder().append(mt5GetSettings, rhs.mt5GetSettings).append(login, rhs.login).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
