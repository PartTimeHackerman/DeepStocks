
package data.binaryAPI.commandsUnused.landing_company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Landing Company for gaming contracts (Volatility Indices)
 * 
 */
public class GamingCompany implements Serializable
{

    /**
     * Landing Company short code
     * 
     */
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    /**
     * Landing Company legal name
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
     * Landing Company country of incorporation
     * 
     */
    @SerializedName("country")
    @Expose
    private String country;
    /**
     * Default account currency
     * 
     */
    @SerializedName("legal_default_currency")
    @Expose
    private String legalDefaultCurrency;
    /**
     * Allowable currencies
     * 
     */
    @SerializedName("legal_allowed_currencies")
    @Expose
    private List<String> legalAllowedCurrencies = new ArrayList<String>();
    /**
     * Allowable markets
     * 
     */
    @SerializedName("legal_allowed_markets")
    @Expose
    private List<String> legalAllowedMarkets = new ArrayList<String>();
    /**
     * Allowed contract types
     * 
     */
    @SerializedName("legal_allowed_contract_categories")
    @Expose
    private List<String> legalAllowedContractCategories = new ArrayList<String>();
    private final static long serialVersionUID = 6136118503439717786L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GamingCompany() {
    }

    /**
     * 
     * @param country
     * @param address
     * @param legalAllowedContractCategories
     * @param legalDefaultCurrency
     * @param name
     * @param legalAllowedCurrencies
     * @param shortcode
     * @param legalAllowedMarkets
     */
    public GamingCompany(String shortcode, String name, List<String> address, String country, String legalDefaultCurrency, List<String> legalAllowedCurrencies, List<String> legalAllowedMarkets, List<String> legalAllowedContractCategories) {
        super();
        this.shortcode = shortcode;
        this.name = name;
        this.address = address;
        this.country = country;
        this.legalDefaultCurrency = legalDefaultCurrency;
        this.legalAllowedCurrencies = legalAllowedCurrencies;
        this.legalAllowedMarkets = legalAllowedMarkets;
        this.legalAllowedContractCategories = legalAllowedContractCategories;
    }

    /**
     * Landing Company short code
     * 
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Landing Company short code
     * 
     */
    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    /**
     * Landing Company legal name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Landing Company legal name
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
     * Landing Company country of incorporation
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Landing Company country of incorporation
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Default account currency
     * 
     */
    public String getLegalDefaultCurrency() {
        return legalDefaultCurrency;
    }

    /**
     * Default account currency
     * 
     */
    public void setLegalDefaultCurrency(String legalDefaultCurrency) {
        this.legalDefaultCurrency = legalDefaultCurrency;
    }

    /**
     * Allowable currencies
     * 
     */
    public List<String> getLegalAllowedCurrencies() {
        return legalAllowedCurrencies;
    }

    /**
     * Allowable currencies
     * 
     */
    public void setLegalAllowedCurrencies(List<String> legalAllowedCurrencies) {
        this.legalAllowedCurrencies = legalAllowedCurrencies;
    }

    /**
     * Allowable markets
     * 
     */
    public List<String> getLegalAllowedMarkets() {
        return legalAllowedMarkets;
    }

    /**
     * Allowable markets
     * 
     */
    public void setLegalAllowedMarkets(List<String> legalAllowedMarkets) {
        this.legalAllowedMarkets = legalAllowedMarkets;
    }

    /**
     * Allowed contract types
     * 
     */
    public List<String> getLegalAllowedContractCategories() {
        return legalAllowedContractCategories;
    }

    /**
     * Allowed contract types
     * 
     */
    public void setLegalAllowedContractCategories(List<String> legalAllowedContractCategories) {
        this.legalAllowedContractCategories = legalAllowedContractCategories;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shortcode).append(name).append(address).append(country).append(legalDefaultCurrency).append(legalAllowedCurrencies).append(legalAllowedMarkets).append(legalAllowedContractCategories).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GamingCompany) == false) {
            return false;
        }
        GamingCompany rhs = ((GamingCompany) other);
        return new EqualsBuilder().append(shortcode, rhs.shortcode).append(name, rhs.name).append(address, rhs.address).append(country, rhs.country).append(legalDefaultCurrency, rhs.legalDefaultCurrency).append(legalAllowedCurrencies, rhs.legalAllowedCurrencies).append(legalAllowedMarkets, rhs.legalAllowedMarkets).append(legalAllowedContractCategories, rhs.legalAllowedContractCategories).isEquals();
    }

}
