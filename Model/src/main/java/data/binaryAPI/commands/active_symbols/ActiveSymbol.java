
package data.binaryAPI.commands.active_symbols;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class ActiveSymbol implements Serializable
{

    /**
     * Binary.com symbol code for this underlying
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Intraday interval minutes
     * 
     */
    @SerializedName("intraday_interval_minutes")
    @Expose
    private Integer intradayIntervalMinutes;
    /**
     * Symbol type (forex, commodities, etc)
     * 
     */
    @SerializedName("symbol_type")
    @Expose
    private String symbolType;
    /**
     *  1 or 0 - whether the market is currently open or closed
     * 
     */
    @SerializedName("exchange_is_open")
    @Expose
    private Integer exchangeIsOpen;
    /**
     * Exchange name (for underlyings listed on a Stock Exchange)
     * 
     */
    @SerializedName("exchange_name")
    @Expose
    private String exchangeName;
    /**
     * Amount the data feed is delayed (in minutes) due to Exchange licensing requirements
     * 
     */
    @SerializedName("delay_amount")
    @Expose
    private Integer delayAmount;
    /**
     * Display name
     * 
     */
    @SerializedName("display_name")
    @Expose
    private String displayName;
    /**
     * Latest spot price of the underlying
     * 
     */
    @SerializedName("spot")
    @Expose
    private Double spot;
    /**
     * Latest spot epoch time
     * 
     */
    @SerializedName("spot_time")
    @Expose
    private String spotTime;
    /**
     *  1 indicates that trading is currently suspended
     * 
     */
    @SerializedName("is_trading_suspended")
    @Expose
    private Integer isTradingSuspended;
    /**
     * For stocks and stock indices, the underlying currency for that instrument
     * 
     */
    @SerializedName("quoted_currency_symbol")
    @Expose
    private String quotedCurrencySymbol;
    /**
     * Number of seconds elapsed since the last spot price
     * 
     */
    @SerializedName("spot_age")
    @Expose
    private String spotAge;
    /**
     * Market category (forex, indices etc)
     * 
     */
    @SerializedName("market")
    @Expose
    private String market;
    /**
     * Translated market name
     * 
     */
    @SerializedName("market_display_name")
    @Expose
    private String marketDisplayName;
    /**
     * Submarket name
     * 
     */
    @SerializedName("submarket")
    @Expose
    private String submarket;
    /**
     * Translated submarket name
     * 
     */
    @SerializedName("submarket_display_name")
    @Expose
    private String submarketDisplayName;
    /**
     * Pip size (i.e. minimum fluctuation amount)
     * 
     */
    @SerializedName("pip")
    @Expose
    private Double pip;
    private final static long serialVersionUID = -237395603985977768L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActiveSymbol() {
    }

    /**
     * 
     * @param isTradingSuspended
     * @param quotedCurrencySymbol
     * @param spotAge
     * @param submarketDisplayName
     * @param symbol
     * @param displayName
     * @param exchangeIsOpen
     * @param delayAmount
     * @param submarket
     * @param symbolType
     * @param intradayIntervalMinutes
     * @param market
     * @param marketDisplayName
     * @param pip
     * @param spot
     * @param exchangeName
     * @param spotTime
     */
    public ActiveSymbol(String symbol, Integer intradayIntervalMinutes, String symbolType, Integer exchangeIsOpen, String exchangeName, Integer delayAmount, String displayName, Double spot, String spotTime, Integer isTradingSuspended, String quotedCurrencySymbol, String spotAge, String market, String marketDisplayName, String submarket, String submarketDisplayName, Double pip) {
        super();
        this.symbol = symbol;
        this.intradayIntervalMinutes = intradayIntervalMinutes;
        this.symbolType = symbolType;
        this.exchangeIsOpen = exchangeIsOpen;
        this.exchangeName = exchangeName;
        this.delayAmount = delayAmount;
        this.displayName = displayName;
        this.spot = spot;
        this.spotTime = spotTime;
        this.isTradingSuspended = isTradingSuspended;
        this.quotedCurrencySymbol = quotedCurrencySymbol;
        this.spotAge = spotAge;
        this.market = market;
        this.marketDisplayName = marketDisplayName;
        this.submarket = submarket;
        this.submarketDisplayName = submarketDisplayName;
        this.pip = pip;
    }

    /**
     * Binary.com symbol code for this underlying
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Binary.com symbol code for this underlying
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Intraday interval minutes
     * 
     */
    public Integer getIntradayIntervalMinutes() {
        return intradayIntervalMinutes;
    }

    /**
     * Intraday interval minutes
     * 
     */
    public void setIntradayIntervalMinutes(Integer intradayIntervalMinutes) {
        this.intradayIntervalMinutes = intradayIntervalMinutes;
    }

    /**
     * Symbol type (forex, commodities, etc)
     * 
     */
    public String getSymbolType() {
        return symbolType;
    }

    /**
     * Symbol type (forex, commodities, etc)
     * 
     */
    public void setSymbolType(String symbolType) {
        this.symbolType = symbolType;
    }

    /**
     *  1 or 0 - whether the market is currently open or closed
     * 
     */
    public Integer getExchangeIsOpen() {
        return exchangeIsOpen;
    }

    /**
     *  1 or 0 - whether the market is currently open or closed
     * 
     */
    public void setExchangeIsOpen(Integer exchangeIsOpen) {
        this.exchangeIsOpen = exchangeIsOpen;
    }

    /**
     * Exchange name (for underlyings listed on a Stock Exchange)
     * 
     */
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * Exchange name (for underlyings listed on a Stock Exchange)
     * 
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    /**
     * Amount the data feed is delayed (in minutes) due to Exchange licensing requirements
     * 
     */
    public Integer getDelayAmount() {
        return delayAmount;
    }

    /**
     * Amount the data feed is delayed (in minutes) due to Exchange licensing requirements
     * 
     */
    public void setDelayAmount(Integer delayAmount) {
        this.delayAmount = delayAmount;
    }

    /**
     * Display name
     * 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name
     * 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Latest spot price of the underlying
     * 
     */
    public Double getSpot() {
        return spot;
    }

    /**
     * Latest spot price of the underlying
     * 
     */
    public void setSpot(Double spot) {
        this.spot = spot;
    }

    /**
     * Latest spot epoch time
     * 
     */
    public String getSpotTime() {
        return spotTime;
    }

    /**
     * Latest spot epoch time
     * 
     */
    public void setSpotTime(String spotTime) {
        this.spotTime = spotTime;
    }

    /**
     *  1 indicates that trading is currently suspended
     * 
     */
    public Integer getIsTradingSuspended() {
        return isTradingSuspended;
    }

    /**
     *  1 indicates that trading is currently suspended
     * 
     */
    public void setIsTradingSuspended(Integer isTradingSuspended) {
        this.isTradingSuspended = isTradingSuspended;
    }

    /**
     * For stocks and stock indices, the underlying currency for that instrument
     * 
     */
    public String getQuotedCurrencySymbol() {
        return quotedCurrencySymbol;
    }

    /**
     * For stocks and stock indices, the underlying currency for that instrument
     * 
     */
    public void setQuotedCurrencySymbol(String quotedCurrencySymbol) {
        this.quotedCurrencySymbol = quotedCurrencySymbol;
    }

    /**
     * Number of seconds elapsed since the last spot price
     * 
     */
    public String getSpotAge() {
        return spotAge;
    }

    /**
     * Number of seconds elapsed since the last spot price
     * 
     */
    public void setSpotAge(String spotAge) {
        this.spotAge = spotAge;
    }

    /**
     * Market category (forex, indices etc)
     * 
     */
    public String getMarket() {
        return market;
    }

    /**
     * Market category (forex, indices etc)
     * 
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * Translated market name
     * 
     */
    public String getMarketDisplayName() {
        return marketDisplayName;
    }

    /**
     * Translated market name
     * 
     */
    public void setMarketDisplayName(String marketDisplayName) {
        this.marketDisplayName = marketDisplayName;
    }

    /**
     * Submarket name
     * 
     */
    public String getSubmarket() {
        return submarket;
    }

    /**
     * Submarket name
     * 
     */
    public void setSubmarket(String submarket) {
        this.submarket = submarket;
    }

    /**
     * Translated submarket name
     * 
     */
    public String getSubmarketDisplayName() {
        return submarketDisplayName;
    }

    /**
     * Translated submarket name
     * 
     */
    public void setSubmarketDisplayName(String submarketDisplayName) {
        this.submarketDisplayName = submarketDisplayName;
    }

    /**
     * Pip size (i.e. minimum fluctuation amount)
     * 
     */
    public Double getPip() {
        return pip;
    }

    /**
     * Pip size (i.e. minimum fluctuation amount)
     * 
     */
    public void setPip(Double pip) {
        this.pip = pip;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(symbol).append(intradayIntervalMinutes).append(symbolType).append(exchangeIsOpen).append(exchangeName).append(delayAmount).append(displayName).append(spot).append(spotTime).append(isTradingSuspended).append(quotedCurrencySymbol).append(spotAge).append(market).append(marketDisplayName).append(submarket).append(submarketDisplayName).append(pip).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveSymbol) == false) {
            return false;
        }
        ActiveSymbol rhs = ((ActiveSymbol) other);
        return new EqualsBuilder().append(symbol, rhs.symbol).append(intradayIntervalMinutes, rhs.intradayIntervalMinutes).append(symbolType, rhs.symbolType).append(exchangeIsOpen, rhs.exchangeIsOpen).append(exchangeName, rhs.exchangeName).append(delayAmount, rhs.delayAmount).append(displayName, rhs.displayName).append(spot, rhs.spot).append(spotTime, rhs.spotTime).append(isTradingSuspended, rhs.isTradingSuspended).append(quotedCurrencySymbol, rhs.quotedCurrencySymbol).append(spotAge, rhs.spotAge).append(market, rhs.market).append(marketDisplayName, rhs.marketDisplayName).append(submarket, rhs.submarket).append(submarketDisplayName, rhs.submarketDisplayName).append(pip, rhs.pip).isEquals();
    }

}
