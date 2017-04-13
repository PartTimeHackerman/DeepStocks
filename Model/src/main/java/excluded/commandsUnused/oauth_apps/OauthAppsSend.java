
package data.binaryAPI.commandsUnused.oauth_apps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * OAuth Applications Send
 * <p>
 * List all my used OAuth applications.
 * 
 */
public class OauthAppsSend implements Serializable
{

    @SerializedName("oauth_apps")
    @Expose
    private Integer oauthApps;
    /**
     * Accept app_id, Revoke App Permissions and delete all tokens related to the app.
     * 
     */
    @SerializedName("revoke_app")
    @Expose
    private Integer revokeApp;
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
    private final static long serialVersionUID = 4979337235453710174L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OauthAppsSend() {
    }

    /**
     * 
     * @param revokeApp
     * @param passthrough
     * @param oauthApps
     * @param reqId
     */
    public OauthAppsSend(Integer oauthApps, Integer revokeApp, Passthrough passthrough, Integer reqId) {
        super();
        this.oauthApps = oauthApps;
        this.revokeApp = revokeApp;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getOauthApps() {
        return oauthApps;
    }

    public void setOauthApps(Integer oauthApps) {
        this.oauthApps = oauthApps;
    }

    /**
     * Accept app_id, Revoke App Permissions and delete all tokens related to the app.
     * 
     */
    public Integer getRevokeApp() {
        return revokeApp;
    }

    /**
     * Accept app_id, Revoke App Permissions and delete all tokens related to the app.
     * 
     */
    public void setRevokeApp(Integer revokeApp) {
        this.revokeApp = revokeApp;
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
        return new HashCodeBuilder().append(oauthApps).append(revokeApp).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OauthAppsSend) == false) {
            return false;
        }
        OauthAppsSend rhs = ((OauthAppsSend) other);
        return new EqualsBuilder().append(oauthApps, rhs.oauthApps).append(revokeApp, rhs.revokeApp).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
