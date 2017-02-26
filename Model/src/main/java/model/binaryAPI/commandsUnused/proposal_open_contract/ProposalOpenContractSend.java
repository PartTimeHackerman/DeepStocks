
package data.binaryAPI.commandsUnused.proposal_open_contract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Latest price for an open contract
 * <p>
 * Get latest price (and other information) for a contract in the user's portfolio
 * 
 */
public class ProposalOpenContractSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("proposal_open_contract")
    @Expose
    private Integer proposalOpenContract;
    /**
     * Contract id received from a Portfolio request. If not set, you will receive stream of all open contracts.
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
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
    /**
     *  1 - to stream
     * 
     */
    @SerializedName("subscribe")
    @Expose
    private Integer subscribe;
    private final static long serialVersionUID = -4976423839931628803L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalOpenContractSend() {
    }

    /**
     * 
     * @param subscribe
     * @param contractId
     * @param passthrough
     * @param proposalOpenContract
     * @param reqId
     */
    public ProposalOpenContractSend(Integer proposalOpenContract, Integer contractId, Passthrough passthrough, Integer reqId, Integer subscribe) {
        super();
        this.proposalOpenContract = proposalOpenContract;
        this.contractId = contractId;
        this.passthrough = passthrough;
        this.reqId = reqId;
        this.subscribe = subscribe;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getProposalOpenContract() {
        return proposalOpenContract;
    }

    /**
     * Must be 1
     * 
     */
    public void setProposalOpenContract(Integer proposalOpenContract) {
        this.proposalOpenContract = proposalOpenContract;
    }

    /**
     * Contract id received from a Portfolio request. If not set, you will receive stream of all open contracts.
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Contract id received from a Portfolio request. If not set, you will receive stream of all open contracts.
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
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

    /**
     *  1 - to stream
     * 
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     *  1 - to stream
     * 
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(proposalOpenContract).append(contractId).append(passthrough).append(reqId).append(subscribe).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalOpenContractSend) == false) {
            return false;
        }
        ProposalOpenContractSend rhs = ((ProposalOpenContractSend) other);
        return new EqualsBuilder().append(proposalOpenContract, rhs.proposalOpenContract).append(contractId, rhs.contractId).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).append(subscribe, rhs.subscribe).isEquals();
    }

}
