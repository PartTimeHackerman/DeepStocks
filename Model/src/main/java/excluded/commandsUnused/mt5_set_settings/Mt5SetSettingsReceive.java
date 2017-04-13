
package data.binaryAPI.commandsUnused.mt5_set_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Update MT5 account Receive
 * <p>
 * Update MT5 account Receive
 * 
 */
public class Mt5SetSettingsReceive implements Serializable, Message
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
     * Update MT5 account details
     * <p>
     * Update MT5 account details
     * 
     */
    @SerializedName("mt5_set_settings")
    @Expose
    private Mt5SetSettings mt5SetSettings;
    /**
     * mt5_set_settings
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
    private final static long serialVersionUID = 2092506992040285341L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5SetSettingsReceive() {
    }

    /**
     * 
     * @param mt5SetSettings
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public Mt5SetSettingsReceive(Object echoReq, Mt5SetSettings mt5SetSettings, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5SetSettings = mt5SetSettings;
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
     * Update MT5 account details
     * <p>
     * Update MT5 account details
     * 
     */
    public Mt5SetSettings getMt5SetSettings() {
        return mt5SetSettings;
    }

    /**
     * Update MT5 account details
     * <p>
     * Update MT5 account details
     * 
     */
    public void setMt5SetSettings(Mt5SetSettings mt5SetSettings) {
        this.mt5SetSettings = mt5SetSettings;
    }

    /**
     * mt5_set_settings
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_set_settings
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
        return new HashCodeBuilder().append(echoReq).append(mt5SetSettings).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5SetSettingsReceive) == false) {
            return false;
        }
        Mt5SetSettingsReceive rhs = ((Mt5SetSettingsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5SetSettings, rhs.mt5SetSettings).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
