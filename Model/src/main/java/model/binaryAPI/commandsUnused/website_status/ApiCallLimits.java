
package data.binaryAPI.commandsUnused.website_status;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * API call limits
 * <p>
 * Limits for api call for each websocket connection
 * 
 */
public class ApiCallLimits implements Serializable
{

    private final static long serialVersionUID = 6426127883885913060L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiCallLimits) == false) {
            return false;
        }
        ApiCallLimits rhs = ((ApiCallLimits) other);
        return new EqualsBuilder().isEquals();
    }

}
