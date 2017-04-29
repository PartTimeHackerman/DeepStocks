package model.binaryAPI.commands.ticks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import model.data.Candle;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Tick Stream Response
 * <p>
 * Latest spot price for a given symbol. Continous responses with a frequency of up to one second
 * 
 */
public class TicksReceive implements Serializable, BinaryMessage
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
     * TickSpotData
     * <p>
     * Tick by tick list of streamed data
     * 
     */
    @SerializedName("tick")
    @Expose
    private Candle tick;
    /**
     * tick
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
    private final static long serialVersionUID = -8183541953990733029L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TicksReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param tick
     * @param reqId
     */
    public TicksReceive(Object echoReq, Candle tick, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.tick = tick;
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
     * TickSpotData
     * <p>
     * Tick by tick list of streamed data
     * 
     */
    public Candle getCandle() {
        return tick;
    }

    /**
     * TickSpotData
     * <p>
     * Tick by tick list of streamed data
     * 
     */
    public void setTick(Candle tick) {
        this.tick = tick;
    }

    /**
     * tick
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * tick
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
        return new HashCodeBuilder().append(echoReq).append(tick).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicksReceive) == false) {
            return false;
        }
        TicksReceive rhs = ((TicksReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(tick, rhs.tick).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
