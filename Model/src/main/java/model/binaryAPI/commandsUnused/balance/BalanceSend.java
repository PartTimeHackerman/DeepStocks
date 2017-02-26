
package data.binaryAPI.commandsUnused.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Balance Send
 * <p>
 * Get user account balance
 * 
 */
public class BalanceSend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("balance")
    @Expose
    private Integer balance;
    /**
     * If set to 1, will send updates whenever the balance changes.
     * 
     */
    @SerializedName("subscribe")
    @Expose
    private Integer subscribe;
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
    private final static long serialVersionUID = -3046123973912859524L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BalanceSend() {
    }

    /**
     * 
     * @param balance
     * @param subscribe
     * @param passthrough
     * @param reqId
     */
    public BalanceSend(Integer balance, Integer subscribe, Passthrough passthrough, Integer reqId) {
        super();
        this.balance = balance;
        this.subscribe = subscribe;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * Must be 1.
     * 
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * If set to 1, will send updates whenever the balance changes.
     * 
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * If set to 1, will send updates whenever the balance changes.
     * 
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
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
        return new HashCodeBuilder().append(balance).append(subscribe).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceSend) == false) {
            return false;
        }
        BalanceSend rhs = ((BalanceSend) other);
        return new EqualsBuilder().append(balance, rhs.balance).append(subscribe, rhs.subscribe).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
