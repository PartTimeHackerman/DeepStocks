
package data.binaryAPI.commandsUnused.mt5_password_change;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 user password change receive
 * <p>
 * MT5 user password change receive
 * 
 */
public class Mt5PasswordChangeReceive implements Serializable, Message
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
     * Password Change Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("mt5_password_change")
    @Expose
    private Integer mt5PasswordChange;
    /**
     * mt5_password_change
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
    private final static long serialVersionUID = -1159266776925571014L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5PasswordChangeReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param mt5PasswordChange
     * @param reqId
     */
    public Mt5PasswordChangeReceive(Object echoReq, Integer mt5PasswordChange, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5PasswordChange = mt5PasswordChange;
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
     * Password Change Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getMt5PasswordChange() {
        return mt5PasswordChange;
    }

    /**
     * Password Change Status
     * <p>
     *  1 on success
     * 
     */
    public void setMt5PasswordChange(Integer mt5PasswordChange) {
        this.mt5PasswordChange = mt5PasswordChange;
    }

    /**
     * mt5_password_change
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_password_change
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
        return new HashCodeBuilder().append(echoReq).append(mt5PasswordChange).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5PasswordChangeReceive) == false) {
            return false;
        }
        Mt5PasswordChangeReceive rhs = ((Mt5PasswordChangeReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5PasswordChange, rhs.mt5PasswordChange).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
