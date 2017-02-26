
package data.binaryAPI.commandsUnused.get_account_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get Account Status Receive
 * <p>
 * A message with Account Status
 * 
 */
public class GetAccountStatusReceive implements Serializable, Message
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
     * Account status details
     * 
     */
    @SerializedName("get_account_status")
    @Expose
    private GetAccountStatus getAccountStatus;
    /**
     * get_account_status
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
    private final static long serialVersionUID = 4816822852485146862L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetAccountStatusReceive() {
    }

    /**
     * 
     * @param msgType
     * @param getAccountStatus
     * @param echoReq
     * @param reqId
     */
    public GetAccountStatusReceive(Object echoReq, GetAccountStatus getAccountStatus, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getAccountStatus = getAccountStatus;
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
     * Account status details
     * 
     */
    public GetAccountStatus getGetAccountStatus() {
        return getAccountStatus;
    }

    /**
     * Account status details
     * 
     */
    public void setGetAccountStatus(GetAccountStatus getAccountStatus) {
        this.getAccountStatus = getAccountStatus;
    }

    /**
     * get_account_status
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_account_status
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
        return new HashCodeBuilder().append(echoReq).append(getAccountStatus).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountStatusReceive) == false) {
            return false;
        }
        GetAccountStatusReceive rhs = ((GetAccountStatusReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getAccountStatus, rhs.getAccountStatus).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
