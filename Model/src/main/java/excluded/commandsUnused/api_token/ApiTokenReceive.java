
package data.binaryAPI.commandsUnused.api_token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import data.binaryAPI.commands.Message;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * API Token Response
 * <p>
 * 
 * 
 */
public class ApiTokenReceive implements Serializable, Message
{

    @SerializedName("api_token")
    @Expose
    private ApiToken apiToken;
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
     * api_token
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
    private final static long serialVersionUID = -3902908300739108903L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiTokenReceive() {
    }

    /**
     * 
     * @param apiToken
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ApiTokenReceive(ApiToken apiToken, Object echoReq, String msgType, Integer reqId) {
        super();
        this.apiToken = apiToken;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    public ApiToken getApiToken() {
        return apiToken;
    }

    public void setApiToken(ApiToken apiToken) {
        this.apiToken = apiToken;
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
     * api_token
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * api_token
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
        return new HashCodeBuilder().append(apiToken).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiTokenReceive) == false) {
            return false;
        }
        ApiTokenReceive rhs = ((ApiTokenReceive) other);
        return new EqualsBuilder().append(apiToken, rhs.apiToken).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
