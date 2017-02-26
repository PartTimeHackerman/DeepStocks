
package data.binaryAPI.commandsUnused.statement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Transaction implements Serializable
{

    /**
     * It is the remaining balance Example: 10150.1300
     * 
     */
    @SerializedName("balance_after")
    @Expose
    private Double balanceAfter;
    /**
     * It is the transaction id. In statement every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    /**
     * It is the contract id Example: 4867502908
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * It is the time of transaction Example: 1441175849
     * 
     */
    @SerializedName("transaction_time")
    @Expose
    private Integer transactionTime;
    /**
     * Time at which contract was purchased, present only for sell transaction
     * 
     */
    @SerializedName("purchase_time")
    @Expose
    private Integer purchaseTime;
    /**
     * It is the type of action Example: buy
     * 
     */
    @SerializedName("action_type")
    @Expose
    private String actionType;
    /**
     * It is the amount of transaction Example: -83.2300
     * 
     */
    @SerializedName("amount")
    @Expose
    private Double amount;
    /**
     * The description of contract purchased if description is set to 1
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Compact description of the contract purchased if description is set to 1
     * 
     */
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    /**
     * Payout price
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    /**
     * Id of an app where this transaction was performed. For example, it's 1 for binary.com.
     * 
     */
    @SerializedName("app_id")
    @Expose
    private Integer appId;
    private final static long serialVersionUID = -7035249623593987511L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param actionType
     * @param amount
     * @param appId
     * @param contractId
     * @param longcode
     * @param payout
     * @param balanceAfter
     * @param purchaseTime
     * @param transactionTime
     * @param shortcode
     * @param transactionId
     */
    public Transaction(Double balanceAfter, Integer transactionId, Integer contractId, Integer transactionTime, Integer purchaseTime, String actionType, Double amount, String longcode, String shortcode, Double payout, Integer appId) {
        super();
        this.balanceAfter = balanceAfter;
        this.transactionId = transactionId;
        this.contractId = contractId;
        this.transactionTime = transactionTime;
        this.purchaseTime = purchaseTime;
        this.actionType = actionType;
        this.amount = amount;
        this.longcode = longcode;
        this.shortcode = shortcode;
        this.payout = payout;
        this.appId = appId;
    }

    /**
     * It is the remaining balance Example: 10150.1300
     * 
     */
    public Double getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * It is the remaining balance Example: 10150.1300
     * 
     */
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * It is the transaction id. In statement every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * It is the transaction id. In statement every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * It is the contract id Example: 4867502908
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * It is the contract id Example: 4867502908
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * It is the time of transaction Example: 1441175849
     * 
     */
    public Integer getTransactionTime() {
        return transactionTime;
    }

    /**
     * It is the time of transaction Example: 1441175849
     * 
     */
    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Time at which contract was purchased, present only for sell transaction
     * 
     */
    public Integer getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Time at which contract was purchased, present only for sell transaction
     * 
     */
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * It is the type of action Example: buy
     * 
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * It is the type of action Example: buy
     * 
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * It is the amount of transaction Example: -83.2300
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * It is the amount of transaction Example: -83.2300
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * The description of contract purchased if description is set to 1
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * The description of contract purchased if description is set to 1
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Compact description of the contract purchased if description is set to 1
     * 
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Compact description of the contract purchased if description is set to 1
     * 
     */
    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    /**
     * Payout price
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Payout price
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    /**
     * Id of an app where this transaction was performed. For example, it's 1 for binary.com.
     * 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * Id of an app where this transaction was performed. For example, it's 1 for binary.com.
     * 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balanceAfter).append(transactionId).append(contractId).append(transactionTime).append(purchaseTime).append(actionType).append(amount).append(longcode).append(shortcode).append(payout).append(appId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return new EqualsBuilder().append(balanceAfter, rhs.balanceAfter).append(transactionId, rhs.transactionId).append(contractId, rhs.contractId).append(transactionTime, rhs.transactionTime).append(purchaseTime, rhs.purchaseTime).append(actionType, rhs.actionType).append(amount, rhs.amount).append(longcode, rhs.longcode).append(shortcode, rhs.shortcode).append(payout, rhs.payout).append(appId, rhs.appId).isEquals();
    }

}
