
package data.binaryAPI.commandsUnused.get_financial_assessment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Assessment details
 * <p>
 * Client's financial asessment details
 * 
 */
public class GetFinancialAssessment implements Serializable
{

    /**
     * Total score based on client's answer for financial assessment
     * 
     */
    @SerializedName("score")
    @Expose
    private Integer score;
    /**
     * Forex trading frequency
     * 
     */
    @SerializedName("forex_trading_frequency")
    @Expose
    private String forexTradingFrequency;
    /**
     * Forex trading experience
     * 
     */
    @SerializedName("forex_trading_experience")
    @Expose
    private String forexTradingExperience;
    /**
     * Indices trading frequency
     * 
     */
    @SerializedName("indices_trading_frequency")
    @Expose
    private String indicesTradingFrequency;
    /**
     * Indices trading experience
     * 
     */
    @SerializedName("indices_trading_experience")
    @Expose
    private String indicesTradingExperience;
    /**
     * Commodities trading frequency
     * 
     */
    @SerializedName("commodities_trading_frequency")
    @Expose
    private String commoditiesTradingFrequency;
    /**
     * Commodities trading experience
     * 
     */
    @SerializedName("commodities_trading_experience")
    @Expose
    private String commoditiesTradingExperience;
    /**
     * Stocks trading experience
     * 
     */
    @SerializedName("stocks_trading_experience")
    @Expose
    private String stocksTradingExperience;
    /**
     * Stocks trading frequency
     * 
     */
    @SerializedName("stocks_trading_frequency")
    @Expose
    private String stocksTradingFrequency;
    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    @SerializedName("other_derivatives_trading_frequency")
    @Expose
    private String otherDerivativesTradingFrequency;
    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    @SerializedName("other_derivatives_trading_experience")
    @Expose
    private String otherDerivativesTradingExperience;
    /**
     * Other financial instruments trading frequency
     * 
     */
    @SerializedName("other_instruments_trading_frequency")
    @Expose
    private String otherInstrumentsTradingFrequency;
    /**
     * Other financial instruments trading experience
     * 
     */
    @SerializedName("other_instruments_trading_experience")
    @Expose
    private String otherInstrumentsTradingExperience;
    /**
     * Industry of Employment
     * 
     */
    @SerializedName("employment_industry")
    @Expose
    private String employmentIndustry;
    /**
     * Level of Education
     * 
     */
    @SerializedName("education_level")
    @Expose
    private String educationLevel;
    /**
     * Income Source
     * 
     */
    @SerializedName("income_source")
    @Expose
    private String incomeSource;
    /**
     * Net Annual Income
     * 
     */
    @SerializedName("net_income")
    @Expose
    private String netIncome;
    /**
     * Estimated Net Worth
     * 
     */
    @SerializedName("estimated_worth")
    @Expose
    private String estimatedWorth;
    private final static long serialVersionUID = 331693499184951885L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetFinancialAssessment() {
    }

    /**
     * 
     * @param stocksTradingExperience
     * @param forexTradingExperience
     * @param indicesTradingExperience
     * @param otherInstrumentsTradingFrequency
     * @param estimatedWorth
     * @param indicesTradingFrequency
     * @param stocksTradingFrequency
     * @param score
     * @param otherDerivativesTradingExperience
     * @param commoditiesTradingExperience
     * @param employmentIndustry
     * @param educationLevel
     * @param otherDerivativesTradingFrequency
     * @param netIncome
     * @param commoditiesTradingFrequency
     * @param incomeSource
     * @param otherInstrumentsTradingExperience
     * @param forexTradingFrequency
     */
    public GetFinancialAssessment(Integer score, String forexTradingFrequency, String forexTradingExperience, String indicesTradingFrequency, String indicesTradingExperience, String commoditiesTradingFrequency, String commoditiesTradingExperience, String stocksTradingExperience, String stocksTradingFrequency, String otherDerivativesTradingFrequency, String otherDerivativesTradingExperience, String otherInstrumentsTradingFrequency, String otherInstrumentsTradingExperience, String employmentIndustry, String educationLevel, String incomeSource, String netIncome, String estimatedWorth) {
        super();
        this.score = score;
        this.forexTradingFrequency = forexTradingFrequency;
        this.forexTradingExperience = forexTradingExperience;
        this.indicesTradingFrequency = indicesTradingFrequency;
        this.indicesTradingExperience = indicesTradingExperience;
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
        this.commoditiesTradingExperience = commoditiesTradingExperience;
        this.stocksTradingExperience = stocksTradingExperience;
        this.stocksTradingFrequency = stocksTradingFrequency;
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
        this.employmentIndustry = employmentIndustry;
        this.educationLevel = educationLevel;
        this.incomeSource = incomeSource;
        this.netIncome = netIncome;
        this.estimatedWorth = estimatedWorth;
    }

    /**
     * Total score based on client's answer for financial assessment
     * 
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Total score based on client's answer for financial assessment
     * 
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Forex trading frequency
     * 
     */
    public String getForexTradingFrequency() {
        return forexTradingFrequency;
    }

    /**
     * Forex trading frequency
     * 
     */
    public void setForexTradingFrequency(String forexTradingFrequency) {
        this.forexTradingFrequency = forexTradingFrequency;
    }

    /**
     * Forex trading experience
     * 
     */
    public String getForexTradingExperience() {
        return forexTradingExperience;
    }

    /**
     * Forex trading experience
     * 
     */
    public void setForexTradingExperience(String forexTradingExperience) {
        this.forexTradingExperience = forexTradingExperience;
    }

    /**
     * Indices trading frequency
     * 
     */
    public String getIndicesTradingFrequency() {
        return indicesTradingFrequency;
    }

    /**
     * Indices trading frequency
     * 
     */
    public void setIndicesTradingFrequency(String indicesTradingFrequency) {
        this.indicesTradingFrequency = indicesTradingFrequency;
    }

    /**
     * Indices trading experience
     * 
     */
    public String getIndicesTradingExperience() {
        return indicesTradingExperience;
    }

    /**
     * Indices trading experience
     * 
     */
    public void setIndicesTradingExperience(String indicesTradingExperience) {
        this.indicesTradingExperience = indicesTradingExperience;
    }

    /**
     * Commodities trading frequency
     * 
     */
    public String getCommoditiesTradingFrequency() {
        return commoditiesTradingFrequency;
    }

    /**
     * Commodities trading frequency
     * 
     */
    public void setCommoditiesTradingFrequency(String commoditiesTradingFrequency) {
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
    }

    /**
     * Commodities trading experience
     * 
     */
    public String getCommoditiesTradingExperience() {
        return commoditiesTradingExperience;
    }

    /**
     * Commodities trading experience
     * 
     */
    public void setCommoditiesTradingExperience(String commoditiesTradingExperience) {
        this.commoditiesTradingExperience = commoditiesTradingExperience;
    }

    /**
     * Stocks trading experience
     * 
     */
    public String getStocksTradingExperience() {
        return stocksTradingExperience;
    }

    /**
     * Stocks trading experience
     * 
     */
    public void setStocksTradingExperience(String stocksTradingExperience) {
        this.stocksTradingExperience = stocksTradingExperience;
    }

    /**
     * Stocks trading frequency
     * 
     */
    public String getStocksTradingFrequency() {
        return stocksTradingFrequency;
    }

    /**
     * Stocks trading frequency
     * 
     */
    public void setStocksTradingFrequency(String stocksTradingFrequency) {
        this.stocksTradingFrequency = stocksTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    public String getOtherDerivativesTradingFrequency() {
        return otherDerivativesTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * 
     */
    public void setOtherDerivativesTradingFrequency(String otherDerivativesTradingFrequency) {
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    public String getOtherDerivativesTradingExperience() {
        return otherDerivativesTradingExperience;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * 
     */
    public void setOtherDerivativesTradingExperience(String otherDerivativesTradingExperience) {
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
    }

    /**
     * Other financial instruments trading frequency
     * 
     */
    public String getOtherInstrumentsTradingFrequency() {
        return otherInstrumentsTradingFrequency;
    }

    /**
     * Other financial instruments trading frequency
     * 
     */
    public void setOtherInstrumentsTradingFrequency(String otherInstrumentsTradingFrequency) {
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
    }

    /**
     * Other financial instruments trading experience
     * 
     */
    public String getOtherInstrumentsTradingExperience() {
        return otherInstrumentsTradingExperience;
    }

    /**
     * Other financial instruments trading experience
     * 
     */
    public void setOtherInstrumentsTradingExperience(String otherInstrumentsTradingExperience) {
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
    }

    /**
     * Industry of Employment
     * 
     */
    public String getEmploymentIndustry() {
        return employmentIndustry;
    }

    /**
     * Industry of Employment
     * 
     */
    public void setEmploymentIndustry(String employmentIndustry) {
        this.employmentIndustry = employmentIndustry;
    }

    /**
     * Level of Education
     * 
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Level of Education
     * 
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * Income Source
     * 
     */
    public String getIncomeSource() {
        return incomeSource;
    }

    /**
     * Income Source
     * 
     */
    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    /**
     * Net Annual Income
     * 
     */
    public String getNetIncome() {
        return netIncome;
    }

    /**
     * Net Annual Income
     * 
     */
    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    /**
     * Estimated Net Worth
     * 
     */
    public String getEstimatedWorth() {
        return estimatedWorth;
    }

    /**
     * Estimated Net Worth
     * 
     */
    public void setEstimatedWorth(String estimatedWorth) {
        this.estimatedWorth = estimatedWorth;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(score).append(forexTradingFrequency).append(forexTradingExperience).append(indicesTradingFrequency).append(indicesTradingExperience).append(commoditiesTradingFrequency).append(commoditiesTradingExperience).append(stocksTradingExperience).append(stocksTradingFrequency).append(otherDerivativesTradingFrequency).append(otherDerivativesTradingExperience).append(otherInstrumentsTradingFrequency).append(otherInstrumentsTradingExperience).append(employmentIndustry).append(educationLevel).append(incomeSource).append(netIncome).append(estimatedWorth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetFinancialAssessment) == false) {
            return false;
        }
        GetFinancialAssessment rhs = ((GetFinancialAssessment) other);
        return new EqualsBuilder().append(score, rhs.score).append(forexTradingFrequency, rhs.forexTradingFrequency).append(forexTradingExperience, rhs.forexTradingExperience).append(indicesTradingFrequency, rhs.indicesTradingFrequency).append(indicesTradingExperience, rhs.indicesTradingExperience).append(commoditiesTradingFrequency, rhs.commoditiesTradingFrequency).append(commoditiesTradingExperience, rhs.commoditiesTradingExperience).append(stocksTradingExperience, rhs.stocksTradingExperience).append(stocksTradingFrequency, rhs.stocksTradingFrequency).append(otherDerivativesTradingFrequency, rhs.otherDerivativesTradingFrequency).append(otherDerivativesTradingExperience, rhs.otherDerivativesTradingExperience).append(otherInstrumentsTradingFrequency, rhs.otherInstrumentsTradingFrequency).append(otherInstrumentsTradingExperience, rhs.otherInstrumentsTradingExperience).append(employmentIndustry, rhs.employmentIndustry).append(educationLevel, rhs.educationLevel).append(incomeSource, rhs.incomeSource).append(netIncome, rhs.netIncome).append(estimatedWorth, rhs.estimatedWorth).isEquals();
    }

}
