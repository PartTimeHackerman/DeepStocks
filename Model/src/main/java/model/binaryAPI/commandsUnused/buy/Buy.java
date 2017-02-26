
package data.binaryAPI.commandsUnused.buy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Receipt confirmation
 * <p>
 * Receipt confirmation for the purchase
 * 
 */
public class Buy implements Serializable
{

    /**
     * The new account balance after completion of the purchase
     * (Required)
     * 
     */
    @SerializedName("balance_after")
    @Expose
    private Double balanceAfter;
    /**
     * The description of contract purchased
     * (Required)
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Compact description of the contract purchased
     * (Required)
     * 
     */
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    /**
     * Epoch value showing the expected start time of the contract
     * (Required)
     * 
     */
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    /**
     * Internal contract identifier
     * (Required)
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * Actual effected purchase price
     * (Required)
     * 
     */
    @SerializedName("buy_price")
    @Expose
    private Double buyPrice;
    /**
     * Epoch value of the transaction purchase time
     * (Required)
     * 
     */
    @SerializedName("purchase_time")
    @Expose
    private Integer purchaseTime;
    /**
     * Internal transaction identifier
     * (Required)
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    /**
     * [For spread contracts only] Amount per point
     * 
     */
    @SerializedName("amount_per_point")
    @Expose
    private Double amountPerPoint;
    /**
     * [For spread contracts only] Stop profit level (spot plus/minus stop profit amount)
     * 
     */
    @SerializedName("stop_profit_level")
    @Expose
    private Double stopProfitLevel;
    /**
     * [For spread contracts only] Stop loss level (spot plus/minus stop loss amount)
     * 
     */
    @SerializedName("stop_loss_level")
    @Expose
    private Double stopLossLevel;
    /**
     * Proposed payout value
     * (Required)
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    private final static long serialVersionUID = -4822675063459520302L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Buy() {
    }

    /**
     * 
     * @param buyPrice
     * @param longcode
     * @param contractId
     * @param payout
     * @param stopProfitLevel
     * @param balanceAfter
     * @param startTime
     * @param purchaseTime
     * @param shortcode
     * @param amountPerPoint
     * @param transactionId
     * @param stopLossLevel
     */
    public Buy(Double balanceAfter, String longcode, String shortcode, Integer startTime, Integer contractId, Double buyPrice, Integer purchaseTime, Integer transactionId, Double amountPerPoint, Double stopProfitLevel, Double stopLossLevel, Double payout) {
        super();
        this.balanceAfter = balanceAfter;
        this.longcode = longcode;
        this.shortcode = shortcode;
        this.startTime = startTime;
        this.contractId = contractId;
        this.buyPrice = buyPrice;
        this.purchaseTime = purchaseTime;
        this.transactionId = transactionId;
        this.amountPerPoint = amountPerPoint;
        this.stopProfitLevel = stopProfitLevel;
        this.stopLossLevel = stopLossLevel;
        this.payout = payout;
    }

    /**
     * The new account balance after completion of the purchase
     * (Required)
     * 
     */
    public Double getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * The new account balance after completion of the purchase
     * (Required)
     * 
     */
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * The description of contract purchased
     * (Required)
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * The description of contract purchased
     * (Required)
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Compact description of the contract purchased
     * (Required)
     * 
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Compact description of the contract purchased
     * (Required)
     * 
     */
    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    /**
     * Epoch value showing the expected start time of the contract
     * (Required)
     * 
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * Epoch value showing the expected start time of the contract
     * (Required)
     * 
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Internal contract identifier
     * (Required)
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Internal contract identifier
     * (Required)
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * Actual effected purchase price
     * (Required)
     * 
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * Actual effected purchase price
     * (Required)
     * 
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * Epoch value of the transaction purchase time
     * (Required)
     * 
     */
    public Integer getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Epoch value of the transaction purchase time
     * (Required)
     * 
     */
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * Internal transaction identifier
     * (Required)
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Internal transaction identifier
     * (Required)
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * [For spread contracts only] Amount per point
     * 
     */
    public Double getAmountPerPoint() {
        return amountPerPoint;
    }

    /**
     * [For spread contracts only] Amount per point
     * 
     */
    public void setAmountPerPoint(Double amountPerPoint) {
        this.amountPerPoint = amountPerPoint;
    }

    /**
     * [For spread contracts only] Stop profit level (spot plus/minus stop profit amount)
     * 
     */
    public Double getStopProfitLevel() {
        return stopProfitLevel;
    }

    /**
     * [For spread contracts only] Stop profit level (spot plus/minus stop profit amount)
     * 
     */
    public void setStopProfitLevel(Double stopProfitLevel) {
        this.stopProfitLevel = stopProfitLevel;
    }

    /**
     * [For spread contracts only] Stop loss level (spot plus/minus stop loss amount)
     * 
     */
    public Double getStopLossLevel() {
        return stopLossLevel;
    }

    /**
     * [For spread contracts only] Stop loss level (spot plus/minus stop loss amount)
     * 
     */
    public void setStopLossLevel(Double stopLossLevel) {
        this.stopLossLevel = stopLossLevel;
    }

    /**
     * Proposed payout value
     * (Required)
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Proposed payout value
     * (Required)
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(balanceAfter).append(longcode).append(shortcode).append(startTime).append(contractId).append(buyPrice).append(purchaseTime).append(transactionId).append(amountPerPoint).append(stopProfitLevel).append(stopLossLevel).append(payout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Buy) == false) {
            return false;
        }
        Buy rhs = ((Buy) other);
        return new EqualsBuilder().append(balanceAfter, rhs.balanceAfter).append(longcode, rhs.longcode).append(shortcode, rhs.shortcode).append(startTime, rhs.startTime).append(contractId, rhs.contractId).append(buyPrice, rhs.buyPrice).append(purchaseTime, rhs.purchaseTime).append(transactionId, rhs.transactionId).append(amountPerPoint, rhs.amountPerPoint).append(stopProfitLevel, rhs.stopProfitLevel).append(stopLossLevel, rhs.stopLossLevel).append(payout, rhs.payout).isEquals();
    }

}
