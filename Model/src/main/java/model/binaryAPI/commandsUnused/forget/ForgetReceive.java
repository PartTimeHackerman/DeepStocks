
package data.binaryAPI.commandsUnused.forget;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Cancel an Incoming Stream Receive
 * <p>
 * 
 * 
 */
public class ForgetReceive implements Serializable, Message
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
     * If 1, stream exited and stopped. If 0, stream did not exist.
     * 
     */
    @SerializedName("forget")
    @Expose
    private Integer forget;
    /**
     * forget
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
    private final static long serialVersionUID = 9104217592152844999L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForgetReceive() {
    }

    /**
     * 
     * @param forget
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ForgetReceive(Object echoReq, Integer forget, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.forget = forget;
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
     * If 1, stream exited and stopped. If 0, stream did not exist.
     * 
     */
    public Integer getForget() {
        return forget;
    }

    /**
     * If 1, stream exited and stopped. If 0, stream did not exist.
     * 
     */
    public void setForget(Integer forget) {
        this.forget = forget;
    }

    /**
     * forget
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * forget
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
        return new HashCodeBuilder().append(echoReq).append(forget).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForgetReceive) == false) {
            return false;
        }
        ForgetReceive rhs = ((ForgetReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(forget, rhs.forget).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
