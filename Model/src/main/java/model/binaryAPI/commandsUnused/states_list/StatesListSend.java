
package data.binaryAPI.commandsUnused.states_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * States List Send
 * <p>
 * For a given country, returns a list of States of that country. This is useful to populate the account opening form.
 * 
 */
public class StatesListSend implements Serializable
{

    /**
     * States list
     * <p>
     * Two letter country code.
     * 
     */
    @SerializedName("states_list")
    @Expose
    private String statesList;
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
    private final static long serialVersionUID = -7758255488394842842L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatesListSend() {
    }

    /**
     * 
     * @param statesList
     * @param passthrough
     * @param reqId
     */
    public StatesListSend(String statesList, Passthrough passthrough, Integer reqId) {
        super();
        this.statesList = statesList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * States list
     * <p>
     * Two letter country code.
     * 
     */
    public String getStatesList() {
        return statesList;
    }

    /**
     * States list
     * <p>
     * Two letter country code.
     * 
     */
    public void setStatesList(String statesList) {
        this.statesList = statesList;
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
        return new HashCodeBuilder().append(statesList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatesListSend) == false) {
            return false;
        }
        StatesListSend rhs = ((StatesListSend) other);
        return new EqualsBuilder().append(statesList, rhs.statesList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
