
package data.binaryAPI.commandsUnused.buy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Optional field, used to pass the parameters for contract buy
 * 
 */
public class Parameters implements Serializable
{

    /**
     * Proposed payout or stake value
     * 
     */
    @SerializedName("amount")
    @Expose
    private Double amount;
    /**
     * Indicate whether amount is 'payout' or 'stake'
     * 
     */
    @SerializedName("basis")
    @Expose
    private Parameters.Basis basis;
    /**
     * A valid contract-type
     * 
     */
    @SerializedName("contract_type")
    @Expose
    private String contractType;
    /**
     * This can only be the account-holder's currency
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * For forward-starting contracts, epoch value of the starting time of the contract.
     * 
     */
    @SerializedName("date_start")
    @Expose
    private Integer dateStart;
    /**
     * Epoch value of the expiry time of the contract. You must either specify date_expiry or duration.
     * 
     */
    @SerializedName("date_expiry")
    @Expose
    private Integer dateExpiry;
    /**
     * Duration quantity
     * 
     */
    @SerializedName("duration")
    @Expose
    private Integer duration;
    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks)
     * 
     */
    @SerializedName("duration_unit")
    @Expose
    private Parameters.DurationUnit durationUnit;
    /**
     * Symbol code
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier")
    @Expose
    private String barrier;
    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier2")
    @Expose
    private String barrier2;
    /**
     * [For spread contracts only] Amount per point
     * 
     */
    @SerializedName("amount_per_point")
    @Expose
    private Double amountPerPoint;
    /**
     * [For spread contracts only] Stop type (dollar or point)
     * 
     */
    @SerializedName("stop_type")
    @Expose
    private Parameters.StopType stopType;
    /**
     * [For spread contracts only] Stop profit amount
     * 
     */
    @SerializedName("stop_profit")
    @Expose
    private Double stopProfit;
    /**
     * [For spread contracts only] Stop loss amount
     * 
     */
    @SerializedName("stop_loss")
    @Expose
    private Double stopLoss;
    /**
     * [For japan only] An epoch value of a predefined trading period start time
     * 
     */
    @SerializedName("trading_period_start")
    @Expose
    private Integer tradingPeriodStart;
    private final static long serialVersionUID = -1331167261652936340L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameters() {
    }

    /**
     * 
     * @param symbol
     * @param amount
     * @param contractType
     * @param dateExpiry
     * @param stopType
     * @param basis
     * @param amountPerPoint
     * @param duration
     * @param barrier
     * @param barrier2
     * @param dateStart
     * @param stopLoss
     * @param currency
     * @param durationUnit
     * @param stopProfit
     * @param tradingPeriodStart
     */
    public Parameters(Double amount, Parameters.Basis basis, String contractType, String currency, Integer dateStart, Integer dateExpiry, Integer duration, Parameters.DurationUnit durationUnit, String symbol, String barrier, String barrier2, Double amountPerPoint, Parameters.StopType stopType, Double stopProfit, Double stopLoss, Integer tradingPeriodStart) {
        super();
        this.amount = amount;
        this.basis = basis;
        this.contractType = contractType;
        this.currency = currency;
        this.dateStart = dateStart;
        this.dateExpiry = dateExpiry;
        this.duration = duration;
        this.durationUnit = durationUnit;
        this.symbol = symbol;
        this.barrier = barrier;
        this.barrier2 = barrier2;
        this.amountPerPoint = amountPerPoint;
        this.stopType = stopType;
        this.stopProfit = stopProfit;
        this.stopLoss = stopLoss;
        this.tradingPeriodStart = tradingPeriodStart;
    }

    /**
     * Proposed payout or stake value
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Proposed payout or stake value
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Indicate whether amount is 'payout' or 'stake'
     * 
     */
    public Parameters.Basis getBasis() {
        return basis;
    }

    /**
     * Indicate whether amount is 'payout' or 'stake'
     * 
     */
    public void setBasis(Parameters.Basis basis) {
        this.basis = basis;
    }

    /**
     * A valid contract-type
     * 
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * A valid contract-type
     * 
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * This can only be the account-holder's currency
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This can only be the account-holder's currency
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * For forward-starting contracts, epoch value of the starting time of the contract.
     * 
     */
    public Integer getDateStart() {
        return dateStart;
    }

    /**
     * For forward-starting contracts, epoch value of the starting time of the contract.
     * 
     */
    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Epoch value of the expiry time of the contract. You must either specify date_expiry or duration.
     * 
     */
    public Integer getDateExpiry() {
        return dateExpiry;
    }

    /**
     * Epoch value of the expiry time of the contract. You must either specify date_expiry or duration.
     * 
     */
    public void setDateExpiry(Integer dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    /**
     * Duration quantity
     * 
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration quantity
     * 
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks)
     * 
     */
    public Parameters.DurationUnit getDurationUnit() {
        return durationUnit;
    }

    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks)
     * 
     */
    public void setDurationUnit(Parameters.DurationUnit durationUnit) {
        this.durationUnit = durationUnit;
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
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier() {
        return barrier;
    }

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier(String barrier) {
        this.barrier = barrier;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier2() {
        return barrier2;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier2(String barrier2) {
        this.barrier2 = barrier2;
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
     * [For spread contracts only] Stop type (dollar or point)
     * 
     */
    public Parameters.StopType getStopType() {
        return stopType;
    }

    /**
     * [For spread contracts only] Stop type (dollar or point)
     * 
     */
    public void setStopType(Parameters.StopType stopType) {
        this.stopType = stopType;
    }

    /**
     * [For spread contracts only] Stop profit amount
     * 
     */
    public Double getStopProfit() {
        return stopProfit;
    }

    /**
     * [For spread contracts only] Stop profit amount
     * 
     */
    public void setStopProfit(Double stopProfit) {
        this.stopProfit = stopProfit;
    }

    /**
     * [For spread contracts only] Stop loss amount
     * 
     */
    public Double getStopLoss() {
        return stopLoss;
    }

    /**
     * [For spread contracts only] Stop loss amount
     * 
     */
    public void setStopLoss(Double stopLoss) {
        this.stopLoss = stopLoss;
    }

    /**
     * [For japan only] An epoch value of a predefined trading period start time
     * 
     */
    public Integer getTradingPeriodStart() {
        return tradingPeriodStart;
    }

    /**
     * [For japan only] An epoch value of a predefined trading period start time
     * 
     */
    public void setTradingPeriodStart(Integer tradingPeriodStart) {
        this.tradingPeriodStart = tradingPeriodStart;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(basis).append(contractType).append(currency).append(dateStart).append(dateExpiry).append(duration).append(durationUnit).append(symbol).append(barrier).append(barrier2).append(amountPerPoint).append(stopType).append(stopProfit).append(stopLoss).append(tradingPeriodStart).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters) == false) {
            return false;
        }
        Parameters rhs = ((Parameters) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(basis, rhs.basis).append(contractType, rhs.contractType).append(currency, rhs.currency).append(dateStart, rhs.dateStart).append(dateExpiry, rhs.dateExpiry).append(duration, rhs.duration).append(durationUnit, rhs.durationUnit).append(symbol, rhs.symbol).append(barrier, rhs.barrier).append(barrier2, rhs.barrier2).append(amountPerPoint, rhs.amountPerPoint).append(stopType, rhs.stopType).append(stopProfit, rhs.stopProfit).append(stopLoss, rhs.stopLoss).append(tradingPeriodStart, rhs.tradingPeriodStart).isEquals();
    }

    public enum Basis {

        @SerializedName("payout")
        PAYOUT("payout"),
        @SerializedName("stake")
        STAKE("stake");
        private final String value;
        private final static Map<String, Parameters.Basis> CONSTANTS = new HashMap<String, Parameters.Basis>();

        static {
            for (Parameters.Basis c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Basis(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Parameters.Basis fromValue(String value) {
            Parameters.Basis constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DurationUnit {

        @SerializedName("d")
        D("d"),
        @SerializedName("m")
        M("m"),
        @SerializedName("s")
        S("s"),
        @SerializedName("h")
        H("h"),
        @SerializedName("t")
        T("t");
        private final String value;
        private final static Map<String, Parameters.DurationUnit> CONSTANTS = new HashMap<String, Parameters.DurationUnit>();

        static {
            for (Parameters.DurationUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DurationUnit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Parameters.DurationUnit fromValue(String value) {
            Parameters.DurationUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum StopType {

        @SerializedName("dollar")
        DOLLAR("dollar"),
        @SerializedName("point")
        POINT("point");
        private final String value;
        private final static Map<String, Parameters.StopType> CONSTANTS = new HashMap<String, Parameters.StopType>();

        static {
            for (Parameters.StopType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StopType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Parameters.StopType fromValue(String value) {
            Parameters.StopType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
