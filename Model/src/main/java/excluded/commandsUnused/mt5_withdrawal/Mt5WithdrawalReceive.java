
package data.binaryAPI.commandsUnused.mt5_withdrawal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 Account Withdrawal Response
 * <p>
 * 
 * 
 */
public class Mt5WithdrawalReceive implements Serializable, Message
{

    /**
     * MT5 Account Withdrawal Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("mt5_withdrawal")
    @Expose
    private Integer mt5Withdrawal;
    /**
     * Deposit reference id of Binary account
     * 
     */
    @SerializedName("binary_transaction_id")
    @Expose
    private Integer binaryTransactionId;
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
     * mt5_withdrawal
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
    private final static long serialVersionUID = 3364141800256341769L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5WithdrawalReceive() {
    }

    /**
     * 
     * @param mt5Withdrawal
     * @param msgType
     * @param binaryTransactionId
     * @param echoReq
     * @param reqId
     */
    public Mt5WithdrawalReceive(Integer mt5Withdrawal, Integer binaryTransactionId, Object echoReq, String msgType, Integer reqId) {
        super();
        this.mt5Withdrawal = mt5Withdrawal;
        this.binaryTransactionId = binaryTransactionId;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * MT5 Account Withdrawal Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getMt5Withdrawal() {
        return mt5Withdrawal;
    }

    /**
     * MT5 Account Withdrawal Status
     * <p>
     *  1 on success
     * 
     */
    public void setMt5Withdrawal(Integer mt5Withdrawal) {
        this.mt5Withdrawal = mt5Withdrawal;
    }

    /**
     * Deposit reference id of Binary account
     * 
     */
    public Integer getBinaryTransactionId() {
        return binaryTransactionId;
    }

    /**
     * Deposit reference id of Binary account
     * 
     */
    public void setBinaryTransactionId(Integer binaryTransactionId) {
        this.binaryTransactionId = binaryTransactionId;
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
     * mt5_withdrawal
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_withdrawal
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
        return new HashCodeBuilder().append(mt5Withdrawal).append(binaryTransactionId).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5WithdrawalReceive) == false) {
            return false;
        }
        Mt5WithdrawalReceive rhs = ((Mt5WithdrawalReceive) other);
        return new EqualsBuilder().append(mt5Withdrawal, rhs.mt5Withdrawal).append(binaryTransactionId, rhs.binaryTransactionId).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
