
package data.binaryAPI.commandsUnused.cashier_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Cashier Password Response
 * <p>
 * 
 * 
 */
public class CashierPasswordReceive implements Serializable, Message
{

    /**
     * The status for cashier, 1 means locked, 0 means unlocked.
     * 
     */
    @SerializedName("cashier_password")
    @Expose
    private Integer cashierPassword;
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
     * cashier_password
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
    private final static long serialVersionUID = 2444551939848179129L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CashierPasswordReceive() {
    }

    /**
     * 
     * @param cashierPassword
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public CashierPasswordReceive(Integer cashierPassword, Object echoReq, String msgType, Integer reqId) {
        super();
        this.cashierPassword = cashierPassword;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * The status for cashier, 1 means locked, 0 means unlocked.
     * 
     */
    public Integer getCashierPassword() {
        return cashierPassword;
    }

    /**
     * The status for cashier, 1 means locked, 0 means unlocked.
     * 
     */
    public void setCashierPassword(Integer cashierPassword) {
        this.cashierPassword = cashierPassword;
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
     * cashier_password
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * cashier_password
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
        return new HashCodeBuilder().append(cashierPassword).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashierPasswordReceive) == false) {
            return false;
        }
        CashierPasswordReceive rhs = ((CashierPasswordReceive) other);
        return new EqualsBuilder().append(cashierPassword, rhs.cashierPassword).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
