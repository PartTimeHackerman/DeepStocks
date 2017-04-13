
package data.binaryAPI.commandsUnused.topup_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Top Up Virtual Response
 * <p>
 * 
 * 
 */
public class TopupVirtualReceive implements Serializable, Message
{

    @SerializedName("topup_virtual")
    @Expose
    private TopupVirtual topupVirtual;
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
     * topup_virtual
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
    private final static long serialVersionUID = 2371579011363880394L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopupVirtualReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param topupVirtual
     * @param reqId
     */
    public TopupVirtualReceive(TopupVirtual topupVirtual, Object echoReq, String msgType, Integer reqId) {
        super();
        this.topupVirtual = topupVirtual;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    public TopupVirtual getTopupVirtual() {
        return topupVirtual;
    }

    public void setTopupVirtual(TopupVirtual topupVirtual) {
        this.topupVirtual = topupVirtual;
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
     * topup_virtual
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * topup_virtual
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
        return new HashCodeBuilder().append(topupVirtual).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopupVirtualReceive) == false) {
            return false;
        }
        TopupVirtualReceive rhs = ((TopupVirtualReceive) other);
        return new EqualsBuilder().append(topupVirtual, rhs.topupVirtual).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
