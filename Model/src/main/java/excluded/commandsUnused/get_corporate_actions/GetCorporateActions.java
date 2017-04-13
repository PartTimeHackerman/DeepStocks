
package data.binaryAPI.commandsUnused.get_corporate_actions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Get corporate actions response
 * <p>
 * Corporate actions for an equity symbol
 * 
 */
public class GetCorporateActions implements Serializable
{

    /**
     * Array of the corporate actions.
     * 
     */
    @SerializedName("actions")
    @Expose
    private List<Action> actions = new ArrayList<Action>();
    private final static long serialVersionUID = 221780529089677337L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetCorporateActions() {
    }

    /**
     * 
     * @param actions
     */
    public GetCorporateActions(List<Action> actions) {
        super();
        this.actions = actions;
    }

    /**
     * Array of the corporate actions.
     * 
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * Array of the corporate actions.
     * 
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetCorporateActions) == false) {
            return false;
        }
        GetCorporateActions rhs = ((GetCorporateActions) other);
        return new EqualsBuilder().append(actions, rhs.actions).isEquals();
    }

}
