
package data.binaryAPI.commandsUnused.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Lastest balance of client
 * <p>
 * Realtime stream of user balance changes.
 * 
 */
public class Balance implements Serializable
{

    /**
     * Balance amount
     * 
     */
    @SerializedName("balance")
    @Expose
    private Double balance;
    /**
     * Currency Example: USD
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Client loginid Example: CR000000
     * 
     */
    @SerializedName("loginid")
    @Expose
    private String loginid;
    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = -1564901190469153321L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Balance() {
    }

    /**
     * 
     * @param loginid
     * @param balance
     * @param currency
     * @param id
     */
    public Balance(Double balance, String currency, String loginid, String id) {
        super();
        this.balance = balance;
        this.currency = currency;
        this.loginid = loginid;
        this.id = id;
    }

    /**
     * Balance amount
     * 
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance amount
     * 
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Currency Example: USD
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency Example: USD
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Client loginid Example: CR000000
     * 
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * Client loginid Example: CR000000
     * 
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balance).append(currency).append(loginid).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Balance) == false) {
            return false;
        }
        Balance rhs = ((Balance) other);
        return new EqualsBuilder().append(balance, rhs.balance).append(currency, rhs.currency).append(loginid, rhs.loginid).append(id, rhs.id).isEquals();
    }

}
