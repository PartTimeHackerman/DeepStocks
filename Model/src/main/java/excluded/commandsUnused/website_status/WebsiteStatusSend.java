
package data.binaryAPI.commandsUnused.website_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Server Status request
 * <p>
 * Request server status
 * 
 */
public class WebsiteStatusSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("website_status")
    @Expose
    private Integer websiteStatus = 1;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -1790622267581540464L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebsiteStatusSend() {
    }

    /**
     * 
     * @param websiteStatus
     * @param passthrough
     * @param reqId
     */
    public WebsiteStatusSend(Integer websiteStatus, Passthrough passthrough, Integer reqId) {
        super();
        this.websiteStatus = websiteStatus;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getWebsiteStatus() {
        return websiteStatus;
    }

    /**
     * Must be 1
     * 
     */
    public void setWebsiteStatus(Integer websiteStatus) {
        this.websiteStatus = websiteStatus;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public Passthrough getPassthrough() {
        return passthrough;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public void setPassthrough(Passthrough passthrough) {
        this.passthrough = passthrough;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(websiteStatus).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebsiteStatusSend) == false) {
            return false;
        }
        WebsiteStatusSend rhs = ((WebsiteStatusSend) other);
        return new EqualsBuilder().append(websiteStatus, rhs.websiteStatus).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
