
package data.binaryAPI.commandsUnused.copytrading_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Statistics of the trader
 * 
 */
public class CopytradingStatistics implements Serializable
{

    /**
     * This is the epoch the investor started trading with binary.com
     * (Required)
     * 
     */
    @SerializedName("active_since")
    @Expose
    private Integer activeSince;
    /**
     * Represents the net change in equity per month.
     * 
     */
    @SerializedName("monthly_profitable_trades")
    @Expose
    private MonthlyProfitableTrades monthlyProfitableTrades;
    /**
     * Represents the net change in equity per year.
     * 
     */
    @SerializedName("yearly_profitable_trades")
    @Expose
    private YearlyProfitableTrades yearlyProfitableTrades;
    /**
     * Represents the net change in equity for a 12-month period.
     * 
     */
    @SerializedName("last_12months_profitable_trades")
    @Expose
    private Double last12monthsProfitableTrades;
    /**
     * Total number of trades for all time.
     * 
     */
    @SerializedName("total_trades")
    @Expose
    private Integer totalTrades;
    /**
     * Number of profit trades in percentage.
     * 
     */
    @SerializedName("trades_profitable")
    @Expose
    private Double tradesProfitable;
    /**
     * Average seconds of keeping positions open.
     * 
     */
    @SerializedName("avg_duration")
    @Expose
    private Integer avgDuration;
    /**
     * Average profit of trades in percentage.
     * 
     */
    @SerializedName("avg_profit")
    @Expose
    private Double avgProfit;
    /**
     * Average loss of trades in percentage.
     * 
     */
    @SerializedName("avg_loss")
    @Expose
    private Double avgLoss;
    /**
     * Represents the portfolio distribution by markets.
     * 
     */
    @SerializedName("trades_breakdown")
    @Expose
    private TradesBreakdown tradesBreakdown;
    /**
     * Trader performance probability.
     * (Required)
     * 
     */
    @SerializedName("performance_probability")
    @Expose
    private Double performanceProbability;
    /**
     * Trader copiers count.
     * (Required)
     * 
     */
    @SerializedName("copiers")
    @Expose
    private Double copiers;
    private final static long serialVersionUID = 3538600620391722014L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopytradingStatistics() {
    }

    /**
     * 
     * @param last12monthsProfitableTrades
     * @param avgLoss
     * @param activeSince
     * @param yearlyProfitableTrades
     * @param monthlyProfitableTrades
     * @param tradesBreakdown
     * @param totalTrades
     * @param performanceProbability
     * @param tradesProfitable
     * @param avgProfit
     * @param avgDuration
     * @param copiers
     */
    public CopytradingStatistics(Integer activeSince, MonthlyProfitableTrades monthlyProfitableTrades, YearlyProfitableTrades yearlyProfitableTrades, Double last12monthsProfitableTrades, Integer totalTrades, Double tradesProfitable, Integer avgDuration, Double avgProfit, Double avgLoss, TradesBreakdown tradesBreakdown, Double performanceProbability, Double copiers) {
        super();
        this.activeSince = activeSince;
        this.monthlyProfitableTrades = monthlyProfitableTrades;
        this.yearlyProfitableTrades = yearlyProfitableTrades;
        this.last12monthsProfitableTrades = last12monthsProfitableTrades;
        this.totalTrades = totalTrades;
        this.tradesProfitable = tradesProfitable;
        this.avgDuration = avgDuration;
        this.avgProfit = avgProfit;
        this.avgLoss = avgLoss;
        this.tradesBreakdown = tradesBreakdown;
        this.performanceProbability = performanceProbability;
        this.copiers = copiers;
    }

    /**
     * This is the epoch the investor started trading with binary.com
     * (Required)
     * 
     */
    public Integer getActiveSince() {
        return activeSince;
    }

    /**
     * This is the epoch the investor started trading with binary.com
     * (Required)
     * 
     */
    public void setActiveSince(Integer activeSince) {
        this.activeSince = activeSince;
    }

    /**
     * Represents the net change in equity per month.
     * 
     */
    public MonthlyProfitableTrades getMonthlyProfitableTrades() {
        return monthlyProfitableTrades;
    }

    /**
     * Represents the net change in equity per month.
     * 
     */
    public void setMonthlyProfitableTrades(MonthlyProfitableTrades monthlyProfitableTrades) {
        this.monthlyProfitableTrades = monthlyProfitableTrades;
    }

    /**
     * Represents the net change in equity per year.
     * 
     */
    public YearlyProfitableTrades getYearlyProfitableTrades() {
        return yearlyProfitableTrades;
    }

    /**
     * Represents the net change in equity per year.
     * 
     */
    public void setYearlyProfitableTrades(YearlyProfitableTrades yearlyProfitableTrades) {
        this.yearlyProfitableTrades = yearlyProfitableTrades;
    }

    /**
     * Represents the net change in equity for a 12-month period.
     * 
     */
    public Double getLast12monthsProfitableTrades() {
        return last12monthsProfitableTrades;
    }

    /**
     * Represents the net change in equity for a 12-month period.
     * 
     */
    public void setLast12monthsProfitableTrades(Double last12monthsProfitableTrades) {
        this.last12monthsProfitableTrades = last12monthsProfitableTrades;
    }

    /**
     * Total number of trades for all time.
     * 
     */
    public Integer getTotalTrades() {
        return totalTrades;
    }

    /**
     * Total number of trades for all time.
     * 
     */
    public void setTotalTrades(Integer totalTrades) {
        this.totalTrades = totalTrades;
    }

    /**
     * Number of profit trades in percentage.
     * 
     */
    public Double getTradesProfitable() {
        return tradesProfitable;
    }

    /**
     * Number of profit trades in percentage.
     * 
     */
    public void setTradesProfitable(Double tradesProfitable) {
        this.tradesProfitable = tradesProfitable;
    }

    /**
     * Average seconds of keeping positions open.
     * 
     */
    public Integer getAvgDuration() {
        return avgDuration;
    }

    /**
     * Average seconds of keeping positions open.
     * 
     */
    public void setAvgDuration(Integer avgDuration) {
        this.avgDuration = avgDuration;
    }

    /**
     * Average profit of trades in percentage.
     * 
     */
    public Double getAvgProfit() {
        return avgProfit;
    }

    /**
     * Average profit of trades in percentage.
     * 
     */
    public void setAvgProfit(Double avgProfit) {
        this.avgProfit = avgProfit;
    }

    /**
     * Average loss of trades in percentage.
     * 
     */
    public Double getAvgLoss() {
        return avgLoss;
    }

    /**
     * Average loss of trades in percentage.
     * 
     */
    public void setAvgLoss(Double avgLoss) {
        this.avgLoss = avgLoss;
    }

    /**
     * Represents the portfolio distribution by markets.
     * 
     */
    public TradesBreakdown getTradesBreakdown() {
        return tradesBreakdown;
    }

    /**
     * Represents the portfolio distribution by markets.
     * 
     */
    public void setTradesBreakdown(TradesBreakdown tradesBreakdown) {
        this.tradesBreakdown = tradesBreakdown;
    }

    /**
     * Trader performance probability.
     * (Required)
     * 
     */
    public Double getPerformanceProbability() {
        return performanceProbability;
    }

    /**
     * Trader performance probability.
     * (Required)
     * 
     */
    public void setPerformanceProbability(Double performanceProbability) {
        this.performanceProbability = performanceProbability;
    }

    /**
     * Trader copiers count.
     * (Required)
     * 
     */
    public Double getCopiers() {
        return copiers;
    }

    /**
     * Trader copiers count.
     * (Required)
     * 
     */
    public void setCopiers(Double copiers) {
        this.copiers = copiers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(activeSince).append(monthlyProfitableTrades).append(yearlyProfitableTrades).append(last12monthsProfitableTrades).append(totalTrades).append(tradesProfitable).append(avgDuration).append(avgProfit).append(avgLoss).append(tradesBreakdown).append(performanceProbability).append(copiers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopytradingStatistics) == false) {
            return false;
        }
        CopytradingStatistics rhs = ((CopytradingStatistics) other);
        return new EqualsBuilder().append(activeSince, rhs.activeSince).append(monthlyProfitableTrades, rhs.monthlyProfitableTrades).append(yearlyProfitableTrades, rhs.yearlyProfitableTrades).append(last12monthsProfitableTrades, rhs.last12monthsProfitableTrades).append(totalTrades, rhs.totalTrades).append(tradesProfitable, rhs.tradesProfitable).append(avgDuration, rhs.avgDuration).append(avgProfit, rhs.avgProfit).append(avgLoss, rhs.avgLoss).append(tradesBreakdown, rhs.tradesBreakdown).append(performanceProbability, rhs.performanceProbability).append(copiers, rhs.copiers).isEquals();
    }

}
