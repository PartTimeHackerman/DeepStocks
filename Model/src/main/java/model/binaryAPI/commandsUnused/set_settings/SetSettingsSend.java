
package data.binaryAPI.commandsUnused.set_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Set User Settings Send
 * <p>
 * Set User Settings (this call should be used in conjunction with get_settings)
 * 
 */
public class SetSettingsSend implements Serializable
{

    @SerializedName("set_settings")
    @Expose
    private Integer setSettings;
    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    @SerializedName("address_line_1")
    @Expose
    private String addressLine1;
    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    @SerializedName("address_line_2")
    @Expose
    private String addressLine2;
    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    @SerializedName("address_city")
    @Expose
    private String addressCity;
    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    @SerializedName("address_state")
    @Expose
    private String addressState;
    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    @SerializedName("address_postcode")
    @Expose
    private String addressPostcode;
    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     *  2-letter country code. Note: not applicable for real money account. Only allow for Virtual account without residence set.
     * 
     */
    @SerializedName("residence")
    @Expose
    private String residence;
    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     * 
     */
    @SerializedName("email_consent")
    @Expose
    private Integer emailConsent;
    /**
     * Japan real money client settings
     * <p>
     * Japan real money client settings, only applicable for Japan real money account client.
     * 
     */
    @SerializedName("jp_settings")
    @Expose
    private JpSettings jpSettings;
    /**
     * Boolean value 1 or 0, indicating permission to allow others to follow your trades. Note: not applicable for Virtual account. Only allow for real money account.
     * 
     */
    @SerializedName("allow_copiers")
    @Expose
    private Integer allowCopiers;
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
    private final static long serialVersionUID = 9190140978391262744L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetSettingsSend() {
    }

    /**
     * 
     * @param addressPostcode
     * @param addressState
     * @param reqId
     * @param setSettings
     * @param emailConsent
     * @param phone
     * @param passthrough
     * @param addressLine1
     * @param addressLine2
     * @param residence
     * @param allowCopiers
     * @param addressCity
     * @param jpSettings
     */
    public SetSettingsSend(Integer setSettings, String addressLine1, String addressLine2, String addressCity, String addressState, String addressPostcode, String phone, String residence, Integer emailConsent, JpSettings jpSettings, Integer allowCopiers, Passthrough passthrough, Integer reqId) {
        super();
        this.setSettings = setSettings;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.phone = phone;
        this.residence = residence;
        this.emailConsent = emailConsent;
        this.jpSettings = jpSettings;
        this.allowCopiers = allowCopiers;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getSetSettings() {
        return setSettings;
    }

    public void setSetSettings(Integer setSettings) {
        this.setSettings = setSettings;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Note: not applicable for virtual account. Required field for real money account.
     * 
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Note: not applicable for virtual account. Optional field for real money account.
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *  2-letter country code. Note: not applicable for real money account. Only allow for Virtual account without residence set.
     * 
     */
    public String getResidence() {
        return residence;
    }

    /**
     *  2-letter country code. Note: not applicable for real money account. Only allow for Virtual account without residence set.
     * 
     */
    public void setResidence(String residence) {
        this.residence = residence;
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
        return new HashCodeBuilder().append(setSettings).append(addressLine1).append(addressLine2).append(addressCity).append(addressState).append(addressPostcode).append(phone).append(residence).append(emailConsent).append(jpSettings).append(allowCopiers).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetSettingsSend) == false) {
            return false;
        }
        SetSettingsSend rhs = ((SetSettingsSend) other);
        return new EqualsBuilder().append(setSettings, rhs.setSettings).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(addressCity, rhs.addressCity).append(addressState, rhs.addressState).append(addressPostcode, rhs.addressPostcode).append(phone, rhs.phone).append(residence, rhs.residence).append(emailConsent, rhs.emailConsent).append(jpSettings, rhs.jpSettings).append(allowCopiers, rhs.allowCopiers).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
