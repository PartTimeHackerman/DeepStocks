
package data.binaryAPI.commandsUnused.proposal_array;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Price Proposal result
 * 
 */
public class Proposal implements Serializable
{

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier")
    @Expose
    private String barrier;
    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier2")
    @Expose
    private String barrier2;
    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Example: 5.14
     * (Required)
     * 
     */
    @SerializedName("ask_price")
    @Expose
    private Double askPrice;
    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    @SerializedName("display_value")
    @Expose
    private Double displayValue;
    /**
     * Error message
     * 
     */
    @SerializedName("error")
    @Expose
    private Error error;
    private final static long serialVersionUID = 8836632005681792186L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Proposal() {
    }

    /**
     * 
     * @param displayValue
     * @param askPrice
     * @param barrier
     * @param barrier2
     * @param longcode
     * @param error
     */
    public Proposal(String barrier, String barrier2, String longcode, Double askPrice, Double displayValue, Error error) {
        super();
        this.barrier = barrier;
        this.barrier2 = barrier2;
        this.longcode = longcode;
        this.askPrice = askPrice;
        this.displayValue = displayValue;
        this.error = error;
    }

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier() {
        return barrier;
    }

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier(String barrier) {
        this.barrier = barrier;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier2() {
        return barrier2;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier2(String barrier2) {
        this.barrier2 = barrier2;
    }

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Example: 5.14
     * (Required)
     * 
     */
    public Double getAskPrice() {
        return askPrice;
    }

    /**
     * Example: 5.14
     * (Required)
     * 
     */
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    public Double getDisplayValue() {
        return displayValue;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    public void setDisplayValue(Double displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * Error message
     * 
     */
    public Error getError() {
        return error;
    }

    /**
     * Error message
     * 
     */
    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(barrier).append(barrier2).append(longcode).append(askPrice).append(displayValue).append(error).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Proposal) == false) {
            return false;
        }
        Proposal rhs = ((Proposal) other);
        return new EqualsBuilder().append(barrier, rhs.barrier).append(barrier2, rhs.barrier2).append(longcode, rhs.longcode).append(askPrice, rhs.askPrice).append(displayValue, rhs.displayValue).append(error, rhs.error).isEquals();
    }

}
