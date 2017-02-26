
package data.binaryAPI.commandsUnused.mt5_deposit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 Account Deposit Response
 * <p>
 * 
 * 
 */
public class Mt5DepositReceive implements Serializable, Message
{

    /**
     * MT5 Account Deposit Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("mt5_deposit")
    @Expose
    private Integer mt5Deposit;
    /**
     * Withdrawal reference id of Binary account
     * 
     */
    @SerializedName("binary_transaction_id")
    @Expose
    private Integer binaryTransactionId;
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
     * mt5_deposit
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
    private final static long serialVersionUID = -3343864060813973589L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5DepositReceive() {
    }

    /**
     * 
     * @param msgType
     * @param mt5Deposit
     * @param binaryTransactionId
     * @param echoReq
     * @param reqId
     */
    public Mt5DepositReceive(Integer mt5Deposit, Integer binaryTransactionId, Object echoReq, String msgType, Integer reqId) {
        super();
        this.mt5Deposit = mt5Deposit;
        this.binaryTransactionId = binaryTransactionId;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * MT5 Account Deposit Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getMt5Deposit() {
        return mt5Deposit;
    }

    /**
     * MT5 Account Deposit Status
     * <p>
     *  1 on success
     * 
     */
    public void setMt5Deposit(Integer mt5Deposit) {
        this.mt5Deposit = mt5Deposit;
    }

    /**
     * Withdrawal reference id of Binary account
     * 
     */
    public Integer getBinaryTransactionId() {
        return binaryTransactionId;
    }

    /**
     * Withdrawal reference id of Binary account
     * 
     */
    public void setBinaryTransactionId(Integer binaryTransactionId) {
        this.binaryTransactionId = binaryTransactionId;
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
     * mt5_deposit
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_deposit
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
        return new HashCodeBuilder().append(mt5Deposit).append(binaryTransactionId).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5DepositReceive) == false) {
            return false;
        }
        Mt5DepositReceive rhs = ((Mt5DepositReceive) other);
        return new EqualsBuilder().append(mt5Deposit, rhs.mt5Deposit).append(binaryTransactionId, rhs.binaryTransactionId).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
