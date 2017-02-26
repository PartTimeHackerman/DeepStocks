
package data.binaryAPI.commandsUnused.set_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Japan real money client settings
 * <p>
 * Japan real money client settings, only applicable for Japan real money account client.
 * 
 */
public class JpSettings implements Serializable
{

    /**
     * Occupation.
     * 
     */
    @SerializedName("occupation")
    @Expose
    private JpSettings.Occupation occupation;
    /**
     * Annual income. Accept any value in enum list.
     * 
     */
    @SerializedName("annual_income")
    @Expose
    private JpSettings.AnnualIncome annualIncome;
    /**
     * Financial asset. Accept any value in enum list.
     * 
     */
    @SerializedName("financial_asset")
    @Expose
    private JpSettings.FinancialAsset financialAsset;
    /**
     * Equities trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_equities")
    @Expose
    private JpSettings.TradingExperienceEquities tradingExperienceEquities;
    /**
     * Commodities trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_commodities")
    @Expose
    private JpSettings.TradingExperienceCommodities tradingExperienceCommodities;
    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_foreign_currency_deposit")
    @Expose
    private JpSettings.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit;
    /**
     * Margin FX trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_margin_fx")
    @Expose
    private JpSettings.TradingExperienceMarginFx tradingExperienceMarginFx;
    /**
     * Investment trust trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_investment_trust")
    @Expose
    private JpSettings.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust;
    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_public_bond")
    @Expose
    private JpSettings.TradingExperiencePublicBond tradingExperiencePublicBond;
    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_experience_option_trading")
    @Expose
    private JpSettings.TradingExperienceOptionTrading tradingExperienceOptionTrading;
    /**
     * Trading purpose. Accept any value in enum list.
     * 
     */
    @SerializedName("trading_purpose")
    @Expose
    private JpSettings.TradingPurpose tradingPurpose;
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
    private final static long serialVersionUID = 7091605553934707659L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JpSettings() {
    }

    /**
     * 
     * @param occupation
     * @param annualIncome
     * @param tradingExperiencePublicBond
     * @param tradingExperienceForeignCurrencyDeposit
     * @param tradingExperienceMarginFx
     * @param financialAsset
     * @param tradingPurpose
     * @param tradingExperienceEquities
     * @param tradingExperienceInvestmentTrust
     * @param tradingExperienceOptionTrading
     * @param hedgeAssetAmount
     * @param hedgeAsset
     * @param tradingExperienceCommodities
     */
    public JpSettings(JpSettings.Occupation occupation, JpSettings.AnnualIncome annualIncome, JpSettings.FinancialAsset financialAsset, JpSettings.TradingExperienceEquities tradingExperienceEquities, JpSettings.TradingExperienceCommodities tradingExperienceCommodities, JpSettings.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit, JpSettings.TradingExperienceMarginFx tradingExperienceMarginFx, JpSettings.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust, JpSettings.TradingExperiencePublicBond tradingExperiencePublicBond, JpSettings.TradingExperienceOptionTrading tradingExperienceOptionTrading, JpSettings.TradingPurpose tradingPurpose, String hedgeAsset, Integer hedgeAssetAmount) {
        super();
        this.occupation = occupation;
        this.annualIncome = annualIncome;
        this.financialAsset = financialAsset;
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
    }

    /**
     * Occupation.
     * 
     */
    public JpSettings.Occupation getOccupation() {
        return occupation;
    }

    /**
     * Occupation.
     * 
     */
    public void setOccupation(JpSettings.Occupation occupation) {
        this.occupation = occupation;
    }

    /**
     * Annual income. Accept any value in enum list.
     * 
     */
    public JpSettings.AnnualIncome getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Annual income. Accept any value in enum list.
     * 
     */
    public void setAnnualIncome(JpSettings.AnnualIncome annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * Financial asset. Accept any value in enum list.
     * 
     */
    public JpSettings.FinancialAsset getFinancialAsset() {
        return financialAsset;
    }

    /**
     * Financial asset. Accept any value in enum list.
     * 
     */
    public void setFinancialAsset(JpSettings.FinancialAsset financialAsset) {
        this.financialAsset = financialAsset;
    }

    /**
     * Equities trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceEquities getTradingExperienceEquities() {
        return tradingExperienceEquities;
    }

    /**
     * Equities trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceEquities(JpSettings.TradingExperienceEquities tradingExperienceEquities) {
        this.tradingExperienceEquities = tradingExperienceEquities;
    }

    /**
     * Commodities trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceCommodities getTradingExperienceCommodities() {
        return tradingExperienceCommodities;
    }

    /**
     * Commodities trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceCommodities(JpSettings.TradingExperienceCommodities tradingExperienceCommodities) {
        this.tradingExperienceCommodities = tradingExperienceCommodities;
    }

    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceForeignCurrencyDeposit getTradingExperienceForeignCurrencyDeposit() {
        return tradingExperienceForeignCurrencyDeposit;
    }

    /**
     * Foreign currency deposit trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceForeignCurrencyDeposit(JpSettings.TradingExperienceForeignCurrencyDeposit tradingExperienceForeignCurrencyDeposit) {
        this.tradingExperienceForeignCurrencyDeposit = tradingExperienceForeignCurrencyDeposit;
    }

    /**
     * Margin FX trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceMarginFx getTradingExperienceMarginFx() {
        return tradingExperienceMarginFx;
    }

    /**
     * Margin FX trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceMarginFx(JpSettings.TradingExperienceMarginFx tradingExperienceMarginFx) {
        this.tradingExperienceMarginFx = tradingExperienceMarginFx;
    }

    /**
     * Investment trust trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceInvestmentTrust getTradingExperienceInvestmentTrust() {
        return tradingExperienceInvestmentTrust;
    }

    /**
     * Investment trust trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceInvestmentTrust(JpSettings.TradingExperienceInvestmentTrust tradingExperienceInvestmentTrust) {
        this.tradingExperienceInvestmentTrust = tradingExperienceInvestmentTrust;
    }

    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperiencePublicBond getTradingExperiencePublicBond() {
        return tradingExperiencePublicBond;
    }

    /**
     * Public and corporation bond trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperiencePublicBond(JpSettings.TradingExperiencePublicBond tradingExperiencePublicBond) {
        this.tradingExperiencePublicBond = tradingExperiencePublicBond;
    }

    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingExperienceOptionTrading getTradingExperienceOptionTrading() {
        return tradingExperienceOptionTrading;
    }

    /**
     * OTC Derivative (Option) trading experience. Accept any value in enum list.
     * 
     */
    public void setTradingExperienceOptionTrading(JpSettings.TradingExperienceOptionTrading tradingExperienceOptionTrading) {
        this.tradingExperienceOptionTrading = tradingExperienceOptionTrading;
    }

    /**
     * Trading purpose. Accept any value in enum list.
     * 
     */
    public JpSettings.TradingPurpose getTradingPurpose() {
        return tradingPurpose;
    }

    /**
     * Trading purpose. Accept any value in enum list.
     * 
     */
    public void setTradingPurpose(JpSettings.TradingPurpose tradingPurpose) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(occupation).append(annualIncome).append(financialAsset).append(tradingExperienceEquities).append(tradingExperienceCommodities).append(tradingExperienceForeignCurrencyDeposit).append(tradingExperienceMarginFx).append(tradingExperienceInvestmentTrust).append(tradingExperiencePublicBond).append(tradingExperienceOptionTrading).append(tradingPurpose).append(hedgeAsset).append(hedgeAssetAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JpSettings) == false) {
            return false;
        }
        JpSettings rhs = ((JpSettings) other);
        return new EqualsBuilder().append(occupation, rhs.occupation).append(annualIncome, rhs.annualIncome).append(financialAsset, rhs.financialAsset).append(tradingExperienceEquities, rhs.tradingExperienceEquities).append(tradingExperienceCommodities, rhs.tradingExperienceCommodities).append(tradingExperienceForeignCurrencyDeposit, rhs.tradingExperienceForeignCurrencyDeposit).append(tradingExperienceMarginFx, rhs.tradingExperienceMarginFx).append(tradingExperienceInvestmentTrust, rhs.tradingExperienceInvestmentTrust).append(tradingExperiencePublicBond, rhs.tradingExperiencePublicBond).append(tradingExperienceOptionTrading, rhs.tradingExperienceOptionTrading).append(tradingPurpose, rhs.tradingPurpose).append(hedgeAsset, rhs.hedgeAsset).append(hedgeAssetAmount, rhs.hedgeAssetAmount).isEquals();
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
        private final static Map<String, JpSettings.AnnualIncome> CONSTANTS = new HashMap<String, JpSettings.AnnualIncome>();

        static {
            for (JpSettings.AnnualIncome c: values()) {
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

        public static JpSettings.AnnualIncome fromValue(String value) {
            JpSettings.AnnualIncome constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.FinancialAsset> CONSTANTS = new HashMap<String, JpSettings.FinancialAsset>();

        static {
            for (JpSettings.FinancialAsset c: values()) {
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

        public static JpSettings.FinancialAsset fromValue(String value) {
            JpSettings.FinancialAsset constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.Occupation> CONSTANTS = new HashMap<String, JpSettings.Occupation>();

        static {
            for (JpSettings.Occupation c: values()) {
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

        public static JpSettings.Occupation fromValue(String value) {
            JpSettings.Occupation constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceCommodities> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceCommodities>();

        static {
            for (JpSettings.TradingExperienceCommodities c: values()) {
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

        public static JpSettings.TradingExperienceCommodities fromValue(String value) {
            JpSettings.TradingExperienceCommodities constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceEquities> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceEquities>();

        static {
            for (JpSettings.TradingExperienceEquities c: values()) {
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

        public static JpSettings.TradingExperienceEquities fromValue(String value) {
            JpSettings.TradingExperienceEquities constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceForeignCurrencyDeposit> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceForeignCurrencyDeposit>();

        static {
            for (JpSettings.TradingExperienceForeignCurrencyDeposit c: values()) {
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

        public static JpSettings.TradingExperienceForeignCurrencyDeposit fromValue(String value) {
            JpSettings.TradingExperienceForeignCurrencyDeposit constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceInvestmentTrust> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceInvestmentTrust>();

        static {
            for (JpSettings.TradingExperienceInvestmentTrust c: values()) {
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

        public static JpSettings.TradingExperienceInvestmentTrust fromValue(String value) {
            JpSettings.TradingExperienceInvestmentTrust constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceMarginFx> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceMarginFx>();

        static {
            for (JpSettings.TradingExperienceMarginFx c: values()) {
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

        public static JpSettings.TradingExperienceMarginFx fromValue(String value) {
            JpSettings.TradingExperienceMarginFx constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperienceOptionTrading> CONSTANTS = new HashMap<String, JpSettings.TradingExperienceOptionTrading>();

        static {
            for (JpSettings.TradingExperienceOptionTrading c: values()) {
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

        public static JpSettings.TradingExperienceOptionTrading fromValue(String value) {
            JpSettings.TradingExperienceOptionTrading constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingExperiencePublicBond> CONSTANTS = new HashMap<String, JpSettings.TradingExperiencePublicBond>();

        static {
            for (JpSettings.TradingExperiencePublicBond c: values()) {
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

        public static JpSettings.TradingExperiencePublicBond fromValue(String value) {
            JpSettings.TradingExperiencePublicBond constant = CONSTANTS.get(value);
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
        private final static Map<String, JpSettings.TradingPurpose> CONSTANTS = new HashMap<String, JpSettings.TradingPurpose>();

        static {
            for (JpSettings.TradingPurpose c: values()) {
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

        public static JpSettings.TradingPurpose fromValue(String value) {
            JpSettings.TradingPurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
