
package data.binaryAPI.commandsUnused.profit_table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Profit Table Receive
 * <p>
 * A summary of account profit table is received
 * 
 */
public class ProfitTableReceive implements Serializable, Message
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
     * Profit Table list
     * <p>
     * Account Profit Table.
     * 
     */
    @SerializedName("profit_table")
    @Expose
    private ProfitTable profitTable;
    /**
     * statement
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
    private final static long serialVersionUID = -8690920373802631367L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProfitTableReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param profitTable
     * @param reqId
     */
    public ProfitTableReceive(Object echoReq, ProfitTable profitTable, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.profitTable = profitTable;
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
     * Profit Table list
     * <p>
     * Account Profit Table.
     * 
     */
    public ProfitTable getProfitTable() {
        return profitTable;
    }

    /**
     * Profit Table list
     * <p>
     * Account Profit Table.
     * 
     */
    public void setProfitTable(ProfitTable profitTable) {
        this.profitTable = profitTable;
    }

    /**
     * statement
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * statement
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
        return new HashCodeBuilder().append(echoReq).append(profitTable).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfitTableReceive) == false) {
            return false;
        }
        ProfitTableReceive rhs = ((ProfitTableReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(profitTable, rhs.profitTable).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
