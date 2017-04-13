
package data.binaryAPI.commandsUnused.new_account_virtual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Create virtual account Send
 * <p>
 * Create a new virtual-money account
 * 
 */
public class NewAccountVirtualSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("new_account_virtual")
    @Expose
    private Integer newAccountVirtual;
    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    @SerializedName("verification_code")
    @Expose
    private String verificationCode;
    /**
     * Password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    @SerializedName("client_password")
    @Expose
    private String clientPassword;
    /**
     *  2-letter country code (value received from residence_list call)
     * 
     */
    @SerializedName("residence")
    @Expose
    private String residence;
    /**
     * Affiliate token, within 32 characters.
     * 
     */
    @SerializedName("affiliate_token")
    @Expose
    private String affiliateToken;
    /**
     * Optional field to identify the source of traffic such as: search engine, newsletter, or other referral
     * 
     */
    @SerializedName("utm_source")
    @Expose
    private String utmSource;
    /**
     * Optional field to identify the medium the link was used upon such as: email, CPC, or other methods of sharing
     * 
     */
    @SerializedName("utm_medium")
    @Expose
    private String utmMedium;
    /**
     * Optional field to identify a specific product promotion or strategic campaign such as a spring sale or other promotions
     * 
     */
    @SerializedName("utm_campaign")
    @Expose
    private String utmCampaign;
    /**
     * Boolean value 1 or 0, indicating permission to use email address for any contact which may include marketing
     * 
     */
    @SerializedName("email_consent")
    @Expose
    private Integer emailConsent;
    /**
     * (Google Click Identifier) to track source
     * 
     */
    @SerializedName("gclid_url")
    @Expose
    private String gclidUrl;
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
    private final static long serialVersionUID = -738682791761483859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountVirtualSend() {
    }

    /**
     * 
     * @param utmSource
     * @param emailConsent
     * @param gclidUrl
     * @param passthrough
     * @param utmMedium
     * @param newAccountVirtual
     * @param residence
     * @param utmCampaign
     * @param clientPassword
     * @param affiliateToken
     * @param verificationCode
     * @param reqId
     */
    public NewAccountVirtualSend(Integer newAccountVirtual, String verificationCode, String clientPassword, String residence, String affiliateToken, String utmSource, String utmMedium, String utmCampaign, Integer emailConsent, String gclidUrl, Passthrough passthrough, Integer reqId) {
        super();
        this.newAccountVirtual = newAccountVirtual;
        this.verificationCode = verificationCode;
        this.clientPassword = clientPassword;
        this.residence = residence;
        this.affiliateToken = affiliateToken;
        this.utmSource = utmSource;
        this.utmMedium = utmMedium;
        this.utmCampaign = utmCampaign;
        this.emailConsent = emailConsent;
        this.gclidUrl = gclidUrl;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getNewAccountVirtual() {
        return newAccountVirtual;
    }

    /**
     * Must be 1
     * 
     */
    public void setNewAccountVirtual(Integer newAccountVirtual) {
        this.newAccountVirtual = newAccountVirtual;
    }

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
     * Password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public String getClientPassword() {
        return clientPassword;
    }

    /**
     * Password (length within 6-25 chars, accepts any printable ASCII character)
     * 
     */
    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    /**
     *  2-letter country code (value received from residence_list call)
     * 
     */
    public String getResidence() {
        return residence;
    }

    /**
     *  2-letter country code (value received from residence_list call)
     * 
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public String getAffiliateToken() {
        return affiliateToken;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public void setAffiliateToken(String affiliateToken) {
        this.affiliateToken = affiliateToken;
    }

    /**
     * Optional field to identify the source of traffic such as: search engine, newsletter, or other referral
     * 
     */
    public String getUtmSource() {
        return utmSource;
    }

    /**
     * Optional field to identify the source of traffic such as: search engine, newsletter, or other referral
     * 
     */
    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }

    /**
     * Optional field to identify the medium the link was used upon such as: email, CPC, or other methods of sharing
     * 
     */
    public String getUtmMedium() {
        return utmMedium;
    }

    /**
     * Optional field to identify the medium the link was used upon such as: email, CPC, or other methods of sharing
     * 
     */
    public void setUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
    }

    /**
     * Optional field to identify a specific product promotion or strategic campaign such as a spring sale or other promotions
     * 
     */
    public String getUtmCampaign() {
        return utmCampaign;
    }

    /**
     * Optional field to identify a specific product promotion or strategic campaign such as a spring sale or other promotions
     * 
     */
    public void setUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
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
     * (Google Click Identifier) to track source
     * 
     */
    public String getGclidUrl() {
        return gclidUrl;
    }

    /**
     * (Google Click Identifier) to track source
     * 
     */
    public void setGclidUrl(String gclidUrl) {
        this.gclidUrl = gclidUrl;
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
        return new HashCodeBuilder().append(newAccountVirtual).append(verificationCode).append(clientPassword).append(residence).append(affiliateToken).append(utmSource).append(utmMedium).append(utmCampaign).append(emailConsent).append(gclidUrl).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountVirtualSend) == false) {
            return false;
        }
        NewAccountVirtualSend rhs = ((NewAccountVirtualSend) other);
        return new EqualsBuilder().append(newAccountVirtual, rhs.newAccountVirtual).append(verificationCode, rhs.verificationCode).append(clientPassword, rhs.clientPassword).append(residence, rhs.residence).append(affiliateToken, rhs.affiliateToken).append(utmSource, rhs.utmSource).append(utmMedium, rhs.utmMedium).append(utmCampaign, rhs.utmCampaign).append(emailConsent, rhs.emailConsent).append(gclidUrl, rhs.gclidUrl).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
