
package data.binaryAPI.commandsUnused.new_account_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create virtual account Receive
 * <p>
 * Create virtual-money account
 * 
 */
public class NewAccountVirtualReceive implements Serializable, Message
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
     * New virtual-money account
     * <p>
     * New virtual-money account details
     * 
     */
    @SerializedName("new_account_virtual")
    @Expose
    private NewAccountVirtual newAccountVirtual;
    /**
     * new_account_virtual
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
    private final static long serialVersionUID = 6438978029484082744L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountVirtualReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param newAccountVirtual
     * @param reqId
     */
    public NewAccountVirtualReceive(Object echoReq, NewAccountVirtual newAccountVirtual, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.newAccountVirtual = newAccountVirtual;
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
     * New virtual-money account
     * <p>
     * New virtual-money account details
     * 
     */
    public NewAccountVirtual getNewAccountVirtual() {
        return newAccountVirtual;
    }

    /**
     * New virtual-money account
     * <p>
     * New virtual-money account details
     * 
     */
    public void setNewAccountVirtual(NewAccountVirtual newAccountVirtual) {
        this.newAccountVirtual = newAccountVirtual;
    }

    /**
     * new_account_virtual
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * new_account_virtual
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
        return new HashCodeBuilder().append(echoReq).append(newAccountVirtual).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountVirtualReceive) == false) {
            return false;
        }
        NewAccountVirtualReceive rhs = ((NewAccountVirtualReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(newAccountVirtual, rhs.newAccountVirtual).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
