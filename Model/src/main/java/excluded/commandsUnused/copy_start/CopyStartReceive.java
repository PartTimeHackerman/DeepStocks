
package data.binaryAPI.commandsUnused.copy_start;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Copy Start Receive
 * <p>
 * A message with results is received
 * 
 */
public class CopyStartReceive implements Serializable, Message
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
     * Copy start confirmation
     * <p>
     * Copy start confirmation. Returns 1 is success.
     * 
     */
    @SerializedName("copy_start")
    @Expose
    private Integer copyStart;
    /**
     * copy_start
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
    private final static long serialVersionUID = 3220358745665008571L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopyStartReceive() {
    }

    /**
     * 
     * @param msgType
     * @param copyStart
     * @param echoReq
     * @param reqId
     */
    public CopyStartReceive(Object echoReq, Integer copyStart, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.copyStart = copyStart;
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
     * Copy start confirmation
     * <p>
     * Copy start confirmation. Returns 1 is success.
     * 
     */
    public Integer getCopyStart() {
        return copyStart;
    }

    /**
     * Copy start confirmation
     * <p>
     * Copy start confirmation. Returns 1 is success.
     * 
     */
    public void setCopyStart(Integer copyStart) {
        this.copyStart = copyStart;
    }

    /**
     * copy_start
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * copy_start
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
        return new HashCodeBuilder().append(echoReq).append(copyStart).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopyStartReceive) == false) {
            return false;
        }
        CopyStartReceive rhs = ((CopyStartReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(copyStart, rhs.copyStart).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
