
package data.binaryAPI.commandsUnused.app_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App Get Send
 * <p>
 * get created OAuth application by app_id
 * 
 */
public class AppGetSend implements Serializable
{

    /**
     * Application app_id
     * 
     */
    @SerializedName("app_get")
    @Expose
    private Integer appGet;
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
    private final static long serialVersionUID = -3466609789733437287L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppGetSend() {
    }

    /**
     * 
     * @param appGet
     * @param passthrough
     * @param reqId
     */
    public AppGetSend(Integer appGet, Passthrough passthrough, Integer reqId) {
        super();
        this.appGet = appGet;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Application app_id
     * 
     */
    public Integer getAppGet() {
        return appGet;
    }

    /**
     * Application app_id
     * 
     */
    public void setAppGet(Integer appGet) {
        this.appGet = appGet;
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
        return new HashCodeBuilder().append(appGet).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppGetSend) == false) {
            return false;
        }
        AppGetSend rhs = ((AppGetSend) other);
        return new EqualsBuilder().append(appGet, rhs.appGet).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
