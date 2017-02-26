
package data.binaryAPI.commandsUnused.get_limits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get Limits
 * <p>
 * Trading limits of real account user
 * 
 */
public class GetLimits implements Serializable
{

    /**
     * Maximum account cash balance
     * 
     */
    @SerializedName("account_balance")
    @Expose
    private Double accountBalance;
    /**
     * Maximum daily turnover
     * 
     */
    @SerializedName("daily_turnover")
    @Expose
    private Double dailyTurnover;
    /**
     * Maximum number of open positions
     * 
     */
    @SerializedName("open_positions")
    @Expose
    private Integer openPositions;
    /**
     * Maximum aggregate payouts on open positions
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    /**
     * Maximum aggregate payouts on open positions per symbol and contract type. This limit can be exceeded up to the overall payout limit if there is no prior open position.
     * 
     */
    @SerializedName("payout_per_symbol_and_contract_type")
    @Expose
    private Double payoutPerSymbolAndContractType;
    /**
     * Lifetime withdrawal limit
     * 
     */
    @SerializedName("lifetime_limit")
    @Expose
    private Double lifetimeLimit;
    /**
     * Number of days for num_of_days_limit withdrawal limit
     * 
     */
    @SerializedName("num_of_days")
    @Expose
    private Integer numOfDays;
    /**
     * Withdrawal limit for num_of_days days
     * 
     */
    @SerializedName("num_of_days_limit")
    @Expose
    private Integer numOfDaysLimit;
    /**
     * Amount left to reach withdrawal limit
     * 
     */
    @SerializedName("remainder")
    @Expose
    private Double remainder;
    /**
     * Total withdrawal for num_of_days days
     * 
     */
    @SerializedName("withdrawal_for_x_days_monetary")
    @Expose
    private Double withdrawalForXDaysMonetary;
    /**
     * Total withdrawal since inception
     * 
     */
    @SerializedName("withdrawal_since_inception_monetary")
    @Expose
    private Double withdrawalSinceInceptionMonetary;
    private final static long serialVersionUID = 1165888537630072160L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetLimits() {
    }

    /**
     * 
     * @param numOfDaysLimit
     * @param withdrawalForXDaysMonetary
     * @param numOfDays
     * @param payoutPerSymbolAndContractType
     * @param openPositions
     * @param payout
     * @param lifetimeLimit
     * @param withdrawalSinceInceptionMonetary
     * @param accountBalance
     * @param dailyTurnover
     * @param remainder
     */
    public GetLimits(Double accountBalance, Double dailyTurnover, Integer openPositions, Double payout, Double payoutPerSymbolAndContractType, Double lifetimeLimit, Integer numOfDays, Integer numOfDaysLimit, Double remainder, Double withdrawalForXDaysMonetary, Double withdrawalSinceInceptionMonetary) {
        super();
        this.accountBalance = accountBalance;
        this.dailyTurnover = dailyTurnover;
        this.openPositions = openPositions;
        this.payout = payout;
        this.payoutPerSymbolAndContractType = payoutPerSymbolAndContractType;
        this.lifetimeLimit = lifetimeLimit;
        this.numOfDays = numOfDays;
        this.numOfDaysLimit = numOfDaysLimit;
        this.remainder = remainder;
        this.withdrawalForXDaysMonetary = withdrawalForXDaysMonetary;
        this.withdrawalSinceInceptionMonetary = withdrawalSinceInceptionMonetary;
    }

    /**
     * Maximum account cash balance
     * 
     */
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Maximum account cash balance
     * 
     */
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Maximum daily turnover
     * 
     */
    public Double getDailyTurnover() {
        return dailyTurnover;
    }

    /**
     * Maximum daily turnover
     * 
     */
    public void setDailyTurnover(Double dailyTurnover) {
        this.dailyTurnover = dailyTurnover;
    }

    /**
     * Maximum number of open positions
     * 
     */
    public Integer getOpenPositions() {
        return openPositions;
    }

    /**
     * Maximum number of open positions
     * 
     */
    public void setOpenPositions(Integer openPositions) {
        this.openPositions = openPositions;
    }

    /**
     * Maximum aggregate payouts on open positions
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Maximum aggregate payouts on open positions
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    /**
     * Maximum aggregate payouts on open positions per symbol and contract type. This limit can be exceeded up to the overall payout limit if there is no prior open position.
     * 
     */
    public Double getPayoutPerSymbolAndContractType() {
        return payoutPerSymbolAndContractType;
    }

    /**
     * Maximum aggregate payouts on open positions per symbol and contract type. This limit can be exceeded up to the overall payout limit if there is no prior open position.
     * 
     */
    public void setPayoutPerSymbolAndContractType(Double payoutPerSymbolAndContractType) {
        this.payoutPerSymbolAndContractType = payoutPerSymbolAndContractType;
    }

    /**
     * Lifetime withdrawal limit
     * 
     */
    public Double getLifetimeLimit() {
        return lifetimeLimit;
    }

    /**
     * Lifetime withdrawal limit
     * 
     */
    public void setLifetimeLimit(Double lifetimeLimit) {
        this.lifetimeLimit = lifetimeLimit;
    }

    /**
     * Number of days for num_of_days_limit withdrawal limit
     * 
     */
    public Integer getNumOfDays() {
        return numOfDays;
    }

    /**
     * Number of days for num_of_days_limit withdrawal limit
     * 
     */
    public void setNumOfDays(Integer numOfDays) {
        this.numOfDays = numOfDays;
    }

    /**
     * Withdrawal limit for num_of_days days
     * 
     */
    public Integer getNumOfDaysLimit() {
        return numOfDaysLimit;
    }

    /**
     * Withdrawal limit for num_of_days days
     * 
     */
    public void setNumOfDaysLimit(Integer numOfDaysLimit) {
        this.numOfDaysLimit = numOfDaysLimit;
    }

    /**
     * Amount left to reach withdrawal limit
     * 
     */
    public Double getRemainder() {
        return remainder;
    }

    /**
     * Amount left to reach withdrawal limit
     * 
     */
    public void setRemainder(Double remainder) {
        this.remainder = remainder;
    }

    /**
     * Total withdrawal for num_of_days days
     * 
     */
    public Double getWithdrawalForXDaysMonetary() {
        return withdrawalForXDaysMonetary;
    }

    /**
     * Total withdrawal for num_of_days days
     * 
     */
    public void setWithdrawalForXDaysMonetary(Double withdrawalForXDaysMonetary) {
        this.withdrawalForXDaysMonetary = withdrawalForXDaysMonetary;
    }

    /**
     * Total withdrawal since inception
     * 
     */
    public Double getWithdrawalSinceInceptionMonetary() {
        return withdrawalSinceInceptionMonetary;
    }

    /**
     * Total withdrawal since inception
     * 
     */
    public void setWithdrawalSinceInceptionMonetary(Double withdrawalSinceInceptionMonetary) {
        this.withdrawalSinceInceptionMonetary = withdrawalSinceInceptionMonetary;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountBalance).append(dailyTurnover).append(openPositions).append(payout).append(payoutPerSymbolAndContractType).append(lifetimeLimit).append(numOfDays).append(numOfDaysLimit).append(remainder).append(withdrawalForXDaysMonetary).append(withdrawalSinceInceptionMonetary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetLimits) == false) {
            return false;
        }
        GetLimits rhs = ((GetLimits) other);
        return new EqualsBuilder().append(accountBalance, rhs.accountBalance).append(dailyTurnover, rhs.dailyTurnover).append(openPositions, rhs.openPositions).append(payout, rhs.payout).append(payoutPerSymbolAndContractType, rhs.payoutPerSymbolAndContractType).append(lifetimeLimit, rhs.lifetimeLimit).append(numOfDays, rhs.numOfDays).append(numOfDaysLimit, rhs.numOfDaysLimit).append(remainder, rhs.remainder).append(withdrawalForXDaysMonetary, rhs.withdrawalForXDaysMonetary).append(withdrawalSinceInceptionMonetary, rhs.withdrawalSinceInceptionMonetary).isEquals();
    }

}
