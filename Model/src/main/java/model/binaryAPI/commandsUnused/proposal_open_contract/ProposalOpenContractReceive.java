
package data.binaryAPI.commandsUnused.proposal_open_contract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Open contract proposal response
 * <p>
 * Latest price and other details for an open contract in the user's portfolio
 * 
 */
public class ProposalOpenContractReceive implements Serializable, Message
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
     * Open contract response
     * <p>
     * Latest price and other details for an open contract
     * 
     */
    @SerializedName("proposal_open_contract")
    @Expose
    private ProposalOpenContract proposalOpenContract;
    /**
     * proposal_open_contract
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
    private final static long serialVersionUID = -458303862952512913L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalOpenContractReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param proposalOpenContract
     * @param reqId
     */
    public ProposalOpenContractReceive(Object echoReq, ProposalOpenContract proposalOpenContract, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.proposalOpenContract = proposalOpenContract;
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
     * Open contract response
     * <p>
     * Latest price and other details for an open contract
     * 
     */
    public ProposalOpenContract getProposalOpenContract() {
        return proposalOpenContract;
    }

    /**
     * Open contract response
     * <p>
     * Latest price and other details for an open contract
     * 
     */
    public void setProposalOpenContract(ProposalOpenContract proposalOpenContract) {
        this.proposalOpenContract = proposalOpenContract;
    }

    /**
     * proposal_open_contract
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * proposal_open_contract
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
        return new HashCodeBuilder().append(echoReq).append(proposalOpenContract).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalOpenContractReceive) == false) {
            return false;
        }
        ProposalOpenContractReceive rhs = ((ProposalOpenContractReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(proposalOpenContract, rhs.proposalOpenContract).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
