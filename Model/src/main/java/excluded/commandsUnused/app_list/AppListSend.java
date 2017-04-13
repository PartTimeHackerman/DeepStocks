
package data.binaryAPI.commandsUnused.app_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * App List Send
 * <p>
 * List all my OAuth application
 * 
 */
public class AppListSend implements Serializable
{

    @SerializedName("app_list")
    @Expose
    private Integer appList;
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
    private final static long serialVersionUID = 3433490532582088594L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppListSend() {
    }

    /**
     * 
     * @param appList
     * @param passthrough
     * @param reqId
     */
    public AppListSend(Integer appList, Passthrough passthrough, Integer reqId) {
        super();
        this.appList = appList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getAppList() {
        return appList;
    }

    public void setAppList(Integer appList) {
        this.appList = appList;
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
        return new HashCodeBuilder().append(appList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppListSend) == false) {
            return false;
        }
        AppListSend rhs = ((AppListSend) other);
        return new EqualsBuilder().append(appList, rhs.appList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
