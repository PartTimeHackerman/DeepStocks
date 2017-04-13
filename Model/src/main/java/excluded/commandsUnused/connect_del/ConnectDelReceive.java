
package data.binaryAPI.commandsUnused.connect_del;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Social Connect Delete Receive
 * <p>
 * 
 * 
 */
public class ConnectDelReceive implements Serializable, Message
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
     *  1 on success
     * (Required)
     * 
     */
    @SerializedName("connect_del")
    @Expose
    private String connectDel;
    /**
     * connect_del
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
    private final static long serialVersionUID = -2933181888776022372L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectDelReceive() {
    }

    /**
     * 
     * @param connectDel
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ConnectDelReceive(Object echoReq, String connectDel, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.connectDel = connectDel;
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
     *  1 on success
     * (Required)
     * 
     */
    public String getConnectDel() {
        return connectDel;
    }

    /**
     *  1 on success
     * (Required)
     * 
     */
    public void setConnectDel(String connectDel) {
        this.connectDel = connectDel;
    }

    /**
     * connect_del
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * connect_del
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
        return new HashCodeBuilder().append(echoReq).append(connectDel).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectDelReceive) == false) {
            return false;
        }
        ConnectDelReceive rhs = ((ConnectDelReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(connectDel, rhs.connectDel).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
