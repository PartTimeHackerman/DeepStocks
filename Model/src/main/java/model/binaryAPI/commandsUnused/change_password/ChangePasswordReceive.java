
package data.binaryAPI.commandsUnused.change_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Change Password Response
 * <p>
 * 
 * 
 */
public class ChangePasswordReceive implements Serializable, Message
{

    /**
     * If 1, password updated.
     * 
     */
    @SerializedName("change_password")
    @Expose
    private Integer changePassword;
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
     * change_password
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
    private final static long serialVersionUID = -3733082477148974256L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChangePasswordReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param changePassword
     * @param reqId
     */
    public ChangePasswordReceive(Integer changePassword, Object echoReq, String msgType, Integer reqId) {
        super();
        this.changePassword = changePassword;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * If 1, password updated.
     * 
     */
    public Integer getChangePassword() {
        return changePassword;
    }

    /**
     * If 1, password updated.
     * 
     */
    public void setChangePassword(Integer changePassword) {
        this.changePassword = changePassword;
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
     * change_password
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * change_password
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
        return new HashCodeBuilder().append(changePassword).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangePasswordReceive) == false) {
            return false;
        }
        ChangePasswordReceive rhs = ((ChangePasswordReceive) other);
        return new EqualsBuilder().append(changePassword, rhs.changePassword).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
