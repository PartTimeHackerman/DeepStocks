
package data.binaryAPI.commandsUnused.portfolio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Portfolio
 * <p>
 * Client open positions
 * 
 */
public class Contract implements Serializable
{

    /**
     * Binary.com internal contract identifier number (to be used in a Price Proposal - Open Contract API call)
     * 
     */
    @SerializedName("contract_id")
    @Expose
    private Integer contractId;
    /**
     * It is the transaction id. Every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    /**
     * Epoch of purchase time
     * 
     */
    @SerializedName("purchase_time")
    @Expose
    private Integer purchaseTime;
    /**
     * Symbol code
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Payout price
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    /**
     * Buy price
     * 
     */
    @SerializedName("buy_price")
    @Expose
    private Double buyPrice;
    /**
     * Epoch of start date
     * 
     */
    @SerializedName("date_start")
    @Expose
    private Integer dateStart;
    /**
     * Epoch of expiry time
     * 
     */
    @SerializedName("expiry_time")
    @Expose
    private Integer expiryTime;
    /**
     * Contract type
     * 
     */
    @SerializedName("contract_type")
    @Expose
    private String contractType;
    /**
     * Contract currency
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Contract description
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Id of an app from where this contract was purchased. For example, it's 1 for binary.com.
     * 
     */
    @SerializedName("app_id")
    @Expose
    private Integer appId;
    private final static long serialVersionUID = -2349020728358372463L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contract() {
    }

    /**
     * 
     * @param buyPrice
     * @param symbol
     * @param dateStart
     * @param contractType
     * @param appId
     * @param contractId
     * @param payout
     * @param expiryTime
     * @param longcode
     * @param purchaseTime
     * @param currency
     * @param transactionId
     */
    public Contract(Integer contractId, Integer transactionId, Integer purchaseTime, String symbol, Double payout, Double buyPrice, Integer dateStart, Integer expiryTime, String contractType, String currency, String longcode, Integer appId) {
        super();
        this.contractId = contractId;
        this.transactionId = transactionId;
        this.purchaseTime = purchaseTime;
        this.symbol = symbol;
        this.payout = payout;
        this.buyPrice = buyPrice;
        this.dateStart = dateStart;
        this.expiryTime = expiryTime;
        this.contractType = contractType;
        this.currency = currency;
        this.longcode = longcode;
        this.appId = appId;
    }

    /**
     * Binary.com internal contract identifier number (to be used in a Price Proposal - Open Contract API call)
     * 
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * Binary.com internal contract identifier number (to be used in a Price Proposal - Open Contract API call)
     * 
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * It is the transaction id. Every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * It is the transaction id. Every contract (buy or sell) and every payment has a unique id. Example: 10867502908
     * 
     */
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Epoch of purchase time
     * 
     */
    public Integer getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Epoch of purchase time
     * 
     */
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
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
     * Payout price
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Payout price
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    /**
     * Buy price
     * 
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * Buy price
     * 
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * Epoch of start date
     * 
     */
    public Integer getDateStart() {
        return dateStart;
    }

    /**
     * Epoch of start date
     * 
     */
    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Epoch of expiry time
     * 
     */
    public Integer getExpiryTime() {
        return expiryTime;
    }

    /**
     * Epoch of expiry time
     * 
     */
    public void setExpiryTime(Integer expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * Contract type
     * 
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Contract type
     * 
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * Contract currency
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Contract currency
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Contract description
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * Contract description
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Id of an app from where this contract was purchased. For example, it's 1 for binary.com.
     * 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * Id of an app from where this contract was purchased. For example, it's 1 for binary.com.
     * 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contractId).append(transactionId).append(purchaseTime).append(symbol).append(payout).append(buyPrice).append(dateStart).append(expiryTime).append(contractType).append(currency).append(longcode).append(appId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract) == false) {
            return false;
        }
        Contract rhs = ((Contract) other);
        return new EqualsBuilder().append(contractId, rhs.contractId).append(transactionId, rhs.transactionId).append(purchaseTime, rhs.purchaseTime).append(symbol, rhs.symbol).append(payout, rhs.payout).append(buyPrice, rhs.buyPrice).append(dateStart, rhs.dateStart).append(expiryTime, rhs.expiryTime).append(contractType, rhs.contractType).append(currency, rhs.currency).append(longcode, rhs.longcode).append(appId, rhs.appId).isEquals();
    }

}
