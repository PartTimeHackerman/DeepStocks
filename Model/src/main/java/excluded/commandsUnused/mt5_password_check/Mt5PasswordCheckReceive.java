
package data.binaryAPI.commandsUnused.mt5_password_check;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 user password check receive
 * <p>
 * MT5 user password check receive
 * 
 */
public class Mt5PasswordCheckReceive implements Serializable, Message
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
     * Password Check Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("mt5_password_check")
    @Expose
    private Integer mt5PasswordCheck;
    /**
     * mt5_password_check
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
    private final static long serialVersionUID = -8591465240586903807L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5PasswordCheckReceive() {
    }

    /**
     * 
     * @param mt5PasswordCheck
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public Mt5PasswordCheckReceive(Object echoReq, Integer mt5PasswordCheck, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5PasswordCheck = mt5PasswordCheck;
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
     * Password Check Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getMt5PasswordCheck() {
        return mt5PasswordCheck;
    }

    /**
     * Password Check Status
     * <p>
     *  1 on success
     * 
     */
    public void setMt5PasswordCheck(Integer mt5PasswordCheck) {
        this.mt5PasswordCheck = mt5PasswordCheck;
    }

    /**
     * mt5_password_check
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_password_check
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
        return new HashCodeBuilder().append(echoReq).append(mt5PasswordCheck).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5PasswordCheckReceive) == false) {
            return false;
        }
        Mt5PasswordCheckReceive rhs = ((Mt5PasswordCheckReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5PasswordCheck, rhs.mt5PasswordCheck).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
