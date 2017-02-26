
package data.binaryAPI.commandsUnused.get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * User Details
 * <p>
 * 
 * 
 */
public class GetSettings implements Serializable
{

    /**
     * User Email
     * 
     */
    @SerializedName("email")
    @Expose
    private String email;
    /**
     * User Country
     * 
     */
    @SerializedName("country")
    @Expose
    private String country;
    /**
     *  2-letter country code ISO standard
     * 
     */
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    /**
     * Salutation (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("salutation")
    @Expose
    private String salutation;
    /**
     * First name (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("first_name")
    @Expose
    private String firstName;
    /**
     * Last name (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("last_name")
    @Expose
    private String lastName;
    /**
     * Epoch of user's birthday (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("date_of_birth")
    @Expose
    private Integer dateOfBirth;
    /**
     * Address line 1 (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("address_line_1")
    @Expose
    private String addressLine1;
    /**
     * Address line 2 (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("address_line_2")
    @Expose
    private String addressLine2;
    /**
     * City (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("address_city")
    @Expose
    private String addressCity;
    /**
     * State (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("address_state")
    @Expose
    private String addressState;
    /**
     * Post Code (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("address_postcode")
    @Expose
    private String addressPostcode;
    /**
     * Telephone (note: not set for virtual-money accounts)
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * Boolean value 1 or 0, indicating whether is payment agent (note: not applicable for virtual money accounts)
     * 
     */
    @SerializedName("is_authenticated_payment_agent")
    @Expose
    private Integer isAuthenticatedPaymentAgent;
    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     * 
     */
    @SerializedName("email_consent")
    @Expose
    private Integer emailConsent;
    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades. Note: not applicable for Virtual account. Only allow for real money account.
     * 
     */
    @SerializedName("allow_copiers")
    @Expose
    private Integer allowCopiers;
    /**
     * Japan real money account status
     * <p>
     * Japan real money account status, only applicable for Japan virtual money account client.
     * 
     */
    @SerializedName("jp_account_status")
    @Expose
    private JpAccountStatus jpAccountStatus;
    /**
     * Japan real money client settings
     * <p>
     * Japan real money client settings, only applicable for Japan real money account client.
     * 
     */
    @SerializedName("jp_settings")
    @Expose
    private JpSettings jpSettings;
    private final static long serialVersionUID = 520044665222135352L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSettings() {
    }

    /**
     * 
     * @param country
     * @param lastName
     * @param isAuthenticatedPaymentAgent
     * @param addressPostcode
     * @param jpAccountStatus
     * @param dateOfBirth
     * @param addressState
     * @param firstName
     * @param emailConsent
     * @param phone
     * @param countryCode
     * @param addressLine1
     * @param addressLine2
     * @param salutation
     * @param allowCopiers
     * @param email
     * @param addressCity
     * @param jpSettings
     */
    public GetSettings(String email, String country, String countryCode, String salutation, String firstName, String lastName, Integer dateOfBirth, String addressLine1, String addressLine2, String addressCity, String addressState, String addressPostcode, String phone, Integer isAuthenticatedPaymentAgent, Integer emailConsent, Integer allowCopiers, JpAccountStatus jpAccountStatus, JpSettings jpSettings) {
        super();
        this.email = email;
        this.country = country;
        this.countryCode = countryCode;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.phone = phone;
        this.isAuthenticatedPaymentAgent = isAuthenticatedPaymentAgent;
        this.emailConsent = emailConsent;
        this.allowCopiers = allowCopiers;
        this.jpAccountStatus = jpAccountStatus;
        this.jpSettings = jpSettings;
    }

    /**
     * User Email
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * User Email
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * User Country
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * User Country
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *  2-letter country code ISO standard
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     *  2-letter country code ISO standard
     * 
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Salutation (note: not set for virtual-money accounts)
     * 
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Salutation (note: not set for virtual-money accounts)
     * 
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * First name (note: not set for virtual-money accounts)
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name (note: not set for virtual-money accounts)
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name (note: not set for virtual-money accounts)
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name (note: not set for virtual-money accounts)
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Epoch of user's birthday (note: not set for virtual-money accounts)
     * 
     */
    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Epoch of user's birthday (note: not set for virtual-money accounts)
     * 
     */
    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Address line 1 (note: not set for virtual-money accounts)
     * 
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Address line 1 (note: not set for virtual-money accounts)
     * 
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Address line 2 (note: not set for virtual-money accounts)
     * 
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Address line 2 (note: not set for virtual-money accounts)
     * 
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * City (note: not set for virtual-money accounts)
     * 
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * City (note: not set for virtual-money accounts)
     * 
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * State (note: not set for virtual-money accounts)
     * 
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * State (note: not set for virtual-money accounts)
     * 
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Post Code (note: not set for virtual-money accounts)
     * 
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Post Code (note: not set for virtual-money accounts)
     * 
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * Telephone (note: not set for virtual-money accounts)
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Telephone (note: not set for virtual-money accounts)
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Boolean value 1 or 0, indicating whether is payment agent (note: not applicable for virtual money accounts)
     * 
     */
    public Integer getIsAuthenticatedPaymentAgent() {
        return isAuthenticatedPaymentAgent;
    }

    /**
     * Boolean value 1 or 0, indicating whether is payment agent (note: not applicable for virtual money accounts)
     * 
     */
    public void setIsAuthenticatedPaymentAgent(Integer isAuthenticatedPaymentAgent) {
        this.isAuthenticatedPaymentAgent = isAuthenticatedPaymentAgent;
    }

    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     * 
     */
    public Integer getEmailConsent() {
        return emailConsent;
    }

    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     * 
     */
    public void setEmailConsent(Integer emailConsent) {
        this.emailConsent = emailConsent;
    }

    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades. Note: not applicable for Virtual account. Only allow for real money account.
     * 
     */
    public Integer getAllowCopiers() {
        return allowCopiers;
    }

    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades. Note: not applicable for Virtual account. Only allow for real money account.
     * 
     */
    public void setAllowCopiers(Integer allowCopiers) {
        this.allowCopiers = allowCopiers;
    }

    /**
     * Japan real money account status
     * <p>
     * Japan real money account status, only applicable for Japan virtual money account client.
     * 
     */
    public JpAccountStatus getJpAccountStatus() {
        return jpAccountStatus;
    }

    /**
     * Japan real money account status
     * <p>
     * Japan real money account status, only applicable for Japan virtual money account client.
     * 
     */
    public void setJpAccountStatus(JpAccountStatus jpAccountStatus) {
        this.jpAccountStatus = jpAccountStatus;
    }

    /**
     * Japan real money client settings
     * <p>
     * Japan real money client settings, only applicable for Japan real money account client.
     * 
     */
    public JpSettings getJpSettings() {
        return jpSettings;
    }

    /**
     * Japan real money client settings
     * <p>
     * Japan real money client settings, only applicable for Japan real money account client.
     * 
     */
    public void setJpSettings(JpSettings jpSettings) {
        this.jpSettings = jpSettings;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(email).append(country).append(countryCode).append(salutation).append(firstName).append(lastName).append(dateOfBirth).append(addressLine1).append(addressLine2).append(addressCity).append(addressState).append(addressPostcode).append(phone).append(isAuthenticatedPaymentAgent).append(emailConsent).append(allowCopiers).append(jpAccountStatus).append(jpSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSettings) == false) {
            return false;
        }
        GetSettings rhs = ((GetSettings) other);
        return new EqualsBuilder().append(email, rhs.email).append(country, rhs.country).append(countryCode, rhs.countryCode).append(salutation, rhs.salutation).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(dateOfBirth, rhs.dateOfBirth).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(addressCity, rhs.addressCity).append(addressState, rhs.addressState).append(addressPostcode, rhs.addressPostcode).append(phone, rhs.phone).append(isAuthenticatedPaymentAgent, rhs.isAuthenticatedPaymentAgent).append(emailConsent, rhs.emailConsent).append(allowCopiers, rhs.allowCopiers).append(jpAccountStatus, rhs.jpAccountStatus).append(jpSettings, rhs.jpSettings).isEquals();
    }

}
