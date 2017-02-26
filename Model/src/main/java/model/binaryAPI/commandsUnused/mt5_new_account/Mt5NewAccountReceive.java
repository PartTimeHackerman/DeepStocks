
package data.binaryAPI.commandsUnused.mt5_new_account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create MT5 account Receive
 * <p>
 * Create MT5 account Receive
 * 
 */
public class Mt5NewAccountReceive implements Serializable, Message
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
     * New MT5 account
     * <p>
     * New MT5 account details
     * 
     */
    @SerializedName("mt5_new_account")
    @Expose
    private Mt5NewAccount mt5NewAccount;
    /**
     * mt5_new_account
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
    private final static long serialVersionUID = -4993561660891781786L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5NewAccountReceive() {
    }

    /**
     * 
     * @param mt5NewAccount
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public Mt5NewAccountReceive(Object echoReq, Mt5NewAccount mt5NewAccount, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5NewAccount = mt5NewAccount;
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
     * New MT5 account
     * <p>
     * New MT5 account details
     * 
     */
    public Mt5NewAccount getMt5NewAccount() {
        return mt5NewAccount;
    }

    /**
     * New MT5 account
     * <p>
     * New MT5 account details
     * 
     */
    public void setMt5NewAccount(Mt5NewAccount mt5NewAccount) {
        this.mt5NewAccount = mt5NewAccount;
    }

    /**
     * mt5_new_account
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_new_account
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
        return new HashCodeBuilder().append(echoReq).append(mt5NewAccount).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5NewAccountReceive) == false) {
            return false;
        }
        Mt5NewAccountReceive rhs = ((Mt5NewAccountReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5NewAccount, rhs.mt5NewAccount).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
