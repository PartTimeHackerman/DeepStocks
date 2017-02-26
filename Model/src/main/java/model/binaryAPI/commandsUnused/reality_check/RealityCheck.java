
package data.binaryAPI.commandsUnused.reality_check;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Reality check summary
 * <p>
 * Reality check summary of trades.
 * 
 */
public class RealityCheck implements Serializable
{

    /**
     * Reality check summary start time epoch
     * 
     */
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    /**
     * Client loginid Example: CR000000
     * 
     */
    @SerializedName("loginid")
    @Expose
    private String loginid;
    /**
     * Currency of client account i.e currency for trading
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Total count of contract purchased.
     * 
     */
    @SerializedName("buy_count")
    @Expose
    private Integer buyCount;
    /**
     * Total amount of contract purchased.
     * 
     */
    @SerializedName("buy_amount")
    @Expose
    private Double buyAmount;
    /**
     * Total count of contract sold.
     * 
     */
    @SerializedName("sell_count")
    @Expose
    private Integer sellCount;
    /**
     * Total amount of contracts sold.
     * 
     */
    @SerializedName("sell_amount")
    @Expose
    private Double sellAmount;
    /**
     * Indicative profit of contract as per current market price.
     * 
     */
    @SerializedName("potential_profit")
    @Expose
    private Double potentialProfit;
    /**
     * Total count of contracts that are not yet expired.
     * 
     */
    @SerializedName("open_contract_count")
    @Expose
    private Integer openContractCount;
    private final static long serialVersionUID = 8610419597408946399L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RealityCheck() {
    }

    /**
     * 
     * @param buyCount
     * @param loginid
     * @param buyAmount
     * @param sellAmount
     * @param sellCount
     * @param startTime
     * @param currency
     * @param openContractCount
     * @param potentialProfit
     */
    public RealityCheck(Integer startTime, String loginid, String currency, Integer buyCount, Double buyAmount, Integer sellCount, Double sellAmount, Double potentialProfit, Integer openContractCount) {
        super();
        this.startTime = startTime;
        this.loginid = loginid;
        this.currency = currency;
        this.buyCount = buyCount;
        this.buyAmount = buyAmount;
        this.sellCount = sellCount;
        this.sellAmount = sellAmount;
        this.potentialProfit = potentialProfit;
        this.openContractCount = openContractCount;
    }

    /**
     * Reality check summary start time epoch
     * 
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * Reality check summary start time epoch
     * 
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Client loginid Example: CR000000
     * 
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * Client loginid Example: CR000000
     * 
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    /**
     * Currency of client account i.e currency for trading
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency of client account i.e currency for trading
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Total count of contract purchased.
     * 
     */
    public Integer getBuyCount() {
        return buyCount;
    }

    /**
     * Total count of contract purchased.
     * 
     */
    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    /**
     * Total amount of contract purchased.
     * 
     */
    public Double getBuyAmount() {
        return buyAmount;
    }

    /**
     * Total amount of contract purchased.
     * 
     */
    public void setBuyAmount(Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    /**
     * Total count of contract sold.
     * 
     */
    public Integer getSellCount() {
        return sellCount;
    }

    /**
     * Total count of contract sold.
     * 
     */
    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    /**
     * Total amount of contracts sold.
     * 
     */
    public Double getSellAmount() {
        return sellAmount;
    }

    /**
     * Total amount of contracts sold.
     * 
     */
    public void setSellAmount(Double sellAmount) {
        this.sellAmount = sellAmount;
    }

    /**
     * Indicative profit of contract as per current market price.
     * 
     */
    public Double getPotentialProfit() {
        return potentialProfit;
    }

    /**
     * Indicative profit of contract as per current market price.
     * 
     */
    public void setPotentialProfit(Double potentialProfit) {
        this.potentialProfit = potentialProfit;
    }

    /**
     * Total count of contracts that are not yet expired.
     * 
     */
    public Integer getOpenContractCount() {
        return openContractCount;
    }

    /**
     * Total count of contracts that are not yet expired.
     * 
     */
    public void setOpenContractCount(Integer openContractCount) {
        this.openContractCount = openContractCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startTime).append(loginid).append(currency).append(buyCount).append(buyAmount).append(sellCount).append(sellAmount).append(potentialProfit).append(openContractCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RealityCheck) == false) {
            return false;
        }
        RealityCheck rhs = ((RealityCheck) other);
        return new EqualsBuilder().append(startTime, rhs.startTime).append(loginid, rhs.loginid).append(currency, rhs.currency).append(buyCount, rhs.buyCount).append(buyAmount, rhs.buyAmount).append(sellCount, rhs.sellCount).append(sellAmount, rhs.sellAmount).append(potentialProfit, rhs.potentialProfit).append(openContractCount, rhs.openContractCount).isEquals();
    }

}
