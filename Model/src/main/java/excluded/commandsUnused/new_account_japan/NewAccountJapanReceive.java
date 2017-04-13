
package data.binaryAPI.commandsUnused.new_account_japan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create Japan account Receive
 * <p>
 * Create Japan account Receive
 * 
 */
public class NewAccountJapanReceive implements Serializable, Message
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
     * New Japan account
     * <p>
     * New Japan account details
     * 
     */
    @SerializedName("new_account_japan")
    @Expose
    private NewAccountJapan newAccountJapan;
    /**
     * new_account_japan
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
    private final static long serialVersionUID = -6999454049508048686L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountJapanReceive() {
    }

    /**
     * 
     * @param newAccountJapan
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public NewAccountJapanReceive(Object echoReq, NewAccountJapan newAccountJapan, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.newAccountJapan = newAccountJapan;
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
     * New Japan account
     * <p>
     * New Japan account details
     * 
     */
    public NewAccountJapan getNewAccountJapan() {
        return newAccountJapan;
    }

    /**
     * New Japan account
     * <p>
     * New Japan account details
     * 
     */
    public void setNewAccountJapan(NewAccountJapan newAccountJapan) {
        this.newAccountJapan = newAccountJapan;
    }

    /**
     * new_account_japan
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * new_account_japan
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
        return new HashCodeBuilder().append(echoReq).append(newAccountJapan).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountJapanReceive) == false) {
            return false;
        }
        NewAccountJapanReceive rhs = ((NewAccountJapanReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(newAccountJapan, rhs.newAccountJapan).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
