
package data.binaryAPI.commandsUnused.sell;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Sell a Contract Send
 * <p>
 * Sell a Contract as identified from a previous Portfolio call
 * 
 */
public class SellSend implements Serializable
{

    /**
     * Pass contract_id received from the Portfolio call
     * 
     */
    @SerializedName("sell")
    @Expose
    private Integer sell;
    /**
     * Minimum price at which to sell the contract, or '0' for 'sell at market'
     * 
     */
    @SerializedName("price")
    @Expose
    private Double price;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -690917298613579574L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellSend() {
    }

    /**
     * 
     * @param price
     * @param sell
     * @param passthrough
     * @param reqId
     */
    public SellSend(Integer sell, Double price, Passthrough passthrough, Integer reqId) {
        super();
        this.sell = sell;
        this.price = price;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Pass contract_id received from the Portfolio call
     * 
     */
    public Integer getSell() {
        return sell;
    }

    /**
     * Pass contract_id received from the Portfolio call
     * 
     */
    public void setSell(Integer sell) {
        this.sell = sell;
    }

    /**
     * Minimum price at which to sell the contract, or '0' for 'sell at market'
     * 
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Minimum price at which to sell the contract, or '0' for 'sell at market'
     * 
     */
    public void setPrice(Double price) {
        this.price = price;
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
        return new HashCodeBuilder().append(sell).append(price).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellSend) == false) {
            return false;
        }
        SellSend rhs = ((SellSend) other);
        return new EqualsBuilder().append(sell, rhs.sell).append(price, rhs.price).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
