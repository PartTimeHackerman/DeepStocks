
package data.binaryAPI.commandsUnused.forget_all;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Cancel Incoming Streams Based on Type Receive
 * <p>
 * 
 * 
 */
public class ForgetAllReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * Ids of the cancelled streams
     * 
     */
    @SerializedName("forget_all")
    @Expose
    private List<Object> forgetAll = new ArrayList<Object>();
    /**
     * forget_all
     * (Required)
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
    private final static long serialVersionUID = -8027037918253138710L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForgetAllReceive() {
    }

    /**
     * 
     * @param forgetAll
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ForgetAllReceive(Object echoReq, List<Object> forgetAll, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.forgetAll = forgetAll;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
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
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * Ids of the cancelled streams
     * 
     */
    public List<Object> getForgetAll() {
        return forgetAll;
    }

    /**
     * Ids of the cancelled streams
     * 
     */
    public void setForgetAll(List<Object> forgetAll) {
        this.forgetAll = forgetAll;
    }

    /**
     * forget_all
     * (Required)
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * forget_all
     * (Required)
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
        return new HashCodeBuilder().append(echoReq).append(forgetAll).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForgetAllReceive) == false) {
            return false;
        }
        ForgetAllReceive rhs = ((ForgetAllReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(forgetAll, rhs.forgetAll).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
