
package data.binaryAPI.commandsUnused.paymentagent_transfer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent Transfer Response
 * <p>
 * 
 * 
 */
public class PaymentagentTransferReceive implements Serializable, Message
{

    /**
     * If 1, transfer success. If 2, dry-run success.
     * 
     */
    @SerializedName("paymentagent_transfer")
    @Expose
    private Integer paymentagentTransfer;
    /**
     * The transfer_to client full name
     * 
     */
    @SerializedName("client_to_full_name")
    @Expose
    private String clientToFullName;
    /**
     * The transfer_to client loginid
     * 
     */
    @SerializedName("client_to_loginid")
    @Expose
    private String clientToLoginid;
    /**
     * Reference id of transfer performed
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
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
     * paymentagent_transfer
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
    private final static long serialVersionUID = 8562071283500981658L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentTransferReceive() {
    }

    /**
     * 
     * @param msgType
     * @param clientToFullName
     * @param echoReq
     * @param clientToLoginid
     * @param transactionId
     * @param paymentagentTransfer
     * @param reqId
     */
    public PaymentagentTransferReceive(Integer paymentagentTransfer, String clientToFullName, String clientToLoginid, Integer transactionId, Object echoReq, String msgType, Integer reqId) {
        super();
        this.paymentagentTransfer = paymentagentTransfer;
        this.clientToFullName = clientToFullName;
        this.clientToLoginid = clientToLoginid;
        this.transactionId = transactionId;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * If 1, transfer success. If 2, dry-run success.
     * 
     */
    public Integer getPaymentagentTransfer() {
        return paymentagentTransfer;
    }

    /**
     * If 1, transfer success. If 2, dry-run success.
     * 
     */
    public void setPaymentagentTransfer(Integer paymentagentTransfer) {
        this.paymentagentTransfer = paymentagentTransfer;
    }

    /**
     * The transfer_to client full name
     * 
     */
    public String getClientToFullName() {
        return clientToFullName;
    }

    /**
     * The transfer_to client full name
     * 
     */
    public void setClientToFullName(String clientToFullName) {
        this.clientToFullName = clientToFullName;
    }

    /**
     * The transfer_to client loginid
     * 
     */
    public String getClientToLoginid() {
        return clientToLoginid;
    }

    /**
     * The transfer_to client loginid
     * 
     */
    public void setClientToLoginid(String clientToLoginid) {
        this.clientToLoginid = clientToLoginid;
    }

    /**
     * Reference id of transfer performed
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Reference id of transfer performed
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
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
     * paymentagent_transfer
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * paymentagent_transfer
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
        return new HashCodeBuilder().append(paymentagentTransfer).append(clientToFullName).append(clientToLoginid).append(transactionId).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentTransferReceive) == false) {
            return false;
        }
        PaymentagentTransferReceive rhs = ((PaymentagentTransferReceive) other);
        return new EqualsBuilder().append(paymentagentTransfer, rhs.paymentagentTransfer).append(clientToFullName, rhs.clientToFullName).append(clientToLoginid, rhs.clientToLoginid).append(transactionId, rhs.transactionId).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
