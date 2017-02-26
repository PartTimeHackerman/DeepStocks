
package data.binaryAPI.commandsUnused.app_delete;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App Delete Send
 * <p>
 * 
 * 
 */
public class AppDeleteSend implements Serializable
{

    /**
     * Application app_id
     * 
     */
    @SerializedName("app_delete")
    @Expose
    private Integer appDelete;
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
    private final static long serialVersionUID = 8889134070171714350L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppDeleteSend() {
    }

    /**
     * 
     * @param passthrough
     * @param appDelete
     * @param reqId
     */
    public AppDeleteSend(Integer appDelete, Passthrough passthrough, Integer reqId) {
        super();
        this.appDelete = appDelete;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Application app_id
     * 
     */
    public Integer getAppDelete() {
        return appDelete;
    }

    /**
     * Application app_id
     * 
     */
    public void setAppDelete(Integer appDelete) {
        this.appDelete = appDelete;
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
        return new HashCodeBuilder().append(appDelete).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppDeleteSend) == false) {
            return false;
        }
        AppDeleteSend rhs = ((AppDeleteSend) other);
        return new EqualsBuilder().append(appDelete, rhs.appDelete).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
