
package data.binaryAPI.commandsUnused.app_register;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App Register Receive
 * <p>
 * A message with created application
 * 
 */
public class AppRegisterReceive implements Serializable, Message
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
    @SerializedName("app_register")
    @Expose
    private AppRegister appRegister;
    /**
     * app_register
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
    private final static long serialVersionUID = 7783428412445148288L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppRegisterReceive() {
    }

    /**
     * 
     * @param msgType
     * @param appRegister
     * @param echoReq
     * @param reqId
     */
    public AppRegisterReceive(Object echoReq, AppRegister appRegister, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.appRegister = appRegister;
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
    public AppRegister getAppRegister() {
        return appRegister;
    }

    /**
     * Application object
     * <p>
     * 
     * 
     */
    public void setAppRegister(AppRegister appRegister) {
        this.appRegister = appRegister;
    }

    /**
     * app_register
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * app_register
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
        return new HashCodeBuilder().append(echoReq).append(appRegister).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppRegisterReceive) == false) {
            return false;
        }
        AppRegisterReceive rhs = ((AppRegisterReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(appRegister, rhs.appRegister).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
