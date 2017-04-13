
package data.binaryAPI.commandsUnused.new_account_maltainvest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Create maltainvest account Send
 * <p>
 * This call opens a new real-money account with the 'maltainvest' Landing Company. Note: you must be authenticated to Binary (Europe) Ltd or virtual-money account to call this function.
 * 
 */
public class NewAccountMaltainvestSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("new_account_maltainvest")
    @Expose
    private Integer newAccountMaltainvest;
    /**
     * Accept any value in enum list.
     * 
     */
    @SerializedName("salutation")
    @Expose
    private NewAccountMaltainvestSend.Salutation salutation;
    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    @SerializedName("first_name")
    @Expose
    private String firstName;
    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    @SerializedName("last_name")
    @Expose
    private String lastName;
    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    @SerializedName("residence")
    @Expose
    private String residence;
    /**
     * Within 70 characters.
     * 
     */
    @SerializedName("address_line_1")
    @Expose
    private String addressLine1;
    /**
     * Optional field, within 70 characters.
     * 
     */
    @SerializedName("address_line_2")
    @Expose
    private String addressLine2;
    /**
     * Within 35 characters
     * 
     */
    @SerializedName("address_city")
    @Expose
    private String addressCity;
    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    @SerializedName("address_state")
    @Expose
    private String addressState;
    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    @SerializedName("address_postcode")
    @Expose
    private String addressPostcode;
    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * Accept any value in enum list.
     * 
     */
    @SerializedName("secret_question")
    @Expose
    private NewAccountMaltainvestSend.SecretQuestion secretQuestion;
    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    @SerializedName("secret_answer")
    @Expose
    private String secretAnswer;
    /**
     * Affiliate token, within 32 characters.
     * 
     */
    @SerializedName("affiliate_token")
    @Expose
    private String affiliateToken;
    /**
     * Forex trading experience
     * (Required)
     * 
     */
    @SerializedName("forex_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.ForexTradingExperience forexTradingExperience;
    /**
     * Forex trading frequency
     * (Required)
     * 
     */
    @SerializedName("forex_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.ForexTradingFrequency forexTradingFrequency;
    /**
     * Indices trading experience
     * (Required)
     * 
     */
    @SerializedName("indices_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.IndicesTradingExperience indicesTradingExperience;
    /**
     * Indices trading frequency
     * (Required)
     * 
     */
    @SerializedName("indices_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.IndicesTradingFrequency indicesTradingFrequency;
    /**
     * Commodities trading experience
     * (Required)
     * 
     */
    @SerializedName("commodities_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.CommoditiesTradingExperience commoditiesTradingExperience;
    /**
     * Commodities trading frequency
     * (Required)
     * 
     */
    @SerializedName("commodities_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.CommoditiesTradingFrequency commoditiesTradingFrequency;
    /**
     * Stocks trading experience
     * (Required)
     * 
     */
    @SerializedName("stocks_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.StocksTradingExperience stocksTradingExperience;
    /**
     * Stocks trading frequency
     * (Required)
     * 
     */
    @SerializedName("stocks_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.StocksTradingFrequency stocksTradingFrequency;
    /**
     * Binary options or other financial derivatives trading experience
     * (Required)
     * 
     */
    @SerializedName("other_derivatives_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience;
    /**
     * Binary options or other financial derivatives trading frequency
     * (Required)
     * 
     */
    @SerializedName("other_derivatives_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency;
    /**
     * Other financial instruments trading experience
     * (Required)
     * 
     */
    @SerializedName("other_instruments_trading_experience")
    @Expose
    private NewAccountMaltainvestSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience;
    /**
     * Other financial instruments trading frequency
     * (Required)
     * 
     */
    @SerializedName("other_instruments_trading_frequency")
    @Expose
    private NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency;
    /**
     * Industry of Employment
     * (Required)
     * 
     */
    @SerializedName("employment_industry")
    @Expose
    private NewAccountMaltainvestSend.EmploymentIndustry employmentIndustry;
    /**
     * Level of Education
     * (Required)
     * 
     */
    @SerializedName("education_level")
    @Expose
    private NewAccountMaltainvestSend.EducationLevel educationLevel;
    /**
     * Income Source
     * (Required)
     * 
     */
    @SerializedName("income_source")
    @Expose
    private NewAccountMaltainvestSend.IncomeSource incomeSource;
    /**
     * Net Annual Income
     * (Required)
     * 
     */
    @SerializedName("net_income")
    @Expose
    private NewAccountMaltainvestSend.NetIncome netIncome;
    /**
     * Estimated Net Worth
     * (Required)
     * 
     */
    @SerializedName("estimated_worth")
    @Expose
    private NewAccountMaltainvestSend.EstimatedWorth estimatedWorth;
    /**
     * Show whether client has accepted risk disclaimer, boolean value 1 or 0
     * (Required)
     * 
     */
    @SerializedName("accept_risk")
    @Expose
    private Integer acceptRisk;
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
    private final static long serialVersionUID = -2150418665363093361L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountMaltainvestSend() {
    }

    /**
     * 
     * @param secretQuestion
     * @param stocksTradingExperience
     * @param lastName
     * @param forexTradingExperience
     * @param secretAnswer
     * @param indicesTradingExperience
     * @param otherInstrumentsTradingFrequency
     * @param stocksTradingFrequency
     * @param otherDerivativesTradingExperience
     * @param commoditiesTradingExperience
     * @param employmentIndustry
     * @param educationLevel
     * @param otherDerivativesTradingFrequency
     * @param passthrough
     * @param addressLine1
     * @param addressLine2
     * @param residence
     * @param otherInstrumentsTradingExperience
     * @param affiliateToken
     * @param addressCity
     * @param newAccountMaltainvest
     * @param addressPostcode
     * @param dateOfBirth
     * @param addressState
     * @param acceptRisk
     * @param estimatedWorth
     * @param indicesTradingFrequency
     * @param reqId
     * @param firstName
     * @param phone
     * @param netIncome
     * @param commoditiesTradingFrequency
     * @param salutation
     * @param incomeSource
     * @param forexTradingFrequency
     */
    public NewAccountMaltainvestSend(Integer newAccountMaltainvest, NewAccountMaltainvestSend.Salutation salutation, String firstName, String lastName, String dateOfBirth, String residence, String addressLine1, String addressLine2, String addressCity, String addressState, String addressPostcode, String phone, NewAccountMaltainvestSend.SecretQuestion secretQuestion, String secretAnswer, String affiliateToken, NewAccountMaltainvestSend.ForexTradingExperience forexTradingExperience, NewAccountMaltainvestSend.ForexTradingFrequency forexTradingFrequency, NewAccountMaltainvestSend.IndicesTradingExperience indicesTradingExperience, NewAccountMaltainvestSend.IndicesTradingFrequency indicesTradingFrequency, NewAccountMaltainvestSend.CommoditiesTradingExperience commoditiesTradingExperience, NewAccountMaltainvestSend.CommoditiesTradingFrequency commoditiesTradingFrequency, NewAccountMaltainvestSend.StocksTradingExperience stocksTradingExperience, NewAccountMaltainvestSend.StocksTradingFrequency stocksTradingFrequency, NewAccountMaltainvestSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience, NewAccountMaltainvestSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency, NewAccountMaltainvestSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience, NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency, NewAccountMaltainvestSend.EmploymentIndustry employmentIndustry, NewAccountMaltainvestSend.EducationLevel educationLevel, NewAccountMaltainvestSend.IncomeSource incomeSource, NewAccountMaltainvestSend.NetIncome netIncome, NewAccountMaltainvestSend.EstimatedWorth estimatedWorth, Integer acceptRisk, Passthrough passthrough, Integer reqId) {
        super();
        this.newAccountMaltainvest = newAccountMaltainvest;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.residence = residence;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.phone = phone;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.affiliateToken = affiliateToken;
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
        this.acceptRisk = acceptRisk;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getNewAccountMaltainvest() {
        return newAccountMaltainvest;
    }

    /**
     * Must be 1
     * 
     */
    public void setNewAccountMaltainvest(Integer newAccountMaltainvest) {
        this.newAccountMaltainvest = newAccountMaltainvest;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public NewAccountMaltainvestSend.Salutation getSalutation() {
        return salutation;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public void setSalutation(NewAccountMaltainvestSend.Salutation salutation) {
        this.salutation = salutation;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    public String getResidence() {
        return residence;
    }

    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * Within 70 characters.
     * 
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Within 70 characters.
     * 
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Optional field, within 70 characters.
     * 
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Optional field, within 70 characters.
     * 
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Within 35 characters
     * 
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Within 35 characters
     * 
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public NewAccountMaltainvestSend.SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public void setSecretQuestion(NewAccountMaltainvestSend.SecretQuestion secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    public String getSecretAnswer() {
        return secretAnswer;
    }

    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public String getAffiliateToken() {
        return affiliateToken;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public void setAffiliateToken(String affiliateToken) {
        this.affiliateToken = affiliateToken;
    }

    /**
     * Forex trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.ForexTradingExperience getForexTradingExperience() {
        return forexTradingExperience;
    }

    /**
     * Forex trading experience
     * (Required)
     * 
     */
    public void setForexTradingExperience(NewAccountMaltainvestSend.ForexTradingExperience forexTradingExperience) {
        this.forexTradingExperience = forexTradingExperience;
    }

    /**
     * Forex trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.ForexTradingFrequency getForexTradingFrequency() {
        return forexTradingFrequency;
    }

    /**
     * Forex trading frequency
     * (Required)
     * 
     */
    public void setForexTradingFrequency(NewAccountMaltainvestSend.ForexTradingFrequency forexTradingFrequency) {
        this.forexTradingFrequency = forexTradingFrequency;
    }

    /**
     * Indices trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.IndicesTradingExperience getIndicesTradingExperience() {
        return indicesTradingExperience;
    }

    /**
     * Indices trading experience
     * (Required)
     * 
     */
    public void setIndicesTradingExperience(NewAccountMaltainvestSend.IndicesTradingExperience indicesTradingExperience) {
        this.indicesTradingExperience = indicesTradingExperience;
    }

    /**
     * Indices trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.IndicesTradingFrequency getIndicesTradingFrequency() {
        return indicesTradingFrequency;
    }

    /**
     * Indices trading frequency
     * (Required)
     * 
     */
    public void setIndicesTradingFrequency(NewAccountMaltainvestSend.IndicesTradingFrequency indicesTradingFrequency) {
        this.indicesTradingFrequency = indicesTradingFrequency;
    }

    /**
     * Commodities trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.CommoditiesTradingExperience getCommoditiesTradingExperience() {
        return commoditiesTradingExperience;
    }

    /**
     * Commodities trading experience
     * (Required)
     * 
     */
    public void setCommoditiesTradingExperience(NewAccountMaltainvestSend.CommoditiesTradingExperience commoditiesTradingExperience) {
        this.commoditiesTradingExperience = commoditiesTradingExperience;
    }

    /**
     * Commodities trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.CommoditiesTradingFrequency getCommoditiesTradingFrequency() {
        return commoditiesTradingFrequency;
    }

    /**
     * Commodities trading frequency
     * (Required)
     * 
     */
    public void setCommoditiesTradingFrequency(NewAccountMaltainvestSend.CommoditiesTradingFrequency commoditiesTradingFrequency) {
        this.commoditiesTradingFrequency = commoditiesTradingFrequency;
    }

    /**
     * Stocks trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.StocksTradingExperience getStocksTradingExperience() {
        return stocksTradingExperience;
    }

    /**
     * Stocks trading experience
     * (Required)
     * 
     */
    public void setStocksTradingExperience(NewAccountMaltainvestSend.StocksTradingExperience stocksTradingExperience) {
        this.stocksTradingExperience = stocksTradingExperience;
    }

    /**
     * Stocks trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.StocksTradingFrequency getStocksTradingFrequency() {
        return stocksTradingFrequency;
    }

    /**
     * Stocks trading frequency
     * (Required)
     * 
     */
    public void setStocksTradingFrequency(NewAccountMaltainvestSend.StocksTradingFrequency stocksTradingFrequency) {
        this.stocksTradingFrequency = stocksTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.OtherDerivativesTradingExperience getOtherDerivativesTradingExperience() {
        return otherDerivativesTradingExperience;
    }

    /**
     * Binary options or other financial derivatives trading experience
     * (Required)
     * 
     */
    public void setOtherDerivativesTradingExperience(NewAccountMaltainvestSend.OtherDerivativesTradingExperience otherDerivativesTradingExperience) {
        this.otherDerivativesTradingExperience = otherDerivativesTradingExperience;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.OtherDerivativesTradingFrequency getOtherDerivativesTradingFrequency() {
        return otherDerivativesTradingFrequency;
    }

    /**
     * Binary options or other financial derivatives trading frequency
     * (Required)
     * 
     */
    public void setOtherDerivativesTradingFrequency(NewAccountMaltainvestSend.OtherDerivativesTradingFrequency otherDerivativesTradingFrequency) {
        this.otherDerivativesTradingFrequency = otherDerivativesTradingFrequency;
    }

    /**
     * Other financial instruments trading experience
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.OtherInstrumentsTradingExperience getOtherInstrumentsTradingExperience() {
        return otherInstrumentsTradingExperience;
    }

    /**
     * Other financial instruments trading experience
     * (Required)
     * 
     */
    public void setOtherInstrumentsTradingExperience(NewAccountMaltainvestSend.OtherInstrumentsTradingExperience otherInstrumentsTradingExperience) {
        this.otherInstrumentsTradingExperience = otherInstrumentsTradingExperience;
    }

    /**
     * Other financial instruments trading frequency
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency getOtherInstrumentsTradingFrequency() {
        return otherInstrumentsTradingFrequency;
    }

    /**
     * Other financial instruments trading frequency
     * (Required)
     * 
     */
    public void setOtherInstrumentsTradingFrequency(NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency otherInstrumentsTradingFrequency) {
        this.otherInstrumentsTradingFrequency = otherInstrumentsTradingFrequency;
    }

    /**
     * Industry of Employment
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.EmploymentIndustry getEmploymentIndustry() {
        return employmentIndustry;
    }

    /**
     * Industry of Employment
     * (Required)
     * 
     */
    public void setEmploymentIndustry(NewAccountMaltainvestSend.EmploymentIndustry employmentIndustry) {
        this.employmentIndustry = employmentIndustry;
    }

    /**
     * Level of Education
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.EducationLevel getEducationLevel() {
        return educationLevel;
    }

    /**
     * Level of Education
     * (Required)
     * 
     */
    public void setEducationLevel(NewAccountMaltainvestSend.EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * Income Source
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.IncomeSource getIncomeSource() {
        return incomeSource;
    }

    /**
     * Income Source
     * (Required)
     * 
     */
    public void setIncomeSource(NewAccountMaltainvestSend.IncomeSource incomeSource) {
        this.incomeSource = incomeSource;
    }

    /**
     * Net Annual Income
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.NetIncome getNetIncome() {
        return netIncome;
    }

    /**
     * Net Annual Income
     * (Required)
     * 
     */
    public void setNetIncome(NewAccountMaltainvestSend.NetIncome netIncome) {
        this.netIncome = netIncome;
    }

    /**
     * Estimated Net Worth
     * (Required)
     * 
     */
    public NewAccountMaltainvestSend.EstimatedWorth getEstimatedWorth() {
        return estimatedWorth;
    }

    /**
     * Estimated Net Worth
     * (Required)
     * 
     */
    public void setEstimatedWorth(NewAccountMaltainvestSend.EstimatedWorth estimatedWorth) {
        this.estimatedWorth = estimatedWorth;
    }

    /**
     * Show whether client has accepted risk disclaimer, boolean value 1 or 0
     * (Required)
     * 
     */
    public Integer getAcceptRisk() {
        return acceptRisk;
    }

    /**
     * Show whether client has accepted risk disclaimer, boolean value 1 or 0
     * (Required)
     * 
     */
    public void setAcceptRisk(Integer acceptRisk) {
        this.acceptRisk = acceptRisk;
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
        return new HashCodeBuilder().append(newAccountMaltainvest).append(salutation).append(firstName).append(lastName).append(dateOfBirth).append(residence).append(addressLine1).append(addressLine2).append(addressCity).append(addressState).append(addressPostcode).append(phone).append(secretQuestion).append(secretAnswer).append(affiliateToken).append(forexTradingExperience).append(forexTradingFrequency).append(indicesTradingExperience).append(indicesTradingFrequency).append(commoditiesTradingExperience).append(commoditiesTradingFrequency).append(stocksTradingExperience).append(stocksTradingFrequency).append(otherDerivativesTradingExperience).append(otherDerivativesTradingFrequency).append(otherInstrumentsTradingExperience).append(otherInstrumentsTradingFrequency).append(employmentIndustry).append(educationLevel).append(incomeSource).append(netIncome).append(estimatedWorth).append(acceptRisk).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountMaltainvestSend) == false) {
            return false;
        }
        NewAccountMaltainvestSend rhs = ((NewAccountMaltainvestSend) other);
        return new EqualsBuilder().append(newAccountMaltainvest, rhs.newAccountMaltainvest).append(salutation, rhs.salutation).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(dateOfBirth, rhs.dateOfBirth).append(residence, rhs.residence).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(addressCity, rhs.addressCity).append(addressState, rhs.addressState).append(addressPostcode, rhs.addressPostcode).append(phone, rhs.phone).append(secretQuestion, rhs.secretQuestion).append(secretAnswer, rhs.secretAnswer).append(affiliateToken, rhs.affiliateToken).append(forexTradingExperience, rhs.forexTradingExperience).append(forexTradingFrequency, rhs.forexTradingFrequency).append(indicesTradingExperience, rhs.indicesTradingExperience).append(indicesTradingFrequency, rhs.indicesTradingFrequency).append(commoditiesTradingExperience, rhs.commoditiesTradingExperience).append(commoditiesTradingFrequency, rhs.commoditiesTradingFrequency).append(stocksTradingExperience, rhs.stocksTradingExperience).append(stocksTradingFrequency, rhs.stocksTradingFrequency).append(otherDerivativesTradingExperience, rhs.otherDerivativesTradingExperience).append(otherDerivativesTradingFrequency, rhs.otherDerivativesTradingFrequency).append(otherInstrumentsTradingExperience, rhs.otherInstrumentsTradingExperience).append(otherInstrumentsTradingFrequency, rhs.otherInstrumentsTradingFrequency).append(employmentIndustry, rhs.employmentIndustry).append(educationLevel, rhs.educationLevel).append(incomeSource, rhs.incomeSource).append(netIncome, rhs.netIncome).append(estimatedWorth, rhs.estimatedWorth).append(acceptRisk, rhs.acceptRisk).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum CommoditiesTradingExperience {

        @SerializedName("0-1 year")
        _0_1_YEAR("0-1 year"),
        @SerializedName("1-2 years")
        _1_2_YEARS("1-2 years"),
        @SerializedName("Over 3 years")
        OVER_3_YEARS("Over 3 years");
        private final String value;
        private final static Map<String, NewAccountMaltainvestSend.CommoditiesTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.CommoditiesTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.CommoditiesTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.CommoditiesTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.CommoditiesTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.CommoditiesTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.CommoditiesTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.CommoditiesTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.CommoditiesTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.CommoditiesTradingFrequency constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.EducationLevel> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.EducationLevel>();

        static {
            for (NewAccountMaltainvestSend.EducationLevel c: values()) {
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

        public static NewAccountMaltainvestSend.EducationLevel fromValue(String value) {
            NewAccountMaltainvestSend.EducationLevel constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.EmploymentIndustry> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.EmploymentIndustry>();

        static {
            for (NewAccountMaltainvestSend.EmploymentIndustry c: values()) {
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

        public static NewAccountMaltainvestSend.EmploymentIndustry fromValue(String value) {
            NewAccountMaltainvestSend.EmploymentIndustry constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.EstimatedWorth> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.EstimatedWorth>();

        static {
            for (NewAccountMaltainvestSend.EstimatedWorth c: values()) {
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

        public static NewAccountMaltainvestSend.EstimatedWorth fromValue(String value) {
            NewAccountMaltainvestSend.EstimatedWorth constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.ForexTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.ForexTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.ForexTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.ForexTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.ForexTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.ForexTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.ForexTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.ForexTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.ForexTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.ForexTradingFrequency constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.IncomeSource> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.IncomeSource>();

        static {
            for (NewAccountMaltainvestSend.IncomeSource c: values()) {
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

        public static NewAccountMaltainvestSend.IncomeSource fromValue(String value) {
            NewAccountMaltainvestSend.IncomeSource constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.IndicesTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.IndicesTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.IndicesTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.IndicesTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.IndicesTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.IndicesTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.IndicesTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.IndicesTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.IndicesTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.IndicesTradingFrequency constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.NetIncome> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.NetIncome>();

        static {
            for (NewAccountMaltainvestSend.NetIncome c: values()) {
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

        public static NewAccountMaltainvestSend.NetIncome fromValue(String value) {
            NewAccountMaltainvestSend.NetIncome constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.OtherDerivativesTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.OtherDerivativesTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.OtherDerivativesTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.OtherDerivativesTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.OtherDerivativesTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.OtherDerivativesTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.OtherDerivativesTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.OtherDerivativesTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.OtherDerivativesTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.OtherDerivativesTradingFrequency constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.OtherInstrumentsTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.OtherInstrumentsTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.OtherInstrumentsTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.OtherInstrumentsTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.OtherInstrumentsTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.OtherInstrumentsTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Salutation {

        @SerializedName("Mr")
        MR("Mr"),
        @SerializedName("Mrs")
        MRS("Mrs"),
        @SerializedName("Ms")
        MS("Ms"),
        @SerializedName("Miss")
        MISS("Miss");
        private final String value;
        private final static Map<String, NewAccountMaltainvestSend.Salutation> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.Salutation>();

        static {
            for (NewAccountMaltainvestSend.Salutation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Salutation(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountMaltainvestSend.Salutation fromValue(String value) {
            NewAccountMaltainvestSend.Salutation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SecretQuestion {

        @SerializedName("Mother's maiden name")
        MOTHER_S_MAIDEN_NAME("Mother's maiden name"),
        @SerializedName("Name of your pet")
        NAME_OF_YOUR_PET("Name of your pet"),
        @SerializedName("Name of first love")
        NAME_OF_FIRST_LOVE("Name of first love"),
        @SerializedName("Memorable town/city")
        MEMORABLE_TOWN_CITY("Memorable town/city"),
        @SerializedName("Memorable date")
        MEMORABLE_DATE("Memorable date"),
        @SerializedName("Favourite dish")
        FAVOURITE_DISH("Favourite dish"),
        @SerializedName("Brand of first car")
        BRAND_OF_FIRST_CAR("Brand of first car"),
        @SerializedName("Favourite artist")
        FAVOURITE_ARTIST("Favourite artist");
        private final String value;
        private final static Map<String, NewAccountMaltainvestSend.SecretQuestion> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.SecretQuestion>();

        static {
            for (NewAccountMaltainvestSend.SecretQuestion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SecretQuestion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountMaltainvestSend.SecretQuestion fromValue(String value) {
            NewAccountMaltainvestSend.SecretQuestion constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.StocksTradingExperience> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.StocksTradingExperience>();

        static {
            for (NewAccountMaltainvestSend.StocksTradingExperience c: values()) {
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

        public static NewAccountMaltainvestSend.StocksTradingExperience fromValue(String value) {
            NewAccountMaltainvestSend.StocksTradingExperience constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountMaltainvestSend.StocksTradingFrequency> CONSTANTS = new HashMap<String, NewAccountMaltainvestSend.StocksTradingFrequency>();

        static {
            for (NewAccountMaltainvestSend.StocksTradingFrequency c: values()) {
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

        public static NewAccountMaltainvestSend.StocksTradingFrequency fromValue(String value) {
            NewAccountMaltainvestSend.StocksTradingFrequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
