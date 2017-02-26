
package data.binaryAPI.commandsUnused.proposal_open_contract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Transaction ids for contract
 * <p>
 * Every contract has buy and sell transaction ids, i.e. when you purchase a contract we associate it with buy transaction id, and if contract is already sold we associate that with sell transaction id.
 * 
 */
public class TransactionIds implements Serializable
{

    /**
     * Buy transaction id for that contract
     * 
     */
    @SerializedName("buy")
    @Expose
    private Integer buy;
    /**
     * Sell transaction id for that contract, only present when contract is already sold.
     * 
     */
    @SerializedName("sell")
    @Expose
    private Integer sell;
    private final static long serialVersionUID = -2651167052930828999L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionIds() {
    }

    /**
     * 
     * @param buy
     * @param sell
     */
    public TransactionIds(Integer buy, Integer sell) {
        super();
        this.buy = buy;
        this.sell = sell;
    }

    /**
     * Buy transaction id for that contract
     * 
     */
    public Integer getBuy() {
        return buy;
    }

    /**
     * Buy transaction id for that contract
     * 
     */
    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    /**
     * Sell transaction id for that contract, only present when contract is already sold.
     * 
     */
    public Integer getSell() {
        return sell;
    }

    /**
     * Sell transaction id for that contract, only present when contract is already sold.
     * 
     */
    public void setSell(Integer sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(buy).append(sell).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionIds) == false) {
            return false;
        }
        TransactionIds rhs = ((TransactionIds) other);
        return new EqualsBuilder().append(buy, rhs.buy).append(sell, rhs.sell).isEquals();
    }

}
