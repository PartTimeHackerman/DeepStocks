
package data.binaryAPI.commandsUnused.profit_table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Transaction implements Serializable
{

    /**
     * It is the transaction id. every contract (buy or sell) and every payment has a unique id. Example: 10867502908
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
     * It is the purchase time of transaction
     * 
     */
    @SerializedName("purchase_time")
    @Expose
    private Integer purchaseTime;
    /**
     * It is the sell time of transaction
     * 
     */
    @SerializedName("sell_time")
    @Expose
    private Integer sellTime;
    /**
     * buy price
     * 
     */
    @SerializedName("buy_price")
    @Expose
    private Double buyPrice;
    /**
     * sold price
     * 
     */
    @SerializedName("sell_price")
    @Expose
    private Double sellPrice;
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
     * App id of app where this transaction was performed. For example, it's 1 for binary.com.
     * 
     */
    @SerializedName("app_id")
    @Expose
    private Integer appId;
    private final static long serialVersionUID = 2568199319974493850L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param buyPrice
     * @param appId
     * @param contractId
     * @param longcode
     * @param payout
     * @param purchaseTime
     * @param sellPrice
     * @param shortcode
     * @param transactionId
     * @param sellTime
     */
    public Transaction(Integer transactionId, Integer contractId, Integer purchaseTime, Integer sellTime, Double buyPrice, Double sellPrice, String longcode, String shortcode, Double payout, Integer appId) {
        super();
        this.transactionId = transactionId;
        this.contractId = contractId;
        this.purchaseTime = purchaseTime;
        this.sellTime = sellTime;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.longcode = longcode;
        this.shortcode = shortcode;
        this.payout = payout;
        this.appId = appId;
    }

    /**
     * It is the transaction id. every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * It is the transaction id. every contract (buy or sell) and every payment has a unique id. Example: 10867502908
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
     * It is the purchase time of transaction
     * 
     */
    public Integer getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * It is the purchase time of transaction
     * 
     */
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * It is the sell time of transaction
     * 
     */
    public Integer getSellTime() {
        return sellTime;
    }

    /**
     * It is the sell time of transaction
     * 
     */
    public void setSellTime(Integer sellTime) {
        this.sellTime = sellTime;
    }

    /**
     * buy price
     * 
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * buy price
     * 
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * sold price
     * 
     */
    public Double getSellPrice() {
        return sellPrice;
    }

    /**
     * sold price
     * 
     */
    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
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
     * App id of app where this transaction was performed. For example, it's 1 for binary.com.
     * 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * App id of app where this transaction was performed. For example, it's 1 for binary.com.
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
        return new HashCodeBuilder().append(transactionId).append(contractId).append(purchaseTime).append(sellTime).append(buyPrice).append(sellPrice).append(longcode).append(shortcode).append(payout).append(appId).toHashCode();
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
        return new EqualsBuilder().append(transactionId, rhs.transactionId).append(contractId, rhs.contractId).append(purchaseTime, rhs.purchaseTime).append(sellTime, rhs.sellTime).append(buyPrice, rhs.buyPrice).append(sellPrice, rhs.sellPrice).append(longcode, rhs.longcode).append(shortcode, rhs.shortcode).append(payout, rhs.payout).append(appId, rhs.appId).isEquals();
    }

}
