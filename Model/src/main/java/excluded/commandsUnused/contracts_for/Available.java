
package data.binaryAPI.commandsUnused.contracts_for;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Available implements Serializable
{

    /**
     * Type of market (forex, indices, ...)
     * (Required)
     * 
     */
    @SerializedName("market")
    @Expose
    private String market;
    /**
     * Type of contract (example: asian up)
     * 
     */
    @SerializedName("contracts_display")
    @Expose
    private String contractsDisplay;
    /**
     * Maximum contract duration (example: 10)
     * (Required)
     * 
     */
    @SerializedName("max_contract_duration")
    @Expose
    private String maxContractDuration;
    /**
     * Category of barrier (example: asian)
     * (Required)
     * 
     */
    @SerializedName("barrier_category")
    @Expose
    private String barrierCategory;
    /**
     * Maximum payout (example: 10000)
     * 
     */
    @SerializedName("payout_limit")
    @Expose
    private Double payoutLimit;
    /**
     * Type of submarket (example: major_pairs)
     * (Required)
     * 
     */
    @SerializedName("submarket")
    @Expose
    private String submarket;
    /**
     * Name of exchange (example: EURONEXT)
     * (Required)
     * 
     */
    @SerializedName("exchange_name")
    @Expose
    private String exchangeName;
    /**
     * Category of the contract (example: Asians)
     * (Required)
     * 
     */
    @SerializedName("contract_category_display")
    @Expose
    private String contractCategoryDisplay;
    /**
     * Type of contract (example: ASIANU)
     * (Required)
     * 
     */
    @SerializedName("contract_type")
    @Expose
    private String contractType;
    /**
     * Minimum contract duration (example: 5)
     * (Required)
     * 
     */
    @SerializedName("min_contract_duration")
    @Expose
    private String minContractDuration;
    /**
     * Type of sentiment (example: up)
     * (Required)
     * 
     */
    @SerializedName("sentiment")
    @Expose
    private String sentiment;
    /**
     * Barriers (example: 0)
     * (Required)
     * 
     */
    @SerializedName("barriers")
    @Expose
    private Double barriers;
    /**
     * Category of contract (example: asian)
     * (Required)
     * 
     */
    @SerializedName("contract_category")
    @Expose
    private String contractCategory;
    /**
     * Start Type (example: spot)
     * (Required)
     * 
     */
    @SerializedName("start_type")
    @Expose
    private String startType;
    /**
     * Expiry Type (example: tick)
     * (Required)
     * 
     */
    @SerializedName("expiry_type")
    @Expose
    private String expiryType;
    /**
     * Symbol code (example: R_50)
     * (Required)
     * 
     */
    @SerializedName("underlying_symbol")
    @Expose
    private String underlyingSymbol;
    /**
     * Array of returned forward starting options
     * 
     */
    @SerializedName("forward_starting_options")
    @Expose
    private List<ForwardStartingOption> forwardStartingOptions = new ArrayList<ForwardStartingOption>();
    /**
     * Array of available barriers for a predefined trading period (only return if region set to 'japan')
     * 
     */
    @SerializedName("available_barriers")
    @Expose
    private List<Object> availableBarriers = new ArrayList<Object>();
    /**
     * Array of barriers already expired (only return if region set to 'japan')
     * 
     */
    @SerializedName("expired_barriers")
    @Expose
    private List<Object> expiredBarriers = new ArrayList<Object>();
    /**
     * A hash of predefined trading period (only return if region set to 'japan')
     * 
     */
    @SerializedName("trading_period")
    @Expose
    private TradingPeriod tradingPeriod;
    private final static long serialVersionUID = 5801173887020844739L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Available() {
    }

    /**
     * 
     * @param sentiment
     * @param contractType
     * @param contractCategoryDisplay
     * @param contractsDisplay
     * @param startType
     * @param submarket
     * @param expiredBarriers
     * @param tradingPeriod
     * @param barrierCategory
     * @param market
     * @param contractCategory
     * @param maxContractDuration
     * @param barriers
     * @param underlyingSymbol
     * @param forwardStartingOptions
     * @param expiryType
     * @param availableBarriers
     * @param exchangeName
     * @param payoutLimit
     * @param minContractDuration
     */
    public Available(String market, String contractsDisplay, String maxContractDuration, String barrierCategory, Double payoutLimit, String submarket, String exchangeName, String contractCategoryDisplay, String contractType, String minContractDuration, String sentiment, Double barriers, String contractCategory, String startType, String expiryType, String underlyingSymbol, List<ForwardStartingOption> forwardStartingOptions, List<Object> availableBarriers, List<Object> expiredBarriers, TradingPeriod tradingPeriod) {
        super();
        this.market = market;
        this.contractsDisplay = contractsDisplay;
        this.maxContractDuration = maxContractDuration;
        this.barrierCategory = barrierCategory;
        this.payoutLimit = payoutLimit;
        this.submarket = submarket;
        this.exchangeName = exchangeName;
        this.contractCategoryDisplay = contractCategoryDisplay;
        this.contractType = contractType;
        this.minContractDuration = minContractDuration;
        this.sentiment = sentiment;
        this.barriers = barriers;
        this.contractCategory = contractCategory;
        this.startType = startType;
        this.expiryType = expiryType;
        this.underlyingSymbol = underlyingSymbol;
        this.forwardStartingOptions = forwardStartingOptions;
        this.availableBarriers = availableBarriers;
        this.expiredBarriers = expiredBarriers;
        this.tradingPeriod = tradingPeriod;
    }

    /**
     * Type of market (forex, indices, ...)
     * (Required)
     * 
     */
    public String getMarket() {
        return market;
    }

    /**
     * Type of market (forex, indices, ...)
     * (Required)
     * 
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * Type of contract (example: asian up)
     * 
     */
    public String getContractsDisplay() {
        return contractsDisplay;
    }

    /**
     * Type of contract (example: asian up)
     * 
     */
    public void setContractsDisplay(String contractsDisplay) {
        this.contractsDisplay = contractsDisplay;
    }

    /**
     * Maximum contract duration (example: 10)
     * (Required)
     * 
     */
    public String getMaxContractDuration() {
        return maxContractDuration;
    }

    /**
     * Maximum contract duration (example: 10)
     * (Required)
     * 
     */
    public void setMaxContractDuration(String maxContractDuration) {
        this.maxContractDuration = maxContractDuration;
    }

    /**
     * Category of barrier (example: asian)
     * (Required)
     * 
     */
    public String getBarrierCategory() {
        return barrierCategory;
    }

    /**
     * Category of barrier (example: asian)
     * (Required)
     * 
     */
    public void setBarrierCategory(String barrierCategory) {
        this.barrierCategory = barrierCategory;
    }

    /**
     * Maximum payout (example: 10000)
     * 
     */
    public Double getPayoutLimit() {
        return payoutLimit;
    }

    /**
     * Maximum payout (example: 10000)
     * 
     */
    public void setPayoutLimit(Double payoutLimit) {
        this.payoutLimit = payoutLimit;
    }

    /**
     * Type of submarket (example: major_pairs)
     * (Required)
     * 
     */
    public String getSubmarket() {
        return submarket;
    }

    /**
     * Type of submarket (example: major_pairs)
     * (Required)
     * 
     */
    public void setSubmarket(String submarket) {
        this.submarket = submarket;
    }

    /**
     * Name of exchange (example: EURONEXT)
     * (Required)
     * 
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * Name of exchange (example: EURONEXT)
     * (Required)
     * 
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    /**
     * Category of the contract (example: Asians)
     * (Required)
     * 
     */
    public String getContractCategoryDisplay() {
        return contractCategoryDisplay;
    }

    /**
     * Category of the contract (example: Asians)
     * (Required)
     * 
     */
    public void setContractCategoryDisplay(String contractCategoryDisplay) {
        this.contractCategoryDisplay = contractCategoryDisplay;
    }

    /**
     * Type of contract (example: ASIANU)
     * (Required)
     * 
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Type of contract (example: ASIANU)
     * (Required)
     * 
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * Minimum contract duration (example: 5)
     * (Required)
     * 
     */
    public String getMinContractDuration() {
        return minContractDuration;
    }

    /**
     * Minimum contract duration (example: 5)
     * (Required)
     * 
     */
    public void setMinContractDuration(String minContractDuration) {
        this.minContractDuration = minContractDuration;
    }

    /**
     * Type of sentiment (example: up)
     * (Required)
     * 
     */
    public String getSentiment() {
        return sentiment;
    }

    /**
     * Type of sentiment (example: up)
     * (Required)
     * 
     */
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * Barriers (example: 0)
     * (Required)
     * 
     */
    public Double getBarriers() {
        return barriers;
    }

    /**
     * Barriers (example: 0)
     * (Required)
     * 
     */
    public void setBarriers(Double barriers) {
        this.barriers = barriers;
    }

    /**
     * Category of contract (example: asian)
     * (Required)
     * 
     */
    public String getContractCategory() {
        return contractCategory;
    }

    /**
     * Category of contract (example: asian)
     * (Required)
     * 
     */
    public void setContractCategory(String contractCategory) {
        this.contractCategory = contractCategory;
    }

    /**
     * Start Type (example: spot)
     * (Required)
     * 
     */
    public String getStartType() {
        return startType;
    }

    /**
     * Start Type (example: spot)
     * (Required)
     * 
     */
    public void setStartType(String startType) {
        this.startType = startType;
    }

    /**
     * Expiry Type (example: tick)
     * (Required)
     * 
     */
    public String getExpiryType() {
        return expiryType;
    }

    /**
     * Expiry Type (example: tick)
     * (Required)
     * 
     */
    public void setExpiryType(String expiryType) {
        this.expiryType = expiryType;
    }

    /**
     * Symbol code (example: R_50)
     * (Required)
     * 
     */
    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Symbol code (example: R_50)
     * (Required)
     * 
     */
    public void setUnderlyingSymbol(String underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    /**
     * Array of returned forward starting options
     * 
     */
    public List<ForwardStartingOption> getForwardStartingOptions() {
        return forwardStartingOptions;
    }

    /**
     * Array of returned forward starting options
     * 
     */
    public void setForwardStartingOptions(List<ForwardStartingOption> forwardStartingOptions) {
        this.forwardStartingOptions = forwardStartingOptions;
    }

    /**
     * Array of available barriers for a predefined trading period (only return if region set to 'japan')
     * 
     */
    public List<Object> getAvailableBarriers() {
        return availableBarriers;
    }

    /**
     * Array of available barriers for a predefined trading period (only return if region set to 'japan')
     * 
     */
    public void setAvailableBarriers(List<Object> availableBarriers) {
        this.availableBarriers = availableBarriers;
    }

    /**
     * Array of barriers already expired (only return if region set to 'japan')
     * 
     */
    public List<Object> getExpiredBarriers() {
        return expiredBarriers;
    }

    /**
     * Array of barriers already expired (only return if region set to 'japan')
     * 
     */
    public void setExpiredBarriers(List<Object> expiredBarriers) {
        this.expiredBarriers = expiredBarriers;
    }

    /**
     * A hash of predefined trading period (only return if region set to 'japan')
     * 
     */
    public TradingPeriod getTradingPeriod() {
        return tradingPeriod;
    }

    /**
     * A hash of predefined trading period (only return if region set to 'japan')
     * 
     */
    public void setTradingPeriod(TradingPeriod tradingPeriod) {
        this.tradingPeriod = tradingPeriod;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(contractsDisplay).append(maxContractDuration).append(barrierCategory).append(payoutLimit).append(submarket).append(exchangeName).append(contractCategoryDisplay).append(contractType).append(minContractDuration).append(sentiment).append(barriers).append(contractCategory).append(startType).append(expiryType).append(underlyingSymbol).append(forwardStartingOptions).append(availableBarriers).append(expiredBarriers).append(tradingPeriod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Available) == false) {
            return false;
        }
        Available rhs = ((Available) other);
        return new EqualsBuilder().append(market, rhs.market).append(contractsDisplay, rhs.contractsDisplay).append(maxContractDuration, rhs.maxContractDuration).append(barrierCategory, rhs.barrierCategory).append(payoutLimit, rhs.payoutLimit).append(submarket, rhs.submarket).append(exchangeName, rhs.exchangeName).append(contractCategoryDisplay, rhs.contractCategoryDisplay).append(contractType, rhs.contractType).append(minContractDuration, rhs.minContractDuration).append(sentiment, rhs.sentiment).append(barriers, rhs.barriers).append(contractCategory, rhs.contractCategory).append(startType, rhs.startType).append(expiryType, rhs.expiryType).append(underlyingSymbol, rhs.underlyingSymbol).append(forwardStartingOptions, rhs.forwardStartingOptions).append(availableBarriers, rhs.availableBarriers).append(expiredBarriers, rhs.expiredBarriers).append(tradingPeriod, rhs.tradingPeriod).isEquals();
    }

}
