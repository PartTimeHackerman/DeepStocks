
package data.binaryAPI.commandsUnused.paymentagent_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent List Receive
 * <p>
 * A message with Payment Agent List
 * 
 */
public class PaymentagentListReceive implements Serializable, Message
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
     * Payment Agent List
     * <p>
     * Payment Agent List
     * 
     */
    @SerializedName("paymentagent_list")
    @Expose
    private PaymentagentList paymentagentList;
    /**
     * paymentagent_list
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
    private final static long serialVersionUID = -5419778650875269348L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentListReceive() {
    }

    /**
     * 
     * @param paymentagentList
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public PaymentagentListReceive(Object echoReq, PaymentagentList paymentagentList, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.paymentagentList = paymentagentList;
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
     * Payment Agent List
     * <p>
     * Payment Agent List
     * 
     */
    public PaymentagentList getPaymentagentList() {
        return paymentagentList;
    }

    /**
     * Payment Agent List
     * <p>
     * Payment Agent List
     * 
     */
    public void setPaymentagentList(PaymentagentList paymentagentList) {
        this.paymentagentList = paymentagentList;
    }

    /**
     * paymentagent_list
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * paymentagent_list
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
        return new HashCodeBuilder().append(echoReq).append(paymentagentList).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentListReceive) == false) {
            return false;
        }
        PaymentagentListReceive rhs = ((PaymentagentListReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(paymentagentList, rhs.paymentagentList).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
