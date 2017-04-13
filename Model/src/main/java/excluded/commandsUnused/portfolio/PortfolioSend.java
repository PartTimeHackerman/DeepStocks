
package data.binaryAPI.commandsUnused.portfolio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Portfolio Send
 * <p>
 * Receive information about my current portfolio of outstanding options
 * 
 */
public class PortfolioSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("portfolio")
    @Expose
    private Integer portfolio;
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
    private final static long serialVersionUID = -5371094797832360936L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortfolioSend() {
    }

    /**
     * 
     * @param portfolio
     * @param passthrough
     * @param reqId
     */
    public PortfolioSend(Integer portfolio, Passthrough passthrough, Integer reqId) {
        super();
        this.portfolio = portfolio;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getPortfolio() {
        return portfolio;
    }

    /**
     * Must be 1
     * 
     */
    public void setPortfolio(Integer portfolio) {
        this.portfolio = portfolio;
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
        return new HashCodeBuilder().append(portfolio).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioSend) == false) {
            return false;
        }
        PortfolioSend rhs = ((PortfolioSend) other);
        return new EqualsBuilder().append(portfolio, rhs.portfolio).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
