
package data.binaryAPI.commandsUnused.payout_currencies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Payout Currencies Receive
 * <p>
 * 
 * 
 */
public class PayoutCurrenciesReceive implements Serializable, Message
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
     * Payout currencies
     * <p>
     * Available payout currencies. Note: if a user is logged in, only the currency available for his account will be returned.
     * (Required)
     * 
     */
    @SerializedName("payout_currencies")
    @Expose
    private List<String> payoutCurrencies = new ArrayList<String>();
    /**
     * payout_currencies
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
    private final static long serialVersionUID = -2747294079533514143L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PayoutCurrenciesReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param payoutCurrencies
     * @param reqId
     */
    public PayoutCurrenciesReceive(Object echoReq, List<String> payoutCurrencies, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.payoutCurrencies = payoutCurrencies;
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
     * Payout currencies
     * <p>
     * Available payout currencies. Note: if a user is logged in, only the currency available for his account will be returned.
     * (Required)
     * 
     */
    public List<String> getPayoutCurrencies() {
        return payoutCurrencies;
    }

    /**
     * Payout currencies
     * <p>
     * Available payout currencies. Note: if a user is logged in, only the currency available for his account will be returned.
     * (Required)
     * 
     */
    public void setPayoutCurrencies(List<String> payoutCurrencies) {
        this.payoutCurrencies = payoutCurrencies;
    }

    /**
     * payout_currencies
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * payout_currencies
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
        return new HashCodeBuilder().append(echoReq).append(payoutCurrencies).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayoutCurrenciesReceive) == false) {
            return false;
        }
        PayoutCurrenciesReceive rhs = ((PayoutCurrenciesReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(payoutCurrencies, rhs.payoutCurrencies).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
