
package data.binaryAPI.commandsUnused.paymentagent_withdraw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Payment Agent Withdrawal Request
 * <p>
 * Initiate a withdrawal to an approved Payment Agent.
 * 
 */
public class PaymentagentWithdrawSend implements Serializable
{

    @SerializedName("paymentagent_withdraw")
    @Expose
    private Integer paymentagentWithdraw;
    /**
     * The payment agent loginid received from the paymentagent_list call
     * 
     */
    @SerializedName("paymentagent_loginid")
    @Expose
    private String paymentagentLoginid;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amount")
    @Expose
    private Double amount;
    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    @SerializedName("verification_code")
    @Expose
    private String verificationCode;
    /**
     * Optional field for remarks about the withdraw. Only letters, numbers, space, period, comma, - ' are allowed.
     * 
     */
    @SerializedName("description")
    @Expose
    private String description;
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
    private final static long serialVersionUID = -4021254526828277695L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentagentWithdrawSend() {
    }

    /**
     * 
     * @param amount
     * @param dryRun
     * @param paymentagentLoginid
     * @param paymentagentWithdraw
     * @param passthrough
     * @param description
     * @param currency
     * @param verificationCode
     * @param reqId
     */
    public PaymentagentWithdrawSend(Integer paymentagentWithdraw, String paymentagentLoginid, String currency, Double amount, String verificationCode, String description, Integer dryRun, Passthrough passthrough, Integer reqId) {
        super();
        this.paymentagentWithdraw = paymentagentWithdraw;
        this.paymentagentLoginid = paymentagentLoginid;
        this.currency = currency;
        this.amount = amount;
        this.verificationCode = verificationCode;
        this.description = description;
        this.dryRun = dryRun;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getPaymentagentWithdraw() {
        return paymentagentWithdraw;
    }

    public void setPaymentagentWithdraw(Integer paymentagentWithdraw) {
        this.paymentagentWithdraw = paymentagentWithdraw;
    }

    /**
     * The payment agent loginid received from the paymentagent_list call
     * 
     */
    public String getPaymentagentLoginid() {
        return paymentagentLoginid;
    }

    /**
     * The payment agent loginid received from the paymentagent_list call
     * 
     */
    public void setPaymentagentLoginid(String paymentagentLoginid) {
        this.paymentagentLoginid = paymentagentLoginid;
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
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
     * Optional field for remarks about the withdraw. Only letters, numbers, space, period, comma, - ' are allowed.
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Optional field for remarks about the withdraw. Only letters, numbers, space, period, comma, - ' are allowed.
     * 
     */
    public void setDescription(String description) {
        this.description = description;
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
        return new HashCodeBuilder().append(paymentagentWithdraw).append(paymentagentLoginid).append(currency).append(amount).append(verificationCode).append(description).append(dryRun).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentagentWithdrawSend) == false) {
            return false;
        }
        PaymentagentWithdrawSend rhs = ((PaymentagentWithdrawSend) other);
        return new EqualsBuilder().append(paymentagentWithdraw, rhs.paymentagentWithdraw).append(paymentagentLoginid, rhs.paymentagentLoginid).append(currency, rhs.currency).append(amount, rhs.amount).append(verificationCode, rhs.verificationCode).append(description, rhs.description).append(dryRun, rhs.dryRun).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
