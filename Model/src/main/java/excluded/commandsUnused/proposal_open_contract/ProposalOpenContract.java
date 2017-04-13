
package data.binaryAPI.commandsUnused.proposal_open_contract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Open contract response
 * <p>
 * Latest price and other details for an open contract
 * 
 */
public class ProposalOpenContract implements Serializable
{

    /**
     * High barrier of the contract (if any). Example: 42.123
     * 
     */
    @SerializedName("high_barrier")
    @Expose
    private Double highBarrier;
    /**
     * Low barrier of the contract (if any). Example: 40.132
     * 
     */
    @SerializedName("low_barrier")
    @Expose
    private Double lowBarrier;
    /**
     * Barrier of the contract (if any). Example: 42.123
     * 
     */
    @SerializedName("barrier")
    @Expose
    private Double barrier;
    /**
     * Original high barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    @SerializedName("original_high_barrier")
    @Expose
    private Double originalHighBarrier;
    /**
     * Original low barrier of the contract (if any corporate action). Example: 80.262
     * 
     */
    @SerializedName("original_low_barrier")
    @Expose
    private Double originalLowBarrier;
    /**
     * Original barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    @SerializedName("original_barrier")
    @Expose
    private Double originalBarrier;
    /**
     * The number of barriers a contract has. Example: 2
     * 
     */
    @SerializedName("barrier_count")
    @Expose
    private Double barrierCount;
    /**
     * Price at which the contract could be sold back to Binary.com. Example: 5.14
     * 
     */
    @SerializedName("bid_price")
    @Expose
    private Double bidPrice;
    /**
     * Binary.com internal contract identifier
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * Contract type, for example CALL, PUT
     * 
     */
    @SerializedName("contract_type")
    @Expose
    private String contractType;
    /**
     * Example: USD
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Spot value if we have license to stream this symbol. Example: 9874.52
     * 
     */
    @SerializedName("current_spot")
    @Expose
    private Double currentSpot;
    /**
     * Example: 1439999052
     * 
     */
    @SerializedName("current_spot_time")
    @Expose
    private Integer currentSpotTime;
    /**
     * Example: 9874.52
     * 
     */
    @SerializedName("entry_spot")
    @Expose
    private Double entrySpot;
    /**
     * Expiry date (epoch) of the Contract. Example: 1446629000. Please note that it is not applicable for spreads and tick trade contracts.
     * 
     */
    @SerializedName("date_expiry")
    @Expose
    private Integer dateExpiry;
    /**
     * Settlement date (epoch) of the contract. Example: 1446629000
     * 
     */
    @SerializedName("date_settlement")
    @Expose
    private Integer dateSettlement;
    /**
     * Start date (epoch) of the contract. Example: 1446629000
     * 
     */
    @SerializedName("date_start")
    @Expose
    private Integer dateStart;
    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Whether the contract has an applicable corporate actions or not. Boolean value 1 or 0
     * 
     */
    @SerializedName("has_corporate_actions")
    @Expose
    private Integer hasCorporateActions;
    /**
     * Whether the contract is expired or not. Boolean value 1 or 0
     * 
     */
    @SerializedName("is_expired")
    @Expose
    private Integer isExpired;
    /**
     * Whether the contract is settleable or not. Boolean value 1 or 0
     * 
     */
    @SerializedName("is_settleable")
    @Expose
    private Integer isSettleable;
    /**
     * Whether the contract is forward-starting or not. Boolean value 1 or 0
     * 
     */
    @SerializedName("is_forward_starting")
    @Expose
    private Integer isForwardStarting;
    /**
     * Whether the contract is an intraday contract. Boolean value 1 or 0
     * 
     */
    @SerializedName("is_intraday")
    @Expose
    private Integer isIntraday;
    /**
     * Whether the contract expiry price will depend on the path of the market (e.g. One Touch contract). Boolean value 1 or 0
     * 
     */
    @SerializedName("is_path_dependent")
    @Expose
    private Integer isPathDependent;
    /**
     * Whether the contract can be sold back to Binary.com. Boolean value 1 or 0
     * 
     */
    @SerializedName("is_valid_to_sell")
    @Expose
    private Integer isValidToSell;
    /**
     * Text description of the contract purchased, Example: Win payout if Volatility 100 Index is strictly higher than entry spot at 10 minutes after contract start time.
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Payout value of the contract. Example: 10.50
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    /**
     * Coded description of the contract purchased, Example: CALL_R_100_90_1446704187_1446704787_S0P_0
     * 
     */
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * 
     */
    @SerializedName("display_value")
    @Expose
    private Double displayValue;
    /**
     * Example: BSESENSEX30
     * 
     */
    @SerializedName("underlying")
    @Expose
    private String underlying;
    /**
     * Display name of underlying
     * 
     */
    @SerializedName("display_name")
    @Expose
    private String displayName;
    /**
     * This is the entry spot of the contract. For contracts starting immediately it is the next tick after the start time. For forward-starting contracts it is the spot at the start time. Example: 86.630.
     * 
     */
    @SerializedName("entry_tick")
    @Expose
    private Double entryTick;
    /**
     * This is the epoch time of the entry tick. Example: 1446629000
     * 
     */
    @SerializedName("entry_tick_time")
    @Expose
    private Integer entryTickTime;
    /**
     * This is the latest spot value at the end time of the contract. Example: 86.810
     * 
     */
    @SerializedName("exit_tick")
    @Expose
    private Double exitTick;
    /**
     * This is the epoch time of the exit tick. Note that since certain instruments don't tick every second, the exit tick time may be a few seconds before the end time. Example: 1446629000
     * 
     */
    @SerializedName("exit_tick_time")
    @Expose
    private Integer exitTickTime;
    /**
     * Only for tick trades, number of ticks
     * 
     */
    @SerializedName("tick_count")
    @Expose
    private Integer tickCount;
    /**
     * Error message if validation fails
     * 
     */
    @SerializedName("validation_error")
    @Expose
    private String validationError;
    /**
     * Price at which contract was sold, only available when contract has been sold.
     * 
     */
    @SerializedName("sell_price")
    @Expose
    private Double sellPrice;
    /**
     * Price at which contract was purchased
     * 
     */
    @SerializedName("buy_price")
    @Expose
    private Double buyPrice;
    /**
     * Epoch of purchase time, will be same as date_start for all contracts except forward starting contracts.
     * 
     */
    @SerializedName("purchase_time")
    @Expose
    private Integer purchaseTime;
    /**
     * Epoch time of when the contract was sold (only present for contracts already sold)
     * 
     */
    @SerializedName("sell_time")
    @Expose
    private Integer sellTime;
    /**
     * Latest spot value at the sell time. Example: 86.630 (only present for contracts already sold)
     * 
     */
    @SerializedName("sell_spot")
    @Expose
    private Double sellSpot;
    /**
     * Epoch time of the sell spot. Note that since certain underlyings don't tick every second, the sell spot time may be a few seconds before the sell time. Example: 1446629000 (only present for contracts already sold)
     * 
     */
    @SerializedName("sell_spot_time")
    @Expose
    private Integer sellSpotTime;
    /**
     * The value (points) at which this contract was opened. Only applicable for spreads.
     * 
     */
    @SerializedName("entry_level")
    @Expose
    private Double entryLevel;
    /**
     * The dollar profit/loss per point of movement of the current value. Only applicable for spreads.
     * 
     */
    @SerializedName("amount_per_point")
    @Expose
    private String amountPerPoint;
    /**
     * If the current level touches the stop loss level, then the contract will automatically be closed at the stop loss level. Only applicable for spreads.
     * 
     */
    @SerializedName("stop_loss_level")
    @Expose
    private Double stopLossLevel;
    /**
     * If the current level touches the stop profit level, then the contract will automatically be closed at the stop profit level. Only applicable for spreads.
     * 
     */
    @SerializedName("stop_profit_level")
    @Expose
    private Double stopProfitLevel;
    /**
     * Current value of the underlying. Only applicable for spreads.
     * 
     */
    @SerializedName("current_level")
    @Expose
    private Double currentLevel;
    /**
     * The contract was closed at this level. Only applicable for spreads
     * 
     */
    @SerializedName("exit_level")
    @Expose
    private Double exitLevel;
    /**
     * Current profit/loss in dollars. Only applicable for spreads.
     * 
     */
    @SerializedName("current_value_in_dollar")
    @Expose
    private Double currentValueInDollar;
    /**
     * Current profit or loss in points. Only applicable for spreads.
     * 
     */
    @SerializedName("current_value_in_point")
    @Expose
    private Double currentValueInPoint;
    /**
     * Transaction ids for contract
     * <p>
     * Every contract has buy and sell transaction ids, i.e. when you purchase a contract we associate it with buy transaction id, and if contract is already sold we associate that with sell transaction id.
     * 
     */
    @SerializedName("transaction_ids")
    @Expose
    private TransactionIds transactionIds;
    private final static long serialVersionUID = 8090132531808572595L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalOpenContract() {
    }

    /**
     * 
     * @param contractType
     * @param dateExpiry
     * @param longcode
     * @param payout
     * @param isValidToSell
     * @param sellPrice
     * @param barrier
     * @param tickCount
     * @param sellSpot
     * @param id
     * @param entryTickTime
     * @param stopLossLevel
     * @param currentValueInPoint
     * @param exitTick
     * @param isSettleable
     * @param hasCorporateActions
     * @param underlying
     * @param isForwardStarting
     * @param amountPerPoint
     * @param bidPrice
     * @param isIntraday
     * @param currentSpotTime
     * @param transactionIds
     * @param entryTick
     * @param originalHighBarrier
     * @param displayName
     * @param shortcode
     * @param dateSettlement
     * @param exitLevel
     * @param currentSpot
     * @param dateStart
     * @param stopProfitLevel
     * @param currency
     * @param highBarrier
     * @param sellTime
     * @param originalLowBarrier
     * @param buyPrice
     * @param originalBarrier
     * @param currentValueInDollar
     * @param barrierCount
     * @param validationError
     * @param displayValue
     * @param exitTickTime
     * @param currentLevel
     * @param lowBarrier
     * @param sellSpotTime
     * @param contractId
     * @param entrySpot
     * @param purchaseTime
     * @param entryLevel
     * @param isExpired
     * @param isPathDependent
     */
    public ProposalOpenContract(Double highBarrier, Double lowBarrier, Double barrier, Double originalHighBarrier, Double originalLowBarrier, Double originalBarrier, Double barrierCount, Double bidPrice, Integer contractId, String contractType, String currency, Double currentSpot, Integer currentSpotTime, Double entrySpot, Integer dateExpiry, Integer dateSettlement, Integer dateStart, String id, Integer hasCorporateActions, Integer isExpired, Integer isSettleable, Integer isForwardStarting, Integer isIntraday, Integer isPathDependent, Integer isValidToSell, String longcode, Double payout, String shortcode, Double displayValue, String underlying, String displayName, Double entryTick, Integer entryTickTime, Double exitTick, Integer exitTickTime, Integer tickCount, String validationError, Double sellPrice, Double buyPrice, Integer purchaseTime, Integer sellTime, Double sellSpot, Integer sellSpotTime, Double entryLevel, String amountPerPoint, Double stopLossLevel, Double stopProfitLevel, Double currentLevel, Double exitLevel, Double currentValueInDollar, Double currentValueInPoint, TransactionIds transactionIds) {
        super();
        this.highBarrier = highBarrier;
        this.lowBarrier = lowBarrier;
        this.barrier = barrier;
        this.originalHighBarrier = originalHighBarrier;
        this.originalLowBarrier = originalLowBarrier;
        this.originalBarrier = originalBarrier;
        this.barrierCount = barrierCount;
        this.bidPrice = bidPrice;
        this.contractId = contractId;
        this.contractType = contractType;
        this.currency = currency;
        this.currentSpot = currentSpot;
        this.currentSpotTime = currentSpotTime;
        this.entrySpot = entrySpot;
        this.dateExpiry = dateExpiry;
        this.dateSettlement = dateSettlement;
        this.dateStart = dateStart;
        this.id = id;
        this.hasCorporateActions = hasCorporateActions;
        this.isExpired = isExpired;
        this.isSettleable = isSettleable;
        this.isForwardStarting = isForwardStarting;
        this.isIntraday = isIntraday;
        this.isPathDependent = isPathDependent;
        this.isValidToSell = isValidToSell;
        this.longcode = longcode;
        this.payout = payout;
        this.shortcode = shortcode;
        this.displayValue = displayValue;
        this.underlying = underlying;
        this.displayName = displayName;
        this.entryTick = entryTick;
        this.entryTickTime = entryTickTime;
        this.exitTick = exitTick;
        this.exitTickTime = exitTickTime;
        this.tickCount = tickCount;
        this.validationError = validationError;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.purchaseTime = purchaseTime;
        this.sellTime = sellTime;
        this.sellSpot = sellSpot;
        this.sellSpotTime = sellSpotTime;
        this.entryLevel = entryLevel;
        this.amountPerPoint = amountPerPoint;
        this.stopLossLevel = stopLossLevel;
        this.stopProfitLevel = stopProfitLevel;
        this.currentLevel = currentLevel;
        this.exitLevel = exitLevel;
        this.currentValueInDollar = currentValueInDollar;
        this.currentValueInPoint = currentValueInPoint;
        this.transactionIds = transactionIds;
    }

    /**
     * High barrier of the contract (if any). Example: 42.123
     * 
     */
    public Double getHighBarrier() {
        return highBarrier;
    }

    /**
     * High barrier of the contract (if any). Example: 42.123
     * 
     */
    public void setHighBarrier(Double highBarrier) {
        this.highBarrier = highBarrier;
    }

    /**
     * Low barrier of the contract (if any). Example: 40.132
     * 
     */
    public Double getLowBarrier() {
        return lowBarrier;
    }

    /**
     * Low barrier of the contract (if any). Example: 40.132
     * 
     */
    public void setLowBarrier(Double lowBarrier) {
        this.lowBarrier = lowBarrier;
    }

    /**
     * Barrier of the contract (if any). Example: 42.123
     * 
     */
    public Double getBarrier() {
        return barrier;
    }

    /**
     * Barrier of the contract (if any). Example: 42.123
     * 
     */
    public void setBarrier(Double barrier) {
        this.barrier = barrier;
    }

    /**
     * Original high barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    public Double getOriginalHighBarrier() {
        return originalHighBarrier;
    }

    /**
     * Original high barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    public void setOriginalHighBarrier(Double originalHighBarrier) {
        this.originalHighBarrier = originalHighBarrier;
    }

    /**
     * Original low barrier of the contract (if any corporate action). Example: 80.262
     * 
     */
    public Double getOriginalLowBarrier() {
        return originalLowBarrier;
    }

    /**
     * Original low barrier of the contract (if any corporate action). Example: 80.262
     * 
     */
    public void setOriginalLowBarrier(Double originalLowBarrier) {
        this.originalLowBarrier = originalLowBarrier;
    }

    /**
     * Original barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    public Double getOriginalBarrier() {
        return originalBarrier;
    }

    /**
     * Original barrier of the contract (if any corporate action). Example: 83.246
     * 
     */
    public void setOriginalBarrier(Double originalBarrier) {
        this.originalBarrier = originalBarrier;
    }

    /**
     * The number of barriers a contract has. Example: 2
     * 
     */
    public Double getBarrierCount() {
        return barrierCount;
    }

    /**
     * The number of barriers a contract has. Example: 2
     * 
     */
    public void setBarrierCount(Double barrierCount) {
        this.barrierCount = barrierCount;
    }

    /**
     * Price at which the contract could be sold back to Binary.com. Example: 5.14
     * 
     */
    public Double getBidPrice() {
        return bidPrice;
    }

    /**
     * Price at which the contract could be sold back to Binary.com. Example: 5.14
     * 
     */
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * Binary.com internal contract identifier
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Binary.com internal contract identifier
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * Contract type, for example CALL, PUT
     * 
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Contract type, for example CALL, PUT
     * 
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * Example: USD
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Example: USD
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Spot value if we have license to stream this symbol. Example: 9874.52
     * 
     */
    public Double getCurrentSpot() {
        return currentSpot;
    }

    /**
     * Spot value if we have license to stream this symbol. Example: 9874.52
     * 
     */
    public void setCurrentSpot(Double currentSpot) {
        this.currentSpot = currentSpot;
    }

    /**
     * Example: 1439999052
     * 
     */
    public Integer getCurrentSpotTime() {
        return currentSpotTime;
    }

    /**
     * Example: 1439999052
     * 
     */
    public void setCurrentSpotTime(Integer currentSpotTime) {
        this.currentSpotTime = currentSpotTime;
    }

    /**
     * Example: 9874.52
     * 
     */
    public Double getEntrySpot() {
        return entrySpot;
    }

    /**
     * Example: 9874.52
     * 
     */
    public void setEntrySpot(Double entrySpot) {
        this.entrySpot = entrySpot;
    }

    /**
     * Expiry date (epoch) of the Contract. Example: 1446629000. Please note that it is not applicable for spreads and tick trade contracts.
     * 
     */
    public Integer getDateExpiry() {
        return dateExpiry;
    }

    /**
     * Expiry date (epoch) of the Contract. Example: 1446629000. Please note that it is not applicable for spreads and tick trade contracts.
     * 
     */
    public void setDateExpiry(Integer dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    /**
     * Settlement date (epoch) of the contract. Example: 1446629000
     * 
     */
    public Integer getDateSettlement() {
        return dateSettlement;
    }

    /**
     * Settlement date (epoch) of the contract. Example: 1446629000
     * 
     */
    public void setDateSettlement(Integer dateSettlement) {
        this.dateSettlement = dateSettlement;
    }

    /**
     * Start date (epoch) of the contract. Example: 1446629000
     * 
     */
    public Integer getDateStart() {
        return dateStart;
    }

    /**
     * Start date (epoch) of the contract. Example: 1446629000
     * 
     */
    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
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
     * Whether the contract has an applicable corporate actions or not. Boolean value 1 or 0
     * 
     */
    public Integer getHasCorporateActions() {
        return hasCorporateActions;
    }

    /**
     * Whether the contract has an applicable corporate actions or not. Boolean value 1 or 0
     * 
     */
    public void setHasCorporateActions(Integer hasCorporateActions) {
        this.hasCorporateActions = hasCorporateActions;
    }

    /**
     * Whether the contract is expired or not. Boolean value 1 or 0
     * 
     */
    public Integer getIsExpired() {
        return isExpired;
    }

    /**
     * Whether the contract is expired or not. Boolean value 1 or 0
     * 
     */
    public void setIsExpired(Integer isExpired) {
        this.isExpired = isExpired;
    }

    /**
     * Whether the contract is settleable or not. Boolean value 1 or 0
     * 
     */
    public Integer getIsSettleable() {
        return isSettleable;
    }

    /**
     * Whether the contract is settleable or not. Boolean value 1 or 0
     * 
     */
    public void setIsSettleable(Integer isSettleable) {
        this.isSettleable = isSettleable;
    }

    /**
     * Whether the contract is forward-starting or not. Boolean value 1 or 0
     * 
     */
    public Integer getIsForwardStarting() {
        return isForwardStarting;
    }

    /**
     * Whether the contract is forward-starting or not. Boolean value 1 or 0
     * 
     */
    public void setIsForwardStarting(Integer isForwardStarting) {
        this.isForwardStarting = isForwardStarting;
    }

    /**
     * Whether the contract is an intraday contract. Boolean value 1 or 0
     * 
     */
    public Integer getIsIntraday() {
        return isIntraday;
    }

    /**
     * Whether the contract is an intraday contract. Boolean value 1 or 0
     * 
     */
    public void setIsIntraday(Integer isIntraday) {
        this.isIntraday = isIntraday;
    }

    /**
     * Whether the contract expiry price will depend on the path of the market (e.g. One Touch contract). Boolean value 1 or 0
     * 
     */
    public Integer getIsPathDependent() {
        return isPathDependent;
    }

    /**
     * Whether the contract expiry price will depend on the path of the market (e.g. One Touch contract). Boolean value 1 or 0
     * 
     */
    public void setIsPathDependent(Integer isPathDependent) {
        this.isPathDependent = isPathDependent;
    }

    /**
     * Whether the contract can be sold back to Binary.com. Boolean value 1 or 0
     * 
     */
    public Integer getIsValidToSell() {
        return isValidToSell;
    }

    /**
     * Whether the contract can be sold back to Binary.com. Boolean value 1 or 0
     * 
     */
    public void setIsValidToSell(Integer isValidToSell) {
        this.isValidToSell = isValidToSell;
    }

    /**
     * Text description of the contract purchased, Example: Win payout if Volatility 100 Index is strictly higher than entry spot at 10 minutes after contract start time.
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * Text description of the contract purchased, Example: Win payout if Volatility 100 Index is strictly higher than entry spot at 10 minutes after contract start time.
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Payout value of the contract. Example: 10.50
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Payout value of the contract. Example: 10.50
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    /**
     * Coded description of the contract purchased, Example: CALL_R_100_90_1446704187_1446704787_S0P_0
     * 
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Coded description of the contract purchased, Example: CALL_R_100_90_1446704187_1446704787_S0P_0
     * 
     */
    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * 
     */
    public Double getDisplayValue() {
        return displayValue;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * 
     */
    public void setDisplayValue(Double displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * Example: BSESENSEX30
     * 
     */
    public String getUnderlying() {
        return underlying;
    }

    /**
     * Example: BSESENSEX30
     * 
     */
    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    /**
     * Display name of underlying
     * 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name of underlying
     * 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * This is the entry spot of the contract. For contracts starting immediately it is the next tick after the start time. For forward-starting contracts it is the spot at the start time. Example: 86.630.
     * 
     */
    public Double getEntryTick() {
        return entryTick;
    }

    /**
     * This is the entry spot of the contract. For contracts starting immediately it is the next tick after the start time. For forward-starting contracts it is the spot at the start time. Example: 86.630.
     * 
     */
    public void setEntryTick(Double entryTick) {
        this.entryTick = entryTick;
    }

    /**
     * This is the epoch time of the entry tick. Example: 1446629000
     * 
     */
    public Integer getEntryTickTime() {
        return entryTickTime;
    }

    /**
     * This is the epoch time of the entry tick. Example: 1446629000
     * 
     */
    public void setEntryTickTime(Integer entryTickTime) {
        this.entryTickTime = entryTickTime;
    }

    /**
     * This is the latest spot value at the end time of the contract. Example: 86.810
     * 
     */
    public Double getExitTick() {
        return exitTick;
    }

    /**
     * This is the latest spot value at the end time of the contract. Example: 86.810
     * 
     */
    public void setExitTick(Double exitTick) {
        this.exitTick = exitTick;
    }

    /**
     * This is the epoch time of the exit tick. Note that since certain instruments don't tick every second, the exit tick time may be a few seconds before the end time. Example: 1446629000
     * 
     */
    public Integer getExitTickTime() {
        return exitTickTime;
    }

    /**
     * This is the epoch time of the exit tick. Note that since certain instruments don't tick every second, the exit tick time may be a few seconds before the end time. Example: 1446629000
     * 
     */
    public void setExitTickTime(Integer exitTickTime) {
        this.exitTickTime = exitTickTime;
    }

    /**
     * Only for tick trades, number of ticks
     * 
     */
    public Integer getTickCount() {
        return tickCount;
    }

    /**
     * Only for tick trades, number of ticks
     * 
     */
    public void setTickCount(Integer tickCount) {
        this.tickCount = tickCount;
    }

    /**
     * Error message if validation fails
     * 
     */
    public String getValidationError() {
        return validationError;
    }

    /**
     * Error message if validation fails
     * 
     */
    public void setValidationError(String validationError) {
        this.validationError = validationError;
    }

    /**
     * Price at which contract was sold, only available when contract has been sold.
     * 
     */
    public Double getSellPrice() {
        return sellPrice;
    }

    /**
     * Price at which contract was sold, only available when contract has been sold.
     * 
     */
    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * Price at which contract was purchased
     * 
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * Price at which contract was purchased
     * 
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * Epoch of purchase time, will be same as date_start for all contracts except forward starting contracts.
     * 
     */
    public Integer getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Epoch of purchase time, will be same as date_start for all contracts except forward starting contracts.
     * 
     */
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * Epoch time of when the contract was sold (only present for contracts already sold)
     * 
     */
    public Integer getSellTime() {
        return sellTime;
    }

    /**
     * Epoch time of when the contract was sold (only present for contracts already sold)
     * 
     */
    public void setSellTime(Integer sellTime) {
        this.sellTime = sellTime;
    }

    /**
     * Latest spot value at the sell time. Example: 86.630 (only present for contracts already sold)
     * 
     */
    public Double getSellSpot() {
        return sellSpot;
    }

    /**
     * Latest spot value at the sell time. Example: 86.630 (only present for contracts already sold)
     * 
     */
    public void setSellSpot(Double sellSpot) {
        this.sellSpot = sellSpot;
    }

    /**
     * Epoch time of the sell spot. Note that since certain underlyings don't tick every second, the sell spot time may be a few seconds before the sell time. Example: 1446629000 (only present for contracts already sold)
     * 
     */
    public Integer getSellSpotTime() {
        return sellSpotTime;
    }

    /**
     * Epoch time of the sell spot. Note that since certain underlyings don't tick every second, the sell spot time may be a few seconds before the sell time. Example: 1446629000 (only present for contracts already sold)
     * 
     */
    public void setSellSpotTime(Integer sellSpotTime) {
        this.sellSpotTime = sellSpotTime;
    }

    /**
     * The value (points) at which this contract was opened. Only applicable for spreads.
     * 
     */
    public Double getEntryLevel() {
        return entryLevel;
    }

    /**
     * The value (points) at which this contract was opened. Only applicable for spreads.
     * 
     */
    public void setEntryLevel(Double entryLevel) {
        this.entryLevel = entryLevel;
    }

    /**
     * The dollar profit/loss per point of movement of the current value. Only applicable for spreads.
     * 
     */
    public String getAmountPerPoint() {
        return amountPerPoint;
    }

    /**
     * The dollar profit/loss per point of movement of the current value. Only applicable for spreads.
     * 
     */
    public void setAmountPerPoint(String amountPerPoint) {
        this.amountPerPoint = amountPerPoint;
    }

    /**
     * If the current level touches the stop loss level, then the contract will automatically be closed at the stop loss level. Only applicable for spreads.
     * 
     */
    public Double getStopLossLevel() {
        return stopLossLevel;
    }

    /**
     * If the current level touches the stop loss level, then the contract will automatically be closed at the stop loss level. Only applicable for spreads.
     * 
     */
    public void setStopLossLevel(Double stopLossLevel) {
        this.stopLossLevel = stopLossLevel;
    }

    /**
     * If the current level touches the stop profit level, then the contract will automatically be closed at the stop profit level. Only applicable for spreads.
     * 
     */
    public Double getStopProfitLevel() {
        return stopProfitLevel;
    }

    /**
     * If the current level touches the stop profit level, then the contract will automatically be closed at the stop profit level. Only applicable for spreads.
     * 
     */
    public void setStopProfitLevel(Double stopProfitLevel) {
        this.stopProfitLevel = stopProfitLevel;
    }

    /**
     * Current value of the underlying. Only applicable for spreads.
     * 
     */
    public Double getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Current value of the underlying. Only applicable for spreads.
     * 
     */
    public void setCurrentLevel(Double currentLevel) {
        this.currentLevel = currentLevel;
    }

    /**
     * The contract was closed at this level. Only applicable for spreads
     * 
     */
    public Double getExitLevel() {
        return exitLevel;
    }

    /**
     * The contract was closed at this level. Only applicable for spreads
     * 
     */
    public void setExitLevel(Double exitLevel) {
        this.exitLevel = exitLevel;
    }

    /**
     * Current profit/loss in dollars. Only applicable for spreads.
     * 
     */
    public Double getCurrentValueInDollar() {
        return currentValueInDollar;
    }

    /**
     * Current profit/loss in dollars. Only applicable for spreads.
     * 
     */
    public void setCurrentValueInDollar(Double currentValueInDollar) {
        this.currentValueInDollar = currentValueInDollar;
    }

    /**
     * Current profit or loss in points. Only applicable for spreads.
     * 
     */
    public Double getCurrentValueInPoint() {
        return currentValueInPoint;
    }

    /**
     * Current profit or loss in points. Only applicable for spreads.
     * 
     */
    public void setCurrentValueInPoint(Double currentValueInPoint) {
        this.currentValueInPoint = currentValueInPoint;
    }

    /**
     * Transaction ids for contract
     * <p>
     * Every contract has buy and sell transaction ids, i.e. when you purchase a contract we associate it with buy transaction id, and if contract is already sold we associate that with sell transaction id.
     * 
     */
    public TransactionIds getTransactionIds() {
        return transactionIds;
    }

    /**
     * Transaction ids for contract
     * <p>
     * Every contract has buy and sell transaction ids, i.e. when you purchase a contract we associate it with buy transaction id, and if contract is already sold we associate that with sell transaction id.
     * 
     */
    public void setTransactionIds(TransactionIds transactionIds) {
        this.transactionIds = transactionIds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(highBarrier).append(lowBarrier).append(barrier).append(originalHighBarrier).append(originalLowBarrier).append(originalBarrier).append(barrierCount).append(bidPrice).append(contractId).append(contractType).append(currency).append(currentSpot).append(currentSpotTime).append(entrySpot).append(dateExpiry).append(dateSettlement).append(dateStart).append(id).append(hasCorporateActions).append(isExpired).append(isSettleable).append(isForwardStarting).append(isIntraday).append(isPathDependent).append(isValidToSell).append(longcode).append(payout).append(shortcode).append(displayValue).append(underlying).append(displayName).append(entryTick).append(entryTickTime).append(exitTick).append(exitTickTime).append(tickCount).append(validationError).append(sellPrice).append(buyPrice).append(purchaseTime).append(sellTime).append(sellSpot).append(sellSpotTime).append(entryLevel).append(amountPerPoint).append(stopLossLevel).append(stopProfitLevel).append(currentLevel).append(exitLevel).append(currentValueInDollar).append(currentValueInPoint).append(transactionIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalOpenContract) == false) {
            return false;
        }
        ProposalOpenContract rhs = ((ProposalOpenContract) other);
        return new EqualsBuilder().append(highBarrier, rhs.highBarrier).append(lowBarrier, rhs.lowBarrier).append(barrier, rhs.barrier).append(originalHighBarrier, rhs.originalHighBarrier).append(originalLowBarrier, rhs.originalLowBarrier).append(originalBarrier, rhs.originalBarrier).append(barrierCount, rhs.barrierCount).append(bidPrice, rhs.bidPrice).append(contractId, rhs.contractId).append(contractType, rhs.contractType).append(currency, rhs.currency).append(currentSpot, rhs.currentSpot).append(currentSpotTime, rhs.currentSpotTime).append(entrySpot, rhs.entrySpot).append(dateExpiry, rhs.dateExpiry).append(dateSettlement, rhs.dateSettlement).append(dateStart, rhs.dateStart).append(id, rhs.id).append(hasCorporateActions, rhs.hasCorporateActions).append(isExpired, rhs.isExpired).append(isSettleable, rhs.isSettleable).append(isForwardStarting, rhs.isForwardStarting).append(isIntraday, rhs.isIntraday).append(isPathDependent, rhs.isPathDependent).append(isValidToSell, rhs.isValidToSell).append(longcode, rhs.longcode).append(payout, rhs.payout).append(shortcode, rhs.shortcode).append(displayValue, rhs.displayValue).append(underlying, rhs.underlying).append(displayName, rhs.displayName).append(entryTick, rhs.entryTick).append(entryTickTime, rhs.entryTickTime).append(exitTick, rhs.exitTick).append(exitTickTime, rhs.exitTickTime).append(tickCount, rhs.tickCount).append(validationError, rhs.validationError).append(sellPrice, rhs.sellPrice).append(buyPrice, rhs.buyPrice).append(purchaseTime, rhs.purchaseTime).append(sellTime, rhs.sellTime).append(sellSpot, rhs.sellSpot).append(sellSpotTime, rhs.sellSpotTime).append(entryLevel, rhs.entryLevel).append(amountPerPoint, rhs.amountPerPoint).append(stopLossLevel, rhs.stopLossLevel).append(stopProfitLevel, rhs.stopProfitLevel).append(currentLevel, rhs.currentLevel).append(exitLevel, rhs.exitLevel).append(currentValueInDollar, rhs.currentValueInDollar).append(currentValueInPoint, rhs.currentValueInPoint).append(transactionIds, rhs.transactionIds).isEquals();
    }

}
