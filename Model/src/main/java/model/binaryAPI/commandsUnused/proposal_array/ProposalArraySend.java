
package data.binaryAPI.commandsUnused.proposal_array;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Get latest prices for a specific contract with different barriers
 * <p>
 * Get latest prices for a specific contract with different barriers
 * 
 */
public class ProposalArraySend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("proposal_array")
    @Expose
    private Integer proposalArray;
    /**
     *  1 - to initiate a realtime stream of prices. Note that tick trades, digit trades and less than 24 hours at-the-money contracts for the following underlying symbols are not streamed: R_100 R_50 R_25 R_75 RDBULL RDBEAR (this is because their price is constant).
     * 
     */
    @SerializedName("subscribe")
    @Expose
    private Integer subscribe;
    /**
     * Proposed contract payout or stake value
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
    private ProposalArraySend.Basis basis;
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
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks). If this parameter is not set then duration will be counted as seconds.
     * 
     */
    @SerializedName("duration_unit")
    @Expose
    private ProposalArraySend.DurationUnit durationUnit;
    /**
     * Symbol code
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Array of barrier(s) for the contract
     * 
     */
    @SerializedName("barriers")
    @Expose
    private List<Barrier> barriers = new ArrayList<Barrier>();
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
    private ProposalArraySend.StopType stopType;
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
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -241186563159074958L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalArraySend() {
    }

    /**
     * 
     * @param symbol
     * @param amount
     * @param subscribe
     * @param contractType
     * @param dateExpiry
     * @param stopType
     * @param basis
     * @param amountPerPoint
     * @param reqId
     * @param duration
     * @param barriers
     * @param dateStart
     * @param stopLoss
     * @param passthrough
     * @param proposalArray
     * @param currency
     * @param durationUnit
     * @param stopProfit
     * @param tradingPeriodStart
     */
    public ProposalArraySend(Integer proposalArray, Integer subscribe, Double amount, ProposalArraySend.Basis basis, String contractType, String currency, Integer dateStart, Integer dateExpiry, Integer duration, ProposalArraySend.DurationUnit durationUnit, String symbol, List<Barrier> barriers, Double amountPerPoint, ProposalArraySend.StopType stopType, Double stopProfit, Double stopLoss, Integer tradingPeriodStart, Passthrough passthrough, Integer reqId) {
        super();
        this.proposalArray = proposalArray;
        this.subscribe = subscribe;
        this.amount = amount;
        this.basis = basis;
        this.contractType = contractType;
        this.currency = currency;
        this.dateStart = dateStart;
        this.dateExpiry = dateExpiry;
        this.duration = duration;
        this.durationUnit = durationUnit;
        this.symbol = symbol;
        this.barriers = barriers;
        this.amountPerPoint = amountPerPoint;
        this.stopType = stopType;
        this.stopProfit = stopProfit;
        this.stopLoss = stopLoss;
        this.tradingPeriodStart = tradingPeriodStart;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getProposalArray() {
        return proposalArray;
    }

    /**
     * Must be 1
     * 
     */
    public void setProposalArray(Integer proposalArray) {
        this.proposalArray = proposalArray;
    }

    /**
     *  1 - to initiate a realtime stream of prices. Note that tick trades, digit trades and less than 24 hours at-the-money contracts for the following underlying symbols are not streamed: R_100 R_50 R_25 R_75 RDBULL RDBEAR (this is because their price is constant).
     * 
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     *  1 - to initiate a realtime stream of prices. Note that tick trades, digit trades and less than 24 hours at-the-money contracts for the following underlying symbols are not streamed: R_100 R_50 R_25 R_75 RDBULL RDBEAR (this is because their price is constant).
     * 
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * Proposed contract payout or stake value
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Proposed contract payout or stake value
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Indicate whether amount is 'payout' or 'stake'
     * 
     */
    public ProposalArraySend.Basis getBasis() {
        return basis;
    }

    /**
     * Indicate whether amount is 'payout' or 'stake'
     * 
     */
    public void setBasis(ProposalArraySend.Basis basis) {
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
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks). If this parameter is not set then duration will be counted as seconds.
     * 
     */
    public ProposalArraySend.DurationUnit getDurationUnit() {
        return durationUnit;
    }

    /**
     * Duration unit is s(seconds), m(minutes), h(hours), d(days), t(ticks). If this parameter is not set then duration will be counted as seconds.
     * 
     */
    public void setDurationUnit(ProposalArraySend.DurationUnit durationUnit) {
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
     * Array of barrier(s) for the contract
     * 
     */
    public List<Barrier> getBarriers() {
        return barriers;
    }

    /**
     * Array of barrier(s) for the contract
     * 
     */
    public void setBarriers(List<Barrier> barriers) {
        this.barriers = barriers;
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
    public ProposalArraySend.StopType getStopType() {
        return stopType;
    }

    /**
     * [For spread contracts only] Stop type (dollar or point)
     * 
     */
    public void setStopType(ProposalArraySend.StopType stopType) {
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

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public Passthrough getPassthrough() {
        return passthrough;
    }

    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    public void setPassthrough(Passthrough passthrough) {
        this.passthrough = passthrough;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field to map request to response
     * 
     */
    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(proposalArray).append(subscribe).append(amount).append(basis).append(contractType).append(currency).append(dateStart).append(dateExpiry).append(duration).append(durationUnit).append(symbol).append(barriers).append(amountPerPoint).append(stopType).append(stopProfit).append(stopLoss).append(tradingPeriodStart).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalArraySend) == false) {
            return false;
        }
        ProposalArraySend rhs = ((ProposalArraySend) other);
        return new EqualsBuilder().append(proposalArray, rhs.proposalArray).append(subscribe, rhs.subscribe).append(amount, rhs.amount).append(basis, rhs.basis).append(contractType, rhs.contractType).append(currency, rhs.currency).append(dateStart, rhs.dateStart).append(dateExpiry, rhs.dateExpiry).append(duration, rhs.duration).append(durationUnit, rhs.durationUnit).append(symbol, rhs.symbol).append(barriers, rhs.barriers).append(amountPerPoint, rhs.amountPerPoint).append(stopType, rhs.stopType).append(stopProfit, rhs.stopProfit).append(stopLoss, rhs.stopLoss).append(tradingPeriodStart, rhs.tradingPeriodStart).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum Basis {

        @SerializedName("payout")
        PAYOUT("payout"),
        @SerializedName("stake")
        STAKE("stake");
        private final String value;
        private final static Map<String, ProposalArraySend.Basis> CONSTANTS = new HashMap<String, ProposalArraySend.Basis>();

        static {
            for (ProposalArraySend.Basis c: values()) {
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

        public static ProposalArraySend.Basis fromValue(String value) {
            ProposalArraySend.Basis constant = CONSTANTS.get(value);
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
        private final static Map<String, ProposalArraySend.DurationUnit> CONSTANTS = new HashMap<String, ProposalArraySend.DurationUnit>();

        static {
            for (ProposalArraySend.DurationUnit c: values()) {
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

        public static ProposalArraySend.DurationUnit fromValue(String value) {
            ProposalArraySend.DurationUnit constant = CONSTANTS.get(value);
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
        private final static Map<String, ProposalArraySend.StopType> CONSTANTS = new HashMap<String, ProposalArraySend.StopType>();

        static {
            for (ProposalArraySend.StopType c: values()) {
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

        public static ProposalArraySend.StopType fromValue(String value) {
            ProposalArraySend.StopType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
