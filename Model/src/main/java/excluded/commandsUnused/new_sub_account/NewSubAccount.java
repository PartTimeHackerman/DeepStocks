
package data.binaryAPI.commandsUnused.new_sub_account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * New sub account
 * <p>
 * New sub account details
 * 
 */
public class NewSubAccount implements Serializable
{

    /**
     * Client id of new sub account
     * 
     */
    @SerializedName("client_id")
    @Expose
    private String clientId;
    /**
     * landing company full name
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
    private final static long serialVersionUID = 2029038151130416489L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewSubAccount() {
    }

    /**
     * 
     * @param clientId
     * @param landingCompany
     * @param landingCompanyShort
     */
    public NewSubAccount(String clientId, String landingCompany, String landingCompanyShort) {
        super();
        this.clientId = clientId;
        this.landingCompany = landingCompany;
        this.landingCompanyShort = landingCompanyShort;
    }

    /**
     * Client id of new sub account
     * 
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Client id of new sub account
     * 
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * landing company full name
     * 
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * landing company full name
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientId).append(landingCompany).append(landingCompanyShort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewSubAccount) == false) {
            return false;
        }
        NewSubAccount rhs = ((NewSubAccount) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(landingCompany, rhs.landingCompany).append(landingCompanyShort, rhs.landingCompanyShort).isEquals();
    }

}
