
package data.binaryAPI.commandsUnused.copy_start;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Copy Start Send
 * <p>
 * Start copy trader bets
 * 
 */
public class CopyStartSend implements Serializable
{

    /**
     * API tokens identifying the accounts of trader which will be used to copy trades
     * 
     */
    @SerializedName("copy_start")
    @Expose
    private String copyStart;
    /**
     * Optional field, used to set minimal trade stake to be copied
     * 
     */
    @SerializedName("min_trade_stake")
    @Expose
    private Double minTradeStake;
    /**
     * Optional field, used to set maximum trade stake to be copied
     * 
     */
    @SerializedName("max_trade_stake")
    @Expose
    private Double maxTradeStake;
    /**
     * Optional field, used to set assets to be copied. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    @SerializedName("assets")
    @Expose
    private Object assets;
    /**
     * Optional field, used to set trade types to be copied. E.x ["CALL", "PUT"]
     * 
     */
    @SerializedName("trade_types")
    @Expose
    private Object tradeTypes;
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
    private final static long serialVersionUID = 3160053522315811055L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopyStartSend() {
    }

    /**
     * 
     * @param assets
     * @param tradeTypes
     * @param copyStart
     * @param minTradeStake
     * @param maxTradeStake
     * @param passthrough
     * @param reqId
     */
    public CopyStartSend(String copyStart, Double minTradeStake, Double maxTradeStake, Object assets, Object tradeTypes, Passthrough passthrough, Integer reqId) {
        super();
        this.copyStart = copyStart;
        this.minTradeStake = minTradeStake;
        this.maxTradeStake = maxTradeStake;
        this.assets = assets;
        this.tradeTypes = tradeTypes;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * API tokens identifying the accounts of trader which will be used to copy trades
     * 
     */
    public String getCopyStart() {
        return copyStart;
    }

    /**
     * API tokens identifying the accounts of trader which will be used to copy trades
     * 
     */
    public void setCopyStart(String copyStart) {
        this.copyStart = copyStart;
    }

    /**
     * Optional field, used to set minimal trade stake to be copied
     * 
     */
    public Double getMinTradeStake() {
        return minTradeStake;
    }

    /**
     * Optional field, used to set minimal trade stake to be copied
     * 
     */
    public void setMinTradeStake(Double minTradeStake) {
        this.minTradeStake = minTradeStake;
    }

    /**
     * Optional field, used to set maximum trade stake to be copied
     * 
     */
    public Double getMaxTradeStake() {
        return maxTradeStake;
    }

    /**
     * Optional field, used to set maximum trade stake to be copied
     * 
     */
    public void setMaxTradeStake(Double maxTradeStake) {
        this.maxTradeStake = maxTradeStake;
    }

    /**
     * Optional field, used to set assets to be copied. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    public Object getAssets() {
        return assets;
    }

    /**
     * Optional field, used to set assets to be copied. E.x ["frxUSDJPY", "R_50"]
     * 
     */
    public void setAssets(Object assets) {
        this.assets = assets;
    }

    /**
     * Optional field, used to set trade types to be copied. E.x ["CALL", "PUT"]
     * 
     */
    public Object getTradeTypes() {
        return tradeTypes;
    }

    /**
     * Optional field, used to set trade types to be copied. E.x ["CALL", "PUT"]
     * 
     */
    public void setTradeTypes(Object tradeTypes) {
        this.tradeTypes = tradeTypes;
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
        return new HashCodeBuilder().append(copyStart).append(minTradeStake).append(maxTradeStake).append(assets).append(tradeTypes).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopyStartSend) == false) {
            return false;
        }
        CopyStartSend rhs = ((CopyStartSend) other);
        return new EqualsBuilder().append(copyStart, rhs.copyStart).append(minTradeStake, rhs.minTradeStake).append(maxTradeStake, rhs.maxTradeStake).append(assets, rhs.assets).append(tradeTypes, rhs.tradeTypes).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
