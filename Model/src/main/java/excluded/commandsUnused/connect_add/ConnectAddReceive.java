
package data.binaryAPI.commandsUnused.connect_add;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Social Connect Add Receive
 * <p>
 * 
 * 
 */
public class ConnectAddReceive implements Serializable, Message
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
    @SerializedName("connect_add")
    @Expose
    private String connectAdd;
    /**
     * connect_add
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
    private final static long serialVersionUID = 6635605131097624719L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectAddReceive() {
    }

    /**
     * 
     * @param msgType
     * @param connectAdd
     * @param echoReq
     * @param reqId
     */
    public ConnectAddReceive(Object echoReq, String connectAdd, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.connectAdd = connectAdd;
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
    public String getConnectAdd() {
        return connectAdd;
    }

    /**
     *  1 on success
     * (Required)
     * 
     */
    public void setConnectAdd(String connectAdd) {
        this.connectAdd = connectAdd;
    }

    /**
     * connect_add
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * connect_add
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
        return new HashCodeBuilder().append(echoReq).append(connectAdd).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectAddReceive) == false) {
            return false;
        }
        ConnectAddReceive rhs = ((ConnectAddReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(connectAdd, rhs.connectAdd).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
