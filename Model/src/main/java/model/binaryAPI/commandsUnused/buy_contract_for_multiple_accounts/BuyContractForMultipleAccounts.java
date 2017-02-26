
package data.binaryAPI.commandsUnused.buy_contract_for_multiple_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Receipt confirmation
 * <p>
 * Receipt confirmation for the purchase
 * 
 */
public class BuyContractForMultipleAccounts implements Serializable
{

    @SerializedName("result")
    @Expose
    private List<Object> result = new ArrayList<Object>();
    private final static long serialVersionUID = 6997688495956042991L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuyContractForMultipleAccounts() {
    }

    /**
     * 
     * @param result
     */
    public BuyContractForMultipleAccounts(List<Object> result) {
        super();
        this.result = result;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(result).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuyContractForMultipleAccounts) == false) {
            return false;
        }
        BuyContractForMultipleAccounts rhs = ((BuyContractForMultipleAccounts) other);
        return new EqualsBuilder().append(result, rhs.result).isEquals();
    }

}
