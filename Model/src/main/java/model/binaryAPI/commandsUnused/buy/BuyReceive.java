
package data.binaryAPI.commandsUnused.buy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Buy a Contract Receive
 * <p>
 * A message with transaction results is received
 * 
 */
public class BuyReceive implements Serializable, Message
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
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * 
     */
    @SerializedName("buy")
    @Expose
    private Buy buy;
    /**
     * buy
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
    private final static long serialVersionUID = 6393369709742545663L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuyReceive() {
    }

    /**
     * 
     * @param msgType
     * @param buy
     * @param echoReq
     * @param reqId
     */
    public BuyReceive(Object echoReq, Buy buy, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.buy = buy;
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
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * 
     */
    public Buy getBuy() {
        return buy;
    }

    /**
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * 
     */
    public void setBuy(Buy buy) {
        this.buy = buy;
    }

    /**
     * buy
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * buy
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
        return new HashCodeBuilder().append(echoReq).append(buy).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuyReceive) == false) {
            return false;
        }
        BuyReceive rhs = ((BuyReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(buy, rhs.buy).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
