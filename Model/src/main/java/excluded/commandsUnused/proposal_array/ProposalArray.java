
package data.binaryAPI.commandsUnused.proposal_array;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Multiple Price Proposal Response
 * <p>
 * Latest price and other details for a given contract
 * 
 */
public class ProposalArray implements Serializable
{

    /**
     * Multiple Price Proposal Result
     * 
     */
    @SerializedName("proposals")
    @Expose
    private List<Proposal> proposals = new ArrayList<Proposal>();
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
    private final static long serialVersionUID = 1807572734146388700L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProposalArray() {
    }

    /**
     * 
     * @param dateStart
     * @param spot
     * @param payout
     * @param spotTime
     * @param proposals
     * @param id
     * @param spread
     */
    public ProposalArray(List<Proposal> proposals, Double spot, Integer spotTime, Integer dateStart, String id, Double payout, Double spread) {
        super();
        this.proposals = proposals;
        this.spot = spot;
        this.spotTime = spotTime;
        this.dateStart = dateStart;
        this.id = id;
        this.payout = payout;
        this.spread = spread;
    }

    /**
     * Multiple Price Proposal Result
     * 
     */
    public List<Proposal> getProposals() {
        return proposals;
    }

    /**
     * Multiple Price Proposal Result
     * 
     */
    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
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
        return new HashCodeBuilder().append(proposals).append(spot).append(spotTime).append(dateStart).append(id).append(payout).append(spread).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProposalArray) == false) {
            return false;
        }
        ProposalArray rhs = ((ProposalArray) other);
        return new EqualsBuilder().append(proposals, rhs.proposals).append(spot, rhs.spot).append(spotTime, rhs.spotTime).append(dateStart, rhs.dateStart).append(id, rhs.id).append(payout, rhs.payout).append(spread, rhs.spread).isEquals();
    }

}
