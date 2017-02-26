
package data.binaryAPI.commandsUnused.mt5_login_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Get List of MT5 accounts for client
 * <p>
 * Get list of MT5 accounts for client
 * 
 */
public class Mt5LoginListSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_login_list")
    @Expose
    private Integer mt5LoginList;
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
    private final static long serialVersionUID = -4413070486460963122L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5LoginListSend() {
    }

    /**
     * 
     * @param mt5LoginList
     * @param passthrough
     * @param reqId
     */
    public Mt5LoginListSend(Integer mt5LoginList, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5LoginList = mt5LoginList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5LoginList() {
        return mt5LoginList;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5LoginList(Integer mt5LoginList) {
        this.mt5LoginList = mt5LoginList;
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
        return new HashCodeBuilder().append(mt5LoginList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5LoginListSend) == false) {
            return false;
        }
        Mt5LoginListSend rhs = ((Mt5LoginListSend) other);
        return new EqualsBuilder().append(mt5LoginList, rhs.mt5LoginList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
