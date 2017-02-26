
package data.binaryAPI.commandsUnused.app_register;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * App Register Send
 * <p>
 * Register a new OAuth application
 * 
 */
public class AppRegisterSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("app_register")
    @Expose
    private Integer appRegister;
    /**
     * Application name
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("scopes")
    @Expose
    private List<String> scopes = new ArrayList<String>();
    /**
     * Application's homepage
     * 
     */
    @SerializedName("homepage")
    @Expose
    private String homepage;
    /**
     * Application's GitHub page (for open-source projects)
     * 
     */
    @SerializedName("github")
    @Expose
    private String github;
    /**
     * Application's App Store URL (if applicable)
     * 
     */
    @SerializedName("appstore")
    @Expose
    private String appstore;
    /**
     * Application's Google Play URL (if applicable)
     * 
     */
    @SerializedName("googleplay")
    @Expose
    private String googleplay;
    /**
     * Application redirect_uri
     * 
     */
    @SerializedName("redirect_uri")
    @Expose
    private String redirectUri;
    /**
     * Markup to be added to contract prices (as a percentage of contract payout). Min: 0, Max: 5
     * 
     */
    @SerializedName("app_markup_percentage")
    @Expose
    private Double appMarkupPercentage;
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
    private final static long serialVersionUID = -1906887690365092033L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppRegisterSend() {
    }

    /**
     * 
     * @param redirectUri
     * @param googleplay
     * @param github
     * @param appRegister
     * @param appstore
     * @param name
     * @param passthrough
     * @param scopes
     * @param homepage
     * @param appMarkupPercentage
     * @param reqId
     */
    public AppRegisterSend(Integer appRegister, String name, List<String> scopes, String homepage, String github, String appstore, String googleplay, String redirectUri, Double appMarkupPercentage, Passthrough passthrough, Integer reqId) {
        super();
        this.appRegister = appRegister;
        this.name = name;
        this.scopes = scopes;
        this.homepage = homepage;
        this.github = github;
        this.appstore = appstore;
        this.googleplay = googleplay;
        this.redirectUri = redirectUri;
        this.appMarkupPercentage = appMarkupPercentage;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getAppRegister() {
        return appRegister;
    }

    /**
     * Must be 1
     * 
     */
    public void setAppRegister(Integer appRegister) {
        this.appRegister = appRegister;
    }

    /**
     * Application name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Application name
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * Application's homepage
     * 
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Application's homepage
     * 
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * Application's GitHub page (for open-source projects)
     * 
     */
    public String getGithub() {
        return github;
    }

    /**
     * Application's GitHub page (for open-source projects)
     * 
     */
    public void setGithub(String github) {
        this.github = github;
    }

    /**
     * Application's App Store URL (if applicable)
     * 
     */
    public String getAppstore() {
        return appstore;
    }

    /**
     * Application's App Store URL (if applicable)
     * 
     */
    public void setAppstore(String appstore) {
        this.appstore = appstore;
    }

    /**
     * Application's Google Play URL (if applicable)
     * 
     */
    public String getGoogleplay() {
        return googleplay;
    }

    /**
     * Application's Google Play URL (if applicable)
     * 
     */
    public void setGoogleplay(String googleplay) {
        this.googleplay = googleplay;
    }

    /**
     * Application redirect_uri
     * 
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * Application redirect_uri
     * 
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * Markup to be added to contract prices (as a percentage of contract payout). Min: 0, Max: 5
     * 
     */
    public Double getAppMarkupPercentage() {
        return appMarkupPercentage;
    }

    /**
     * Markup to be added to contract prices (as a percentage of contract payout). Min: 0, Max: 5
     * 
     */
    public void setAppMarkupPercentage(Double appMarkupPercentage) {
        this.appMarkupPercentage = appMarkupPercentage;
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
        return new HashCodeBuilder().append(appRegister).append(name).append(scopes).append(homepage).append(github).append(appstore).append(googleplay).append(redirectUri).append(appMarkupPercentage).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppRegisterSend) == false) {
            return false;
        }
        AppRegisterSend rhs = ((AppRegisterSend) other);
        return new EqualsBuilder().append(appRegister, rhs.appRegister).append(name, rhs.name).append(scopes, rhs.scopes).append(homepage, rhs.homepage).append(github, rhs.github).append(appstore, rhs.appstore).append(googleplay, rhs.googleplay).append(redirectUri, rhs.redirectUri).append(appMarkupPercentage, rhs.appMarkupPercentage).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
