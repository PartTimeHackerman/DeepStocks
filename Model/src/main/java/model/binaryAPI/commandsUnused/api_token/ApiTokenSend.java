
package data.binaryAPI.commandsUnused.api_token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * API Token Request
 * <p>
 * This call manages API tokens
 * 
 */
public class ApiTokenSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("api_token")
    @Expose
    private Integer apiToken;
    /**
     * The name of the created token
     * 
     */
    @SerializedName("new_token")
    @Expose
    private String newToken;
    @SerializedName("new_token_scopes")
    @Expose
    private List<String> newTokenScopes = new ArrayList<String>();
    /**
     * The token to remove
     * 
     */
    @SerializedName("delete_token")
    @Expose
    private String deleteToken;
    /**
     * [For omnibus accounts only] Loginid of sub account. If this field is present then it will create token for this sub account.
     * 
     */
    @SerializedName("sub_account")
    @Expose
    private String subAccount;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -8009285910851181367L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiTokenSend() {
    }

    /**
     * 
     * @param newToken
     * @param apiToken
     * @param newTokenScopes
     * @param passthrough
     * @param deleteToken
     * @param subAccount
     * @param reqId
     */
    public ApiTokenSend(Integer apiToken, String newToken, List<String> newTokenScopes, String deleteToken, String subAccount, Passthrough passthrough, Integer reqId) {
        super();
        this.apiToken = apiToken;
        this.newToken = newToken;
        this.newTokenScopes = newTokenScopes;
        this.deleteToken = deleteToken;
        this.subAccount = subAccount;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getApiToken() {
        return apiToken;
    }

    /**
     * Must be 1
     * 
     */
    public void setApiToken(Integer apiToken) {
        this.apiToken = apiToken;
    }

    /**
     * The name of the created token
     * 
     */
    public String getNewToken() {
        return newToken;
    }

    /**
     * The name of the created token
     * 
     */
    public void setNewToken(String newToken) {
        this.newToken = newToken;
    }

    public List<String> getNewTokenScopes() {
        return newTokenScopes;
    }

    public void setNewTokenScopes(List<String> newTokenScopes) {
        this.newTokenScopes = newTokenScopes;
    }

    /**
     * The token to remove
     * 
     */
    public String getDeleteToken() {
        return deleteToken;
    }

    /**
     * The token to remove
     * 
     */
    public void setDeleteToken(String deleteToken) {
        this.deleteToken = deleteToken;
    }

    /**
     * [For omnibus accounts only] Loginid of sub account. If this field is present then it will create token for this sub account.
     * 
     */
    public String getSubAccount() {
        return subAccount;
    }

    /**
     * [For omnibus accounts only] Loginid of sub account. If this field is present then it will create token for this sub account.
     * 
     */
    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public Passthrough getPassthrough() {
        return passthrough;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public void setPassthrough(Passthrough passthrough) {
        this.passthrough = passthrough;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(apiToken).append(newToken).append(newTokenScopes).append(deleteToken).append(subAccount).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiTokenSend) == false) {
            return false;
        }
        ApiTokenSend rhs = ((ApiTokenSend) other);
        return new EqualsBuilder().append(apiToken, rhs.apiToken).append(newToken, rhs.newToken).append(newTokenScopes, rhs.newTokenScopes).append(deleteToken, rhs.deleteToken).append(subAccount, rhs.subAccount).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
