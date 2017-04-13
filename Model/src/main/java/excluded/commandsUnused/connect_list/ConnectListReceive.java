
package data.binaryAPI.commandsUnused.connect_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Social Connect List Receive
 * <p>
 * 
 * 
 */
public class ConnectListReceive implements Serializable, Message
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
     * 
     * (Required)
     * 
     */
    @SerializedName("connect_list")
    @Expose
    private List<String> connectList = new ArrayList<String>();
    /**
     * connect_list
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
    private final static long serialVersionUID = 4027667631237894241L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectListReceive() {
    }

    /**
     * 
     * @param msgType
     * @param connectList
     * @param echoReq
     * @param reqId
     */
    public ConnectListReceive(Object echoReq, List<String> connectList, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.connectList = connectList;
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
     * 
     * (Required)
     * 
     */
    public List<String> getConnectList() {
        return connectList;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setConnectList(List<String> connectList) {
        this.connectList = connectList;
    }

    /**
     * connect_list
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * connect_list
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
        return new HashCodeBuilder().append(echoReq).append(connectList).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectListReceive) == false) {
            return false;
        }
        ConnectListReceive rhs = ((ConnectListReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(connectList, rhs.connectList).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
