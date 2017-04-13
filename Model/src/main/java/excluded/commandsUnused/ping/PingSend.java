
package data.binaryAPI.commandsUnused.ping;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Ping Send
 * <p>
 * 
 * 
 */
public class PingSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("ping")
    @Expose
    private String ping;
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
    private final static long serialVersionUID = 1901346841166264554L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PingSend() {
    }

    /**
     * 
     * @param ping
     * @param passthrough
     * @param reqId
     */
    public PingSend(String ping, Passthrough passthrough, Integer reqId) {
        super();
        this.ping = ping;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public String getPing() {
        return ping;
    }

    /**
     * Must be 1
     * 
     */
    public void setPing(String ping) {
        this.ping = ping;
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
        return new HashCodeBuilder().append(ping).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PingSend) == false) {
            return false;
        }
        PingSend rhs = ((PingSend) other);
        return new EqualsBuilder().append(ping, rhs.ping).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
