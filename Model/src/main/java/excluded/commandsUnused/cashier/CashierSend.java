
package data.binaryAPI.commandsUnused.cashier;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Cashier Request
 * <p>
 * Cashier
 * 
 */
public class CashierSend implements Serializable
{

    /**
     * either deposit or withdraw, default to deposit
     * 
     */
    @SerializedName("cashier")
    @Expose
    private CashierSend.Cashier cashier;
    /**
     * Note only doughflow is supported currently, epg is only for test.
     * 
     */
    @SerializedName("provider")
    @Expose
    private CashierSend.Provider provider = CashierSend.Provider.fromValue("doughflow");
    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    @SerializedName("verification_code")
    @Expose
    private String verificationCode;
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
    private final static long serialVersionUID = -6214777845261947691L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CashierSend() {
    }

    /**
     * 
     * @param provider
     * @param cashier
     * @param passthrough
     * @param verificationCode
     * @param reqId
     */
    public CashierSend(CashierSend.Cashier cashier, CashierSend.Provider provider, String verificationCode, Passthrough passthrough, Integer reqId) {
        super();
        this.cashier = cashier;
        this.provider = provider;
        this.verificationCode = verificationCode;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * either deposit or withdraw, default to deposit
     * 
     */
    public CashierSend.Cashier getCashier() {
        return cashier;
    }

    /**
     * either deposit or withdraw, default to deposit
     * 
     */
    public void setCashier(CashierSend.Cashier cashier) {
        this.cashier = cashier;
    }

    /**
     * Note only doughflow is supported currently, epg is only for test.
     * 
     */
    public CashierSend.Provider getProvider() {
        return provider;
    }

    /**
     * Note only doughflow is supported currently, epg is only for test.
     * 
     */
    public void setProvider(CashierSend.Provider provider) {
        this.provider = provider;
    }

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
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
        return new HashCodeBuilder().append(cashier).append(provider).append(verificationCode).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashierSend) == false) {
            return false;
        }
        CashierSend rhs = ((CashierSend) other);
        return new EqualsBuilder().append(cashier, rhs.cashier).append(provider, rhs.provider).append(verificationCode, rhs.verificationCode).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum Cashier {

        @SerializedName("deposit")
        DEPOSIT("deposit"),
        @SerializedName("withdraw")
        WITHDRAW("withdraw");
        private final String value;
        private final static Map<String, CashierSend.Cashier> CONSTANTS = new HashMap<String, CashierSend.Cashier>();

        static {
            for (CashierSend.Cashier c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Cashier(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CashierSend.Cashier fromValue(String value) {
            CashierSend.Cashier constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Provider {

        @SerializedName("doughflow")
        DOUGHFLOW("doughflow"),
        @SerializedName("epg")
        EPG("epg");
        private final String value;
        private final static Map<String, CashierSend.Provider> CONSTANTS = new HashMap<String, CashierSend.Provider>();

        static {
            for (CashierSend.Provider c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Provider(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CashierSend.Provider fromValue(String value) {
            CashierSend.Provider constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
