
package data.binaryAPI.commandsUnused.set_account_currency;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Set Account Currency
 * <p>
 * Set account currency, this will be default currency for your account i.e currency for trading, deposit
 * 
 */
public class SetAccountCurrencySend implements Serializable
{

    @SerializedName("set_account_currency")
    @Expose
    private SetAccountCurrencySend.SetAccountCurrency setAccountCurrency;
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
    private final static long serialVersionUID = -2530964320760940848L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetAccountCurrencySend() {
    }

    /**
     * 
     * @param setAccountCurrency
     * @param passthrough
     * @param reqId
     */
    public SetAccountCurrencySend(SetAccountCurrencySend.SetAccountCurrency setAccountCurrency, Passthrough passthrough, Integer reqId) {
        super();
        this.setAccountCurrency = setAccountCurrency;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public SetAccountCurrencySend.SetAccountCurrency getSetAccountCurrency() {
        return setAccountCurrency;
    }

    public void setSetAccountCurrency(SetAccountCurrencySend.SetAccountCurrency setAccountCurrency) {
        this.setAccountCurrency = setAccountCurrency;
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
        return new HashCodeBuilder().append(setAccountCurrency).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetAccountCurrencySend) == false) {
            return false;
        }
        SetAccountCurrencySend rhs = ((SetAccountCurrencySend) other);
        return new EqualsBuilder().append(setAccountCurrency, rhs.setAccountCurrency).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum SetAccountCurrency {

        @SerializedName("USD")
        USD("USD"),
        @SerializedName("EUR")
        EUR("EUR"),
        @SerializedName("GBP")
        GBP("GBP"),
        @SerializedName("AUD")
        AUD("AUD"),
        @SerializedName("JPY")
        JPY("JPY");
        private final String value;
        private final static Map<String, SetAccountCurrencySend.SetAccountCurrency> CONSTANTS = new HashMap<String, SetAccountCurrencySend.SetAccountCurrency>();

        static {
            for (SetAccountCurrencySend.SetAccountCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SetAccountCurrency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetAccountCurrencySend.SetAccountCurrency fromValue(String value) {
            SetAccountCurrencySend.SetAccountCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
