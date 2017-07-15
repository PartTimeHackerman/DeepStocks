
package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Trading Times Receive
 * <p>
 * A message with Trading Times
 * 
 */
public class TradingTimesReceive implements Serializable, BinaryMessage
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
     * Trading Times Structure
     * <p>
     * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
     * 
     */
    @SerializedName("trading_times")
    @Expose
    private TradingTimes tradingTimes;
    /**
     * trading_times
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request toClass map toClass response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 8791141450959192181L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradingTimesReceive() {
    }

    /**
     * 
     * @param msgType
     * @param tradingTimes
     * @param echoReq
     * @param reqId
     */
    public TradingTimesReceive(Object echoReq, TradingTimes tradingTimes, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.tradingTimes = tradingTimes;
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
     * Trading Times Structure
     * <p>
     * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
     * 
     */
    public TradingTimes getTradingTimes() {
        return tradingTimes;
    }

    /**
     * Trading Times Structure
     * <p>
     * The trading times structure is a hierarchy as follows: Market -> SubMarket -> Underlyings
     * 
     */
    public void setTradingTimes(TradingTimes tradingTimes) {
        this.tradingTimes = tradingTimes;
    }

    /**
     * trading_times
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * trading_times
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request toClass map toClass response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request toClass map toClass response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(tradingTimes).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradingTimesReceive) == false) {
            return false;
        }
        TradingTimesReceive rhs = ((TradingTimesReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(tradingTimes, rhs.tradingTimes).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
