
package data.binaryAPI.commandsUnused.forget_all;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Cancel Incoming Streams Based on Type
 * <p>
 * Immediately cancel the real-time streams of messages of given type
 * 
 */
public class ForgetAllSend implements Serializable
{

    /**
     * Cancel all streams of a given type (which should be 'ticks', 'proposal', 'proposal_open_contract', etc)
     * 
     */
    @SerializedName("forget_all")
    @Expose
    private ForgetAllSend.ForgetAll forgetAll;
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
    private final static long serialVersionUID = 1186203583107636201L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForgetAllSend() {
    }

    /**
     * 
     * @param forgetAll
     * @param passthrough
     * @param reqId
     */
    public ForgetAllSend(ForgetAllSend.ForgetAll forgetAll, Passthrough passthrough, Integer reqId) {
        super();
        this.forgetAll = forgetAll;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Cancel all streams of a given type (which should be 'ticks', 'proposal', 'proposal_open_contract', etc)
     * 
     */
    public ForgetAllSend.ForgetAll getForgetAll() {
        return forgetAll;
    }

    /**
     * Cancel all streams of a given type (which should be 'ticks', 'proposal', 'proposal_open_contract', etc)
     * 
     */
    public void setForgetAll(ForgetAllSend.ForgetAll forgetAll) {
        this.forgetAll = forgetAll;
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
        return new HashCodeBuilder().append(forgetAll).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForgetAllSend) == false) {
            return false;
        }
        ForgetAllSend rhs = ((ForgetAllSend) other);
        return new EqualsBuilder().append(forgetAll, rhs.forgetAll).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum ForgetAll {

        @SerializedName("ticks")
        TICKS("ticks"),
        @SerializedName("candles")
        CANDLES("candles"),
        @SerializedName("proposal")
        PROPOSAL("proposal"),
        @SerializedName("portfolio")
        PORTFOLIO("portfolio"),
        @SerializedName("proposal_open_contract")
        PROPOSAL_OPEN_CONTRACT("proposal_open_contract"),
        @SerializedName("balance")
        BALANCE("balance"),
        @SerializedName("transaction")
        TRANSACTION("transaction"),
        @SerializedName("pricing_table")
        PRICING_TABLE("pricing_table");
        private final String value;
        private final static Map<String, ForgetAllSend.ForgetAll> CONSTANTS = new HashMap<String, ForgetAllSend.ForgetAll>();

        static {
            for (ForgetAllSend.ForgetAll c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ForgetAll(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ForgetAllSend.ForgetAll fromValue(String value) {
            ForgetAllSend.ForgetAll constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
