
package data.binaryAPI.commandsUnused.new_account_japan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * New Japan account
 * <p>
 * New Japan account details
 * 
 */
public class NewAccountJapan implements Serializable
{

    /**
     * Client id of new Japan account
     * (Required)
     * 
     */
    @SerializedName("client_id")
    @Expose
    private String clientId;
    /**
     * landing company full name
     * (Required)
     * 
     */
    @SerializedName("landing_company")
    @Expose
    private String landingCompany;
    /**
     * landing company shortcode
     * 
     */
    @SerializedName("landing_company_short")
    @Expose
    private String landingCompanyShort;
    /**
     * oauth token for client's login session
     * (Required)
     * 
     */
    @SerializedName("oauth_token")
    @Expose
    private String oauthToken;
    private final static long serialVersionUID = 2355826012736448747L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountJapan() {
    }

    /**
     * 
     * @param clientId
     * @param landingCompany
     * @param landingCompanyShort
     * @param oauthToken
     */
    public NewAccountJapan(String clientId, String landingCompany, String landingCompanyShort, String oauthToken) {
        super();
        this.clientId = clientId;
        this.landingCompany = landingCompany;
        this.landingCompanyShort = landingCompanyShort;
        this.oauthToken = oauthToken;
    }

    /**
     * Client id of new Japan account
     * (Required)
     * 
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Client id of new Japan account
     * (Required)
     * 
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * landing company full name
     * (Required)
     * 
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * landing company full name
     * (Required)
     * 
     */
    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
    }

    /**
     * landing company shortcode
     * 
     */
    public String getLandingCompanyShort() {
        return landingCompanyShort;
    }

    /**
     * landing company shortcode
     * 
     */
    public void setLandingCompanyShort(String landingCompanyShort) {
        this.landingCompanyShort = landingCompanyShort;
    }

    /**
     * oauth token for client's login session
     * (Required)
     * 
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * oauth token for client's login session
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
        return new HashCodeBuilder().append(clientId).append(landingCompany).append(landingCompanyShort).append(oauthToken).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountJapan) == false) {
            return false;
        }
        NewAccountJapan rhs = ((NewAccountJapan) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(landingCompany, rhs.landingCompany).append(landingCompanyShort, rhs.landingCompanyShort).append(oauthToken, rhs.oauthToken).isEquals();
    }

}
