
package data.binaryAPI.commandsUnused.connect_add;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Social Connect Add Send
 * <p>
 * Add new social connect
 * 
 */
public class ConnectAddSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("connect_add")
    @Expose
    private Integer connectAdd;
    /**
     * Oneall connection token (taken from redirected uri)
     * 
     */
    @SerializedName("connection_token")
    @Expose
    private String connectionToken;
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
    private final static long serialVersionUID = 3961659244502880490L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectAddSend() {
    }

    /**
     * 
     * @param connectAdd
     * @param passthrough
     * @param connectionToken
     * @param reqId
     */
    public ConnectAddSend(Integer connectAdd, String connectionToken, Passthrough passthrough, Integer reqId) {
        super();
        this.connectAdd = connectAdd;
        this.connectionToken = connectionToken;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getConnectAdd() {
        return connectAdd;
    }

    /**
     * Must be 1
     * 
     */
    public void setConnectAdd(Integer connectAdd) {
        this.connectAdd = connectAdd;
    }

    /**
     * Oneall connection token (taken from redirected uri)
     * 
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * Oneall connection token (taken from redirected uri)
     * 
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
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
        return new HashCodeBuilder().append(connectAdd).append(connectionToken).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectAddSend) == false) {
            return false;
        }
        ConnectAddSend rhs = ((ConnectAddSend) other);
        return new EqualsBuilder().append(connectAdd, rhs.connectAdd).append(connectionToken, rhs.connectionToken).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
