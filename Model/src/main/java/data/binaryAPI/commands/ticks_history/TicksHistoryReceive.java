
package data.binaryAPI.commands.ticks_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import data.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Tick History Response
 * <p>
 * Historic tick data for a single symbol
 * 
 */
public class TicksHistoryReceive implements Serializable, BinaryMessage
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
     * Tick History Response
     * <p>
     * Historic tick data for a given symbol
     * 
     */
    @SerializedName("history")
    @Expose
    private History history;
    /**
     * Array of OHLC (open/high/low/close) price values for the given time (only for style='candles')
     * 
     */
    @SerializedName("candles")
    @Expose
    private List<Candle> candles = new ArrayList<Candle>();
    /**
     * style
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
    private final static long serialVersionUID = 7684102736825730421L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicksHistoryReceive() {
    }

    /**
     * 
     * @param msgType
     * @param candles
     * @param echoReq
     * @param history
     * @param reqId
     */
    public TicksHistoryReceive(Object echoReq, History history, List<Candle> candles, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.history = history;
        this.candles = candles;
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
     * Tick History Response
     * <p>
     * Historic tick data for a given symbol
     * 
     */
    public History getHistory() {
        return history;
    }

    /**
     * Tick History Response
     * <p>
     * Historic tick data for a given symbol
     * 
     */
    public void setHistory(History history) {
        this.history = history;
    }

    /**
     * Array of OHLC (open/high/low/close) price values for the given time (only for style='candles')
     * 
     */
    public List<Candle> getCandles() {
        return candles;
    }

    /**
     * Array of OHLC (open/high/low/close) price values for the given time (only for style='candles')
     * 
     */
    public void setCandles(List<Candle> candles) {
        this.candles = candles;
    }

    /**
     * style
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * style
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
        return new HashCodeBuilder().append(echoReq).append(history).append(candles).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicksHistoryReceive) == false) {
            return false;
        }
        TicksHistoryReceive rhs = ((TicksHistoryReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(history, rhs.history).append(candles, rhs.candles).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
