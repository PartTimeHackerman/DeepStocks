
package data.binaryAPI.commandsUnused.transfer_between_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Transfer Between Accounts Response
 * <p>
 * 
 * 
 */
public class TransferBetweenAccountsReceive implements Serializable, Message
{

    /**
     * If 1, transfer success.
     * 
     */
    @SerializedName("transfer_between_accounts")
    @Expose
    private Integer transferBetweenAccounts;
    /**
     * the avaiable accounts to transfer
     * 
     */
    @SerializedName("accounts")
    @Expose
    private List<Account> accounts = new ArrayList<Account>();
    /**
     * The account to client full name
     * 
     */
    @SerializedName("client_to_full_name")
    @Expose
    private String clientToFullName;
    /**
     * The account to client loginid
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
     * transfer_between_accounts
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
    private final static long serialVersionUID = -2977266492660062322L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransferBetweenAccountsReceive() {
    }

    /**
     * 
     * @param transferBetweenAccounts
     * @param msgType
     * @param accounts
     * @param clientToFullName
     * @param echoReq
     * @param clientToLoginid
     * @param transactionId
     * @param reqId
     */
    public TransferBetweenAccountsReceive(Integer transferBetweenAccounts, List<Account> accounts, String clientToFullName, String clientToLoginid, Integer transactionId, Object echoReq, String msgType, Integer reqId) {
        super();
        this.transferBetweenAccounts = transferBetweenAccounts;
        this.accounts = accounts;
        this.clientToFullName = clientToFullName;
        this.clientToLoginid = clientToLoginid;
        this.transactionId = transactionId;
        this.echoReq = echoReq;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * If 1, transfer success.
     * 
     */
    public Integer getTransferBetweenAccounts() {
        return transferBetweenAccounts;
    }

    /**
     * If 1, transfer success.
     * 
     */
    public void setTransferBetweenAccounts(Integer transferBetweenAccounts) {
        this.transferBetweenAccounts = transferBetweenAccounts;
    }

    /**
     * the avaiable accounts to transfer
     * 
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * the avaiable accounts to transfer
     * 
     */
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * The account to client full name
     * 
     */
    public String getClientToFullName() {
        return clientToFullName;
    }

    /**
     * The account to client full name
     * 
     */
    public void setClientToFullName(String clientToFullName) {
        this.clientToFullName = clientToFullName;
    }

    /**
     * The account to client loginid
     * 
     */
    public String getClientToLoginid() {
        return clientToLoginid;
    }

    /**
     * The account to client loginid
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
     * transfer_between_accounts
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * transfer_between_accounts
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
        return new HashCodeBuilder().append(transferBetweenAccounts).append(accounts).append(clientToFullName).append(clientToLoginid).append(transactionId).append(echoReq).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferBetweenAccountsReceive) == false) {
            return false;
        }
        TransferBetweenAccountsReceive rhs = ((TransferBetweenAccountsReceive) other);
        return new EqualsBuilder().append(transferBetweenAccounts, rhs.transferBetweenAccounts).append(accounts, rhs.accounts).append(clientToFullName, rhs.clientToFullName).append(clientToLoginid, rhs.clientToLoginid).append(transactionId, rhs.transactionId).append(echoReq, rhs.echoReq).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
