
package model.binaryAPI.commands.authorize;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Authorization Response
 * <p>
 * A message containing account information for the holder of that token
 * 
 */
public class AuthorizeReceive implements Serializable, BinaryMessage
{

    /**
     * Authorization Response
     * <p>
     * Account information for the holder of the token
     * 
     */
    @SerializedName("authorize")
    @Expose
    private Authorize authorize;
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
     * authorize
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
    private final static long serialVersionUID = 3928903084731189266L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AuthorizeReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param authorize
     * @param reqId
     */
    public AuthorizeReceive(Authorize authorize, Object echoReq, String msgType, Integer reqId) {
        super();
        this.authorize = authorize;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Authorization Response
     * <p>
     * Account information for the holder of the token
     * 
     */
    public Authorize getAuthorize() {
        return authorize;
    }

    /**
     * Authorization Response
     * <p>
     * Account information for the holder of the token
     * 
     */
    public void setAuthorize(Authorize authorize) {
        this.authorize = authorize;
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
     * authorize
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * authorize
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
        return new HashCodeBuilder().append(authorize).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorizeReceive) == false) {
            return false;
        }
        AuthorizeReceive rhs = ((AuthorizeReceive) other);
        return new EqualsBuilder().append(authorize, rhs.authorize).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
