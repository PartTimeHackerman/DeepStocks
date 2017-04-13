
package data.binaryAPI.commandsUnused.set_financial_assessment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Save Financial assessment details send
 * <p>
 * This call sets the financial assessement details based on the client's answers to analyse whether he possess the experience and knowledge to understand the risks involved with binary options trading.
 * 
 */
public class SetFinancialAssessmentSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("set_financial_assessment")
    @Expose
    private Integer setFinancialAssessment;
    /**
     * Forex trading experience
     * 
     */
    @SerializedName("forex_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.ForexTradingExperience forexTradingExperience;
    /**
     * Forex trading frequency
     * 
     */
    @SerializedName("forex_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.ForexTradingFrequency forexTradingFrequency;
    /**
     * Indices trading experience
     * 
     */
    @SerializedName("indices_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.IndicesTradingExperience indicesTradingExperience;
    /**
     * Indices trading frequency
     * 
     */
    @SerializedName("indices_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.IndicesTradingFrequency indicesTradingFrequency;
    /**
     * Commodities trading experience
     * 
     */
    @SerializedName("commodities_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.CommoditiesTradingExperience commoditiesTradingExperience;
    /**
     * Commodities trading frequency
     * 
     */
    @SerializedName("commodities_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.CommoditiesTradingFrequency commoditiesTradingFrequency;
    /**
     * Stocks trading experience
     * 
     */
    @SerializedName("stocks_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.StocksTradingExperience stocksTradingExperience;
    /**
     * Stocks trading frequency
     * 
     */
    @SerializedName("stocks_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.StocksTradingFrequency stocksTradingFrequency;
    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    @SerializedName("other_derivatives_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience;
    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    @SerializedName("other_derivatives_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency;
    /**
     * Other financial instruments trading experience
     * 
     */
    @SerializedName("other_instruments_trading_experience")
    @Expose
    private SetFinancialAssessmentSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience;
    /**
     * Other financial instruments trading frequency
     * 
     */
    @SerializedName("other_instruments_trading_frequency")
    @Expose
    private SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency;
    /**
     * Industry of Employment
     * 
     */
    @SerializedName("employment_industry")
    @Expose
    private SetFinancialAssessmentSend.EmploymentIndustry employmentIndustry;
    /**
     * Level of Education
     * 
     */
    @SerializedName("education_level")
    @Expose
    private SetFinancialAssessmentSend.EducationLevel educationLevel;
    /**
     * Income Source
     * 
     */
    @SerializedName("income_source")
    @Expose
    private SetFinancialAssessmentSend.IncomeSource incomeSource;
    /**
     * Net Annual Income
     * 
     */
    @SerializedName("net_income")
    @Expose
    private SetFinancialAssessmentSend.NetIncome netIncome;
    /**
     * Estimated Net Worth
     * 
     */
    @SerializedName("estimated_worth")
    @Expose
    private SetFinancialAssessmentSend.EstimatedWorth estimatedWorth;
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
    private final static long serialVersionUID = 479240015103417927L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetFinancialAssessmentSend() {
    }

    /**
     * 
     * @param stocksTradingExperience
     * @param forexTradingExperience
     * @param setFinancialAssessment
     * @param indicesTradingExperience
     * @param otherInstrumentsTradingFrequency
     * @param estimatedWorth
     * @param indicesTradingFrequency
     * @param stocksTradingFrequency
     * @param reqId
     * @param otherDerivativesTradingExperience
     * @param commoditiesTradingExperience
     * @param employmentIndustry
     * @param educationLevel
     * @param otherDerivativesTradingFrequency
     * @param passthrough
     * @param netIncome
     * @param commoditiesTradingFrequency
     * @param incomeSource
     * @param otherInstrumentsTradingExperience
     * @param forexTradingFrequency
     */
    public SetFinancialAssessmentSend(Integer setFinancialAssessment, SetFinancialAssessmentSend.ForexTradingExperience forexTradingExperience, SetFinancialAssessmentSend.ForexTradingFrequency forexTradingFrequency, SetFinancialAssessmentSend.IndicesTradingExperience indicesTradingExperience, SetFinancialAssessmentSend.IndicesTradingFrequency indicesTradingFrequency, SetFinancialAssessmentSend.CommoditiesTradingExperience commoditiesTradingExperience, SetFinancialAssessmentSend.CommoditiesTradingFrequency commoditiesTradingFrequency, SetFinancialAssessmentSend.StocksTradingExperience stocksTradingExperience, SetFinancialAssessmentSend.StocksTradingFrequency stocksTradingFrequency, SetFinancialAssessmentSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience, SetFinancialAssessmentSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency, SetFinancialAssessmentSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience, SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency, SetFinancialAssessmentSend.EmploymentIndustry employmentIndustry, SetFinancialAssessmentSend.EducationLevel educationLevel, SetFinancialAssessmentSend.IncomeSource incomeSource, SetFinancialAssessmentSend.NetIncome netIncome, SetFinancialAssessmentSend.EstimatedWorth estimatedWorth, Passthrough passthrough, Integer reqId) {
        super();
        this.setFinancialAssessment = setFinancialAssessment;
        this.forexTradingExperience = forexTradingExperience;
        this.forexTradingFrequency = forexTradingFrequency;
        this.indicesTradingExperience = indicesTradingExperience;
        this.indicesTradingFrequency = indicesTradingFrequency;
        this.commoditiesTradingExperience = commoditiesTradingExperience;
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
        this.stocksTradingExperience = stocksTradingExperience;
        this.stocksTradingFrequency = stocksTradingFrequency;
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
        this.employmentIndustry = employmentIndustry;
        this.educationLevel = educationLevel;
        this.incomeSource = incomeSource;
        this.netIncome = netIncome;
        this.estimatedWorth = estimatedWorth;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getSetFinancialAssessment() {
        return setFinancialAssessment;
    }

    /**
     * Must be 1
     * 
     */
    public void setSetFinancialAssessment(Integer setFinancialAssessment) {
        this.setFinancialAssessment = setFinancialAssessment;
    }

    /**
     * Forex trading experience
     * 
     */
    public SetFinancialAssessmentSend.ForexTradingExperience getForexTradingExperience() {
        return forexTradingExperience;
    }

    /**
     * Forex trading experience
     * 
     */
    public void setForexTradingExperience(SetFinancialAssessmentSend.ForexTradingExperience forexTradingExperience) {
        this.forexTradingExperience = forexTradingExperience;
    }

    /**
     * Forex trading frequency
     * 
     */
    public SetFinancialAssessmentSend.ForexTradingFrequency getForexTradingFrequency() {
        return forexTradingFrequency;
    }

    /**
     * Forex trading frequency
     * 
     */
    public void setForexTradingFrequency(SetFinancialAssessmentSend.ForexTradingFrequency forexTradingFrequency) {
        this.forexTradingFrequency = forexTradingFrequency;
    }

    /**
     * Indices trading experience
     * 
     */
    public SetFinancialAssessmentSend.IndicesTradingExperience getIndicesTradingExperience() {
        return indicesTradingExperience;
    }

    /**
     * Indices trading experience
     * 
     */
    public void setIndicesTradingExperience(SetFinancialAssessmentSend.IndicesTradingExperience indicesTradingExperience) {
        this.indicesTradingExperience = indicesTradingExperience;
    }

    /**
     * Indices trading frequency
     * 
     */
    public SetFinancialAssessmentSend.IndicesTradingFrequency getIndicesTradingFrequency() {
        return indicesTradingFrequency;
    }

    /**
     * Indices trading frequency
     * 
     */
    public void setIndicesTradingFrequency(SetFinancialAssessmentSend.IndicesTradingFrequency indicesTradingFrequency) {
        this.indicesTradingFrequency = indicesTradingFrequency;
    }

    /**
     * Commodities trading experience
     * 
     */
    public SetFinancialAssessmentSend.CommoditiesTradingExperience getCommoditiesTradingExperience() {
        return commoditiesTradingExperience;
    }

    /**
     * Commodities trading experience
     * 
     */
    public void setCommoditiesTradingExperience(SetFinancialAssessmentSend.CommoditiesTradingExperience commoditiesTradingExperience) {
        this.commoditiesTradingExperience = commoditiesTradingExperience;
    }

    /**
     * Commodities trading frequency
     * 
     */
    public SetFinancialAssessmentSend.CommoditiesTradingFrequency getCommoditiesTradingFrequency() {
        return commoditiesTradingFrequency;
    }

    /**
     * Commodities trading frequency
     * 
     */
    public void setCommoditiesTradingFrequency(SetFinancialAssessmentSend.CommoditiesTradingFrequency commoditiesTradingFrequency) {
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
    }

    /**
     * Stocks trading experience
     * 
     */
    public SetFinancialAssessmentSend.StocksTradingExperience getStocksTradingExperience() {
        return stocksTradingExperience;
    }

    /**
     * Stocks trading experience
     * 
     */
    public void setStocksTradingExperience(SetFinancialAssessmentSend.StocksTradingExperience stocksTradingExperience) {
        this.stocksTradingExperience = stocksTradingExperience;
    }

    /**
     * Stocks trading frequency
     * 
     */
    public SetFinancialAssessmentSend.StocksTradingFrequency getStocksTradingFrequency() {
        return stocksTradingFrequency;
    }

    /**
     * Stocks trading frequency
     * 
     */
    public void setStocksTradingFrequency(SetFinancialAssessmentSend.StocksTradingFrequency stocksTradingFrequency) {
        this.stocksTradingFrequency = stocksTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    public SetFinancialAssessmentSend.OtherDerivativesTradingExperience getOtherDerivativesTradingExperience() {
        return otherDerivativesTradingExperience;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    public void setOtherDerivativesTradingExperience(SetFinancialAssessmentSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience) {
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    public SetFinancialAssessmentSend.OtherDerivativesTradingFrequency getOtherDerivativesTradingFrequency() {
        return otherDerivativesTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    public void setOtherDerivativesTradingFrequency(SetFinancialAssessmentSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency) {
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
    }

    /**
     * Other financial instruments trading experience
     * 
     */
    public SetFinancialAssessmentSend.OtherInstrumentsTradingExperience getOtherInstrumentsTradingExperience() {
        return otherInstrumentsTradingExperience;
    }

    /**
     * Other financial instruments trading experience
     * 
     */
    public void setOtherInstrumentsTradingExperience(SetFinancialAssessmentSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience) {
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
    }

    /**
     * Other financial instruments trading frequency
     * 
     */
    public SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency getOtherInstrumentsTradingFrequency() {
        return otherInstrumentsTradingFrequency;
    }

    /**
     * Other financial instruments trading frequency
     * 
     */
    public void setOtherInstrumentsTradingFrequency(SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency) {
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
    }

    /**
     * Industry of Employment
     * 
     */
    public SetFinancialAssessmentSend.EmploymentIndustry getEmploymentIndustry() {
        return employmentIndustry;
    }

    /**
     * Industry of Employment
     * 
     */
    public void setEmploymentIndustry(SetFinancialAssessmentSend.EmploymentIndustry employmentIndustry) {
        this.employmentIndustry = employmentIndustry;
    }

    /**
     * Level of Education
     * 
     */
    public SetFinancialAssessmentSend.EducationLevel getEducationLevel() {
        return educationLevel;
    }

    /**
     * Level of Education
     * 
     */
    public void setEducationLevel(SetFinancialAssessmentSend.EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * Income Source
     * 
     */
    public SetFinancialAssessmentSend.IncomeSource getIncomeSource() {
        return incomeSource;
    }

    /**
     * Income Source
     * 
     */
    public void setIncomeSource(SetFinancialAssessmentSend.IncomeSource incomeSource) {
        this.incomeSource = incomeSource;
    }

    /**
     * Net Annual Income
     * 
     */
    public SetFinancialAssessmentSend.NetIncome getNetIncome() {
        return netIncome;
    }

    /**
     * Net Annual Income
     * 
     */
    public void setNetIncome(SetFinancialAssessmentSend.NetIncome netIncome) {
        this.netIncome = netIncome;
    }

    /**
     * Estimated Net Worth
     * 
     */
    public SetFinancialAssessmentSend.EstimatedWorth getEstimatedWorth() {
        return estimatedWorth;
    }

    /**
     * Estimated Net Worth
     * 
     */
    public void setEstimatedWorth(SetFinancialAssessmentSend.EstimatedWorth estimatedWorth) {
        this.estimatedWorth = estimatedWorth;
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
        return new HashCodeBuilder().append(setFinancialAssessment).append(forexTradingExperience).append(forexTradingFrequency).append(indicesTradingExperience).append(indicesTradingFrequency).append(commoditiesTradingExperience).append(commoditiesTradingFrequency).append(stocksTradingExperience).append(stocksTradingFrequency).append(otherDerivativesTradingExperience).append(otherDerivativesTradingFrequency).append(otherInstrumentsTradingExperience).append(otherInstrumentsTradingFrequency).append(employmentIndustry).append(educationLevel).append(incomeSource).append(netIncome).append(estimatedWorth).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetFinancialAssessmentSend) == false) {
            return false;
        }
        SetFinancialAssessmentSend rhs = ((SetFinancialAssessmentSend) other);
        return new EqualsBuilder().append(setFinancialAssessment, rhs.setFinancialAssessment).append(forexTradingExperience, rhs.forexTradingExperience).append(forexTradingFrequency, rhs.forexTradingFrequency).append(indicesTradingExperience, rhs.indicesTradingExperience).append(indicesTradingFrequency, rhs.indicesTradingFrequency).append(commoditiesTradingExperience, rhs.commoditiesTradingExperience).append(commoditiesTradingFrequency, rhs.commoditiesTradingFrequency).append(stocksTradingExperience, rhs.stocksTradingExperience).append(stocksTradingFrequency, rhs.stocksTradingFrequency).append(otherDerivativesTradingExperience, rhs.otherDerivativesTradingExperience).append(otherDerivativesTradingFrequency, rhs.otherDerivativesTradingFrequency).append(otherInstrumentsTradingExperience, rhs.otherInstrumentsTradingExperience).append(otherInstrumentsTradingFrequency, rhs.otherInstrumentsTradingFrequency).append(employmentIndustry, rhs.employmentIndustry).append(educationLevel, rhs.educationLevel).append(incomeSource, rhs.incomeSource).append(netIncome, rhs.netIncome).append(estimatedWorth, rhs.estimatedWorth).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum CommoditiesTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.CommoditiesTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.CommoditiesTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.CommoditiesTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CommoditiesTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.CommoditiesTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.CommoditiesTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CommoditiesTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.CommoditiesTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.CommoditiesTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.CommoditiesTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CommoditiesTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.CommoditiesTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.CommoditiesTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EducationLevel {

        @SerializedName("Primary")
        PRIMARY("Primary"),
        @SerializedName("Secondary")
        SECONDARY("Secondary"),
        @SerializedName("Tertiary")
        TERTIARY("Tertiary");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.EducationLevel> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.EducationLevel>();

        static {
            for (SetFinancialAssessmentSend.EducationLevel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EducationLevel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.EducationLevel fromValue(String value) {
            SetFinancialAssessmentSend.EducationLevel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EmploymentIndustry {

        @SerializedName("Construction")
        CONSTRUCTION("Construction"),
        @SerializedName("Education")
        EDUCATION("Education"),
        @SerializedName("Finance")
        FINANCE("Finance"),
        @SerializedName("Health")
        HEALTH("Health"),
        @SerializedName("Tourism")
        TOURISM("Tourism"),
        @SerializedName("Other")
        OTHER("Other");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.EmploymentIndustry> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.EmploymentIndustry>();

        static {
            for (SetFinancialAssessmentSend.EmploymentIndustry c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EmploymentIndustry(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.EmploymentIndustry fromValue(String value) {
            SetFinancialAssessmentSend.EmploymentIndustry constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EstimatedWorth {

        @SerializedName("Less than $100,000")
        LESS_THAN_$_100_000("Less than $100,000"),
        @SerializedName("$100,000 - $250,000")
        $_100_000_$_250_000("$100,000 - $250,000"),
        @SerializedName("$250,001 - $500,000")
        $_250_001_$_500_000("$250,001 - $500,000"),
        @SerializedName("$500,001 - $1,000,000")
        $_500_001_$_1_000_000("$500,001 - $1,000,000"),
        @SerializedName("Over $1,000,000")
        OVER_$_1_000_000("Over $1,000,000");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.EstimatedWorth> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.EstimatedWorth>();

        static {
            for (SetFinancialAssessmentSend.EstimatedWorth c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EstimatedWorth(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.EstimatedWorth fromValue(String value) {
            SetFinancialAssessmentSend.EstimatedWorth constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ForexTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.ForexTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.ForexTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.ForexTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ForexTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.ForexTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.ForexTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ForexTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.ForexTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.ForexTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.ForexTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ForexTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.ForexTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.ForexTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum IncomeSource {

        @SerializedName("Salaried Employee")
        SALARIED_EMPLOYEE("Salaried Employee"),
        @SerializedName("Self-Employed")
        SELF_EMPLOYED("Self-Employed"),
        @SerializedName("Investments & Dividends")
        INVESTMENTS_DIVIDENDS("Investments & Dividends"),
        @SerializedName("Pension")
        PENSION("Pension"),
        @SerializedName("Other")
        OTHER("Other");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.IncomeSource> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.IncomeSource>();

        static {
            for (SetFinancialAssessmentSend.IncomeSource c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IncomeSource(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.IncomeSource fromValue(String value) {
            SetFinancialAssessmentSend.IncomeSource constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum IndicesTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.IndicesTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.IndicesTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.IndicesTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IndicesTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.IndicesTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.IndicesTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum IndicesTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.IndicesTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.IndicesTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.IndicesTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IndicesTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.IndicesTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.IndicesTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum NetIncome {

        @SerializedName("Less than $25,000")
        LESS_THAN_$_25_000("Less than $25,000"),
        @SerializedName("$25,000 - $50,000")
        $_25_000_$_50_000("$25,000 - $50,000"),
        @SerializedName("$50,001 - $100,000")
        $_50_001_$_100_000("$50,001 - $100,000"),
        @SerializedName("$100,001 - $500,000")
        $_100_001_$_500_000("$100,001 - $500,000"),
        @SerializedName("Over $500,000")
        OVER_$_500_000("Over $500,000");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.NetIncome> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.NetIncome>();

        static {
            for (SetFinancialAssessmentSend.NetIncome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NetIncome(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.NetIncome fromValue(String value) {
            SetFinancialAssessmentSend.NetIncome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherDerivativesTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.OtherDerivativesTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.OtherDerivativesTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.OtherDerivativesTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherDerivativesTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.OtherDerivativesTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.OtherDerivativesTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherDerivativesTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.OtherDerivativesTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.OtherDerivativesTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.OtherDerivativesTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherDerivativesTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.OtherDerivativesTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.OtherDerivativesTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherInstrumentsTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.OtherInstrumentsTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.OtherInstrumentsTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.OtherInstrumentsTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherInstrumentsTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.OtherInstrumentsTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.OtherInstrumentsTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherInstrumentsTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherInstrumentsTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.OtherInstrumentsTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum StocksTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.StocksTradingExperience> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.StocksTradingExperience>();

        static {
            for (SetFinancialAssessmentSend.StocksTradingExperience c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StocksTradingExperience(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.StocksTradingExperience fromValue(String value) {
            SetFinancialAssessmentSend.StocksTradingExperience constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum StocksTradingFrequency {

        @SerializedName("0-5 transactions in the past 12 months")
        _0_5_TRANSACTIONS_IN_THE_PAST_12_MONTHS("0-5 transactions in the past 12 months"),
        @SerializedName("6-10 transactions in the past 12 months")
        _6_10_TRANSACTIONS_IN_THE_PAST_12_MONTHS("6-10 transactions in the past 12 months"),
        @SerializedName("40 transactions or more in the past 12 months")
        _40_TRANSACTIONS_OR_MORE_IN_THE_PAST_12_MONTHS("40 transactions or more in the past 12 months");
        private final String value;
        private final static Map<String, SetFinancialAssessmentSend.StocksTradingFrequency> CONSTANTS = new HashMap<String, SetFinancialAssessmentSend.StocksTradingFrequency>();

        static {
            for (SetFinancialAssessmentSend.StocksTradingFrequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StocksTradingFrequency(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SetFinancialAssessmentSend.StocksTradingFrequency fromValue(String value) {
            SetFinancialAssessmentSend.StocksTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
