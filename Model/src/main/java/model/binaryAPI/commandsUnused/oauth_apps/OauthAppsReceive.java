
package data.binaryAPI.commandsUnused.oauth_apps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * OAuth Apps Receive
 * <p>
 * A message with used applications
 * 
 */
public class OauthAppsReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    @SerializedName("oauth_apps")
    @Expose
    private List<OauthApp> oauthApps = new ArrayList<OauthApp>();
    /**
     * oauth_apps
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 4280132481897638721L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OauthAppsReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param oauthApps
     * @param reqId
     */
    public OauthAppsReceive(Object echoReq, List<OauthApp> oauthApps, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.oauthApps = oauthApps;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    public List<OauthApp> getOauthApps() {
        return oauthApps;
    }

    public void setOauthApps(List<OauthApp> oauthApps) {
        this.oauthApps = oauthApps;
    }

    /**
     * oauth_apps
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * oauth_apps
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(oauthApps).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OauthAppsReceive) == false) {
            return false;
        }
        OauthAppsReceive rhs = ((OauthAppsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(oauthApps, rhs.oauthApps).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
