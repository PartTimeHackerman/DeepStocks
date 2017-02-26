
package data.binaryAPI.commandsUnused.verify_email;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Verify Email Receive
 * <p>
 * Verify Email Receive
 * 
 */
public class VerifyEmailReceive implements Serializable, Message
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
     * verify email response
     * <p>
     *  1 for success (secure code has been sent to the email address)
     * 
     */
    @SerializedName("verify_email")
    @Expose
    private Integer verifyEmail;
    /**
     * verify_email
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
    private final static long serialVersionUID = 8399064150210815224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerifyEmailReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param verifyEmail
     * @param reqId
     */
    public VerifyEmailReceive(Object echoReq, Integer verifyEmail, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.verifyEmail = verifyEmail;
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
     * verify email response
     * <p>
     *  1 for success (secure code has been sent to the email address)
     * 
     */
    public Integer getVerifyEmail() {
        return verifyEmail;
    }

    /**
     * verify email response
     * <p>
     *  1 for success (secure code has been sent to the email address)
     * 
     */
    public void setVerifyEmail(Integer verifyEmail) {
        this.verifyEmail = verifyEmail;
    }

    /**
     * verify_email
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * verify_email
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
        return new HashCodeBuilder().append(echoReq).append(verifyEmail).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerifyEmailReceive) == false) {
            return false;
        }
        VerifyEmailReceive rhs = ((VerifyEmailReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(verifyEmail, rhs.verifyEmail).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
