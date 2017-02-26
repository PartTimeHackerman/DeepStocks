
package data.binaryAPI.commandsUnused.mt5_login_list;

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
public class Mt5LoginList implements Serializable
{

    /**
     * Login of MT5 account
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
    /**
     * Group type of the MT5 account, e.g. real, vanuatu, etc.
     * 
     */
    @SerializedName("group")
    @Expose
    private String group;
    private final static long serialVersionUID = 2926871458826082983L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5LoginList() {
    }

    /**
     * 
     * @param login
     * @param group
     */
    public Mt5LoginList(String login, String group) {
        super();
        this.login = login;
        this.group = group;
    }

    /**
     * Login of MT5 account
     * 
     */
    public String getLogin() {
        return login;
    }

    /**
     * Login of MT5 account
     * 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Group type of the MT5 account, e.g. real, vanuatu, etc.
     * 
     */
    public String getGroup() {
        return group;
    }

    /**
     * Group type of the MT5 account, e.g. real, vanuatu, etc.
     * 
     */
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(login).append(group).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5LoginList) == false) {
            return false;
        }
        Mt5LoginList rhs = ((Mt5LoginList) other);
        return new EqualsBuilder().append(login, rhs.login).append(group, rhs.group).isEquals();
    }

}
