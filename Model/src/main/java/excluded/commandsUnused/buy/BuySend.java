
package data.binaryAPI.commandsUnused.buy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Buy a Contract Send
 * <p>
 * Buy a Contract
 * 
 */
public class BuySend implements Serializable
{

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    @SerializedName("buy")
    @Expose
    private String buy;
    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    @SerializedName("price")
    @Expose
    private Double price;
    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
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
    private final static long serialVersionUID = -1495573643297455855L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuySend() {
    }

    /**
     * 
     * @param price
     * @param buy
     * @param passthrough
     * @param parameters
     * @param reqId
     */
    public BuySend(String buy, Double price, Parameters parameters, Passthrough passthrough, Integer reqId) {
        super();
        this.buy = buy;
        this.price = price;
        this.parameters = parameters;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    public String getBuy() {
        return buy;
    }

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    public void setBuy(String buy) {
        this.buy = buy;
    }

    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
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
        return new HashCodeBuilder().append(buy).append(price).append(parameters).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuySend) == false) {
            return false;
        }
        BuySend rhs = ((BuySend) other);
        return new EqualsBuilder().append(buy, rhs.buy).append(price, rhs.price).append(parameters, rhs.parameters).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
