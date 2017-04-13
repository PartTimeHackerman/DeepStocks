
package data.binaryAPI.commandsUnused.mt5_login_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Get List of MT5 accounts for client
 * <p>
 * Get list of MT5 accounts for client
 * 
 */
public class Mt5LoginListReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    @SerializedName("mt5_login_list")
    @Expose
    private List<Mt5LoginList> mt5LoginList = new ArrayList<Mt5LoginList>();
    /**
     * mt5_login_list
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
    private final static long serialVersionUID = -9081480506639659203L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5LoginListReceive() {
    }

    /**
     * 
     * @param msgType
     * @param mt5LoginList
     * @param echoReq
     * @param reqId
     */
    public Mt5LoginListReceive(Object echoReq, List<Mt5LoginList> mt5LoginList, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.mt5LoginList = mt5LoginList;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    public List<Mt5LoginList> getMt5LoginList() {
        return mt5LoginList;
    }

    public void setMt5LoginList(List<Mt5LoginList> mt5LoginList) {
        this.mt5LoginList = mt5LoginList;
    }

    /**
     * mt5_login_list
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * mt5_login_list
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
        return new HashCodeBuilder().append(echoReq).append(mt5LoginList).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5LoginListReceive) == false) {
            return false;
        }
        Mt5LoginListReceive rhs = ((Mt5LoginListReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(mt5LoginList, rhs.mt5LoginList).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
