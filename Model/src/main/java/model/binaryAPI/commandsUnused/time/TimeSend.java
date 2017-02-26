
package data.binaryAPI.commandsUnused.time;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Time request
 * <p>
 * Request back-end server epoch time
 * 
 */
public class TimeSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("time")
    @Expose
    private Integer time;
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
    private final static long serialVersionUID = 1446603251885754740L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TimeSend() {
    }

    /**
     * 
     * @param passthrough
     * @param time
     * @param reqId
     */
    public TimeSend(Integer time, Passthrough passthrough, Integer reqId) {
        super();
        this.time = time;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getTime() {
        return time;
    }

    /**
     * Must be 1
     * 
     */
    public void setTime(Integer time) {
        this.time = time;
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
        return new HashCodeBuilder().append(time).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeSend) == false) {
            return false;
        }
        TimeSend rhs = ((TimeSend) other);
        return new EqualsBuilder().append(time, rhs.time).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
