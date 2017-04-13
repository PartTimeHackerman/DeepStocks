
package data.binaryAPI.commandsUnused.contracts_for;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContractsFor implements Serializable
{

    /**
     * Array of available contracts details
     * 
     */
    @SerializedName("available")
    @Expose
    private List<Available> available = new ArrayList<Available>();
    /**
     * Symbol's next market-close time as an epoch value
     * (Required)
     * 
     */
    @SerializedName("close")
    @Expose
    private Integer close;
    /**
     * Symbol's next market-open time as an epoch value
     * (Required)
     * 
     */
    @SerializedName("open")
    @Expose
    private Integer open;
    /**
     * Count of contracts available
     * (Required)
     * 
     */
    @SerializedName("hit_count")
    @Expose
    private Double hitCount;
    /**
     * Current spot price for this underlying
     * (Required)
     * 
     */
    @SerializedName("spot")
    @Expose
    private Double spot;
    /**
     * Indicates the feed license for symbol, for example whether its realtime or delayed
     * (Required)
     * 
     */
    @SerializedName("feed_license")
    @Expose
    private String feedLicense;
    private final static long serialVersionUID = -3447657396490939214L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContractsFor() {
    }

    /**
     * 
     * @param hitCount
     * @param feedLicense
     * @param spot
     * @param available
     * @param close
     * @param open
     */
    public ContractsFor(List<Available> available, Integer close, Integer open, Double hitCount, Double spot, String feedLicense) {
        super();
        this.available = available;
        this.close = close;
        this.open = open;
        this.hitCount = hitCount;
        this.spot = spot;
        this.feedLicense = feedLicense;
    }

    /**
     * Array of available contracts details
     * 
     */
    public List<Available> getAvailable() {
        return available;
    }

    /**
     * Array of available contracts details
     * 
     */
    public void setAvailable(List<Available> available) {
        this.available = available;
    }

    /**
     * Symbol's next market-close time as an epoch value
     * (Required)
     * 
     */
    public Integer getClose() {
        return close;
    }

    /**
     * Symbol's next market-close time as an epoch value
     * (Required)
     * 
     */
    public void setClose(Integer close) {
        this.close = close;
    }

    /**
     * Symbol's next market-open time as an epoch value
     * (Required)
     * 
     */
    public Integer getOpen() {
        return open;
    }

    /**
     * Symbol's next market-open time as an epoch value
     * (Required)
     * 
     */
    public void setOpen(Integer open) {
        this.open = open;
    }

    /**
     * Count of contracts available
     * (Required)
     * 
     */
    public Double getHitCount() {
        return hitCount;
    }

    /**
     * Count of contracts available
     * (Required)
     * 
     */
    public void setHitCount(Double hitCount) {
        this.hitCount = hitCount;
    }

    /**
     * Current spot price for this underlying
     * (Required)
     * 
     */
    public Double getSpot() {
        return spot;
    }

    /**
     * Current spot price for this underlying
     * (Required)
     * 
     */
    public void setSpot(Double spot) {
        this.spot = spot;
    }

    /**
     * Indicates the feed license for symbol, for example whether its realtime or delayed
     * (Required)
     * 
     */
    public String getFeedLicense() {
        return feedLicense;
    }

    /**
     * Indicates the feed license for symbol, for example whether its realtime or delayed
     * (Required)
     * 
     */
    public void setFeedLicense(String feedLicense) {
        this.feedLicense = feedLicense;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(available).append(close).append(open).append(hitCount).append(spot).append(feedLicense).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractsFor) == false) {
            return false;
        }
        ContractsFor rhs = ((ContractsFor) other);
        return new EqualsBuilder().append(available, rhs.available).append(close, rhs.close).append(open, rhs.open).append(hitCount, rhs.hitCount).append(spot, rhs.spot).append(feedLicense, rhs.feedLicense).isEquals();
    }

}
