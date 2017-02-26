
package data.binaryAPI.commandsUnused.get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get User Settings Receive
 * <p>
 * A message with User Settings
 * 
 */
public class GetSettingsReceive implements Serializable, Message
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
    /**
     * User Details
     * <p>
     * 
     * 
     */
    @SerializedName("get_settings")
    @Expose
    private GetSettings getSettings;
    /**
     * get_settings
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
    private final static long serialVersionUID = -1252648675247378013L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSettingsReceive() {
    }

    /**
     * 
     * @param msgType
     * @param getSettings
     * @param echoReq
     * @param reqId
     */
    public GetSettingsReceive(Object echoReq, GetSettings getSettings, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getSettings = getSettings;
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

    /**
     * User Details
     * <p>
     * 
     * 
     */
    public GetSettings getGetSettings() {
        return getSettings;
    }

    /**
     * User Details
     * <p>
     * 
     * 
     */
    public void setGetSettings(GetSettings getSettings) {
        this.getSettings = getSettings;
    }

    /**
     * get_settings
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_settings
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
        return new HashCodeBuilder().append(echoReq).append(getSettings).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSettingsReceive) == false) {
            return false;
        }
        GetSettingsReceive rhs = ((GetSettingsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getSettings, rhs.getSettings).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
