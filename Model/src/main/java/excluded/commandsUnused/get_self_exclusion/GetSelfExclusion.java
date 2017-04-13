
package data.binaryAPI.commandsUnused.get_self_exclusion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Self-Exclusion Structure
 * <p>
 * 
 * 
 */
public class GetSelfExclusion implements Serializable
{

    /**
     * Maximum account cash balance
     * 
     */
    @SerializedName("max_balance")
    @Expose
    private Integer maxBalance;
    /**
     * Daily turnover limit
     * 
     */
    @SerializedName("max_turnover")
    @Expose
    private Integer maxTurnover;
    /**
     * Daily limit on losses
     * 
     */
    @SerializedName("max_losses")
    @Expose
    private Integer maxLosses;
    /**
     *  7-day turnover limit
     * 
     */
    @SerializedName("max_7day_turnover")
    @Expose
    private Integer max7dayTurnover;
    /**
     *  7-day limit on losses
     * 
     */
    @SerializedName("max_7day_losses")
    @Expose
    private Integer max7dayLosses;
    /**
     *  30-day turnover limit
     * 
     */
    @SerializedName("max_30day_turnover")
    @Expose
    private Integer max30dayTurnover;
    /**
     *  30-day limit on losses
     * 
     */
    @SerializedName("max_30day_losses")
    @Expose
    private Integer max30dayLosses;
    /**
     * Maximum number of open positions
     * 
     */
    @SerializedName("max_open_bets")
    @Expose
    private Integer maxOpenBets;
    /**
     * Session duration limit, in minutes
     * 
     */
    @SerializedName("session_duration_limit")
    @Expose
    private Integer sessionDurationLimit;
    /**
     * Exclude me from the website until (date YYYY-MM-DD)
     * 
     */
    @SerializedName("exclude_until")
    @Expose
    private String excludeUntil;
    /**
     * Exclude me from the website until (epoch time)
     * 
     */
    @SerializedName("timeout_until")
    @Expose
    private Integer timeoutUntil;
    private final static long serialVersionUID = 3709763427508195193L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetSelfExclusion() {
    }

    /**
     * 
     * @param maxOpenBets
     * @param maxLosses
     * @param sessionDurationLimit
     * @param excludeUntil
     * @param maxBalance
     * @param max7dayTurnover
     * @param maxTurnover
     * @param max30dayTurnover
     * @param max7dayLosses
     * @param max30dayLosses
     * @param timeoutUntil
     */
    public GetSelfExclusion(Integer maxBalance, Integer maxTurnover, Integer maxLosses, Integer max7dayTurnover, Integer max7dayLosses, Integer max30dayTurnover, Integer max30dayLosses, Integer maxOpenBets, Integer sessionDurationLimit, String excludeUntil, Integer timeoutUntil) {
        super();
        this.maxBalance = maxBalance;
        this.maxTurnover = maxTurnover;
        this.maxLosses = maxLosses;
        this.max7dayTurnover = max7dayTurnover;
        this.max7dayLosses = max7dayLosses;
        this.max30dayTurnover = max30dayTurnover;
        this.max30dayLosses = max30dayLosses;
        this.maxOpenBets = maxOpenBets;
        this.sessionDurationLimit = sessionDurationLimit;
        this.excludeUntil = excludeUntil;
        this.timeoutUntil = timeoutUntil;
    }

    /**
     * Maximum account cash balance
     * 
     */
    public Integer getMaxBalance() {
        return maxBalance;
    }

    /**
     * Maximum account cash balance
     * 
     */
    public void setMaxBalance(Integer maxBalance) {
        this.maxBalance = maxBalance;
    }

    /**
     * Daily turnover limit
     * 
     */
    public Integer getMaxTurnover() {
        return maxTurnover;
    }

    /**
     * Daily turnover limit
     * 
     */
    public void setMaxTurnover(Integer maxTurnover) {
        this.maxTurnover = maxTurnover;
    }

    /**
     * Daily limit on losses
     * 
     */
    public Integer getMaxLosses() {
        return maxLosses;
    }

    /**
     * Daily limit on losses
     * 
     */
    public void setMaxLosses(Integer maxLosses) {
        this.maxLosses = maxLosses;
    }

    /**
     *  7-day turnover limit
     * 
     */
    public Integer getMax7dayTurnover() {
        return max7dayTurnover;
    }

    /**
     *  7-day turnover limit
     * 
     */
    public void setMax7dayTurnover(Integer max7dayTurnover) {
        this.max7dayTurnover = max7dayTurnover;
    }

    /**
     *  7-day limit on losses
     * 
     */
    public Integer getMax7dayLosses() {
        return max7dayLosses;
    }

    /**
     *  7-day limit on losses
     * 
     */
    public void setMax7dayLosses(Integer max7dayLosses) {
        this.max7dayLosses = max7dayLosses;
    }

    /**
     *  30-day turnover limit
     * 
     */
    public Integer getMax30dayTurnover() {
        return max30dayTurnover;
    }

    /**
     *  30-day turnover limit
     * 
     */
    public void setMax30dayTurnover(Integer max30dayTurnover) {
        this.max30dayTurnover = max30dayTurnover;
    }

    /**
     *  30-day limit on losses
     * 
     */
    public Integer getMax30dayLosses() {
        return max30dayLosses;
    }

    /**
     *  30-day limit on losses
     * 
     */
    public void setMax30dayLosses(Integer max30dayLosses) {
        this.max30dayLosses = max30dayLosses;
    }

    /**
     * Maximum number of open positions
     * 
     */
    public Integer getMaxOpenBets() {
        return maxOpenBets;
    }

    /**
     * Maximum number of open positions
     * 
     */
    public void setMaxOpenBets(Integer maxOpenBets) {
        this.maxOpenBets = maxOpenBets;
    }

    /**
     * Session duration limit, in minutes
     * 
     */
    public Integer getSessionDurationLimit() {
        return sessionDurationLimit;
    }

    /**
     * Session duration limit, in minutes
     * 
     */
    public void setSessionDurationLimit(Integer sessionDurationLimit) {
        this.sessionDurationLimit = sessionDurationLimit;
    }

    /**
     * Exclude me from the website until (date YYYY-MM-DD)
     * 
     */
    public String getExcludeUntil() {
        return excludeUntil;
    }

    /**
     * Exclude me from the website until (date YYYY-MM-DD)
     * 
     */
    public void setExcludeUntil(String excludeUntil) {
        this.excludeUntil = excludeUntil;
    }

    /**
     * Exclude me from the website until (epoch time)
     * 
     */
    public Integer getTimeoutUntil() {
        return timeoutUntil;
    }

    /**
     * Exclude me from the website until (epoch time)
     * 
     */
    public void setTimeoutUntil(Integer timeoutUntil) {
        this.timeoutUntil = timeoutUntil;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxBalance).append(maxTurnover).append(maxLosses).append(max7dayTurnover).append(max7dayLosses).append(max30dayTurnover).append(max30dayLosses).append(maxOpenBets).append(sessionDurationLimit).append(excludeUntil).append(timeoutUntil).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetSelfExclusion) == false) {
            return false;
        }
        GetSelfExclusion rhs = ((GetSelfExclusion) other);
        return new EqualsBuilder().append(maxBalance, rhs.maxBalance).append(maxTurnover, rhs.maxTurnover).append(maxLosses, rhs.maxLosses).append(max7dayTurnover, rhs.max7dayTurnover).append(max7dayLosses, rhs.max7dayLosses).append(max30dayTurnover, rhs.max30dayTurnover).append(max30dayLosses, rhs.max30dayLosses).append(maxOpenBets, rhs.maxOpenBets).append(sessionDurationLimit, rhs.sessionDurationLimit).append(excludeUntil, rhs.excludeUntil).append(timeoutUntil, rhs.timeoutUntil).isEquals();
    }

}
