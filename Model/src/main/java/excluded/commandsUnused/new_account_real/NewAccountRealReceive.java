
package data.binaryAPI.commandsUnused.new_account_real;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create real account Receive
 * <p>
 * Create real account Receive
 * 
 */
public class NewAccountRealReceive implements Serializable, Message
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
     * New real money account
     * <p>
     * New real money account details
     * 
     */
    @SerializedName("new_account_real")
    @Expose
    private NewAccountReal newAccountReal;
    /**
     * new_account_real
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
    private final static long serialVersionUID = -5388849615112307164L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountRealReceive() {
    }

    /**
     * 
     * @param newAccountReal
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public NewAccountRealReceive(Object echoReq, NewAccountReal newAccountReal, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.newAccountReal = newAccountReal;
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
     * New real money account
     * <p>
     * New real money account details
     * 
     */
    public NewAccountReal getNewAccountReal() {
        return newAccountReal;
    }

    /**
     * New real money account
     * <p>
     * New real money account details
     * 
     */
    public void setNewAccountReal(NewAccountReal newAccountReal) {
        this.newAccountReal = newAccountReal;
    }

    /**
     * new_account_real
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * new_account_real
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
        return new HashCodeBuilder().append(echoReq).append(newAccountReal).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountRealReceive) == false) {
            return false;
        }
        NewAccountRealReceive rhs = ((NewAccountRealReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(newAccountReal, rhs.newAccountReal).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
