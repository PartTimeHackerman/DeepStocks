
package data.binaryAPI.commandsUnused.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Transaction Subscription
 * <p>
 * Subscribe to transaction notifications
 * 
 */
public class TransactionSend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("transaction")
    @Expose
    private Integer transaction;
    /**
     * If set to 1, will send updates whenever there is an update to transactions. If not to 1 then it will not return any records.
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
    private final static long serialVersionUID = -248865284605367350L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionSend() {
    }

    /**
     * 
     * @param subscribe
     * @param passthrough
     * @param transaction
     * @param reqId
     */
    public TransactionSend(Integer transaction, Integer subscribe, Passthrough passthrough, Integer reqId) {
        super();
        this.transaction = transaction;
        this.subscribe = subscribe;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getTransaction() {
        return transaction;
    }

    /**
     * Must be 1.
     * 
     */
    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    /**
     * If set to 1, will send updates whenever there is an update to transactions. If not to 1 then it will not return any records.
     * 
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * If set to 1, will send updates whenever there is an update to transactions. If not to 1 then it will not return any records.
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
        return new HashCodeBuilder().append(transaction).append(subscribe).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionSend) == false) {
            return false;
        }
        TransactionSend rhs = ((TransactionSend) other);
        return new EqualsBuilder().append(transaction, rhs.transaction).append(subscribe, rhs.subscribe).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
