
package data.binaryAPI.commandsUnused.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Transaction Updates
 * <p>
 * Return transaction updates
 * 
 */
public class TransactionReceive implements Serializable, Message
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
     * Latest update to transaction
     * <p>
     * Realtime stream of user transaction updates.
     * 
     */
    @SerializedName("transaction")
    @Expose
    private Transaction transaction;
    /**
     * transaction
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
    private final static long serialVersionUID = -6200862282569975868L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param transaction
     * @param reqId
     */
    public TransactionReceive(Object echoReq, Transaction transaction, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.transaction = transaction;
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
     * Latest update to transaction
     * <p>
     * Realtime stream of user transaction updates.
     * 
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Latest update to transaction
     * <p>
     * Realtime stream of user transaction updates.
     * 
     */
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * transaction
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * transaction
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
        return new HashCodeBuilder().append(echoReq).append(transaction).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionReceive) == false) {
            return false;
        }
        TransactionReceive rhs = ((TransactionReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(transaction, rhs.transaction).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
