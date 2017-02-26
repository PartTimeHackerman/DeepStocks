
package data.binaryAPI.commandsUnused.get_financial_assessment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get financial assessment details
 * <p>
 * This call gets the financial assessement details. The 'financial assessment' is a questionnaire that clients of certain Landing Companies need to complete, due to regulatory and KYC (know your client) requirements.
 * 
 */
public class GetFinancialAssessmentSend implements Serializable
{

    @SerializedName("get_financial_assessment")
    @Expose
    private Integer getFinancialAssessment;
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
    private final static long serialVersionUID = 2704182608427766141L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetFinancialAssessmentSend() {
    }

    /**
     * 
     * @param getFinancialAssessment
     * @param passthrough
     * @param reqId
     */
    public GetFinancialAssessmentSend(Integer getFinancialAssessment, Passthrough passthrough, Integer reqId) {
        super();
        this.getFinancialAssessment = getFinancialAssessment;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getGetFinancialAssessment() {
        return getFinancialAssessment;
    }

    public void setGetFinancialAssessment(Integer getFinancialAssessment) {
        this.getFinancialAssessment = getFinancialAssessment;
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
        return new HashCodeBuilder().append(getFinancialAssessment).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetFinancialAssessmentSend) == false) {
            return false;
        }
        GetFinancialAssessmentSend rhs = ((GetFinancialAssessmentSend) other);
        return new EqualsBuilder().append(getFinancialAssessment, rhs.getFinancialAssessment).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
