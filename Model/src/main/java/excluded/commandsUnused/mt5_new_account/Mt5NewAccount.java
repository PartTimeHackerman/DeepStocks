
package data.binaryAPI.commandsUnused.mt5_new_account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * New MT5 account
 * <p>
 * New MT5 account details
 * 
 */
public class Mt5NewAccount implements Serializable
{

    /**
     * Login of new MT5 account
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
    /**
     * Account type.
     * 
     */
    @SerializedName("account_type")
    @Expose
    private Mt5NewAccount.AccountType accountType;
    /**
     * Account balance
     * 
     */
    @SerializedName("balance")
    @Expose
    private String balance;
    private final static long serialVersionUID = -6604093015298468061L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5NewAccount() {
    }

    /**
     * 
     * @param balance
     * @param accountType
     * @param login
     */
    public Mt5NewAccount(String login, Mt5NewAccount.AccountType accountType, String balance) {
        super();
        this.login = login;
        this.accountType = accountType;
        this.balance = balance;
    }

    /**
     * Login of new MT5 account
     * 
     */
    public String getLogin() {
        return login;
    }

    /**
     * Login of new MT5 account
     * 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Account type.
     * 
     */
    public Mt5NewAccount.AccountType getAccountType() {
        return accountType;
    }

    /**
     * Account type.
     * 
     */
    public void setAccountType(Mt5NewAccount.AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Account balance
     * 
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Account balance
     * 
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(login).append(accountType).append(balance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5NewAccount) == false) {
            return false;
        }
        Mt5NewAccount rhs = ((Mt5NewAccount) other);
        return new EqualsBuilder().append(login, rhs.login).append(accountType, rhs.accountType).append(balance, rhs.balance).isEquals();
    }

    public enum AccountType {

        @SerializedName("demo")
        DEMO("demo"),
        @SerializedName("gaming")
        GAMING("gaming"),
        @SerializedName("financial")
        FINANCIAL("financial");
        private final String value;
        private final static Map<String, Mt5NewAccount.AccountType> CONSTANTS = new HashMap<String, Mt5NewAccount.AccountType>();

        static {
            for (Mt5NewAccount.AccountType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccountType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Mt5NewAccount.AccountType fromValue(String value) {
            Mt5NewAccount.AccountType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
