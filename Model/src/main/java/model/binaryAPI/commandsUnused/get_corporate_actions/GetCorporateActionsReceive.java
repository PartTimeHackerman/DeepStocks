
package data.binaryAPI.commandsUnused.get_corporate_actions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get corporate actions response
 * <p>
 * Corporate actions for an equity symbol
 * 
 */
public class GetCorporateActionsReceive implements Serializable, Message
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
     * Get corporate actions response
     * <p>
     * Corporate actions for an equity symbol
     * 
     */
    @SerializedName("get_corporate_actions")
    @Expose
    private GetCorporateActions getCorporateActions;
    /**
     * get_corporate_actions
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
    private final static long serialVersionUID = -2488403426853503232L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetCorporateActionsReceive() {
    }

    /**
     * 
     * @param getCorporateActions
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public GetCorporateActionsReceive(Object echoReq, GetCorporateActions getCorporateActions, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getCorporateActions = getCorporateActions;
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
     * Get corporate actions response
     * <p>
     * Corporate actions for an equity symbol
     * 
     */
    public GetCorporateActions getGetCorporateActions() {
        return getCorporateActions;
    }

    /**
     * Get corporate actions response
     * <p>
     * Corporate actions for an equity symbol
     * 
     */
    public void setGetCorporateActions(GetCorporateActions getCorporateActions) {
        this.getCorporateActions = getCorporateActions;
    }

    /**
     * get_corporate_actions
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_corporate_actions
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
        return new HashCodeBuilder().append(echoReq).append(getCorporateActions).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetCorporateActionsReceive) == false) {
            return false;
        }
        GetCorporateActionsReceive rhs = ((GetCorporateActionsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getCorporateActions, rhs.getCorporateActions).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
