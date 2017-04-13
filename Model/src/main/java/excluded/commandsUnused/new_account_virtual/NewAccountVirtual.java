
package data.binaryAPI.commandsUnused.new_account_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * New virtual-money account
 * <p>
 * New virtual-money account details
 * 
 */
public class NewAccountVirtual implements Serializable
{

    /**
     * Client id of the new virtual-money account
     * (Required)
     * 
     */
    @SerializedName("client_id")
    @Expose
    private String clientId;
    /**
     * Email of the new virtual-money account
     * (Required)
     * 
     */
    @SerializedName("email")
    @Expose
    private String email;
    /**
     * Account currency
     * (Required)
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Account balance
     * (Required)
     * 
     */
    @SerializedName("balance")
    @Expose
    private Double balance;
    /**
     * Oauth token for the client's login session (so that the user may be logged in immediately)
     * (Required)
     * 
     */
    @SerializedName("oauth_token")
    @Expose
    private String oauthToken;
    private final static long serialVersionUID = -2943173689159203368L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountVirtual() {
    }

    /**
     * 
     * @param clientId
     * @param balance
     * @param currency
     * @param oauthToken
     * @param email
     */
    public NewAccountVirtual(String clientId, String email, String currency, Double balance, String oauthToken) {
        super();
        this.clientId = clientId;
        this.email = email;
        this.currency = currency;
        this.balance = balance;
        this.oauthToken = oauthToken;
    }

    /**
     * Client id of the new virtual-money account
     * (Required)
     * 
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Client id of the new virtual-money account
     * (Required)
     * 
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Email of the new virtual-money account
     * (Required)
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Email of the new virtual-money account
     * (Required)
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Account currency
     * (Required)
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Account currency
     * (Required)
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Account balance
     * (Required)
     * 
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Account balance
     * (Required)
     * 
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Oauth token for the client's login session (so that the user may be logged in immediately)
     * (Required)
     * 
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * Oauth token for the client's login session (so that the user may be logged in immediately)
     * (Required)
     * 
     */
    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientId).append(email).append(currency).append(balance).append(oauthToken).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountVirtual) == false) {
            return false;
        }
        NewAccountVirtual rhs = ((NewAccountVirtual) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(email, rhs.email).append(currency, rhs.currency).append(balance, rhs.balance).append(oauthToken, rhs.oauthToken).isEquals();
    }

}
