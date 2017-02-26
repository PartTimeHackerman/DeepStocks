
package data.binaryAPI.commandsUnused.transfer_between_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Transfer Between Accounts Request
 * <p>
 * This call allows transfers between accounts held by a given user with the 'malta' and 'maltainvest' Landing Companies or between sub account and master account for omnibus accounts.
 * 
 */
public class TransferBetweenAccountsSend implements Serializable
{

    /**
     * if account_from and account_to are not provided, we'll just return available accounts
     * 
     */
    @SerializedName("transfer_between_accounts")
    @Expose
    private Integer transferBetweenAccounts;
    /**
     * The account_from loginid
     * 
     */
    @SerializedName("account_from")
    @Expose
    private String accountFrom;
    /**
     * The account_to loginid
     * 
     */
    @SerializedName("account_to")
    @Expose
    private String accountTo;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amount")
    @Expose
    private Double amount;
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
    private final static long serialVersionUID = 5045820410400011745L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransferBetweenAccountsSend() {
    }

    /**
     * 
     * @param accountTo
     * @param transferBetweenAccounts
     * @param amount
     * @param passthrough
     * @param currency
     * @param accountFrom
     * @param reqId
     */
    public TransferBetweenAccountsSend(Integer transferBetweenAccounts, String accountFrom, String accountTo, String currency, Double amount, Passthrough passthrough, Integer reqId) {
        super();
        this.transferBetweenAccounts = transferBetweenAccounts;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.currency = currency;
        this.amount = amount;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * if account_from and account_to are not provided, we'll just return available accounts
     * 
     */
    public Integer getTransferBetweenAccounts() {
        return transferBetweenAccounts;
    }

    /**
     * if account_from and account_to are not provided, we'll just return available accounts
     * 
     */
    public void setTransferBetweenAccounts(Integer transferBetweenAccounts) {
        this.transferBetweenAccounts = transferBetweenAccounts;
    }

    /**
     * The account_from loginid
     * 
     */
    public String getAccountFrom() {
        return accountFrom;
    }

    /**
     * The account_from loginid
     * 
     */
    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    /**
     * The account_to loginid
     * 
     */
    public String getAccountTo() {
        return accountTo;
    }

    /**
     * The account_to loginid
     * 
     */
    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transferBetweenAccounts).append(accountFrom).append(accountTo).append(currency).append(amount).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferBetweenAccountsSend) == false) {
            return false;
        }
        TransferBetweenAccountsSend rhs = ((TransferBetweenAccountsSend) other);
        return new EqualsBuilder().append(transferBetweenAccounts, rhs.transferBetweenAccounts).append(accountFrom, rhs.accountFrom).append(accountTo, rhs.accountTo).append(currency, rhs.currency).append(amount, rhs.amount).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
