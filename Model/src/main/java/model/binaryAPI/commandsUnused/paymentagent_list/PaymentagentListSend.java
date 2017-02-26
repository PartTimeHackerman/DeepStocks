
package data.binaryAPI.commandsUnused.paymentagent_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent List Send
 * <p>
 * Will return a list of Payment Agents for a given country. Payment agents allow Binary.com users to deposit and withdraw funds using local payment methods that might not be available via the main Binary.com cashier system.
 * 
 */
public class PaymentagentListSend implements Serializable
{

    /**
     * Payment Agent Target Country
     * <p>
     * Client country (2-letter country code).
     * 
     */
    @SerializedName("paymentagent_list")
    @Expose
    private String paymentagentList;
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
    private final static long serialVersionUID = -1233333237943838182L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentListSend() {
    }

    /**
     * 
     * @param paymentagentList
     * @param passthrough
     * @param reqId
     */
    public PaymentagentListSend(String paymentagentList, Passthrough passthrough, Integer reqId) {
        super();
        this.paymentagentList = paymentagentList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Payment Agent Target Country
     * <p>
     * Client country (2-letter country code).
     * 
     */
    public String getPaymentagentList() {
        return paymentagentList;
    }

    /**
     * Payment Agent Target Country
     * <p>
     * Client country (2-letter country code).
     * 
     */
    public void setPaymentagentList(String paymentagentList) {
        this.paymentagentList = paymentagentList;
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
        return new HashCodeBuilder().append(paymentagentList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentListSend) == false) {
            return false;
        }
        PaymentagentListSend rhs = ((PaymentagentListSend) other);
        return new EqualsBuilder().append(paymentagentList, rhs.paymentagentList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
