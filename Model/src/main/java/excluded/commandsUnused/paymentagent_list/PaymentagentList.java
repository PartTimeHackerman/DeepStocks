
package data.binaryAPI.commandsUnused.paymentagent_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Payment Agent List
 * <p>
 * Payment Agent List
 * 
 */
public class PaymentagentList implements Serializable
{

    @SerializedName("available_countries")
    @Expose
    private java.util.List<Object> availableCountries = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("list")
    @Expose
    private java.util.List<data.binaryAPI.commandsUnused.paymentagent_list.List> list = new ArrayList<data.binaryAPI.commandsUnused.paymentagent_list.List>();
    private final static long serialVersionUID = 1595846477536803241L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentList() {
    }

    /**
     * 
     * @param list
     * @param availableCountries
     */
    public PaymentagentList(java.util.List<Object> availableCountries, java.util.List<data.binaryAPI.commandsUnused.paymentagent_list.List> list) {
        super();
        this.availableCountries = availableCountries;
        this.list = list;
    }

    public java.util.List<Object> getAvailableCountries() {
        return availableCountries;
    }

    public void setAvailableCountries(java.util.List<Object> availableCountries) {
        this.availableCountries = availableCountries;
    }

    /**
     * 
     * (Required)
     * 
     */
    public java.util.List<data.binaryAPI.commandsUnused.paymentagent_list.List> getList() {
        return list;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setList(java.util.List<data.binaryAPI.commandsUnused.paymentagent_list.List> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(availableCountries).append(list).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentList) == false) {
            return false;
        }
        PaymentagentList rhs = ((PaymentagentList) other);
        return new EqualsBuilder().append(availableCountries, rhs.availableCountries).append(list, rhs.list).isEquals();
    }

}
