
package data.binaryAPI.commandsUnused.paymentagent_transfer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent Transfer Request
 * <p>
 * Payment Agent Transfer - this call is available only to accounts that are approved Payment Agents.
 * 
 */
public class PaymentagentTransferSend implements Serializable
{

    @SerializedName("paymentagent_transfer")
    @Expose
    private Integer paymentagentTransfer;
    /**
     * The transfer_to loginid
     * 
     */
    @SerializedName("transfer_to")
    @Expose
    private String transferTo;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amount")
    @Expose
    private Double amount;
    /**
     * If 1, just do validation
     * 
     */
    @SerializedName("dry_run")
    @Expose
    private Integer dryRun;
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
    private final static long serialVersionUID = -2705281585307585697L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentTransferSend() {
    }

    /**
     * 
     * @param amount
     * @param dryRun
     * @param passthrough
     * @param currency
     * @param transferTo
     * @param paymentagentTransfer
     * @param reqId
     */
    public PaymentagentTransferSend(Integer paymentagentTransfer, String transferTo, String currency, Double amount, Integer dryRun, Passthrough passthrough, Integer reqId) {
        super();
        this.paymentagentTransfer = paymentagentTransfer;
        this.transferTo = transferTo;
        this.currency = currency;
        this.amount = amount;
        this.dryRun = dryRun;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getPaymentagentTransfer() {
        return paymentagentTransfer;
    }

    public void setPaymentagentTransfer(Integer paymentagentTransfer) {
        this.paymentagentTransfer = paymentagentTransfer;
    }

    /**
     * The transfer_to loginid
     * 
     */
    public String getTransferTo() {
        return transferTo;
    }

    /**
     * The transfer_to loginid
     * 
     */
    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * If 1, just do validation
     * 
     */
    public Integer getDryRun() {
        return dryRun;
    }

    /**
     * If 1, just do validation
     * 
     */
    public void setDryRun(Integer dryRun) {
        this.dryRun = dryRun;
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
        return new HashCodeBuilder().append(paymentagentTransfer).append(transferTo).append(currency).append(amount).append(dryRun).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentTransferSend) == false) {
            return false;
        }
        PaymentagentTransferSend rhs = ((PaymentagentTransferSend) other);
        return new EqualsBuilder().append(paymentagentTransfer, rhs.paymentagentTransfer).append(transferTo, rhs.transferTo).append(currency, rhs.currency).append(amount, rhs.amount).append(dryRun, rhs.dryRun).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
