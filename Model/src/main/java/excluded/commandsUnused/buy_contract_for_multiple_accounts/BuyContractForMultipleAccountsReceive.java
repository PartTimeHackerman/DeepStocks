
package data.binaryAPI.commandsUnused.buy_contract_for_multiple_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Buy a Contract for multiple Accounts Receive
 * <p>
 * A message with transaction results is received
 * 
 */
public class BuyContractForMultipleAccountsReceive implements Serializable, Message
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
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * (Required)
     * 
     */
    @SerializedName("buy_contract_for_multiple_accounts")
    @Expose
    private BuyContractForMultipleAccounts buyContractForMultipleAccounts;
    /**
     * buy_contract_for_multiple_accounts
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
    private final static long serialVersionUID = -5783148728549552007L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuyContractForMultipleAccountsReceive() {
    }

    /**
     * 
     * @param msgType
     * @param buyContractForMultipleAccounts
     * @param echoReq
     * @param reqId
     */
    public BuyContractForMultipleAccountsReceive(Object echoReq, BuyContractForMultipleAccounts buyContractForMultipleAccounts, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.buyContractForMultipleAccounts = buyContractForMultipleAccounts;
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
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * (Required)
     * 
     */
    public BuyContractForMultipleAccounts getBuyContractForMultipleAccounts() {
        return buyContractForMultipleAccounts;
    }

    /**
     * Receipt confirmation
     * <p>
     * Receipt confirmation for the purchase
     * (Required)
     * 
     */
    public void setBuyContractForMultipleAccounts(BuyContractForMultipleAccounts buyContractForMultipleAccounts) {
        this.buyContractForMultipleAccounts = buyContractForMultipleAccounts;
    }

    /**
     * buy_contract_for_multiple_accounts
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * buy_contract_for_multiple_accounts
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
        return new HashCodeBuilder().append(echoReq).append(buyContractForMultipleAccounts).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuyContractForMultipleAccountsReceive) == false) {
            return false;
        }
        BuyContractForMultipleAccountsReceive rhs = ((BuyContractForMultipleAccountsReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(buyContractForMultipleAccounts, rhs.buyContractForMultipleAccounts).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
