
package data.binaryAPI.commandsUnused.proposal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Price Proposal Response
 * <p>
 * Latest price and other details for a given contract
 * 
 */
public class Proposal implements Serializable
{

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    @SerializedName("longcode")
    @Expose
    private String longcode;
    /**
     * Spot value (if there are no Exchange data-feed licensing restrictions for the underlying symbol). Example: 9874.52
     * (Required)
     * 
     */
    @SerializedName("spot")
    @Expose
    private Double spot;
    /**
     * Example: 1439999052
     * (Required)
     * 
     */
    @SerializedName("spot_time")
    @Expose
    private Integer spotTime;
    /**
     * Example: 5.14
     * (Required)
     * 
     */
    @SerializedName("ask_price")
    @Expose
    private Double askPrice;
    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    @SerializedName("display_value")
    @Expose
    private Double displayValue;
    /**
     * Example: 1439999053
     * (Required)
     * 
     */
    @SerializedName("date_start")
    @Expose
    private Integer dateStart;
    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Example: 10
     * (Required)
     * 
     */
    @SerializedName("payout")
    @Expose
    private Double payout;
    /**
     * Example: 10
     * 
     */
    @SerializedName("spread")
    @Expose
    private Double spread;
    private final static long serialVersionUID = 4719130635210519193L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Proposal() {
    }

    /**
     * 
     * @param displayValue
     * @param askPrice
     * @param dateStart
     * @param spot
     * @param longcode
     * @param payout
     * @param spotTime
     * @param id
     * @param spread
     */
    public Proposal(String longcode, Double spot, Integer spotTime, Double askPrice, Double displayValue, Integer dateStart, String id, Double payout, Double spread) {
        super();
        this.longcode = longcode;
        this.spot = spot;
        this.spotTime = spotTime;
        this.askPrice = askPrice;
        this.displayValue = displayValue;
        this.dateStart = dateStart;
        this.id = id;
        this.payout = payout;
        this.spread = spread;
    }

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    public String getLongcode() {
        return longcode;
    }

    /**
     * Example: Win payout if Random 100 Index is strictly higher than entry spot at 15 minutes after contract start time.
     * (Required)
     * 
     */
    public void setLongcode(String longcode) {
        this.longcode = longcode;
    }

    /**
     * Spot value (if there are no Exchange data-feed licensing restrictions for the underlying symbol). Example: 9874.52
     * (Required)
     * 
     */
    public Double getSpot() {
        return spot;
    }

    /**
     * Spot value (if there are no Exchange data-feed licensing restrictions for the underlying symbol). Example: 9874.52
     * (Required)
     * 
     */
    public void setSpot(Double spot) {
        this.spot = spot;
    }

    /**
     * Example: 1439999052
     * (Required)
     * 
     */
    public Integer getSpotTime() {
        return spotTime;
    }

    /**
     * Example: 1439999052
     * (Required)
     * 
     */
    public void setSpotTime(Integer spotTime) {
        this.spotTime = spotTime;
    }

    /**
     * Example: 5.14
     * (Required)
     * 
     */
    public Double getAskPrice() {
        return askPrice;
    }

    /**
     * Example: 5.14
     * (Required)
     * 
     */
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    public Double getDisplayValue() {
        return displayValue;
    }

    /**
     * Example: 5.14, same as ask_price except for spread contracts
     * (Required)
     * 
     */
    public void setDisplayValue(Double displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * Example: 1439999053
     * (Required)
     * 
     */
    public Integer getDateStart() {
        return dateStart;
    }

    /**
     * Example: 1439999053
     * (Required)
     * 
     */
    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * A stream id that can be used to cancel this stream using the Forget request. Example: 1d6651e7d599bce6c54bd71a8283e579
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Example: 10
     * (Required)
     * 
     */
    public Double getPayout() {
        return payout;
    }

    /**
     * Example: 10
     * (Required)
     * 
     */
    public void setPayout(Double payout) {
        this.payout = payout;
    }

    /**
     * Example: 10
     * 
     */
    public Double getSpread() {
        return spread;
    }

    /**
     * Example: 10
     * 
     */
    public void setSpread(Double spread) {
        this.spread = spread;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longcode).append(spot).append(spotTime).append(askPrice).append(displayValue).append(dateStart).append(id).append(payout).append(spread).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Proposal) == false) {
            return false;
        }
        Proposal rhs = ((Proposal) other);
        return new EqualsBuilder().append(longcode, rhs.longcode).append(spot, rhs.spot).append(spotTime, rhs.spotTime).append(askPrice, rhs.askPrice).append(displayValue, rhs.displayValue).append(dateStart, rhs.dateStart).append(id, rhs.id).append(payout, rhs.payout).append(spread, rhs.spread).isEquals();
    }

}
