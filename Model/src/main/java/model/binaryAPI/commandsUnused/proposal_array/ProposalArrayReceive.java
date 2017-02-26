
package data.binaryAPI.commandsUnused.proposal_array;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Multiple Price Proposal Response
 * <p>
 * Latest price and other details for a given contract
 * 
 */
public class ProposalArrayReceive implements Serializable, Message
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
     * Multiple Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    @SerializedName("proposal_array")
    @Expose
    private ProposalArray proposalArray;
    /**
     * proposal_array
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
    private final static long serialVersionUID = -6443806686862895866L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalArrayReceive() {
    }

    /**
     * 
     * @param msgType
     * @param proposalArray
     * @param echoReq
     * @param reqId
     */
    public ProposalArrayReceive(Object echoReq, ProposalArray proposalArray, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.proposalArray = proposalArray;
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
     * Multiple Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    public ProposalArray getProposalArray() {
        return proposalArray;
    }

    /**
     * Multiple Price Proposal Response
     * <p>
     * Latest price and other details for a given contract
     * 
     */
    public void setProposalArray(ProposalArray proposalArray) {
        this.proposalArray = proposalArray;
    }

    /**
     * proposal_array
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * proposal_array
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
        return new HashCodeBuilder().append(echoReq).append(proposalArray).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalArrayReceive) == false) {
            return false;
        }
        ProposalArrayReceive rhs = ((ProposalArrayReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(proposalArray, rhs.proposalArray).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
