
package data.binaryAPI.commandsUnused.asset_index;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Asset Index Receive
 * <p>
 * A message with Asset Index
 * 
 */
public class AssetIndexReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * Asset Index Structure
     * <p>
     * The Asset Index structure is a hierarchy as follows: Market -> Categories -> Underlyings
     * (Required)
     * 
     */
    @SerializedName("asset_index")
    @Expose
    private List<Object> assetIndex = new ArrayList<Object>();
    /**
     * asset_index
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -8906675383396743110L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssetIndexReceive() {
    }

    /**
     * 
     * @param msgType
     * @param assetIndex
     * @param echoReq
     * @param reqId
     */
    public AssetIndexReceive(Object echoReq, List<Object> assetIndex, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.assetIndex = assetIndex;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * Asset Index Structure
     * <p>
     * The Asset Index structure is a hierarchy as follows: Market -> Categories -> Underlyings
     * (Required)
     * 
     */
    public List<Object> getAssetIndex() {
        return assetIndex;
    }

    /**
     * Asset Index Structure
     * <p>
     * The Asset Index structure is a hierarchy as follows: Market -> Categories -> Underlyings
     * (Required)
     * 
     */
    public void setAssetIndex(List<Object> assetIndex) {
        this.assetIndex = assetIndex;
    }

    /**
     * asset_index
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * asset_index
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(assetIndex).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetIndexReceive) == false) {
            return false;
        }
        AssetIndexReceive rhs = ((AssetIndexReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(assetIndex, rhs.assetIndex).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
