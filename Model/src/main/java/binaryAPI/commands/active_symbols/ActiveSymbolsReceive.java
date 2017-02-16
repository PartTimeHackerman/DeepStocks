
package binaryAPI.commands.active_symbols;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Get list of active symbols Receive
 * <p>
 * A BinaryMessage list of active symbols
 * 
 */
public class ActiveSymbolsReceive implements Serializable, BinaryMessage
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
     * Active symbols
     * <p>
     * List of active symbols. Note: if the user is authenticated, then only symbols allowed under his account will be returned.
     * 
     */
    @SerializedName("active_symbols")
    @Expose
    private List<ActiveSymbol> activeSymbols = new ArrayList<ActiveSymbol>();
    /**
     * active_symbols
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
    private final static long serialVersionUID = 6076610137904776706L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActiveSymbolsReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param activeSymbols
     * @param reqId
     */
    public ActiveSymbolsReceive(Object echoReq, List<ActiveSymbol> activeSymbols, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.activeSymbols = activeSymbols;
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
     * Active symbols
     * <p>
     * List of active symbols. Note: if the user is authenticated, then only symbols allowed under his account will be returned.
     * 
     */
    public List<ActiveSymbol> getActiveSymbols() {
        return activeSymbols;
    }

    /**
     * Active symbols
     * <p>
     * List of active symbols. Note: if the user is authenticated, then only symbols allowed under his account will be returned.
     * 
     */
    public void setActiveSymbols(List<ActiveSymbol> activeSymbols) {
        this.activeSymbols = activeSymbols;
    }

    /**
     * active_symbols
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * active_symbols
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
        return new HashCodeBuilder().append(echoReq).append(activeSymbols).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveSymbolsReceive) == false) {
            return false;
        }
        ActiveSymbolsReceive rhs = ((ActiveSymbolsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(activeSymbols, rhs.activeSymbols).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }
}
