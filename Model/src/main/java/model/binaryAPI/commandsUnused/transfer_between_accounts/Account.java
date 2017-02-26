
package data.binaryAPI.commandsUnused.transfer_between_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Account implements Serializable
{

    @SerializedName("loginid")
    @Expose
    private String loginid;
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("currency")
    @Expose
    private String currency;
    private final static long serialVersionUID = 4987573016782294675L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Account() {
    }

    /**
     * 
     * @param loginid
     * @param balance
     * @param currency
     */
    public Account(String loginid, String balance, String currency) {
        super();
        this.loginid = loginid;
        this.balance = balance;
        this.currency = currency;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loginid).append(balance).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return new EqualsBuilder().append(loginid, rhs.loginid).append(balance, rhs.balance).append(currency, rhs.currency).isEquals();
    }

}
