
package data.binaryAPI.commandsUnused.copytrading_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Request statistics of trader
 * <p>
 * Retrieve performance, trading, risk and copiers statistics of trader.
 * 
 */
public class CopytradingStatisticsSend implements Serializable
{

    @SerializedName("copytrading_statistics")
    @Expose
    private Integer copytradingStatistics;
    /**
     * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
     * 
     */
    @SerializedName("passthrough")
    @Expose
    private Passthrough passthrough;
    @SerializedName("trader_id")
    @Expose
    private String traderId;
    /**
     * Optional field to map request to response
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 110195206645830335L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CopytradingStatisticsSend() {
    }

    /**
     * 
     * @param copytradingStatistics
     * @param passthrough
     * @param traderId
     * @param reqId
     */
    public CopytradingStatisticsSend(Integer copytradingStatistics, Passthrough passthrough, String traderId, Integer reqId) {
        super();
        this.copytradingStatistics = copytradingStatistics;
        this.passthrough = passthrough;
        this.traderId = traderId;
        this.reqId = reqId;
    }

    public Integer getCopytradingStatistics() {
        return copytradingStatistics;
    }

    public void setCopytradingStatistics(Integer copytradingStatistics) {
        this.copytradingStatistics = copytradingStatistics;
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

    public String getTraderId() {
        return traderId;
    }

    public void setTraderId(String traderId) {
        this.traderId = traderId;
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
        return new HashCodeBuilder().append(copytradingStatistics).append(passthrough).append(traderId).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CopytradingStatisticsSend) == false) {
            return false;
        }
        CopytradingStatisticsSend rhs = ((CopytradingStatisticsSend) other);
        return new EqualsBuilder().append(copytradingStatistics, rhs.copytradingStatistics).append(passthrough, rhs.passthrough).append(traderId, rhs.traderId).append(reqId, rhs.reqId).isEquals();
    }

}
