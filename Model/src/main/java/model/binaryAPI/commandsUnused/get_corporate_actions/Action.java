
package data.binaryAPI.commandsUnused.get_corporate_actions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Action implements Serializable
{

    /**
     * Effective date of the corporate actions.
     * 
     */
    @SerializedName("display_date")
    @Expose
    private String displayDate;
    /**
     * Type of corporate actions.
     * 
     */
    @SerializedName("type")
    @Expose
    private Integer type;
    /**
     * Value for the corporate actions. Example: split ratio for stock split.
     * 
     */
    @SerializedName("value")
    @Expose
    private Integer value;
    /**
     * Modifier for the corporate actions. Example: divide.
     * 
     */
    @SerializedName("modifier")
    @Expose
    private String modifier;
    private final static long serialVersionUID = -1045347302480549570L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Action() {
    }

    /**
     * 
     * @param displayDate
     * @param modifier
     * @param type
     * @param value
     */
    public Action(String displayDate, Integer type, Integer value, String modifier) {
        super();
        this.displayDate = displayDate;
        this.type = type;
        this.value = value;
        this.modifier = modifier;
    }

    /**
     * Effective date of the corporate actions.
     * 
     */
    public String getDisplayDate() {
        return displayDate;
    }

    /**
     * Effective date of the corporate actions.
     * 
     */
    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    /**
     * Type of corporate actions.
     * 
     */
    public Integer getType() {
        return type;
    }

    /**
     * Type of corporate actions.
     * 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Value for the corporate actions. Example: split ratio for stock split.
     * 
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Value for the corporate actions. Example: split ratio for stock split.
     * 
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Modifier for the corporate actions. Example: divide.
     * 
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * Modifier for the corporate actions. Example: divide.
     * 
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayDate).append(type).append(value).append(modifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(displayDate, rhs.displayDate).append(type, rhs.type).append(value, rhs.value).append(modifier, rhs.modifier).isEquals();
    }

}
