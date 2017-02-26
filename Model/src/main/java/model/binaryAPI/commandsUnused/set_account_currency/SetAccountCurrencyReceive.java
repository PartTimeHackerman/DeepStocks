
package data.binaryAPI.commandsUnused.set_account_currency;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Set Account Currency Response
 * <p>
 * Status of set account currency call
 * 
 */
public class SetAccountCurrencyReceive implements Serializable, Message
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
     * set account currency response
     * <p>
     *  1: success, 0: no change
     * 
     */
    @SerializedName("set_account_currency")
    @Expose
    private Integer setAccountCurrency;
    /**
     * set_account_currency
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
    private final static long serialVersionUID = 3483892418293288062L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetAccountCurrencyReceive() {
    }

    /**
     * 
     * @param setAccountCurrency
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public SetAccountCurrencyReceive(Object echoReq, Integer setAccountCurrency, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.setAccountCurrency = setAccountCurrency;
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
     * set account currency response
     * <p>
     *  1: success, 0: no change
     * 
     */
    public Integer getSetAccountCurrency() {
        return setAccountCurrency;
    }

    /**
     * set account currency response
     * <p>
     *  1: success, 0: no change
     * 
     */
    public void setSetAccountCurrency(Integer setAccountCurrency) {
        this.setAccountCurrency = setAccountCurrency;
    }

    /**
     * set_account_currency
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * set_account_currency
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
        return new HashCodeBuilder().append(echoReq).append(setAccountCurrency).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetAccountCurrencyReceive) == false) {
            return false;
        }
        SetAccountCurrencyReceive rhs = ((SetAccountCurrencyReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(setAccountCurrency, rhs.setAccountCurrency).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
