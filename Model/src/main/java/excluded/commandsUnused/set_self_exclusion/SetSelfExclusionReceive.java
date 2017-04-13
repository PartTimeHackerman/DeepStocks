
package data.binaryAPI.commandsUnused.set_self_exclusion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Set User Self-Exclusion Receive
 * <p>
 * A message with User Self-Exclusion
 * 
 */
public class SetSelfExclusionReceive implements Serializable, Message
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
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    @SerializedName("set_self_exclusion")
    @Expose
    private Integer setSelfExclusion;
    /**
     * set_self_exclusion
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
    private final static long serialVersionUID = -6772349548478677136L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetSelfExclusionReceive() {
    }

    /**
     * 
     * @param setSelfExclusion
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public SetSelfExclusionReceive(Object echoReq, Integer setSelfExclusion, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.setSelfExclusion = setSelfExclusion;
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
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    public Integer getSetSelfExclusion() {
        return setSelfExclusion;
    }

    /**
     * Update Status
     * <p>
     *  1 on success
     * 
     */
    public void setSetSelfExclusion(Integer setSelfExclusion) {
        this.setSelfExclusion = setSelfExclusion;
    }

    /**
     * set_self_exclusion
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * set_self_exclusion
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
        return new HashCodeBuilder().append(echoReq).append(setSelfExclusion).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetSelfExclusionReceive) == false) {
            return false;
        }
        SetSelfExclusionReceive rhs = ((SetSelfExclusionReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(setSelfExclusion, rhs.setSelfExclusion).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
