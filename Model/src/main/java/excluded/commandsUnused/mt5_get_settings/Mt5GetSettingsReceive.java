
package data.binaryAPI.commandsUnused.mt5_get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get MT5 user settings Receive
 * <p>
 * Get MT5 user settings
 * 
 */
public class Mt5GetSettingsReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * 
     * <p>
     * MT5 user account details
     * 
     */
    @SerializedName("mt5_get_settings")
    @Expose
    private Mt5GetSettings mt5GetSettings;
    /**
     * mt5_get_settings
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
    private final static long serialVersionUID = 4592054513598849660L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5GetSettingsReceive() {
    }

    /**
     * 
     * @param mt5GetSettings
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public Mt5GetSettingsReceive(Object echoReq, Mt5GetSettings mt5GetSettings, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5GetSettings = mt5GetSettings;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * 
     * <p>
     * MT5 user account details
     * 
     */
    public Mt5GetSettings getMt5GetSettings() {
        return mt5GetSettings;
    }

    /**
     * 
     * <p>
     * MT5 user account details
     * 
     */
    public void setMt5GetSettings(Mt5GetSettings mt5GetSettings) {
        this.mt5GetSettings = mt5GetSettings;
    }

    /**
     * mt5_get_settings
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_get_settings
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
        return new HashCodeBuilder().append(echoReq).append(mt5GetSettings).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5GetSettingsReceive) == false) {
            return false;
        }
        Mt5GetSettingsReceive rhs = ((Mt5GetSettingsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5GetSettings, rhs.mt5GetSettings).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
