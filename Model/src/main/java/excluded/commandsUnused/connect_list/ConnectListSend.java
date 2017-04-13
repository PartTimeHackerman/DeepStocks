
package data.binaryAPI.commandsUnused.connect_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Social Connect List Send
 * <p>
 * List all social connects
 * 
 */
public class ConnectListSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("connect_list")
    @Expose
    private Integer connectList;
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
    private final static long serialVersionUID = -8306636707472189180L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectListSend() {
    }

    /**
     * 
     * @param connectList
     * @param passthrough
     * @param reqId
     */
    public ConnectListSend(Integer connectList, Passthrough passthrough, Integer reqId) {
        super();
        this.connectList = connectList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getConnectList() {
        return connectList;
    }

    /**
     * Must be 1
     * 
     */
    public void setConnectList(Integer connectList) {
        this.connectList = connectList;
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
        return new HashCodeBuilder().append(connectList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectListSend) == false) {
            return false;
        }
        ConnectListSend rhs = ((ConnectListSend) other);
        return new EqualsBuilder().append(connectList, rhs.connectList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
