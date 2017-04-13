
package data.binaryAPI.commandsUnused.asset_index;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Asset Index Send
 * <p>
 * Retrieve the Asset Index: a list of all available markets and a summary of the contracts available thereupon.
 * 
 */
public class AssetIndexSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("asset_index")
    @Expose
    private Integer assetIndex;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional landing company field. If specified, will return only the markets and contracts that this landing company can trade.
     * 
     */
    @SerializedName("landing_company")
    @Expose
    private String landingCompany;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 1536607452905822346L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssetIndexSend() {
    }

    /**
     * 
     * @param landingCompany
     * @param passthrough
     * @param assetIndex
     * @param reqId
     */
    public AssetIndexSend(Integer assetIndex, Passthrough passthrough, String landingCompany, Integer reqId) {
        super();
        this.assetIndex = assetIndex;
        this.passthrough = passthrough;
        this.landingCompany = landingCompany;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getAssetIndex() {
        return assetIndex;
    }

    /**
     * Must be 1
     * 
     */
    public void setAssetIndex(Integer assetIndex) {
        this.assetIndex = assetIndex;
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
     * Optional landing company field. If specified, will return only the markets and contracts that this landing company can trade.
     * 
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * Optional landing company field. If specified, will return only the markets and contracts that this landing company can trade.
     * 
     */
    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
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
        return new HashCodeBuilder().append(assetIndex).append(passthrough).append(landingCompany).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetIndexSend) == false) {
            return false;
        }
        AssetIndexSend rhs = ((AssetIndexSend) other);
        return new EqualsBuilder().append(assetIndex, rhs.assetIndex).append(passthrough, rhs.passthrough).append(landingCompany, rhs.landingCompany).append(reqId, rhs.reqId).isEquals();
    }

}
