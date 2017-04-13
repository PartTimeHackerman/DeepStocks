
package data.binaryAPI.commandsUnused.get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get User Settings Send
 * <p>
 * Get User Settings (email, date of birth, address etc)
 * 
 */
public class GetSettingsSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("get_settings")
    @Expose
    private Integer getSettings;
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
    private final static long serialVersionUID = 2973188560490169531L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSettingsSend() {
    }

    /**
     * 
     * @param getSettings
     * @param passthrough
     * @param reqId
     */
    public GetSettingsSend(Integer getSettings, Passthrough passthrough, Integer reqId) {
        super();
        this.getSettings = getSettings;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getGetSettings() {
        return getSettings;
    }

    /**
     * Must be 1
     * 
     */
    public void setGetSettings(Integer getSettings) {
        this.getSettings = getSettings;
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
        return new HashCodeBuilder().append(getSettings).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSettingsSend) == false) {
            return false;
        }
        GetSettingsSend rhs = ((GetSettingsSend) other);
        return new EqualsBuilder().append(getSettings, rhs.getSettings).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
