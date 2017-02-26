
package data.binaryAPI.commandsUnused.landing_company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Landing Company Send
 * <p>
 * Binary.com has a number of licensed subsidiaries in various jurisidictions, which are called Landing Companies. This call will return the appropriate Landing Company for clients of a given country. The landing company may differ for gaming contracts (Volatility Indices) and financial contracts (forex, stock indices, commodities).
 * 
 */
public class LandingCompanySend implements Serializable
{

    /**
     * Landing Company
     * <p>
     * Client country
     * 
     */
    @SerializedName("landing_company")
    @Expose
    private String landingCompany;
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
    private final static long serialVersionUID = 3276198509096403452L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompanySend() {
    }

    /**
     * 
     * @param landingCompany
     * @param passthrough
     * @param reqId
     */
    public LandingCompanySend(String landingCompany, Passthrough passthrough, Integer reqId) {
        super();
        this.landingCompany = landingCompany;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Landing Company
     * <p>
     * Client country
     * 
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * Landing Company
     * <p>
     * Client country
     * 
     */
    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
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
        return new HashCodeBuilder().append(landingCompany).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompanySend) == false) {
            return false;
        }
        LandingCompanySend rhs = ((LandingCompanySend) other);
        return new EqualsBuilder().append(landingCompany, rhs.landingCompany).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
