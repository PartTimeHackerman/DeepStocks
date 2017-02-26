
package data.binaryAPI.commandsUnused.app_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Application object
 * <p>
 * 
 * 
 */
public class AppList implements Serializable
{

    /**
     * Application name
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Application id
     * (Required)
     * 
     */
    @SerializedName("app_id")
    @Expose
    private Integer appId;
    /**
     * Application redirect_uri
     * (Required)
     * 
     */
    @SerializedName("redirect_uri")
    @Expose
    private String redirectUri;
    /**
     * Application's homepage
     * (Required)
     * 
     */
    @SerializedName("homepage")
    @Expose
    private String homepage;
    /**
     * Application's GitHub page (for open-source projects)
     * (Required)
     * 
     */
    @SerializedName("github")
    @Expose
    private String github;
    /**
     * Application's App Store URL
     * (Required)
     * 
     */
    @SerializedName("appstore")
    @Expose
    private String appstore;
    /**
     * Application's Google Play URL
     * (Required)
     * 
     */
    @SerializedName("googleplay")
    @Expose
    private String googleplay;
    /**
     * Markup added to contract prices (as a percentage of contract payout)
     * (Required)
     * 
     */
    @SerializedName("app_markup_percentage")
    @Expose
    private Double appMarkupPercentage;
    private final static long serialVersionUID = -9040352594528665334L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppList() {
    }

    /**
     * 
     * @param redirectUri
     * @param googleplay
     * @param github
     * @param appstore
     * @param appId
     * @param name
     * @param homepage
     * @param appMarkupPercentage
     */
    public AppList(String name, Integer appId, String redirectUri, String homepage, String github, String appstore, String googleplay, Double appMarkupPercentage) {
        super();
        this.name = name;
        this.appId = appId;
        this.redirectUri = redirectUri;
        this.homepage = homepage;
        this.github = github;
        this.appstore = appstore;
        this.googleplay = googleplay;
        this.appMarkupPercentage = appMarkupPercentage;
    }

    /**
     * Application name
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Application name
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Application id
     * (Required)
     * 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * Application id
     * (Required)
     * 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * Application redirect_uri
     * (Required)
     * 
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * Application redirect_uri
     * (Required)
     * 
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * Application's homepage
     * (Required)
     * 
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Application's homepage
     * (Required)
     * 
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * Application's GitHub page (for open-source projects)
     * (Required)
     * 
     */
    public String getGithub() {
        return github;
    }

    /**
     * Application's GitHub page (for open-source projects)
     * (Required)
     * 
     */
    public void setGithub(String github) {
        this.github = github;
    }

    /**
     * Application's App Store URL
     * (Required)
     * 
     */
    public String getAppstore() {
        return appstore;
    }

    /**
     * Application's App Store URL
     * (Required)
     * 
     */
    public void setAppstore(String appstore) {
        this.appstore = appstore;
    }

    /**
     * Application's Google Play URL
     * (Required)
     * 
     */
    public String getGoogleplay() {
        return googleplay;
    }

    /**
     * Application's Google Play URL
     * (Required)
     * 
     */
    public void setGoogleplay(String googleplay) {
        this.googleplay = googleplay;
    }

    /**
     * Markup added to contract prices (as a percentage of contract payout)
     * (Required)
     * 
     */
    public Double getAppMarkupPercentage() {
        return appMarkupPercentage;
    }

    /**
     * Markup added to contract prices (as a percentage of contract payout)
     * (Required)
     * 
     */
    public void setAppMarkupPercentage(Double appMarkupPercentage) {
        this.appMarkupPercentage = appMarkupPercentage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(appId).append(redirectUri).append(homepage).append(github).append(appstore).append(googleplay).append(appMarkupPercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppList) == false) {
            return false;
        }
        AppList rhs = ((AppList) other);
        return new EqualsBuilder().append(name, rhs.name).append(appId, rhs.appId).append(redirectUri, rhs.redirectUri).append(homepage, rhs.homepage).append(github, rhs.github).append(appstore, rhs.appstore).append(googleplay, rhs.googleplay).append(appMarkupPercentage, rhs.appMarkupPercentage).isEquals();
    }

}
