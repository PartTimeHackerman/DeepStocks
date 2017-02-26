
package data.binaryAPI.commandsUnused.sell;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Sell a Contract Receive
 * <p>
 * A message with transaction results is received
 * 
 */
public class SellReceive implements Serializable, Message
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
     * Receipt for the transaction
     * <p>
     * Receipt for the transaction
     * 
     */
    @SerializedName("sell")
    @Expose
    private Sell sell;
    /**
     * sell
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
    private final static long serialVersionUID = 8415156400403230057L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellReceive() {
    }

    /**
     * 
     * @param msgType
     * @param sell
     * @param echoReq
     * @param reqId
     */
    public SellReceive(Object echoReq, Sell sell, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.sell = sell;
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
     * Receipt for the transaction
     * <p>
     * Receipt for the transaction
     * 
     */
    public Sell getSell() {
        return sell;
    }

    /**
     * Receipt for the transaction
     * <p>
     * Receipt for the transaction
     * 
     */
    public void setSell(Sell sell) {
        this.sell = sell;
    }

    /**
     * sell
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * sell
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
        return new HashCodeBuilder().append(echoReq).append(sell).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellReceive) == false) {
            return false;
        }
        SellReceive rhs = ((SellReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(sell, rhs.sell).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
