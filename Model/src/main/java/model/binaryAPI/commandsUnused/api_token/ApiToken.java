
package data.binaryAPI.commandsUnused.api_token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ApiToken implements Serializable
{

    /**
     * API tokens
     * 
     */
    @SerializedName("tokens")
    @Expose
    private List<Object> tokens = new ArrayList<Object>();
    /**
     * Token created.
     * 
     */
    @SerializedName("new_token")
    @Expose
    private Integer newToken;
    /**
     * Token deleted.
     * 
     */
    @SerializedName("delete_token")
    @Expose
    private Integer deleteToken;
    /**
     * Loginid of sub account, only present when request was for sub account
     * 
     */
    @SerializedName("sub_account")
    @Expose
    private String subAccount;
    private final static long serialVersionUID = -5760069330627020160L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiToken() {
    }

    /**
     * 
     * @param newToken
     * @param tokens
     * @param deleteToken
     * @param subAccount
     */
    public ApiToken(List<Object> tokens, Integer newToken, Integer deleteToken, String subAccount) {
        super();
        this.tokens = tokens;
        this.newToken = newToken;
        this.deleteToken = deleteToken;
        this.subAccount = subAccount;
    }

    /**
     * API tokens
     * 
     */
    public List<Object> getTokens() {
        return tokens;
    }

    /**
     * API tokens
     * 
     */
    public void setTokens(List<Object> tokens) {
        this.tokens = tokens;
    }

    /**
     * Token created.
     * 
     */
    public Integer getNewToken() {
        return newToken;
    }

    /**
     * Token created.
     * 
     */
    public void setNewToken(Integer newToken) {
        this.newToken = newToken;
    }

    /**
     * Token deleted.
     * 
     */
    public Integer getDeleteToken() {
        return deleteToken;
    }

    /**
     * Token deleted.
     * 
     */
    public void setDeleteToken(Integer deleteToken) {
        this.deleteToken = deleteToken;
    }

    /**
     * Loginid of sub account, only present when request was for sub account
     * 
     */
    public String getSubAccount() {
        return subAccount;
    }

    /**
     * Loginid of sub account, only present when request was for sub account
     * 
     */
    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tokens).append(newToken).append(deleteToken).append(subAccount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiToken) == false) {
            return false;
        }
        ApiToken rhs = ((ApiToken) other);
        return new EqualsBuilder().append(tokens, rhs.tokens).append(newToken, rhs.newToken).append(deleteToken, rhs.deleteToken).append(subAccount, rhs.subAccount).isEquals();
    }

}
