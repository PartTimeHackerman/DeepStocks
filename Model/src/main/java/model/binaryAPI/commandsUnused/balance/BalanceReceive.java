
package data.binaryAPI.commandsUnused.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Realtime Balance
 * <p>
 * Return details of user account balance
 * 
 */
public class BalanceReceive implements Serializable, Message
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
     * Lastest balance of client
     * <p>
     * Realtime stream of user balance changes.
     * 
     */
    @SerializedName("balance")
    @Expose
    private Balance balance;
    /**
     * balance
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
    private final static long serialVersionUID = 2877270727597354969L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BalanceReceive() {
    }

    /**
     * 
     * @param msgType
     * @param balance
     * @param echoReq
     * @param reqId
     */
    public BalanceReceive(Object echoReq, Balance balance, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.balance = balance;
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
     * Lastest balance of client
     * <p>
     * Realtime stream of user balance changes.
     * 
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     * Lastest balance of client
     * <p>
     * Realtime stream of user balance changes.
     * 
     */
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    /**
     * balance
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * balance
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
        return new HashCodeBuilder().append(echoReq).append(balance).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceReceive) == false) {
            return false;
        }
        BalanceReceive rhs = ((BalanceReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(balance, rhs.balance).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
