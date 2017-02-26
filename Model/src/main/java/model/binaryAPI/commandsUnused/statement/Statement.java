
package data.binaryAPI.commandsUnused.statement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * statement list
 * <p>
 * Account statement.
 * 
 */
public class Statement implements Serializable
{

    /**
     * Number of transactions returned in this call
     * 
     */
    @SerializedName("count")
    @Expose
    private Double count;
    /**
     * Array of returned transactions
     * 
     */
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = new ArrayList<Transaction>();
    private final static long serialVersionUID = -6086545224733889593L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Statement() {
    }

    /**
     * 
     * @param count
     * @param transactions
     */
    public Statement(Double count, List<Transaction> transactions) {
        super();
        this.count = count;
        this.transactions = transactions;
    }

    /**
     * Number of transactions returned in this call
     * 
     */
    public Double getCount() {
        return count;
    }

    /**
     * Number of transactions returned in this call
     * 
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * Array of returned transactions
     * 
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Array of returned transactions
     * 
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(transactions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statement) == false) {
            return false;
        }
        Statement rhs = ((Statement) other);
        return new EqualsBuilder().append(count, rhs.count).append(transactions, rhs.transactions).isEquals();
    }

}
