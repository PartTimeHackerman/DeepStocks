
package data.binaryAPI.commandsUnused.set_financial_assessment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Set Financial Assessment Receive
 * <p>
 * Set Financial Assessment Receive
 * 
 */
public class SetFinancialAssessmentReceive implements Serializable, Message
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
     * Financial Assessment Details
     * <p>
     * Financial Assessment score and appropriate status
     * 
     */
    @SerializedName("set_financial_assessment")
    @Expose
    private SetFinancialAssessment setFinancialAssessment;
    /**
     * set_financial_assessment
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
    private final static long serialVersionUID = -4300375925114254421L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetFinancialAssessmentReceive() {
    }

    /**
     * 
     * @param setFinancialAssessment
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public SetFinancialAssessmentReceive(Object echoReq, SetFinancialAssessment setFinancialAssessment, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.setFinancialAssessment = setFinancialAssessment;
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
     * Financial Assessment Details
     * <p>
     * Financial Assessment score and appropriate status
     * 
     */
    public SetFinancialAssessment getSetFinancialAssessment() {
        return setFinancialAssessment;
    }

    /**
     * Financial Assessment Details
     * <p>
     * Financial Assessment score and appropriate status
     * 
     */
    public void setSetFinancialAssessment(SetFinancialAssessment setFinancialAssessment) {
        this.setFinancialAssessment = setFinancialAssessment;
    }

    /**
     * set_financial_assessment
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * set_financial_assessment
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
        return new HashCodeBuilder().append(echoReq).append(setFinancialAssessment).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetFinancialAssessmentReceive) == false) {
            return false;
        }
        SetFinancialAssessmentReceive rhs = ((SetFinancialAssessmentReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(setFinancialAssessment, rhs.setFinancialAssessment).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
