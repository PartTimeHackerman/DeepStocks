
package data.binaryAPI.commandsUnused.topup_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class TopupVirtual implements Serializable
{

    /**
     * Top up currency string
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Top up amount
     * 
     */
    @SerializedName("amount")
    @Expose
    private Double amount;
    private final static long serialVersionUID = -9074211111254457968L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopupVirtual() {
    }

    /**
     * 
     * @param amount
     * @param currency
     */
    public TopupVirtual(String currency, Double amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    /**
     * Top up currency string
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Top up currency string
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Top up amount
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Top up amount
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(currency).append(amount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopupVirtual) == false) {
            return false;
        }
        TopupVirtual rhs = ((TopupVirtual) other);
        return new EqualsBuilder().append(currency, rhs.currency).append(amount, rhs.amount).isEquals();
    }

}
