
package data.binaryAPI.commandsUnused.landing_company_details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Landing Company Details Send
 * <p>
 * Binary.com has a number of licensed subsidiaries in various jurisidictions, which are called Landing Companies (and which are wholly owned subsidiaries of the Binary Group). This call provides information about each Landing Company.
 * 
 */
public class LandingCompanyDetailsSend implements Serializable
{

    /**
     * Landing company shortcode (for example: costarica, malta, maltainvest, iom)
     * 
     */
    @SerializedName("landing_company_details")
    @Expose
    private String landingCompanyDetails;
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
    private final static long serialVersionUID = -138727124599364993L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompanyDetailsSend() {
    }

    /**
     * 
     * @param passthrough
     * @param landingCompanyDetails
     * @param reqId
     */
    public LandingCompanyDetailsSend(String landingCompanyDetails, Passthrough passthrough, Integer reqId) {
        super();
        this.landingCompanyDetails = landingCompanyDetails;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Landing company shortcode (for example: costarica, malta, maltainvest, iom)
     * 
     */
    public String getLandingCompanyDetails() {
        return landingCompanyDetails;
    }

    /**
     * Landing company shortcode (for example: costarica, malta, maltainvest, iom)
     * 
     */
    public void setLandingCompanyDetails(String landingCompanyDetails) {
        this.landingCompanyDetails = landingCompanyDetails;
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
        return new HashCodeBuilder().append(landingCompanyDetails).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompanyDetailsSend) == false) {
            return false;
        }
        LandingCompanyDetailsSend rhs = ((LandingCompanyDetailsSend) other);
        return new EqualsBuilder().append(landingCompanyDetails, rhs.landingCompanyDetails).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
