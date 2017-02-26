
package data.binaryAPI.commandsUnused.get_self_exclusion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get User Self-Exclusion Receive
 * <p>
 * A message with User Self-Exclusion
 * 
 */
public class GetSelfExclusionReceive implements Serializable, Message
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
     * Self-Exclusion Structure
     * <p>
     * 
     * 
     */
    @SerializedName("get_self_exclusion")
    @Expose
    private GetSelfExclusion getSelfExclusion;
    /**
     * get_self_exclusion
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
    private final static long serialVersionUID = 7931370802461403339L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSelfExclusionReceive() {
    }

    /**
     * 
     * @param msgType
     * @param getSelfExclusion
     * @param echoReq
     * @param reqId
     */
    public GetSelfExclusionReceive(Object echoReq, GetSelfExclusion getSelfExclusion, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getSelfExclusion = getSelfExclusion;
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
     * Self-Exclusion Structure
     * <p>
     * 
     * 
     */
    public GetSelfExclusion getGetSelfExclusion() {
        return getSelfExclusion;
    }

    /**
     * Self-Exclusion Structure
     * <p>
     * 
     * 
     */
    public void setGetSelfExclusion(GetSelfExclusion getSelfExclusion) {
        this.getSelfExclusion = getSelfExclusion;
    }

    /**
     * get_self_exclusion
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_self_exclusion
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
        return new HashCodeBuilder().append(echoReq).append(getSelfExclusion).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSelfExclusionReceive) == false) {
            return false;
        }
        GetSelfExclusionReceive rhs = ((GetSelfExclusionReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getSelfExclusion, rhs.getSelfExclusion).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
