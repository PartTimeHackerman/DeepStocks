
package data.binaryAPI.commandsUnused.app_update;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App Update Receive
 * <p>
 * A message with created application
 * 
 */
public class AppUpdateReceive implements Serializable, Message
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
     * (Required)
     * 
     */
    @SerializedName("app_update")
    @Expose
    private AppUpdate appUpdate;
    /**
     * app_update
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
    private final static long serialVersionUID = -5336531012149499623L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppUpdateReceive() {
    }

    /**
     * 
     * @param msgType
     * @param appUpdate
     * @param echoReq
     * @param reqId
     */
    public AppUpdateReceive(Object echoReq, AppUpdate appUpdate, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.appUpdate = appUpdate;
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
     * (Required)
     * 
     */
    public AppUpdate getAppUpdate() {
        return appUpdate;
    }

    /**
     * Application object
     * <p>
     * 
     * (Required)
     * 
     */
    public void setAppUpdate(AppUpdate appUpdate) {
        this.appUpdate = appUpdate;
    }

    /**
     * app_update
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * app_update
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
        return new HashCodeBuilder().append(echoReq).append(appUpdate).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppUpdateReceive) == false) {
            return false;
        }
        AppUpdateReceive rhs = ((AppUpdateReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(appUpdate, rhs.appUpdate).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
