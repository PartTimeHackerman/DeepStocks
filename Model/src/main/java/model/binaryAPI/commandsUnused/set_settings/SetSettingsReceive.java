
package data.binaryAPI.commandsUnused.set_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Set User Settings Receive
 * <p>
 * A message with User Settings
 * 
 */
public class SetSettingsReceive implements Serializable, Message
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
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("set_settings")
    @Expose
    private Integer setSettings;
    /**
     * set_settings
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
    private final static long serialVersionUID = -4893568456159485622L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetSettingsReceive() {
    }

    /**
     * 
     * @param setSettings
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public SetSettingsReceive(Object echoReq, Integer setSettings, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.setSettings = setSettings;
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
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getSetSettings() {
        return setSettings;
    }

    /**
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    public void setSetSettings(Integer setSettings) {
        this.setSettings = setSettings;
    }

    /**
     * set_settings
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * set_settings
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
        return new HashCodeBuilder().append(echoReq).append(setSettings).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetSettingsReceive) == false) {
            return false;
        }
        SetSettingsReceive rhs = ((SetSettingsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(setSettings, rhs.setSettings).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
