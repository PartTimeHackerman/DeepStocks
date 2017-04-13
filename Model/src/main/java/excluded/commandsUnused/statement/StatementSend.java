
package data.binaryAPI.commandsUnused.statement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Statement Send
 * <p>
 * Retrieve a summary of account transactions, according to given search criteria
 * 
 */
public class StatementSend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("statement")
    @Expose
    private Integer statement;
    /**
     * If set to 1, will return full contracts description.
     * 
     */
    @SerializedName("description")
    @Expose
    private Integer description;
    /**
     * Apply upper limit to count of transactions received
     * 
     */
    @SerializedName("limit")
    @Expose
    private Double limit;
    /**
     * Skip this many transactions
     * 
     */
    @SerializedName("offset")
    @Expose
    private Double offset;
    /**
     * Optional start date (epoch)
     * 
     */
    @SerializedName("date_from")
    @Expose
    private Integer dateFrom;
    /**
     * Optional end date (epoch)
     * 
     */
    @SerializedName("date_to")
    @Expose
    private Integer dateTo;
    /**
     * Optional filter for statement (deposit,withdrawal,buy,sell)
     * 
     */
    @SerializedName("action_type")
    @Expose
    private String actionType;
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
    private final static long serialVersionUID = 4479571086036912585L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatementSend() {
    }

    /**
     * 
     * @param actionType
     * @param offset
     * @param statement
     * @param limit
     * @param dateTo
     * @param passthrough
     * @param description
     * @param dateFrom
     * @param reqId
     */
    public StatementSend(Integer statement, Integer description, Double limit, Double offset, Integer dateFrom, Integer dateTo, String actionType, Passthrough passthrough, Integer reqId) {
        super();
        this.statement = statement;
        this.description = description;
        this.limit = limit;
        this.offset = offset;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.actionType = actionType;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getStatement() {
        return statement;
    }

    /**
     * Must be 1.
     * 
     */
    public void setStatement(Integer statement) {
        this.statement = statement;
    }

    /**
     * If set to 1, will return full contracts description.
     * 
     */
    public Integer getDescription() {
        return description;
    }

    /**
     * If set to 1, will return full contracts description.
     * 
     */
    public void setDescription(Integer description) {
        this.description = description;
    }

    /**
     * Apply upper limit to count of transactions received
     * 
     */
    public Double getLimit() {
        return limit;
    }

    /**
     * Apply upper limit to count of transactions received
     * 
     */
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * Skip this many transactions
     * 
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * Skip this many transactions
     * 
     */
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * Optional start date (epoch)
     * 
     */
    public Integer getDateFrom() {
        return dateFrom;
    }

    /**
     * Optional start date (epoch)
     * 
     */
    public void setDateFrom(Integer dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Optional end date (epoch)
     * 
     */
    public Integer getDateTo() {
        return dateTo;
    }

    /**
     * Optional end date (epoch)
     * 
     */
    public void setDateTo(Integer dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Optional filter for statement (deposit,withdrawal,buy,sell)
     * 
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Optional filter for statement (deposit,withdrawal,buy,sell)
     * 
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
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
        return new HashCodeBuilder().append(statement).append(description).append(limit).append(offset).append(dateFrom).append(dateTo).append(actionType).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatementSend) == false) {
            return false;
        }
        StatementSend rhs = ((StatementSend) other);
        return new EqualsBuilder().append(statement, rhs.statement).append(description, rhs.description).append(limit, rhs.limit).append(offset, rhs.offset).append(dateFrom, rhs.dateFrom).append(dateTo, rhs.dateTo).append(actionType, rhs.actionType).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
