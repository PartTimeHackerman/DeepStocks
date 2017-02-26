
package data.binaryAPI.commandsUnused.portfolio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Portfolio
 * <p>
 * Client open positions
 * 
 */
public class Portfolio implements Serializable
{

    /**
     * Contracts
     * <p>
     * Client open positions
     * (Required)
     * 
     */
    @SerializedName("contracts")
    @Expose
    private List<Contract> contracts = new ArrayList<Contract>();
    private final static long serialVersionUID = -3008390596486618720L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Portfolio() {
    }

    /**
     * 
     * @param contracts
     */
    public Portfolio(List<Contract> contracts) {
        super();
        this.contracts = contracts;
    }

    /**
     * Contracts
     * <p>
     * Client open positions
     * (Required)
     * 
     */
    public List<Contract> getContracts() {
        return contracts;
    }

    /**
     * Contracts
     * <p>
     * Client open positions
     * (Required)
     * 
     */
    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contracts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Portfolio) == false) {
            return false;
        }
        Portfolio rhs = ((Portfolio) other);
        return new EqualsBuilder().append(contracts, rhs.contracts).isEquals();
    }

}
