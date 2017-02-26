
package data.binaryAPI.commandsUnused.new_account_maltainvest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create maltainvest account Receive
 * <p>
 * Create maltainvest account Receive
 * 
 */
public class NewAccountMaltainvestReceive implements Serializable, Message
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
     * New maltainvest account
     * <p>
     * New maltainvest account details
     * 
     */
    @SerializedName("new_account_maltainvest")
    @Expose
    private NewAccountMaltainvest newAccountMaltainvest;
    /**
     * new_account_maltainvest
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
    private final static long serialVersionUID = 8858283703713931717L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountMaltainvestReceive() {
    }

    /**
     * 
     * @param msgType
     * @param newAccountMaltainvest
     * @param echoReq
     * @param reqId
     */
    public NewAccountMaltainvestReceive(Object echoReq, NewAccountMaltainvest newAccountMaltainvest, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.newAccountMaltainvest = newAccountMaltainvest;
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
     * New maltainvest account
     * <p>
     * New maltainvest account details
     * 
     */
    public NewAccountMaltainvest getNewAccountMaltainvest() {
        return newAccountMaltainvest;
    }

    /**
     * New maltainvest account
     * <p>
     * New maltainvest account details
     * 
     */
    public void setNewAccountMaltainvest(NewAccountMaltainvest newAccountMaltainvest) {
        this.newAccountMaltainvest = newAccountMaltainvest;
    }

    /**
     * new_account_maltainvest
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * new_account_maltainvest
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
        return new HashCodeBuilder().append(echoReq).append(newAccountMaltainvest).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountMaltainvestReceive) == false) {
            return false;
        }
        NewAccountMaltainvestReceive rhs = ((NewAccountMaltainvestReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(newAccountMaltainvest, rhs.newAccountMaltainvest).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
