
package data.binaryAPI.commandsUnused.landing_company_details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Landing Company Structure
 * <p>
 * 
 * 
 */
public class LandingCompanyDetails implements Serializable
{

    /**
     * Landing Company shortcode
     * 
     */
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    /**
     * Landing Company name
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Landing Company address
     * 
     */
    @SerializedName("address")
    @Expose
    private List<String> address = new ArrayList<String>();
    /**
     * Landing Company country
     * 
     */
    @SerializedName("country")
    @Expose
    private String country;
    /**
     * Default currency of client accounts with this Landing Company
     * 
     */
    @SerializedName("legal_default_currency")
    @Expose
    private String legalDefaultCurrency;
    /**
     * Allowable currencies for accounts with this Landing Company
     * 
     */
    @SerializedName("legal_allowed_currencies")
    @Expose
    private List<String> legalAllowedCurrencies = new ArrayList<String>();
    @SerializedName("legal_allowed_markets")
    @Expose
    private List<String> legalAllowedMarkets = new ArrayList<String>();
    @SerializedName("legal_allowed_contract_categories")
    @Expose
    private List<String> legalAllowedContractCategories = new ArrayList<String>();
    /**
     * Flag to indicate whether reality check is applicable for this Landing Company. 1: applicable, 0: not applicable. The Reality Check is a feature that gives a summary of the client's trades and account balances on a regular basis throughout his session, and is a regulatory requirement for certain Landing Companies.
     * 
     */
    @SerializedName("has_reality_check")
    @Expose
    private Integer hasRealityCheck;
    private final static long serialVersionUID = -5674812082163024310L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompanyDetails() {
    }

    /**
     * 
     * @param country
     * @param address
     * @param legalAllowedContractCategories
     * @param hasRealityCheck
     * @param legalDefaultCurrency
     * @param name
     * @param legalAllowedCurrencies
     * @param shortcode
     * @param legalAllowedMarkets
     */
    public LandingCompanyDetails(String shortcode, String name, List<String> address, String country, String legalDefaultCurrency, List<String> legalAllowedCurrencies, List<String> legalAllowedMarkets, List<String> legalAllowedContractCategories, Integer hasRealityCheck) {
        super();
        this.shortcode = shortcode;
        this.name = name;
        this.address = address;
        this.country = country;
        this.legalDefaultCurrency = legalDefaultCurrency;
        this.legalAllowedCurrencies = legalAllowedCurrencies;
        this.legalAllowedMarkets = legalAllowedMarkets;
        this.legalAllowedContractCategories = legalAllowedContractCategories;
        this.hasRealityCheck = hasRealityCheck;
    }

    /**
     * Landing Company shortcode
     * 
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Landing Company shortcode
     * 
     */
    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    /**
     * Landing Company name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Landing Company name
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Landing Company address
     * 
     */
    public List<String> getAddress() {
        return address;
    }

    /**
     * Landing Company address
     * 
     */
    public void setAddress(List<String> address) {
        this.address = address;
    }

    /**
     * Landing Company country
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Landing Company country
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Default currency of client accounts with this Landing Company
     * 
     */
    public String getLegalDefaultCurrency() {
        return legalDefaultCurrency;
    }

    /**
     * Default currency of client accounts with this Landing Company
     * 
     */
    public void setLegalDefaultCurrency(String legalDefaultCurrency) {
        this.legalDefaultCurrency = legalDefaultCurrency;
    }

    /**
     * Allowable currencies for accounts with this Landing Company
     * 
     */
    public List<String> getLegalAllowedCurrencies() {
        return legalAllowedCurrencies;
    }

    /**
     * Allowable currencies for accounts with this Landing Company
     * 
     */
    public void setLegalAllowedCurrencies(List<String> legalAllowedCurrencies) {
        this.legalAllowedCurrencies = legalAllowedCurrencies;
    }

    public List<String> getLegalAllowedMarkets() {
        return legalAllowedMarkets;
    }

    public void setLegalAllowedMarkets(List<String> legalAllowedMarkets) {
        this.legalAllowedMarkets = legalAllowedMarkets;
    }

    public List<String> getLegalAllowedContractCategories() {
        return legalAllowedContractCategories;
    }

    public void setLegalAllowedContractCategories(List<String> legalAllowedContractCategories) {
        this.legalAllowedContractCategories = legalAllowedContractCategories;
    }

    /**
     * Flag to indicate whether reality check is applicable for this Landing Company. 1: applicable, 0: not applicable. The Reality Check is a feature that gives a summary of the client's trades and account balances on a regular basis throughout his session, and is a regulatory requirement for certain Landing Companies.
     * 
     */
    public Integer getHasRealityCheck() {
        return hasRealityCheck;
    }

    /**
     * Flag to indicate whether reality check is applicable for this Landing Company. 1: applicable, 0: not applicable. The Reality Check is a feature that gives a summary of the client's trades and account balances on a regular basis throughout his session, and is a regulatory requirement for certain Landing Companies.
     * 
     */
    public void setHasRealityCheck(Integer hasRealityCheck) {
        this.hasRealityCheck = hasRealityCheck;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shortcode).append(name).append(address).append(country).append(legalDefaultCurrency).append(legalAllowedCurrencies).append(legalAllowedMarkets).append(legalAllowedContractCategories).append(hasRealityCheck).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompanyDetails) == false) {
            return false;
        }
        LandingCompanyDetails rhs = ((LandingCompanyDetails) other);
        return new EqualsBuilder().append(shortcode, rhs.shortcode).append(name, rhs.name).append(address, rhs.address).append(country, rhs.country).append(legalDefaultCurrency, rhs.legalDefaultCurrency).append(legalAllowedCurrencies, rhs.legalAllowedCurrencies).append(legalAllowedMarkets, rhs.legalAllowedMarkets).append(legalAllowedContractCategories, rhs.legalAllowedContractCategories).append(hasRealityCheck, rhs.hasRealityCheck).isEquals();
    }

}
