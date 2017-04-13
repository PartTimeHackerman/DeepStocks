
package data.binaryAPI.commandsUnused.states_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class StatesList implements Serializable
{

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = -6098969545346766946L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatesList() {
    }

    /**
     * 
     * @param text
     * @param value
     */
    public StatesList(String value, String text) {
        super();
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(text).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatesList) == false) {
            return false;
        }
        StatesList rhs = ((StatesList) other);
        return new EqualsBuilder().append(value, rhs.value).append(text, rhs.text).isEquals();
    }

}
