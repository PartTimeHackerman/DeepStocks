
package model.binaryAPI.commands.active_symbols;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Request list of active symbols
 * <p>
 * Retrieve a list of all active symbols (underlying markets upon which contracts are available for trading).
 * 
 */
public class ActiveSymbolsSend implements Serializable, BinaryMessage
{

    /**
     * Value must be 'brief' or 'full'. If you use 'brief', only a subset of fields will be returned.
     * 
     */
    @SerializedName("active_symbols")
    @Expose
    private String activeSymbols = "full";
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    /**
     * Optional landing company field. If you specify this field, only symbols available for trading by that landing company will be returned.
     * 
     */
    @SerializedName("landing_company")
    @Expose
    private String landingCompany;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -3038713324444241430L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActiveSymbolsSend() {
    }

    /**
     * 
     * @param landingCompany
     * @param passthrough
     * @param activeSymbols
     * @param reqId
     */
    public ActiveSymbolsSend(String activeSymbols, Passthrough passthrough, String landingCompany, Integer reqId) {
        super();
        this.activeSymbols = activeSymbols;
        this.passthrough = passthrough;
        this.landingCompany = landingCompany;
        this.reqId = reqId;
    }

    /**
     * Value must be 'brief' or 'full'. If you use 'brief', only a subset of fields will be returned.
     * 
     */
    public String getActiveSymbols() {
        return activeSymbols;
    }

    /**
     * Value must be 'brief' or 'full'. If you use 'brief', only a subset of fields will be returned.
     * 
     */
    public void setActiveSymbols(String activeSymbols) {
        this.activeSymbols = activeSymbols;
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
     * Optional landing company field. If you specify this field, only symbols available for trading by that landing company will be returned.
     * 
     */
    public String getLandingCompany() {
        return landingCompany;
    }

    /**
     * Optional landing company field. If you specify this field, only symbols available for trading by that landing company will be returned.
     * 
     */
    public void setLandingCompany(String landingCompany) {
        this.landingCompany = landingCompany;
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
        return new HashCodeBuilder().append(activeSymbols).append(passthrough).append(landingCompany).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveSymbolsSend) == false) {
            return false;
        }
        ActiveSymbolsSend rhs = ((ActiveSymbolsSend) other);
        return new EqualsBuilder().append(activeSymbols, rhs.activeSymbols).append(passthrough, rhs.passthrough).append(landingCompany, rhs.landingCompany).append(reqId, rhs.reqId).isEquals();
    }

}
