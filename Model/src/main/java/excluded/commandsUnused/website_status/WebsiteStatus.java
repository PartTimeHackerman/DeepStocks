
package data.binaryAPI.commandsUnused.website_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WebsiteStatus implements Serializable
{

    /**
     * latest T&C version
     * 
     */
    @SerializedName("terms_conditions_version")
    @Expose
    private String termsConditionsVersion;
    /**
     * API call limits
     * <p>
     * Limits for api call for each websocket connection
     * 
     */
    @SerializedName("api_call_limits")
    @Expose
    private ApiCallLimits apiCallLimits;
    /**
     * Country code of connected IP
     * 
     */
    @SerializedName("clients_country")
    @Expose
    private String clientsCountry;
    /**
     * Provides codes for languages supported
     * 
     */
    @SerializedName("supported_languages")
    @Expose
    private List<String> supportedLanguages = new ArrayList<String>();
    private final static long serialVersionUID = 2191863341581405212L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebsiteStatus() {
    }

    /**
     * 
     * @param supportedLanguages
     * @param clientsCountry
     * @param apiCallLimits
     * @param termsConditionsVersion
     */
    public WebsiteStatus(String termsConditionsVersion, ApiCallLimits apiCallLimits, String clientsCountry, List<String> supportedLanguages) {
        super();
        this.termsConditionsVersion = termsConditionsVersion;
        this.apiCallLimits = apiCallLimits;
        this.clientsCountry = clientsCountry;
        this.supportedLanguages = supportedLanguages;
    }

    /**
     * latest T&C version
     * 
     */
    public String getTermsConditionsVersion() {
        return termsConditionsVersion;
    }

    /**
     * latest T&C version
     * 
     */
    public void setTermsConditionsVersion(String termsConditionsVersion) {
        this.termsConditionsVersion = termsConditionsVersion;
    }

    /**
     * API call limits
     * <p>
     * Limits for api call for each websocket connection
     * 
     */
    public ApiCallLimits getApiCallLimits() {
        return apiCallLimits;
    }

    /**
     * API call limits
     * <p>
     * Limits for api call for each websocket connection
     * 
     */
    public void setApiCallLimits(ApiCallLimits apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
    }

    /**
     * Country code of connected IP
     * 
     */
    public String getClientsCountry() {
        return clientsCountry;
    }

    /**
     * Country code of connected IP
     * 
     */
    public void setClientsCountry(String clientsCountry) {
        this.clientsCountry = clientsCountry;
    }

    /**
     * Provides codes for languages supported
     * 
     */
    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    /**
     * Provides codes for languages supported
     * 
     */
    public void setSupportedLanguages(List<String> supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(termsConditionsVersion).append(apiCallLimits).append(clientsCountry).append(supportedLanguages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebsiteStatus) == false) {
            return false;
        }
        WebsiteStatus rhs = ((WebsiteStatus) other);
        return new EqualsBuilder().append(termsConditionsVersion, rhs.termsConditionsVersion).append(apiCallLimits, rhs.apiCallLimits).append(clientsCountry, rhs.clientsCountry).append(supportedLanguages, rhs.supportedLanguages).isEquals();
    }

}
