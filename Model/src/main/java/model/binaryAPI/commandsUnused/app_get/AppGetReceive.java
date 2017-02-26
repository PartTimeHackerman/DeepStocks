
package data.binaryAPI.commandsUnused.app_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App Get Receive
 * <p>
 * A message with requested application
 * 
 */
public class AppGetReceive implements Serializable, Message
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
     * Application object
     * <p>
     * 
     * 
     */
    @SerializedName("app_get")
    @Expose
    private AppGet appGet;
    /**
     * app_get
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
    private final static long serialVersionUID = -4305575724778278800L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppGetReceive() {
    }

    /**
     * 
     * @param appGet
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public AppGetReceive(Object echoReq, AppGet appGet, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.appGet = appGet;
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
     * Application object
     * <p>
     * 
     * 
     */
    public AppGet getAppGet() {
        return appGet;
    }

    /**
     * Application object
     * <p>
     * 
     * 
     */
    public void setAppGet(AppGet appGet) {
        this.appGet = appGet;
    }

    /**
     * app_get
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * app_get
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
        return new HashCodeBuilder().append(echoReq).append(appGet).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppGetReceive) == false) {
            return false;
        }
        AppGetReceive rhs = ((AppGetReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(appGet, rhs.appGet).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
