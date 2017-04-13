
package data.binaryAPI.commandsUnused.time;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Server time
 * <p>
 * 
 * 
 */
public class TimeReceive implements Serializable, Message
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
     * Epoch of server time.
     * 
     */
    @SerializedName("time")
    @Expose
    private Integer time;
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
    private final static long serialVersionUID = -6038212348670661530L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TimeReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param time
     * @param reqId
     */
    public TimeReceive(Object echoReq, Integer time, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.time = time;
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
     * Epoch of server time.
     * 
     */
    public Integer getTime() {
        return time;
    }

    /**
     * Epoch of server time.
     * 
     */
    public void setTime(Integer time) {
        this.time = time;
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
        return new HashCodeBuilder().append(echoReq).append(time).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeReceive) == false) {
            return false;
        }
        TimeReceive rhs = ((TimeReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(time, rhs.time).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
