
package data.binaryAPI.commandsUnused.mt5_withdrawal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 Account Withdrawal Request
 * <p>
 * This call allows withdrawal from MT5 account to Binary account.
 * 
 */
public class Mt5WithdrawalSend implements Serializable
{

    @SerializedName("mt5_withdrawal")
    @Expose
    private Integer mt5Withdrawal;
    /**
     * MT5 account login to withdraw money from
     * 
     */
    @SerializedName("from_mt5")
    @Expose
    private String fromMt5;
    /**
     * Binary account loginid to transfer money to
     * 
     */
    @SerializedName("to_binary")
    @Expose
    private String toBinary;
    /**
     * Amount to withdraw. Min 1, max 20000.
     * 
     */
    @SerializedName("amount")
    @Expose
    private Double amount;
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
    private final static long serialVersionUID = 1523403720410820049L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5WithdrawalSend() {
    }

    /**
     * 
     * @param mt5Withdrawal
     * @param amount
     * @param fromMt5
     * @param passthrough
     * @param toBinary
     * @param reqId
     */
    public Mt5WithdrawalSend(Integer mt5Withdrawal, String fromMt5, String toBinary, Double amount, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5Withdrawal = mt5Withdrawal;
        this.fromMt5 = fromMt5;
        this.toBinary = toBinary;
        this.amount = amount;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getMt5Withdrawal() {
        return mt5Withdrawal;
    }

    public void setMt5Withdrawal(Integer mt5Withdrawal) {
        this.mt5Withdrawal = mt5Withdrawal;
    }

    /**
     * MT5 account login to withdraw money from
     * 
     */
    public String getFromMt5() {
        return fromMt5;
    }

    /**
     * MT5 account login to withdraw money from
     * 
     */
    public void setFromMt5(String fromMt5) {
        this.fromMt5 = fromMt5;
    }

    /**
     * Binary account loginid to transfer money to
     * 
     */
    public String getToBinary() {
        return toBinary;
    }

    /**
     * Binary account loginid to transfer money to
     * 
     */
    public void setToBinary(String toBinary) {
        this.toBinary = toBinary;
    }

    /**
     * Amount to withdraw. Min 1, max 20000.
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount to withdraw. Min 1, max 20000.
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
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
        return new HashCodeBuilder().append(mt5Withdrawal).append(fromMt5).append(toBinary).append(amount).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5WithdrawalSend) == false) {
            return false;
        }
        Mt5WithdrawalSend rhs = ((Mt5WithdrawalSend) other);
        return new EqualsBuilder().append(mt5Withdrawal, rhs.mt5Withdrawal).append(fromMt5, rhs.fromMt5).append(toBinary, rhs.toBinary).append(amount, rhs.amount).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
