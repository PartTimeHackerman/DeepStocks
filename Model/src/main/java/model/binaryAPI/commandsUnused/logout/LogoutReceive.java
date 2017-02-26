
package data.binaryAPI.commandsUnused.logout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Logout Response
 * <p>
 * 
 * 
 */
public class LogoutReceive implements Serializable, Message
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
     * Logout Status
     * <p>
     * 
     * 
     */
    @SerializedName("logout")
    @Expose
    private Integer logout;
    /**
     * time
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
    private final static long serialVersionUID = -2790355938029758214L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LogoutReceive() {
    }

    /**
     * 
     * @param logout
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public LogoutReceive(Object echoReq, Integer logout, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.logout = logout;
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
     * Logout Status
     * <p>
     * 
     * 
     */
    public Integer getLogout() {
        return logout;
    }

    /**
     * Logout Status
     * <p>
     * 
     * 
     */
    public void setLogout(Integer logout) {
        this.logout = logout;
    }

    /**
     * time
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * time
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
        return new HashCodeBuilder().append(echoReq).append(logout).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogoutReceive) == false) {
            return false;
        }
        LogoutReceive rhs = ((LogoutReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(logout, rhs.logout).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
