
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
 * This call gets the financial assessment details of client's account.
 * 
 */
public class GetFinancialAssessmentReceive implements Serializable, Message
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
     * Assessment details
     * <p>
     * Client's financial asessment details
     * 
     */
    @SerializedName("get_financial_assessment")
    @Expose
    private GetFinancialAssessment getFinancialAssessment;
    /**
     * get_financial_assessment
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
    private final static long serialVersionUID = 3938524853981664286L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetFinancialAssessmentReceive() {
    }

    /**
     * 
     * @param getFinancialAssessment
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public GetFinancialAssessmentReceive(Object echoReq, GetFinancialAssessment getFinancialAssessment, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.getFinancialAssessment = getFinancialAssessment;
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
     * Assessment details
     * <p>
     * Client's financial asessment details
     * 
     */
    public GetFinancialAssessment getGetFinancialAssessment() {
        return getFinancialAssessment;
    }

    /**
     * Assessment details
     * <p>
     * Client's financial asessment details
     * 
     */
    public void setGetFinancialAssessment(GetFinancialAssessment getFinancialAssessment) {
        this.getFinancialAssessment = getFinancialAssessment;
    }

    /**
     * get_financial_assessment
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * get_financial_assessment
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
        return new HashCodeBuilder().append(echoReq).append(getFinancialAssessment).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetFinancialAssessmentReceive) == false) {
            return false;
        }
        GetFinancialAssessmentReceive rhs = ((GetFinancialAssessmentReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(getFinancialAssessment, rhs.getFinancialAssessment).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
