
package data.binaryAPI.commandsUnused.sell_expired;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Sell expired contracts
 * <p>
 * Sell expired contract response
 * 
 */
public class SellExpiredReceive implements Serializable, Message
{

    /**
     * Sell expired contract object containing count of contracts sold
     * 
     */
    @SerializedName("sell_expired")
    @Expose
    private SellExpired sellExpired;
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
     * sell_expired
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
    private final static long serialVersionUID = 2380106346749476637L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellExpiredReceive() {
    }

    /**
     * 
     * @param sellExpired
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public SellExpiredReceive(SellExpired sellExpired, Object echoReq, String msgType, Integer reqId) {
        super();
        this.sellExpired = sellExpired;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Sell expired contract object containing count of contracts sold
     * 
     */
    public SellExpired getSellExpired() {
        return sellExpired;
    }

    /**
     * Sell expired contract object containing count of contracts sold
     * 
     */
    public void setSellExpired(SellExpired sellExpired) {
        this.sellExpired = sellExpired;
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
     * sell_expired
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * sell_expired
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
        return new HashCodeBuilder().append(sellExpired).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellExpiredReceive) == false) {
            return false;
        }
        SellExpiredReceive rhs = ((SellExpiredReceive) other);
        return new EqualsBuilder().append(sellExpired, rhs.sellExpired).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
