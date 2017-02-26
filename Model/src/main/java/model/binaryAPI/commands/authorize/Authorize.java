
package model.binaryAPI.commands.authorize;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Authorization Response
 * <p>
 * Account information for the holder of the token
 * 
 */
public class Authorize implements Serializable
{

    /**
     * User email
     * 
     */
    @SerializedName("email")
    @Expose
    private String email;
    /**
     * Currency of the account
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Cash balance of the account
     * 
     */
    @SerializedName("balance")
    @Expose
    private Double balance;
    /**
     * The account ID that the token was issued for
     * 
     */
    @SerializedName("loginid")
    @Expose
    private String loginid;
    /**
     * Boolean value: 1 or 0, indicating whether it is a virtual-money account
     * 
     */
    @SerializedName("is_virtual")
    @Expose
    private String isVirtual;
    /**
     * Landing company shortcode the account belongs to
     * 
     */
    @SerializedName("landing_company_name")
    @Expose
    private String landingCompanyName;
    /**
     * Landing company name the account belongs to
     * 
     */
    @SerializedName("landing_company_fullname")
    @Expose
    private String landingCompanyFullname;
    /**
     *  2-letter country code ISO standard
     * 
     */
    @SerializedName("country")
    @Expose
    private String country;
    /**
     * User's full name
     * 
     */
    @SerializedName("fullname")
    @Expose
    private String fullname;
    /**
     * provide scope of current token like read, trade etc
     * 
     */
    @SerializedName("scopes")
    @Expose
    private List<String> scopes = new ArrayList<String>();
    private final static long serialVersionUID = -8829578703427043424L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Authorize() {
    }

    /**
     * 
     * @param country
     * @param loginid
     * @param landingCompanyName
     * @param balance
     * @param currency
     * @param isVirtual
     * @param fullname
     * @param scopes
     * @param email
     * @param landingCompanyFullname
     */
    public Authorize(String email, String currency, Double balance, String loginid, String isVirtual, String landingCompanyName, String landingCompanyFullname, String country, String fullname, List<String> scopes) {
        super();
        this.email = email;
        this.currency = currency;
        this.balance = balance;
        this.loginid = loginid;
        this.isVirtual = isVirtual;
        this.landingCompanyName = landingCompanyName;
        this.landingCompanyFullname = landingCompanyFullname;
        this.country = country;
        this.fullname = fullname;
        this.scopes = scopes;
    }

    /**
     * User email
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * User email
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Currency of the account
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency of the account
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Cash balance of the account
     * 
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Cash balance of the account
     * 
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * The account ID that the token was issued for
     * 
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * The account ID that the token was issued for
     * 
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    /**
     * Boolean value: 1 or 0, indicating whether it is a virtual-money account
     * 
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * Boolean value: 1 or 0, indicating whether it is a virtual-money account
     * 
     */
    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    /**
     * Landing company shortcode the account belongs to
     * 
     */
    public String getLandingCompanyName() {
        return landingCompanyName;
    }

    /**
     * Landing company shortcode the account belongs to
     * 
     */
    public void setLandingCompanyName(String landingCompanyName) {
        this.landingCompanyName = landingCompanyName;
    }

    /**
     * Landing company name the account belongs to
     * 
     */
    public String getLandingCompanyFullname() {
        return landingCompanyFullname;
    }

    /**
     * Landing company name the account belongs to
     * 
     */
    public void setLandingCompanyFullname(String landingCompanyFullname) {
        this.landingCompanyFullname = landingCompanyFullname;
    }

    /**
     *  2-letter country code ISO standard
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     *  2-letter country code ISO standard
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * User's full name
     * 
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * User's full name
     * 
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * provide scope of current token like read, trade etc
     * 
     */
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * provide scope of current token like read, trade etc
     * 
     */
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(email).append(currency).append(balance).append(loginid).append(isVirtual).append(landingCompanyName).append(landingCompanyFullname).append(country).append(fullname).append(scopes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Authorize) == false) {
            return false;
        }
        Authorize rhs = ((Authorize) other);
        return new EqualsBuilder().append(email, rhs.email).append(currency, rhs.currency).append(balance, rhs.balance).append(loginid, rhs.loginid).append(isVirtual, rhs.isVirtual).append(landingCompanyName, rhs.landingCompanyName).append(landingCompanyFullname, rhs.landingCompanyFullname).append(country, rhs.country).append(fullname, rhs.fullname).append(scopes, rhs.scopes).isEquals();
    }

}
