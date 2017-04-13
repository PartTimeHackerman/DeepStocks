
package data.binaryAPI.commandsUnused.login_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * User login history
 * 
 */
public class LoginHistory implements Serializable
{

    /**
     * Epoch time of the activity
     * (Required)
     * 
     */
    @SerializedName("time")
    @Expose
    private Integer time;
    /**
     * Type of action. Example: login, logout
     * (Required)
     * 
     */
    @SerializedName("action")
    @Expose
    private String action;
    /**
     * Provides details about browser, device used during login or logout
     * (Required)
     * 
     */
    @SerializedName("environment")
    @Expose
    private String environment;
    /**
     * Status of activity: 1 - success, 0 - failure
     * (Required)
     * 
     */
    @SerializedName("status")
    @Expose
    private Integer status;
    private final static long serialVersionUID = 3334619625209292922L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoginHistory() {
    }

    /**
     * 
     * @param environment
     * @param action
     * @param time
     * @param status
     */
    public LoginHistory(Integer time, String action, String environment, Integer status) {
        super();
        this.time = time;
        this.action = action;
        this.environment = environment;
        this.status = status;
    }

    /**
     * Epoch time of the activity
     * (Required)
     * 
     */
    public Integer getTime() {
        return time;
    }

    /**
     * Epoch time of the activity
     * (Required)
     * 
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * Type of action. Example: login, logout
     * (Required)
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * Type of action. Example: login, logout
     * (Required)
     * 
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Provides details about browser, device used during login or logout
     * (Required)
     * 
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Provides details about browser, device used during login or logout
     * (Required)
     * 
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Status of activity: 1 - success, 0 - failure
     * (Required)
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Status of activity: 1 - success, 0 - failure
     * (Required)
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(time).append(action).append(environment).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginHistory) == false) {
            return false;
        }
        LoginHistory rhs = ((LoginHistory) other);
        return new EqualsBuilder().append(time, rhs.time).append(action, rhs.action).append(environment, rhs.environment).append(status, rhs.status).isEquals();
    }

}
