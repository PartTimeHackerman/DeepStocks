
package data.binaryAPI.commandsUnused.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Latest update to transaction
 * <p>
 * Realtime stream of user transaction updates.
 * 
 */
public class Transaction implements Serializable
{

    /**
     * Balance amount
     * 
     */
    @SerializedName("balance")
    @Expose
    private Double balance;
    @SerializedName("action")
    @Expose
    private Transaction.Action action;
    /**
     * It is the contract id Example: 4867502908
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * It is the transaction id. Every contract (buy or sell) or payment has a unique id. Example: 10867502908
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    /**
     * It is the amount of transaction performed Example: -83.2300
     * 
     */
    @SerializedName("amount")
    @Expose
    private Double amount;
    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Time at which transaction was performed, for buy its purchase time, for sell its sell time
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
     * Transaction currency
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Description of contract purchased
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Symbol code
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Display name of symbol
     * 
     */
    @SerializedName("display_name")
    @Expose
    private String displayName;
    /**
     * Epoch value of the expiry time of the contract. Please note that in case of buy transaction this is approximate value not exact one.
     * 
     */
    @SerializedName("date_expiry")
    @Expose
    private Integer dateExpiry;
    private final static long serialVersionUID = -8699581889920797268L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param symbol
     * @param amount
     * @param displayName
     * @param longcode
     * @param dateExpiry
     * @param transactionTime
     * @param transactionId
     * @param balance
     * @param contractId
     * @param action
     * @param purchaseTime
     * @param currency
     * @param id
     */
    public Transaction(Double balance, Transaction.Action action, Integer contractId, Integer transactionId, Double amount, String id, Integer transactionTime, Integer purchaseTime, String currency, String longcode, String symbol, String displayName, Integer dateExpiry) {
        super();
        this.balance = balance;
        this.action = action;
        this.contractId = contractId;
        this.transactionId = transactionId;
        this.amount = amount;
        this.id = id;
        this.transactionTime = transactionTime;
        this.purchaseTime = purchaseTime;
        this.currency = currency;
        this.longcode = longcode;
        this.symbol = symbol;
        this.displayName = displayName;
        this.dateExpiry = dateExpiry;
    }

    /**
     * Balance amount
     * 
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance amount
     * 
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Transaction.Action getAction() {
        return action;
    }

    public void setAction(Transaction.Action action) {
        this.action = action;
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
     * It is the transaction id. Every contract (buy or sell) or payment has a unique id. Example: 10867502908
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * It is the transaction id. Every contract (buy or sell) or payment has a unique id. Example: 10867502908
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * It is the amount of transaction performed Example: -83.2300
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * It is the amount of transaction performed Example: -83.2300
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Time at which transaction was performed, for buy its purchase time, for sell its sell time
     * 
     */
    public Integer getTransactionTime() {
        return transactionTime;
    }

    /**
     * Time at which transaction was performed, for buy its purchase time, for sell its sell time
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
     * Transaction currency
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Transaction currency
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Description of contract purchased
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * Description of contract purchased
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Symbol code
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Symbol code
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Display name of symbol
     * 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name of symbol
     * 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Epoch value of the expiry time of the contract. Please note that in case of buy transaction this is approximate value not exact one.
     * 
     */
    public Integer getDateExpiry() {
        return dateExpiry;
    }

    /**
     * Epoch value of the expiry time of the contract. Please note that in case of buy transaction this is approximate value not exact one.
     * 
     */
    public void setDateExpiry(Integer dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balance).append(action).append(contractId).append(transactionId).append(amount).append(id).append(transactionTime).append(purchaseTime).append(currency).append(longcode).append(symbol).append(displayName).append(dateExpiry).toHashCode();
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
        return new EqualsBuilder().append(balance, rhs.balance).append(action, rhs.action).append(contractId, rhs.contractId).append(transactionId, rhs.transactionId).append(amount, rhs.amount).append(id, rhs.id).append(transactionTime, rhs.transactionTime).append(purchaseTime, rhs.purchaseTime).append(currency, rhs.currency).append(longcode, rhs.longcode).append(symbol, rhs.symbol).append(displayName, rhs.displayName).append(dateExpiry, rhs.dateExpiry).isEquals();
    }

    public enum Action {

        @SerializedName("deposit")
        DEPOSIT("deposit"),
        @SerializedName("withdrawal")
        WITHDRAWAL("withdrawal"),
        @SerializedName("buy")
        BUY("buy"),
        @SerializedName("sell")
        SELL("sell");
        private final String value;
        private final static Map<String, Transaction.Action> CONSTANTS = new HashMap<String, Transaction.Action>();

        static {
            for (Transaction.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Action(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Transaction.Action fromValue(String value) {
            Transaction.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
