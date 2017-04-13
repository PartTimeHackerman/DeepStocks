
package data.binaryAPI.commandsUnused.portfolio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Portfolio Receive
 * <p>
 * Receive a list of outstanding options in the user's portfolio
 * 
 */
public class PortfolioReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * Portfolio
     * <p>
     * Client open positions
     * 
     */
    @SerializedName("portfolio")
    @Expose
    private Portfolio portfolio;
    /**
     * portfolio
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = -6603125553319432571L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortfolioReceive() {
    }

    /**
     * 
     * @param msgType
     * @param portfolio
     * @param echoReq
     * @param reqId
     */
    public PortfolioReceive(Object echoReq, Portfolio portfolio, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.portfolio = portfolio;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * Portfolio
     * <p>
     * Client open positions
     * 
     */
    public Portfolio getPortfolio() {
        return portfolio;
    }

    /**
     * Portfolio
     * <p>
     * Client open positions
     * 
     */
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    /**
     * portfolio
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * portfolio
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(portfolio).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioReceive) == false) {
            return false;
        }
        PortfolioReceive rhs = ((PortfolioReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(portfolio, rhs.portfolio).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
