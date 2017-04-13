
package data.binaryAPI.commandsUnused.ping;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Ping Receive
 * <p>
 * 
 * 
 */
public class PingReceive implements Serializable, Message
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
     * Will return 'pong'
     * 
     */
    @SerializedName("ping")
    @Expose
    private String ping;
    /**
     * ping
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
    private final static long serialVersionUID = 2720821604533590692L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PingReceive() {
    }

    /**
     * 
     * @param msgType
     * @param ping
     * @param echoReq
     * @param reqId
     */
    public PingReceive(Object echoReq, String ping, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.ping = ping;
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
     * Will return 'pong'
     * 
     */
    public String getPing() {
        return ping;
    }

    /**
     * Will return 'pong'
     * 
     */
    public void setPing(String ping) {
        this.ping = ping;
    }

    /**
     * ping
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * ping
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
        return new HashCodeBuilder().append(echoReq).append(ping).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PingReceive) == false) {
            return false;
        }
        PingReceive rhs = ((PingReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(ping, rhs.ping).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
