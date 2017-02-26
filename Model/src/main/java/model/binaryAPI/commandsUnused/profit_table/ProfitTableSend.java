
package data.binaryAPI.commandsUnused.profit_table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Profit Table Send
 * <p>
 * Retrieve a summary of account Profit Table, according to given search criteria
 * 
 */
public class ProfitTableSend implements Serializable
{

    /**
     * Must be 1.
     * 
     */
    @SerializedName("profit_table")
    @Expose
    private Integer profitTable;
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
     * Optional start date (epoch or YYYY-MM-DD)
     * 
     */
    @SerializedName("date_from")
    @Expose
    private String dateFrom;
    /**
     * Optional end date (epoch or YYYY-MM-DD)
     * 
     */
    @SerializedName("date_to")
    @Expose
    private String dateTo;
    /**
     * sort direction, default DESC
     * 
     */
    @SerializedName("sort")
    @Expose
    private String sort;
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
    private final static long serialVersionUID = 1391465269314874158L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProfitTableSend() {
    }

    /**
     * 
     * @param offset
     * @param limit
     * @param dateTo
     * @param passthrough
     * @param description
     * @param sort
     * @param dateFrom
     * @param profitTable
     * @param reqId
     */
    public ProfitTableSend(Integer profitTable, Integer description, Double limit, Double offset, String dateFrom, String dateTo, String sort, Passthrough passthrough, Integer reqId) {
        super();
        this.profitTable = profitTable;
        this.description = description;
        this.limit = limit;
        this.offset = offset;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.sort = sort;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1.
     * 
     */
    public Integer getProfitTable() {
        return profitTable;
    }

    /**
     * Must be 1.
     * 
     */
    public void setProfitTable(Integer profitTable) {
        this.profitTable = profitTable;
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
     * Optional start date (epoch or YYYY-MM-DD)
     * 
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Optional start date (epoch or YYYY-MM-DD)
     * 
     */
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Optional end date (epoch or YYYY-MM-DD)
     * 
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Optional end date (epoch or YYYY-MM-DD)
     * 
     */
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * sort direction, default DESC
     * 
     */
    public String getSort() {
        return sort;
    }

    /**
     * sort direction, default DESC
     * 
     */
    public void setSort(String sort) {
        this.sort = sort;
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
        return new HashCodeBuilder().append(profitTable).append(description).append(limit).append(offset).append(dateFrom).append(dateTo).append(sort).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfitTableSend) == false) {
            return false;
        }
        ProfitTableSend rhs = ((ProfitTableSend) other);
        return new EqualsBuilder().append(profitTable, rhs.profitTable).append(description, rhs.description).append(limit, rhs.limit).append(offset, rhs.offset).append(dateFrom, rhs.dateFrom).append(dateTo, rhs.dateTo).append(sort, rhs.sort).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
