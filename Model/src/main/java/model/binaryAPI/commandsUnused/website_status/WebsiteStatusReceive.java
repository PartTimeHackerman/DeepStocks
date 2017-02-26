
package data.binaryAPI.commandsUnused.website_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Server status
 * <p>
 * 
 * 
 */
public class WebsiteStatusReceive implements Serializable, Message
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
    @SerializedName("website_status")
    @Expose
    private WebsiteStatus websiteStatus;
    /**
     * website_status
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
    private final static long serialVersionUID = 8251410358039646911L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebsiteStatusReceive() {
    }

    /**
     * 
     * @param msgType
     * @param websiteStatus
     * @param echoReq
     * @param reqId
     */
    public WebsiteStatusReceive(Object echoReq, WebsiteStatus websiteStatus, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.websiteStatus = websiteStatus;
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

    public WebsiteStatus getWebsiteStatus() {
        return websiteStatus;
    }

    public void setWebsiteStatus(WebsiteStatus websiteStatus) {
        this.websiteStatus = websiteStatus;
    }

    /**
     * website_status
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * website_status
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
        return new HashCodeBuilder().append(echoReq).append(websiteStatus).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebsiteStatusReceive) == false) {
            return false;
        }
        WebsiteStatusReceive rhs = ((WebsiteStatusReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(websiteStatus, rhs.websiteStatus).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
