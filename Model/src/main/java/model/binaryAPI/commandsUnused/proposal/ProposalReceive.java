
package data.binaryAPI.commandsUnused.proposal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Price Proposal Response
 * <p>
 * Latest price and other details for a given contract
 * 
 */
public class ProposalReceive implements Serializable, Message
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
     * Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    @SerializedName("proposal")
    @Expose
    private Proposal proposal;
    /**
     * proposal
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
    private final static long serialVersionUID = -1582595061271028940L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalReceive() {
    }

    /**
     * 
     * @param proposal
     * @param msgType
     * @param echoReq
     * @param reqId
     */
    public ProposalReceive(Object echoReq, Proposal proposal, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.proposal = proposal;
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
     * Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    public Proposal getProposal() {
        return proposal;
    }

    /**
     * Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    /**
     * proposal
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * proposal
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
        return new HashCodeBuilder().append(echoReq).append(proposal).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalReceive) == false) {
            return false;
        }
        ProposalReceive rhs = ((ProposalReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(proposal, rhs.proposal).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
