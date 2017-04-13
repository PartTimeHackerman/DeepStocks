
package data.binaryAPI.commandsUnused.paymentagent_withdraw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent Withdrawal Response
 * <p>
 * 
 * 
 */
public class PaymentagentWithdrawReceive implements Serializable, Message
{

    /**
     * If 1, withdrawal success. If 2, dry-run success.
     * 
     */
    @SerializedName("paymentagent_withdraw")
    @Expose
    private Integer paymentagentWithdraw;
    /**
     * Payment agent name
     * 
     */
    @SerializedName("paymentagent_name")
    @Expose
    private String paymentagentName;
    /**
     * Reference id of withdrawal performed
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
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
     * paymentagent_withdraw
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
    private final static long serialVersionUID = -3180775293669707311L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentWithdrawReceive() {
    }

    /**
     * 
     * @param msgType
     * @param paymentagentName
     * @param paymentagentWithdraw
     * @param echoReq
     * @param transactionId
     * @param reqId
     */
    public PaymentagentWithdrawReceive(Integer paymentagentWithdraw, String paymentagentName, Integer transactionId, Object echoReq, String msgType, Integer reqId) {
        super();
        this.paymentagentWithdraw = paymentagentWithdraw;
        this.paymentagentName = paymentagentName;
        this.transactionId = transactionId;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * If 1, withdrawal success. If 2, dry-run success.
     * 
     */
    public Integer getPaymentagentWithdraw() {
        return paymentagentWithdraw;
    }

    /**
     * If 1, withdrawal success. If 2, dry-run success.
     * 
     */
    public void setPaymentagentWithdraw(Integer paymentagentWithdraw) {
        this.paymentagentWithdraw = paymentagentWithdraw;
    }

    /**
     * Payment agent name
     * 
     */
    public String getPaymentagentName() {
        return paymentagentName;
    }

    /**
     * Payment agent name
     * 
     */
    public void setPaymentagentName(String paymentagentName) {
        this.paymentagentName = paymentagentName;
    }

    /**
     * Reference id of withdrawal performed
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Reference id of withdrawal performed
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
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
     * paymentagent_withdraw
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * paymentagent_withdraw
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
        return new HashCodeBuilder().append(paymentagentWithdraw).append(paymentagentName).append(transactionId).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentWithdrawReceive) == false) {
            return false;
        }
        PaymentagentWithdrawReceive rhs = ((PaymentagentWithdrawReceive) other);
        return new EqualsBuilder().append(paymentagentWithdraw, rhs.paymentagentWithdraw).append(paymentagentName, rhs.paymentagentName).append(transactionId, rhs.transactionId).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
