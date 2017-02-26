
package data.binaryAPI.commandsUnused.payout_currencies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payout Currencies Send
 * <p>
 * Retrieve a list of available option payout currencies. If a user is logged in, only the currency available for his account will be returned.
 * 
 */
public class PayoutCurrenciesSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("payout_currencies")
    @Expose
    private Integer payoutCurrencies;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -64289547054376738L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PayoutCurrenciesSend() {
    }

    /**
     * 
     * @param passthrough
     * @param payoutCurrencies
     * @param reqId
     */
    public PayoutCurrenciesSend(Integer payoutCurrencies, Passthrough passthrough, Integer reqId) {
        super();
        this.payoutCurrencies = payoutCurrencies;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getPayoutCurrencies() {
        return payoutCurrencies;
    }

    /**
     * Must be 1
     * 
     */
    public void setPayoutCurrencies(Integer payoutCurrencies) {
        this.payoutCurrencies = payoutCurrencies;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public Passthrough getPassthrough() {
        return passthrough;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public void setPassthrough(Passthrough passthrough) {
        this.passthrough = passthrough;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field to map request to response
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
        return new HashCodeBuilder().append(payoutCurrencies).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayoutCurrenciesSend) == false) {
            return false;
        }
        PayoutCurrenciesSend rhs = ((PayoutCurrenciesSend) other);
        return new EqualsBuilder().append(payoutCurrencies, rhs.payoutCurrencies).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
