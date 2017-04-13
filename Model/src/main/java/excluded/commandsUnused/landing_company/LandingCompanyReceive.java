
package data.binaryAPI.commandsUnused.landing_company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Landing Company Receive
 * <p>
 * Returns the Landing Company for clients of a given country.
 * 
 */
public class LandingCompanyReceive implements Serializable, Message
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
     * Landing Company
     * <p>
     * Landing Company
     * 
     */
    @SerializedName("landing_company")
    @Expose
    private LandingCompany landingCompany;
    /**
     * landing_company
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
    private final static long serialVersionUID = 1628765282288898934L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompanyReceive() {
    }

    /**
     * 
     * @param msgType
     * @param landingCompany
     * @param echoReq
     * @param reqId
     */
    public LandingCompanyReceive(Object echoReq, LandingCompany landingCompany, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.landingCompany = landingCompany;
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
     * Landing Company
     * <p>
     * Landing Company
     * 
     */
    public LandingCompany getLandingCompany() {
        return landingCompany;
    }

    /**
     * Landing Company
     * <p>
     * Landing Company
     * 
     */
    public void setLandingCompany(LandingCompany landingCompany) {
        this.landingCompany = landingCompany;
    }

    /**
     * landing_company
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * landing_company
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
        return new HashCodeBuilder().append(echoReq).append(landingCompany).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompanyReceive) == false) {
            return false;
        }
        LandingCompanyReceive rhs = ((LandingCompanyReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(landingCompany, rhs.landingCompany).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
