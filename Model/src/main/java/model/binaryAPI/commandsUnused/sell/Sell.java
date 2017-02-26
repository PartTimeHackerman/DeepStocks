
package data.binaryAPI.commandsUnused.sell;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Receipt for the transaction
 * <p>
 * Receipt for the transaction
 * 
 */
public class Sell implements Serializable
{

    /**
     * New account balance after completion of the sale
     * 
     */
    @SerializedName("balance_after")
    @Expose
    private Double balanceAfter;
    /**
     * Internal contract identifier for the sold contract
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * Actual effected sale price
     * 
     */
    @SerializedName("sold_for")
    @Expose
    private Double soldFor;
    /**
     * Internal transaction identifier for the sale transaction
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    private final static long serialVersionUID = 872762998553654859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sell() {
    }

    /**
     * 
     * @param soldFor
     * @param contractId
     * @param balanceAfter
     * @param transactionId
     */
    public Sell(Double balanceAfter, Integer contractId, Double soldFor, Integer transactionId) {
        super();
        this.balanceAfter = balanceAfter;
        this.contractId = contractId;
        this.soldFor = soldFor;
        this.transactionId = transactionId;
    }

    /**
     * New account balance after completion of the sale
     * 
     */
    public Double getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * New account balance after completion of the sale
     * 
     */
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * Internal contract identifier for the sold contract
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Internal contract identifier for the sold contract
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * Actual effected sale price
     * 
     */
    public Double getSoldFor() {
        return soldFor;
    }

    /**
     * Actual effected sale price
     * 
     */
    public void setSoldFor(Double soldFor) {
        this.soldFor = soldFor;
    }

    /**
     * Internal transaction identifier for the sale transaction
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Internal transaction identifier for the sale transaction
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balanceAfter).append(contractId).append(soldFor).append(transactionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sell) == false) {
            return false;
        }
        Sell rhs = ((Sell) other);
        return new EqualsBuilder().append(balanceAfter, rhs.balanceAfter).append(contractId, rhs.contractId).append(soldFor, rhs.soldFor).append(transactionId, rhs.transactionId).isEquals();
    }

}
