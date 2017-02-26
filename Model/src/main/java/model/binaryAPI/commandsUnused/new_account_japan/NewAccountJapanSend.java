
package data.binaryAPI.commandsUnused.new_account_japan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Create Japan account Send
 * <p>
 * This call opens a new real-money account with the 'Japan' Landing Company. Note: you must be authenticated to Japan virtual-money account to call this function.
 * 
 */
public class NewAccountJapanSend implements Serializable
{

    /**
     * Must be 1
     * (Required)
     * 
     */
    @SerializedName("new_account_japan")
    @Expose
    private Integer newAccountJapan;
    /**
     * Male (m) or female (f).
     * (Required)
     * 
     */
    @SerializedName("gender")
    @Expose
    private NewAccountJapanSend.Gender gender;
    /**
     * Within 1-30 characters, use only word characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    @SerializedName("first_name")
    @Expose
    private String firstName;
    /**
     * Within 1-30 characters, use only words characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    @SerializedName("last_name")
    @Expose
    private String lastName;
    /**
     * Date of birth format: yyyy-mm-dd.
     * (Required)
     * 
     */
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    /**
     * Occupation.
     * (Required)
     * 
     */
    @SerializedName("occupation")
    @Expose
    private NewAccountJapanSend.Occupation occupation;
    /**
     * Must be 'jp' (Japan).
     * (Required)
     * 
     */
    @SerializedName("residence")
    @Expose
    private String residence;
    /**
     * Within 70 characters.
     * (Required)
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
     * (Required)
     * 
     */
    @SerializedName("address_city")
    @Expose
    private String addressCity;
    /**
     * Possible value receive from states_list call.
     * (Required)
     * 
     */
    @SerializedName("address_state")
    @Expose
    private String addressState;
    /**
     * Follows the exact pattern of three numbers, a dash, and four numbers.
     * (Required)
     * 
     */
    @SerializedName("address_postcode")
    @Expose
    private String addressPostcode;
    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * (Required)
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("secret_question")
    @Expose
    private NewAccountJapanSend.SecretQuestion secretQuestion;
    /**
     * Answer to secret question, within 1-50 characters.
     * (Required)
     * 
     */
    @SerializedName("secret_answer")
    @Expose
    private String secretAnswer;
    /**
     * Annual income. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("annual_income")
    @Expose
    private NewAccountJapanSend.AnnualIncome annualIncome;
    /**
     * Financial asset. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("financial_asset")
    @Expose
    private NewAccountJapanSend.FinancialAsset financialAsset;
    /**
     * Daily limit on losses, in JPY
     * (Required)
     * 
     */
    @SerializedName("daily_loss_limit")
    @Expose
    private Integer dailyLossLimit;
    /**
     * Equities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_equities")
    @Expose
    private NewAccountJapanSend.TradingExperienceEquities tradingExperienceEquities;
    /**
     * Commodities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_commodities")
    @Expose
    private NewAccountJapanSend.TradingExperienceCommodities tradingExperienceCommodities;
    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_foreign_currency_deposit")
    @Expose
    private NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit;
    /**
     * Margin FX trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_margin_fx")
    @Expose
    private NewAccountJapanSend.TradingExperienceMarginFx tradingExperienceMarginFx;
    /**
     * Investment trust trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_investment_trust")
    @Expose
    private NewAccountJapanSend.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust;
    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_public_bond")
    @Expose
    private NewAccountJapanSend.TradingExperiencePublicBond tradingExperiencePublicBond;
    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_experience_option_trading")
    @Expose
    private NewAccountJapanSend.TradingExperienceOptionTrading tradingExperienceOptionTrading;
    /**
     * Trading purpose. Accept any value in enum list.
     * (Required)
     * 
     */
    @SerializedName("trading_purpose")
    @Expose
    private NewAccountJapanSend.TradingPurpose tradingPurpose;
    /**
     * Classification of assets requiring hedge. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    @SerializedName("hedge_asset")
    @Expose
    private String hedgeAsset;
    /**
     * Hedge asset amount in JPY. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    @SerializedName("hedge_asset_amount")
    @Expose
    private Integer hedgeAssetAmount;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("agree_use_electronic_doc")
    @Expose
    private Integer agreeUseElectronicDoc;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("agree_warnings_and_policies")
    @Expose
    private Integer agreeWarningsAndPolicies;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_own_judgment")
    @Expose
    private Integer confirmUnderstandOwnJudgment;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_trading_mechanism")
    @Expose
    private Integer confirmUnderstandTradingMechanism;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_judgment_time")
    @Expose
    private Integer confirmUnderstandJudgmentTime;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_total_loss")
    @Expose
    private Integer confirmUnderstandTotalLoss;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_sellback_loss")
    @Expose
    private Integer confirmUnderstandSellbackLoss;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_shortsell_loss")
    @Expose
    private Integer confirmUnderstandShortsellLoss;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_company_profit")
    @Expose
    private Integer confirmUnderstandCompanyProfit;
    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    @SerializedName("confirm_understand_expert_knowledge")
    @Expose
    private Integer confirmUnderstandExpertKnowledge;
    /**
     * Client must declare not FATCA
     * (Required)
     * 
     */
    @SerializedName("declare_not_fatca")
    @Expose
    private Integer declareNotFatca;
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
    private final static long serialVersionUID = -794601192734517858L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountJapanSend() {
    }

    /**
     * 
     * @param secretQuestion
     * @param confirmUnderstandShortsellLoss
     * @param newAccountJapan
     * @param lastName
     * @param occupation
     * @param annualIncome
     * @param tradingExperiencePublicBond
     * @param gender
     * @param tradingExperienceForeignCurrencyDeposit
     * @param tradingExperienceMarginFx
     * @param secretAnswer
     * @param agreeUseElectronicDoc
     * @param agreeWarningsAndPolicies
     * @param tradingPurpose
     * @param confirmUnderstandSellbackLoss
     * @param tradingExperienceEquities
     * @param tradingExperienceInvestmentTrust
     * @param passthrough
     * @param addressLine1
     * @param addressLine2
     * @param hedgeAssetAmount
     * @param hedgeAsset
     * @param residence
     * @param tradingExperienceCommodities
     * @param addressCity
     * @param confirmUnderstandCompanyProfit
     * @param addressPostcode
     * @param dateOfBirth
     * @param addressState
     * @param dailyLossLimit
     * @param financialAsset
     * @param confirmUnderstandOwnJudgment
     * @param reqId
     * @param firstName
     * @param confirmUnderstandTradingMechanism
     * @param phone
     * @param declareNotFatca
     * @param tradingExperienceOptionTrading
     * @param confirmUnderstandJudgmentTime
     * @param confirmUnderstandTotalLoss
     * @param confirmUnderstandExpertKnowledge
     */
    public NewAccountJapanSend(Integer newAccountJapan, NewAccountJapanSend.Gender gender, String firstName, String lastName, String dateOfBirth, NewAccountJapanSend.Occupation occupation, String residence, String addressLine1, String addressLine2, String addressCity, String addressState, String addressPostcode, String phone, NewAccountJapanSend.SecretQuestion secretQuestion, String secretAnswer, NewAccountJapanSend.AnnualIncome annualIncome, NewAccountJapanSend.FinancialAsset financialAsset, Integer dailyLossLimit, NewAccountJapanSend.TradingExperienceEquities tradingExperienceEquities, NewAccountJapanSend.TradingExperienceCommodities tradingExperienceCommodities, NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit, NewAccountJapanSend.TradingExperienceMarginFx tradingExperienceMarginFx, NewAccountJapanSend.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust, NewAccountJapanSend.TradingExperiencePublicBond tradingExperiencePublicBond, NewAccountJapanSend.TradingExperienceOptionTrading tradingExperienceOptionTrading, NewAccountJapanSend.TradingPurpose tradingPurpose, String hedgeAsset, Integer hedgeAssetAmount, Integer agreeUseElectronicDoc, Integer agreeWarningsAndPolicies, Integer confirmUnderstandOwnJudgment, Integer confirmUnderstandTradingMechanism, Integer confirmUnderstandJudgmentTime, Integer confirmUnderstandTotalLoss, Integer confirmUnderstandSellbackLoss, Integer confirmUnderstandShortsellLoss, Integer confirmUnderstandCompanyProfit, Integer confirmUnderstandExpertKnowledge, Integer declareNotFatca, Passthrough passthrough, Integer reqId) {
        super();
        this.newAccountJapan = newAccountJapan;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.residence = residence;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.phone = phone;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.annualIncome = annualIncome;
        this.financialAsset = financialAsset;
        this.dailyLossLimit = dailyLossLimit;
        this.tradingExperienceEquities = tradingExperienceEquities;
        this.tradingExperienceCommodities = tradingExperienceCommodities;
        this.tradingExperienceForeignCurrencyDeposit = tradingExperienceForeignCurrencyDeposit;
        this.tradingExperienceMarginFx = tradingExperienceMarginFx;
        this.tradingExperienceInvestmentTrust = tradingExperienceInvestmentTrust;
        this.tradingExperiencePublicBond = tradingExperiencePublicBond;
        this.tradingExperienceOptionTrading = tradingExperienceOptionTrading;
        this.tradingPurpose = tradingPurpose;
        this.hedgeAsset = hedgeAsset;
        this.hedgeAssetAmount = hedgeAssetAmount;
        this.agreeUseElectronicDoc = agreeUseElectronicDoc;
        this.agreeWarningsAndPolicies = agreeWarningsAndPolicies;
        this.confirmUnderstandOwnJudgment = confirmUnderstandOwnJudgment;
        this.confirmUnderstandTradingMechanism = confirmUnderstandTradingMechanism;
        this.confirmUnderstandJudgmentTime = confirmUnderstandJudgmentTime;
        this.confirmUnderstandTotalLoss = confirmUnderstandTotalLoss;
        this.confirmUnderstandSellbackLoss = confirmUnderstandSellbackLoss;
        this.confirmUnderstandShortsellLoss = confirmUnderstandShortsellLoss;
        this.confirmUnderstandCompanyProfit = confirmUnderstandCompanyProfit;
        this.confirmUnderstandExpertKnowledge = confirmUnderstandExpertKnowledge;
        this.declareNotFatca = declareNotFatca;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * (Required)
     * 
     */
    public Integer getNewAccountJapan() {
        return newAccountJapan;
    }

    /**
     * Must be 1
     * (Required)
     * 
     */
    public void setNewAccountJapan(Integer newAccountJapan) {
        this.newAccountJapan = newAccountJapan;
    }

    /**
     * Male (m) or female (f).
     * (Required)
     * 
     */
    public NewAccountJapanSend.Gender getGender() {
        return gender;
    }

    /**
     * Male (m) or female (f).
     * (Required)
     * 
     */
    public void setGender(NewAccountJapanSend.Gender gender) {
        this.gender = gender;
    }

    /**
     * Within 1-30 characters, use only word characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Within 1-30 characters, use only word characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Within 1-30 characters, use only words characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Within 1-30 characters, use only words characters, spaces, hyphens, full-stops or apostrophes.
     * (Required)
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * (Required)
     * 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * (Required)
     * 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Occupation.
     * (Required)
     * 
     */
    public NewAccountJapanSend.Occupation getOccupation() {
        return occupation;
    }

    /**
     * Occupation.
     * (Required)
     * 
     */
    public void setOccupation(NewAccountJapanSend.Occupation occupation) {
        this.occupation = occupation;
    }

    /**
     * Must be 'jp' (Japan).
     * (Required)
     * 
     */
    public String getResidence() {
        return residence;
    }

    /**
     * Must be 'jp' (Japan).
     * (Required)
     * 
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * Within 70 characters.
     * (Required)
     * 
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Within 70 characters.
     * (Required)
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
     * (Required)
     * 
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Within 35 characters
     * (Required)
     * 
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Possible value receive from states_list call.
     * (Required)
     * 
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Possible value receive from states_list call.
     * (Required)
     * 
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Follows the exact pattern of three numbers, a dash, and four numbers.
     * (Required)
     * 
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Follows the exact pattern of three numbers, a dash, and four numbers.
     * (Required)
     * 
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * (Required)
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * (Required)
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    /**
     * Accept any value in enum list.
     * (Required)
     * 
     */
    public void setSecretQuestion(NewAccountJapanSend.SecretQuestion secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    /**
     * Answer to secret question, within 1-50 characters.
     * (Required)
     * 
     */
    public String getSecretAnswer() {
        return secretAnswer;
    }

    /**
     * Answer to secret question, within 1-50 characters.
     * (Required)
     * 
     */
    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    /**
     * Annual income. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.AnnualIncome getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Annual income. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setAnnualIncome(NewAccountJapanSend.AnnualIncome annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * Financial asset. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.FinancialAsset getFinancialAsset() {
        return financialAsset;
    }

    /**
     * Financial asset. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setFinancialAsset(NewAccountJapanSend.FinancialAsset financialAsset) {
        this.financialAsset = financialAsset;
    }

    /**
     * Daily limit on losses, in JPY
     * (Required)
     * 
     */
    public Integer getDailyLossLimit() {
        return dailyLossLimit;
    }

    /**
     * Daily limit on losses, in JPY
     * (Required)
     * 
     */
    public void setDailyLossLimit(Integer dailyLossLimit) {
        this.dailyLossLimit = dailyLossLimit;
    }

    /**
     * Equities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceEquities getTradingExperienceEquities() {
        return tradingExperienceEquities;
    }

    /**
     * Equities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceEquities(NewAccountJapanSend.TradingExperienceEquities tradingExperienceEquities) {
        this.tradingExperienceEquities = tradingExperienceEquities;
    }

    /**
     * Commodities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceCommodities getTradingExperienceCommodities() {
        return tradingExperienceCommodities;
    }

    /**
     * Commodities trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceCommodities(NewAccountJapanSend.TradingExperienceCommodities tradingExperienceCommodities) {
        this.tradingExperienceCommodities = tradingExperienceCommodities;
    }

    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit getTradingExperienceForeignCurrencyDeposit() {
        return tradingExperienceForeignCurrencyDeposit;
    }

    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceForeignCurrencyDeposit(NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit) {
        this.tradingExperienceForeignCurrencyDeposit = tradingExperienceForeignCurrencyDeposit;
    }

    /**
     * Margin FX trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceMarginFx getTradingExperienceMarginFx() {
        return tradingExperienceMarginFx;
    }

    /**
     * Margin FX trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceMarginFx(NewAccountJapanSend.TradingExperienceMarginFx tradingExperienceMarginFx) {
        this.tradingExperienceMarginFx = tradingExperienceMarginFx;
    }

    /**
     * Investment trust trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceInvestmentTrust getTradingExperienceInvestmentTrust() {
        return tradingExperienceInvestmentTrust;
    }

    /**
     * Investment trust trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceInvestmentTrust(NewAccountJapanSend.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust) {
        this.tradingExperienceInvestmentTrust = tradingExperienceInvestmentTrust;
    }

    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperiencePublicBond getTradingExperiencePublicBond() {
        return tradingExperiencePublicBond;
    }

    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperiencePublicBond(NewAccountJapanSend.TradingExperiencePublicBond tradingExperiencePublicBond) {
        this.tradingExperiencePublicBond = tradingExperiencePublicBond;
    }

    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingExperienceOptionTrading getTradingExperienceOptionTrading() {
        return tradingExperienceOptionTrading;
    }

    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingExperienceOptionTrading(NewAccountJapanSend.TradingExperienceOptionTrading tradingExperienceOptionTrading) {
        this.tradingExperienceOptionTrading = tradingExperienceOptionTrading;
    }

    /**
     * Trading purpose. Accept any value in enum list.
     * (Required)
     * 
     */
    public NewAccountJapanSend.TradingPurpose getTradingPurpose() {
        return tradingPurpose;
    }

    /**
     * Trading purpose. Accept any value in enum list.
     * (Required)
     * 
     */
    public void setTradingPurpose(NewAccountJapanSend.TradingPurpose tradingPurpose) {
        this.tradingPurpose = tradingPurpose;
    }

    /**
     * Classification of assets requiring hedge. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    public String getHedgeAsset() {
        return hedgeAsset;
    }

    /**
     * Classification of assets requiring hedge. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    public void setHedgeAsset(String hedgeAsset) {
        this.hedgeAsset = hedgeAsset;
    }

    /**
     * Hedge asset amount in JPY. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    public Integer getHedgeAssetAmount() {
        return hedgeAssetAmount;
    }

    /**
     * Hedge asset amount in JPY. This field is only required if 'Hedging' is selected for 'trading_purpose'.
     * 
     */
    public void setHedgeAssetAmount(Integer hedgeAssetAmount) {
        this.hedgeAssetAmount = hedgeAssetAmount;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getAgreeUseElectronicDoc() {
        return agreeUseElectronicDoc;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setAgreeUseElectronicDoc(Integer agreeUseElectronicDoc) {
        this.agreeUseElectronicDoc = agreeUseElectronicDoc;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getAgreeWarningsAndPolicies() {
        return agreeWarningsAndPolicies;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setAgreeWarningsAndPolicies(Integer agreeWarningsAndPolicies) {
        this.agreeWarningsAndPolicies = agreeWarningsAndPolicies;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandOwnJudgment() {
        return confirmUnderstandOwnJudgment;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandOwnJudgment(Integer confirmUnderstandOwnJudgment) {
        this.confirmUnderstandOwnJudgment = confirmUnderstandOwnJudgment;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandTradingMechanism() {
        return confirmUnderstandTradingMechanism;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandTradingMechanism(Integer confirmUnderstandTradingMechanism) {
        this.confirmUnderstandTradingMechanism = confirmUnderstandTradingMechanism;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandJudgmentTime() {
        return confirmUnderstandJudgmentTime;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandJudgmentTime(Integer confirmUnderstandJudgmentTime) {
        this.confirmUnderstandJudgmentTime = confirmUnderstandJudgmentTime;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandTotalLoss() {
        return confirmUnderstandTotalLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandTotalLoss(Integer confirmUnderstandTotalLoss) {
        this.confirmUnderstandTotalLoss = confirmUnderstandTotalLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandSellbackLoss() {
        return confirmUnderstandSellbackLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandSellbackLoss(Integer confirmUnderstandSellbackLoss) {
        this.confirmUnderstandSellbackLoss = confirmUnderstandSellbackLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandShortsellLoss() {
        return confirmUnderstandShortsellLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandShortsellLoss(Integer confirmUnderstandShortsellLoss) {
        this.confirmUnderstandShortsellLoss = confirmUnderstandShortsellLoss;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandCompanyProfit() {
        return confirmUnderstandCompanyProfit;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandCompanyProfit(Integer confirmUnderstandCompanyProfit) {
        this.confirmUnderstandCompanyProfit = confirmUnderstandCompanyProfit;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public Integer getConfirmUnderstandExpertKnowledge() {
        return confirmUnderstandExpertKnowledge;
    }

    /**
     * Client must agree on the T&C
     * (Required)
     * 
     */
    public void setConfirmUnderstandExpertKnowledge(Integer confirmUnderstandExpertKnowledge) {
        this.confirmUnderstandExpertKnowledge = confirmUnderstandExpertKnowledge;
    }

    /**
     * Client must declare not FATCA
     * (Required)
     * 
     */
    public Integer getDeclareNotFatca() {
        return declareNotFatca;
    }

    /**
     * Client must declare not FATCA
     * (Required)
     * 
     */
    public void setDeclareNotFatca(Integer declareNotFatca) {
        this.declareNotFatca = declareNotFatca;
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
        return new HashCodeBuilder().append(newAccountJapan).append(gender).append(firstName).append(lastName).append(dateOfBirth).append(occupation).append(residence).append(addressLine1).append(addressLine2).append(addressCity).append(addressState).append(addressPostcode).append(phone).append(secretQuestion).append(secretAnswer).append(annualIncome).append(financialAsset).append(dailyLossLimit).append(tradingExperienceEquities).append(tradingExperienceCommodities).append(tradingExperienceForeignCurrencyDeposit).append(tradingExperienceMarginFx).append(tradingExperienceInvestmentTrust).append(tradingExperiencePublicBond).append(tradingExperienceOptionTrading).append(tradingPurpose).append(hedgeAsset).append(hedgeAssetAmount).append(agreeUseElectronicDoc).append(agreeWarningsAndPolicies).append(confirmUnderstandOwnJudgment).append(confirmUnderstandTradingMechanism).append(confirmUnderstandJudgmentTime).append(confirmUnderstandTotalLoss).append(confirmUnderstandSellbackLoss).append(confirmUnderstandShortsellLoss).append(confirmUnderstandCompanyProfit).append(confirmUnderstandExpertKnowledge).append(declareNotFatca).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountJapanSend) == false) {
            return false;
        }
        NewAccountJapanSend rhs = ((NewAccountJapanSend) other);
        return new EqualsBuilder().append(newAccountJapan, rhs.newAccountJapan).append(gender, rhs.gender).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(dateOfBirth, rhs.dateOfBirth).append(occupation, rhs.occupation).append(residence, rhs.residence).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(addressCity, rhs.addressCity).append(addressState, rhs.addressState).append(addressPostcode, rhs.addressPostcode).append(phone, rhs.phone).append(secretQuestion, rhs.secretQuestion).append(secretAnswer, rhs.secretAnswer).append(annualIncome, rhs.annualIncome).append(financialAsset, rhs.financialAsset).append(dailyLossLimit, rhs.dailyLossLimit).append(tradingExperienceEquities, rhs.tradingExperienceEquities).append(tradingExperienceCommodities, rhs.tradingExperienceCommodities).append(tradingExperienceForeignCurrencyDeposit, rhs.tradingExperienceForeignCurrencyDeposit).append(tradingExperienceMarginFx, rhs.tradingExperienceMarginFx).append(tradingExperienceInvestmentTrust, rhs.tradingExperienceInvestmentTrust).append(tradingExperiencePublicBond, rhs.tradingExperiencePublicBond).append(tradingExperienceOptionTrading, rhs.tradingExperienceOptionTrading).append(tradingPurpose, rhs.tradingPurpose).append(hedgeAsset, rhs.hedgeAsset).append(hedgeAssetAmount, rhs.hedgeAssetAmount).append(agreeUseElectronicDoc, rhs.agreeUseElectronicDoc).append(agreeWarningsAndPolicies, rhs.agreeWarningsAndPolicies).append(confirmUnderstandOwnJudgment, rhs.confirmUnderstandOwnJudgment).append(confirmUnderstandTradingMechanism, rhs.confirmUnderstandTradingMechanism).append(confirmUnderstandJudgmentTime, rhs.confirmUnderstandJudgmentTime).append(confirmUnderstandTotalLoss, rhs.confirmUnderstandTotalLoss).append(confirmUnderstandSellbackLoss, rhs.confirmUnderstandSellbackLoss).append(confirmUnderstandShortsellLoss, rhs.confirmUnderstandShortsellLoss).append(confirmUnderstandCompanyProfit, rhs.confirmUnderstandCompanyProfit).append(confirmUnderstandExpertKnowledge, rhs.confirmUnderstandExpertKnowledge).append(declareNotFatca, rhs.declareNotFatca).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum AnnualIncome {

        @SerializedName("Less than 1 million JPY")
        LESS_THAN_1_MILLION_JPY("Less than 1 million JPY"),
        @SerializedName("1-3 million JPY")
        _1_3_MILLION_JPY("1-3 million JPY"),
        @SerializedName("3-5 million JPY")
        _3_5_MILLION_JPY("3-5 million JPY"),
        @SerializedName("5-10 million JPY")
        _5_10_MILLION_JPY("5-10 million JPY"),
        @SerializedName("10-30 million JPY")
        _10_30_MILLION_JPY("10-30 million JPY"),
        @SerializedName("30-50 million JPY")
        _30_50_MILLION_JPY("30-50 million JPY"),
        @SerializedName("50-100 million JPY")
        _50_100_MILLION_JPY("50-100 million JPY"),
        @SerializedName("Over 100 million JPY")
        OVER_100_MILLION_JPY("Over 100 million JPY");
        private final String value;
        private final static Map<String, NewAccountJapanSend.AnnualIncome> CONSTANTS = new HashMap<String, NewAccountJapanSend.AnnualIncome>();

        static {
            for (NewAccountJapanSend.AnnualIncome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AnnualIncome(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.AnnualIncome fromValue(String value) {
            NewAccountJapanSend.AnnualIncome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FinancialAsset {

        @SerializedName("Less than 1 million JPY")
        LESS_THAN_1_MILLION_JPY("Less than 1 million JPY"),
        @SerializedName("1-3 million JPY")
        _1_3_MILLION_JPY("1-3 million JPY"),
        @SerializedName("3-5 million JPY")
        _3_5_MILLION_JPY("3-5 million JPY"),
        @SerializedName("5-10 million JPY")
        _5_10_MILLION_JPY("5-10 million JPY"),
        @SerializedName("10-30 million JPY")
        _10_30_MILLION_JPY("10-30 million JPY"),
        @SerializedName("30-50 million JPY")
        _30_50_MILLION_JPY("30-50 million JPY"),
        @SerializedName("50-100 million JPY")
        _50_100_MILLION_JPY("50-100 million JPY"),
        @SerializedName("Over 100 million JPY")
        OVER_100_MILLION_JPY("Over 100 million JPY");
        private final String value;
        private final static Map<String, NewAccountJapanSend.FinancialAsset> CONSTANTS = new HashMap<String, NewAccountJapanSend.FinancialAsset>();

        static {
            for (NewAccountJapanSend.FinancialAsset c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FinancialAsset(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.FinancialAsset fromValue(String value) {
            NewAccountJapanSend.FinancialAsset constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Gender {

        @SerializedName("m")
        M("m"),
        @SerializedName("f")
        F("f");
        private final String value;
        private final static Map<String, NewAccountJapanSend.Gender> CONSTANTS = new HashMap<String, NewAccountJapanSend.Gender>();

        static {
            for (NewAccountJapanSend.Gender c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Gender(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.Gender fromValue(String value) {
            NewAccountJapanSend.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Occupation {

        @SerializedName("Office worker")
        OFFICE_WORKER("Office worker"),
        @SerializedName("Director")
        DIRECTOR("Director"),
        @SerializedName("Public worker")
        PUBLIC_WORKER("Public worker"),
        @SerializedName("Self-employed")
        SELF_EMPLOYED("Self-employed"),
        @SerializedName("Housewife / Househusband")
        HOUSEWIFE_HOUSEHUSBAND("Housewife / Househusband"),
        @SerializedName("Contract / Temporary / Part Time")
        CONTRACT_TEMPORARY_PART_TIME("Contract / Temporary / Part Time"),
        @SerializedName("Student")
        STUDENT("Student"),
        @SerializedName("Unemployed")
        UNEMPLOYED("Unemployed"),
        @SerializedName("Others")
        OTHERS("Others");
        private final String value;
        private final static Map<String, NewAccountJapanSend.Occupation> CONSTANTS = new HashMap<String, NewAccountJapanSend.Occupation>();

        static {
            for (NewAccountJapanSend.Occupation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Occupation(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.Occupation fromValue(String value) {
            NewAccountJapanSend.Occupation constant = CONSTANTS.get(value);
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
        private final static Map<String, NewAccountJapanSend.SecretQuestion> CONSTANTS = new HashMap<String, NewAccountJapanSend.SecretQuestion>();

        static {
            for (NewAccountJapanSend.SecretQuestion c: values()) {
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

        public static NewAccountJapanSend.SecretQuestion fromValue(String value) {
            NewAccountJapanSend.SecretQuestion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceCommodities {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceCommodities> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceCommodities>();

        static {
            for (NewAccountJapanSend.TradingExperienceCommodities c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceCommodities(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceCommodities fromValue(String value) {
            NewAccountJapanSend.TradingExperienceCommodities constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceEquities {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceEquities> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceEquities>();

        static {
            for (NewAccountJapanSend.TradingExperienceEquities c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceEquities(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceEquities fromValue(String value) {
            NewAccountJapanSend.TradingExperienceEquities constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceForeignCurrencyDeposit {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit>();

        static {
            for (NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceForeignCurrencyDeposit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit fromValue(String value) {
            NewAccountJapanSend.TradingExperienceForeignCurrencyDeposit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceInvestmentTrust {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceInvestmentTrust> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceInvestmentTrust>();

        static {
            for (NewAccountJapanSend.TradingExperienceInvestmentTrust c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceInvestmentTrust(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceInvestmentTrust fromValue(String value) {
            NewAccountJapanSend.TradingExperienceInvestmentTrust constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceMarginFx {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceMarginFx> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceMarginFx>();

        static {
            for (NewAccountJapanSend.TradingExperienceMarginFx c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceMarginFx(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceMarginFx fromValue(String value) {
            NewAccountJapanSend.TradingExperienceMarginFx constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperienceOptionTrading {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperienceOptionTrading> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperienceOptionTrading>();

        static {
            for (NewAccountJapanSend.TradingExperienceOptionTrading c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperienceOptionTrading(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperienceOptionTrading fromValue(String value) {
            NewAccountJapanSend.TradingExperienceOptionTrading constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingExperiencePublicBond {

        @SerializedName("No experience")
        NO_EXPERIENCE("No experience"),
        @SerializedName("Less than 6 months")
        LESS_THAN_6_MONTHS("Less than 6 months"),
        @SerializedName("6 months to 1 year")
        _6_MONTHS_TO_1_YEAR("6 months to 1 year"),
        @SerializedName("1-3 years")
        _1_3_YEARS("1-3 years"),
        @SerializedName("3-5 years")
        _3_5_YEARS("3-5 years"),
        @SerializedName("Over 5 years")
        OVER_5_YEARS("Over 5 years");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingExperiencePublicBond> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingExperiencePublicBond>();

        static {
            for (NewAccountJapanSend.TradingExperiencePublicBond c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingExperiencePublicBond(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingExperiencePublicBond fromValue(String value) {
            NewAccountJapanSend.TradingExperiencePublicBond constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TradingPurpose {

        @SerializedName("Targeting short-term profits")
        TARGETING_SHORT_TERM_PROFITS("Targeting short-term profits"),
        @SerializedName("Targeting medium-term / long-term profits")
        TARGETING_MEDIUM_TERM_LONG_TERM_PROFITS("Targeting medium-term / long-term profits"),
        @SerializedName("Both the above")
        BOTH_THE_ABOVE("Both the above"),
        @SerializedName("Hedging")
        HEDGING("Hedging");
        private final String value;
        private final static Map<String, NewAccountJapanSend.TradingPurpose> CONSTANTS = new HashMap<String, NewAccountJapanSend.TradingPurpose>();

        static {
            for (NewAccountJapanSend.TradingPurpose c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TradingPurpose(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountJapanSend.TradingPurpose fromValue(String value) {
            NewAccountJapanSend.TradingPurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
