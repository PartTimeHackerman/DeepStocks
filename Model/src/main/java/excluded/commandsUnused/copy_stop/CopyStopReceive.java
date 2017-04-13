
package data.binaryAPI.commandsUnused.copy_stop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Copy Stop Receive
 * <p>
 * A message with results is received
 * 
 */
public class CopyStopReceive implements Serializable, Message
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
     * Copy stopping confirmation
     * <p>
     * Copy stopping confirmation. Returns 1 is success.
     * 
     */
    @SerializedName("copy_stop")
    @Expose
    private Integer copyStop;
    /**
     * copy_stop
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
    private final static long serialVersionUID = 3074326934143122903L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopyStopReceive() {
    }

    /**
     * 
     * @param copyStop
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public CopyStopReceive(Object echoReq, Integer copyStop, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.copyStop = copyStop;
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
     * Copy stopping confirmation
     * <p>
     * Copy stopping confirmation. Returns 1 is success.
     * 
     */
    public Integer getCopyStop() {
        return copyStop;
    }

    /**
     * Copy stopping confirmation
     * <p>
     * Copy stopping confirmation. Returns 1 is success.
     * 
     */
    public void setCopyStop(Integer copyStop) {
        this.copyStop = copyStop;
    }

    /**
     * copy_stop
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * copy_stop
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
        return new HashCodeBuilder().append(echoReq).append(copyStop).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopyStopReceive) == false) {
            return false;
        }
        CopyStopReceive rhs = ((CopyStopReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(copyStop, rhs.copyStop).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
