
package data.binaryAPI.commandsUnused.residence_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class ResidenceList implements Serializable
{

    /**
     *  2-letter country code
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;
    /**
     * Country full name
     * 
     */
    @SerializedName("text")
    @Expose
    private String text;
    /**
     * IDD code of country
     * 
     */
    @SerializedName("phone_idd")
    @Expose
    private String phoneIdd;
    private final static long serialVersionUID = 103594404936020930L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResidenceList() {
    }

    /**
     * 
     * @param phoneIdd
     * @param text
     * @param value
     */
    public ResidenceList(String value, String text, String phoneIdd) {
        super();
        this.value = value;
        this.text = text;
        this.phoneIdd = phoneIdd;
    }

    /**
     *  2-letter country code
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     *  2-letter country code
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Country full name
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * Country full name
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * IDD code of country
     * 
     */
    public String getPhoneIdd() {
        return phoneIdd;
    }

    /**
     * IDD code of country
     * 
     */
    public void setPhoneIdd(String phoneIdd) {
        this.phoneIdd = phoneIdd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(text).append(phoneIdd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResidenceList) == false) {
            return false;
        }
        ResidenceList rhs = ((ResidenceList) other);
        return new EqualsBuilder().append(value, rhs.value).append(text, rhs.text).append(phoneIdd, rhs.phoneIdd).isEquals();
    }

}
