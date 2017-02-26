
package data.binaryAPI.commandsUnused.oauth_apps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Application object
 * <p>
 * 
 * 
 */
public class OauthApp implements Serializable
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
     * Application last used
     * (Required)
     * 
     */
    @SerializedName("last_used")
    @Expose
    private String lastUsed;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("scopes")
    @Expose
    private List<String> scopes = new ArrayList<String>();
    /**
     * Markup added to contract prices (as a percentage of contract payout)
     * (Required)
     * 
     */
    @SerializedName("app_markup_percentage")
    @Expose
    private Double appMarkupPercentage;
    private final static long serialVersionUID = 6458894251982031942L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OauthApp() {
    }

    /**
     * 
     * @param lastUsed
     * @param appId
     * @param name
     * @param scopes
     * @param appMarkupPercentage
     */
    public OauthApp(String name, Integer appId, String lastUsed, List<String> scopes, Double appMarkupPercentage) {
        super();
        this.name = name;
        this.appId = appId;
        this.lastUsed = lastUsed;
        this.scopes = scopes;
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
     * Application last used
     * (Required)
     * 
     */
    public String getLastUsed() {
        return lastUsed;
    }

    /**
     * Application last used
     * (Required)
     * 
     */
    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
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
        return new HashCodeBuilder().append(name).append(appId).append(lastUsed).append(scopes).append(appMarkupPercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OauthApp) == false) {
            return false;
        }
        OauthApp rhs = ((OauthApp) other);
        return new EqualsBuilder().append(name, rhs.name).append(appId, rhs.appId).append(lastUsed, rhs.lastUsed).append(scopes, rhs.scopes).append(appMarkupPercentage, rhs.appMarkupPercentage).isEquals();
    }

}
