
package data.binaryAPI.commandsUnused.contracts_for;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Contracts for Symbol Receive
 * <p>
 * Get the list of currently available contracts
 * 
 */
public class ContractsForReceive implements Serializable, Message
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
    @SerializedName("contracts_for")
    @Expose
    private ContractsFor contractsFor;
    /**
     * contracts_for
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
    private final static long serialVersionUID = -1975724562509360723L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContractsForReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param contractsFor
     * @param reqId
     */
    public ContractsForReceive(Object echoReq, ContractsFor contractsFor, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.contractsFor = contractsFor;
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

    public ContractsFor getContractsFor() {
        return contractsFor;
    }

    public void setContractsFor(ContractsFor contractsFor) {
        this.contractsFor = contractsFor;
    }

    /**
     * contracts_for
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * contracts_for
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
        return new HashCodeBuilder().append(echoReq).append(contractsFor).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractsForReceive) == false) {
            return false;
        }
        ContractsForReceive rhs = ((ContractsForReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(contractsFor, rhs.contractsFor).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
