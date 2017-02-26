
package data.binaryAPI.commandsUnused.get_corporate_actions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Corporate actions for an open contract
 * <p>
 * Get corporate actions for an equity symbol. Corporate actions are events such as stock splits or stock consolidations that will lead to a contract's barrier having to be adjusted accordingly.
 * 
 */
public class GetCorporateActionsSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("get_corporate_actions")
    @Expose
    private Integer getCorporateActions;
    /**
     * Equity's short symbol name. Example: USMSFT, USGOOG.
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Optional start date (epoch or YYYY-MM-DD). Will default to end minus 1 year if not specified.
     * 
     */
    @SerializedName("start")
    @Expose
    private String start;
    /**
     * Optional end date (epoch or YYYY-MM-DD). Will default to now if not specified.
     * 
     */
    @SerializedName("end")
    @Expose
    private String end;
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
    private final static long serialVersionUID = 5854302821464244253L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetCorporateActionsSend() {
    }

    /**
     * 
     * @param getCorporateActions
     * @param symbol
     * @param start
     * @param passthrough
     * @param end
     * @param reqId
     */
    public GetCorporateActionsSend(Integer getCorporateActions, String symbol, String start, String end, Passthrough passthrough, Integer reqId) {
        super();
        this.getCorporateActions = getCorporateActions;
        this.symbol = symbol;
        this.start = start;
        this.end = end;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getGetCorporateActions() {
        return getCorporateActions;
    }

    /**
     * Must be 1
     * 
     */
    public void setGetCorporateActions(Integer getCorporateActions) {
        this.getCorporateActions = getCorporateActions;
    }

    /**
     * Equity's short symbol name. Example: USMSFT, USGOOG.
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Equity's short symbol name. Example: USMSFT, USGOOG.
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Optional start date (epoch or YYYY-MM-DD). Will default to end minus 1 year if not specified.
     * 
     */
    public String getStart() {
        return start;
    }

    /**
     * Optional start date (epoch or YYYY-MM-DD). Will default to end minus 1 year if not specified.
     * 
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Optional end date (epoch or YYYY-MM-DD). Will default to now if not specified.
     * 
     */
    public String getEnd() {
        return end;
    }

    /**
     * Optional end date (epoch or YYYY-MM-DD). Will default to now if not specified.
     * 
     */
    public void setEnd(String end) {
        this.end = end;
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
        return new HashCodeBuilder().append(getCorporateActions).append(symbol).append(start).append(end).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetCorporateActionsSend) == false) {
            return false;
        }
        GetCorporateActionsSend rhs = ((GetCorporateActionsSend) other);
        return new EqualsBuilder().append(getCorporateActions, rhs.getCorporateActions).append(symbol, rhs.symbol).append(start, rhs.start).append(end, rhs.end).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
