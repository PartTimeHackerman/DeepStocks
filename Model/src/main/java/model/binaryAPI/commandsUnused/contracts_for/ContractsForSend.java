
package data.binaryAPI.commandsUnused.contracts_for;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Contracts for Symbol Send
 * <p>
 * For a given symbol, get the list of currently available contracts, and the latest barrier and duration limits for each contract.
 * 
 */
public class ContractsForSend implements Serializable
{

    /**
     * The short symbol name
     * 
     */
    @SerializedName("contracts_for")
    @Expose
    private String contractsFor;
    /**
     * Currency for the contracts stake and payout. Optional field, defaults to USD if not passed in.
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency = "USD";
    /**
     * Set to 'japan' to retrieve contracts available under Japanese regulations, or 'other' otherwise.
     * 
     */
    @SerializedName("region")
    @Expose
    private String region;
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
    private final static long serialVersionUID = 4931100213349924142L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContractsForSend() {
    }

    /**
     * 
     * @param passthrough
     * @param currency
     * @param region
     * @param contractsFor
     * @param reqId
     */
    public ContractsForSend(String contractsFor, String currency, String region, Passthrough passthrough, Integer reqId) {
        super();
        this.contractsFor = contractsFor;
        this.currency = currency;
        this.region = region;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * The short symbol name
     * 
     */
    public String getContractsFor() {
        return contractsFor;
    }

    /**
     * The short symbol name
     * 
     */
    public void setContractsFor(String contractsFor) {
        this.contractsFor = contractsFor;
    }

    /**
     * Currency for the contracts stake and payout. Optional field, defaults to USD if not passed in.
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency for the contracts stake and payout. Optional field, defaults to USD if not passed in.
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Set to 'japan' to retrieve contracts available under Japanese regulations, or 'other' otherwise.
     * 
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set to 'japan' to retrieve contracts available under Japanese regulations, or 'other' otherwise.
     * 
     */
    public void setRegion(String region) {
        this.region = region;
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
        return new HashCodeBuilder().append(contractsFor).append(currency).append(region).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractsForSend) == false) {
            return false;
        }
        ContractsForSend rhs = ((ContractsForSend) other);
        return new EqualsBuilder().append(contractsFor, rhs.contractsFor).append(currency, rhs.currency).append(region, rhs.region).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
