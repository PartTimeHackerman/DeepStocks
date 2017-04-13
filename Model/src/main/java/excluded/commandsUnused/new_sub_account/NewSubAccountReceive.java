
package data.binaryAPI.commandsUnused.new_sub_account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create sub account receive
 * <p>
 * Response for new sub account call
 * 
 */
public class NewSubAccountReceive implements Serializable, Message
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
     * New sub account
     * <p>
     * New sub account details
     * 
     */
    @SerializedName("new_sub_account")
    @Expose
    private NewSubAccount newSubAccount;
    /**
     * new_sub_account
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
    private final static long serialVersionUID = 3318636019135725904L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewSubAccountReceive() {
    }

    /**
     * 
     * @param msgType
     * @param newSubAccount
     * @param echoReq
     * @param reqId
     */
    public NewSubAccountReceive(Object echoReq, NewSubAccount newSubAccount, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.newSubAccount = newSubAccount;
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
     * New sub account
     * <p>
     * New sub account details
     * 
     */
    public NewSubAccount getNewSubAccount() {
        return newSubAccount;
    }

    /**
     * New sub account
     * <p>
     * New sub account details
     * 
     */
    public void setNewSubAccount(NewSubAccount newSubAccount) {
        this.newSubAccount = newSubAccount;
    }

    /**
     * new_sub_account
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * new_sub_account
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
        return new HashCodeBuilder().append(echoReq).append(newSubAccount).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewSubAccountReceive) == false) {
            return false;
        }
        NewSubAccountReceive rhs = ((NewSubAccountReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(newSubAccount, rhs.newSubAccount).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
