
package data.binaryAPI.commandsUnused.landing_company_details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Landing Company Receive
 * <p>
 * A message with Landing Company
 * 
 */
public class LandingCompanyDetailsReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * Landing Company Structure
     * <p>
     * 
     * 
     */
    @SerializedName("landing_company_details")
    @Expose
    private LandingCompanyDetails landingCompanyDetails;
    /**
     * landing_company_details
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -7647986024777408572L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompanyDetailsReceive() {
    }

    /**
     * 
     * @param msgType
     * @param landingCompanyDetails
     * @param echoReq
     * @param reqId
     */
    public LandingCompanyDetailsReceive(Object echoReq, LandingCompanyDetails landingCompanyDetails, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.landingCompanyDetails = landingCompanyDetails;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * Landing Company Structure
     * <p>
     * 
     * 
     */
    public LandingCompanyDetails getLandingCompanyDetails() {
        return landingCompanyDetails;
    }

    /**
     * Landing Company Structure
     * <p>
     * 
     * 
     */
    public void setLandingCompanyDetails(LandingCompanyDetails landingCompanyDetails) {
        this.landingCompanyDetails = landingCompanyDetails;
    }

    /**
     * landing_company_details
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * landing_company_details
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(landingCompanyDetails).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompanyDetailsReceive) == false) {
            return false;
        }
        LandingCompanyDetailsReceive rhs = ((LandingCompanyDetailsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(landingCompanyDetails, rhs.landingCompanyDetails).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
