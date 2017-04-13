
package data.binaryAPI.commandsUnused.verify_email;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Verify Email Send
 * <p>
 * Verify an email address before new account signup. The system will send an email to the address containing a security code to verify the address.
 * 
 */
public class VerifyEmailSend implements Serializable
{

    /**
     * Email address to be verified
     * 
     */
    @SerializedName("verify_email")
    @Expose
    private String verifyEmail;
    /**
     * Purpose of the email verification call
     * 
     */
    @SerializedName("type")
    @Expose
    private VerifyEmailSend.Type type;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    private final static long serialVersionUID = -5888800322164233967L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerifyEmailSend() {
    }

    /**
     * 
     * @param passthrough
     * @param type
     * @param verifyEmail
     * @param reqId
     */
    public VerifyEmailSend(String verifyEmail, VerifyEmailSend.Type type, Integer reqId, Passthrough passthrough) {
        super();
        this.verifyEmail = verifyEmail;
        this.type = type;
        this.reqId = reqId;
        this.passthrough = passthrough;
    }

    /**
     * Email address to be verified
     * 
     */
    public String getVerifyEmail() {
        return verifyEmail;
    }

    /**
     * Email address to be verified
     * 
     */
    public void setVerifyEmail(String verifyEmail) {
        this.verifyEmail = verifyEmail;
    }

    /**
     * Purpose of the email verification call
     * 
     */
    public VerifyEmailSend.Type getType() {
        return type;
    }

    /**
     * Purpose of the email verification call
     * 
     */
    public void setType(VerifyEmailSend.Type type) {
        this.type = type;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(verifyEmail).append(type).append(reqId).append(passthrough).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerifyEmailSend) == false) {
            return false;
        }
        VerifyEmailSend rhs = ((VerifyEmailSend) other);
        return new EqualsBuilder().append(verifyEmail, rhs.verifyEmail).append(type, rhs.type).append(reqId, rhs.reqId).append(passthrough, rhs.passthrough).isEquals();
    }

    public enum Type {

        @SerializedName("account_opening")
        ACCOUNT_OPENING("account_opening"),
        @SerializedName("reset_password")
        RESET_PASSWORD("reset_password"),
        @SerializedName("paymentagent_withdraw")
        PAYMENTAGENT_WITHDRAW("paymentagent_withdraw"),
        @SerializedName("payment_withdraw")
        PAYMENT_WITHDRAW("payment_withdraw");
        private final String value;
        private final static Map<String, VerifyEmailSend.Type> CONSTANTS = new HashMap<String, VerifyEmailSend.Type>();

        static {
            for (VerifyEmailSend.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static VerifyEmailSend.Type fromValue(String value) {
            VerifyEmailSend.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
