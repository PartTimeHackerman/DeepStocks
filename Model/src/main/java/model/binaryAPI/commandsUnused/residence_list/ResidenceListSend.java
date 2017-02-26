
package data.binaryAPI.commandsUnused.residence_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Residence List Send
 * <p>
 * This call returns a list of countries and 2-letter country codes, suitable for populating the account opening form.
 * 
 */
public class ResidenceListSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("residence_list")
    @Expose
    private Integer residenceList;
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
    private final static long serialVersionUID = -4398589277979922505L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResidenceListSend() {
    }

    /**
     * 
     * @param passthrough
     * @param residenceList
     * @param reqId
     */
    public ResidenceListSend(Integer residenceList, Passthrough passthrough, Integer reqId) {
        super();
        this.residenceList = residenceList;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getResidenceList() {
        return residenceList;
    }

    /**
     * Must be 1
     * 
     */
    public void setResidenceList(Integer residenceList) {
        this.residenceList = residenceList;
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
        return new HashCodeBuilder().append(residenceList).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResidenceListSend) == false) {
            return false;
        }
        ResidenceListSend rhs = ((ResidenceListSend) other);
        return new EqualsBuilder().append(residenceList, rhs.residenceList).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
