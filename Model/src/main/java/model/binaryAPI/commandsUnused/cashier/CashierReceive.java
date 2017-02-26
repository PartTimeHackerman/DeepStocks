
package data.binaryAPI.commandsUnused.cashier;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Cashier Response
 * <p>
 * Cashier Response Item
 * 
 */
public class CashierReceive implements Serializable, Message
{

    /**
     * cashier url, Note possible error codes: ASK_TNC_APPROVAL (API tnc_approval), ASK_AUTHENTICATE, ASK_UK_FUNDS_PROTECTION (API tnc_approval), ASK_CURRENCY (API set_account_currency), ASK_EMAIL_VERIFY (verify_email), ASK_FIX_DETAILS (API set_settings)
     * 
     */
    @SerializedName("cashier")
    @Expose
    private String cashier;
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
     * cashier
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
    private final static long serialVersionUID = 1996393527352213036L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CashierReceive() {
    }

    /**
     * 
     * @param msgType
     * @param cashier
     * @param echoReq
     * @param reqId
     */
    public CashierReceive(String cashier, Object echoReq, String msgType, Integer reqId) {
        super();
        this.cashier = cashier;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * cashier url, Note possible error codes: ASK_TNC_APPROVAL (API tnc_approval), ASK_AUTHENTICATE, ASK_UK_FUNDS_PROTECTION (API tnc_approval), ASK_CURRENCY (API set_account_currency), ASK_EMAIL_VERIFY (verify_email), ASK_FIX_DETAILS (API set_settings)
     * 
     */
    public String getCashier() {
        return cashier;
    }

    /**
     * cashier url, Note possible error codes: ASK_TNC_APPROVAL (API tnc_approval), ASK_AUTHENTICATE, ASK_UK_FUNDS_PROTECTION (API tnc_approval), ASK_CURRENCY (API set_account_currency), ASK_EMAIL_VERIFY (verify_email), ASK_FIX_DETAILS (API set_settings)
     * 
     */
    public void setCashier(String cashier) {
        this.cashier = cashier;
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
     * cashier
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * cashier
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
        return new HashCodeBuilder().append(cashier).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashierReceive) == false) {
            return false;
        }
        CashierReceive rhs = ((CashierReceive) other);
        return new EqualsBuilder().append(cashier, rhs.cashier).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
