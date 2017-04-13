
package data.binaryAPI.commandsUnused.tnc_approval;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * T&C Approval Receive
 * <p>
 * 
 * 
 */
public class TncApprovalReceive implements Serializable, Message
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
     * Set terms and conditions 1: success
     * 
     */
    @SerializedName("tnc_approval")
    @Expose
    private Integer tncApproval;
    /**
     * tnc_approval
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
    private final static long serialVersionUID = 6420268628157611088L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TncApprovalReceive() {
    }

    /**
     * 
     * @param msgType
     * @param tncApproval
     * @param echoReq
     * @param reqId
     */
    public TncApprovalReceive(Object echoReq, Integer tncApproval, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.tncApproval = tncApproval;
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
     * Set terms and conditions 1: success
     * 
     */
    public Integer getTncApproval() {
        return tncApproval;
    }

    /**
     * Set terms and conditions 1: success
     * 
     */
    public void setTncApproval(Integer tncApproval) {
        this.tncApproval = tncApproval;
    }

    /**
     * tnc_approval
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * tnc_approval
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
        return new HashCodeBuilder().append(echoReq).append(tncApproval).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TncApprovalReceive) == false) {
            return false;
        }
        TncApprovalReceive rhs = ((TncApprovalReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(tncApproval, rhs.tncApproval).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
