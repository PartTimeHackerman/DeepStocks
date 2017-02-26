
package data.binaryAPI.commandsUnused.get_limits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get Limits Receive
 * <p>
 * Trading and Withdrawal Limits
 * 
 */
public class GetLimitsReceive implements Serializable, Message
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
     * Get Limits
     * <p>
     * Trading limits of real account user
     * 
     */
    @SerializedName("get_limits")
    @Expose
    private GetLimits getLimits;
    /**
     * get_limits
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
    private final static long serialVersionUID = 7223698680328102093L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetLimitsReceive() {
    }

    /**
     * 
     * @param getLimits
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public GetLimitsReceive(Object echoReq, GetLimits getLimits, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getLimits = getLimits;
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
     * Get Limits
     * <p>
     * Trading limits of real account user
     * 
     */
    public GetLimits getGetLimits() {
        return getLimits;
    }

    /**
     * Get Limits
     * <p>
     * Trading limits of real account user
     * 
     */
    public void setGetLimits(GetLimits getLimits) {
        this.getLimits = getLimits;
    }

    /**
     * get_limits
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_limits
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
        return new HashCodeBuilder().append(echoReq).append(getLimits).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLimitsReceive) == false) {
            return false;
        }
        GetLimitsReceive rhs = ((GetLimitsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getLimits, rhs.getLimits).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
