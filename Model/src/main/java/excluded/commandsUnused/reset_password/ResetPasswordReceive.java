
package data.binaryAPI.commandsUnused.reset_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Reset Password Response
 * <p>
 * 
 * 
 */
public class ResetPasswordReceive implements Serializable, Message
{

    /**
     *  1: password reset success, 0: password reset failure
     * 
     */
    @SerializedName("reset_password")
    @Expose
    private Integer resetPassword;
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
     * reset_password
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
    private final static long serialVersionUID = 7433025042009934934L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResetPasswordReceive() {
    }

    /**
     * 
     * @param resetPassword
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ResetPasswordReceive(Integer resetPassword, Object echoReq, String msgType, Integer reqId) {
        super();
        this.resetPassword = resetPassword;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     *  1: password reset success, 0: password reset failure
     * 
     */
    public Integer getResetPassword() {
        return resetPassword;
    }

    /**
     *  1: password reset success, 0: password reset failure
     * 
     */
    public void setResetPassword(Integer resetPassword) {
        this.resetPassword = resetPassword;
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
     * reset_password
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * reset_password
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
        return new HashCodeBuilder().append(resetPassword).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResetPasswordReceive) == false) {
            return false;
        }
        ResetPasswordReceive rhs = ((ResetPasswordReceive) other);
        return new EqualsBuilder().append(resetPassword, rhs.resetPassword).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
