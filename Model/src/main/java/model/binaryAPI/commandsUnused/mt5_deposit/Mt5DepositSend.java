
package data.binaryAPI.commandsUnused.mt5_deposit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * MT5 Account Deposit Request
 * <p>
 * This call allows deposit into MT5 account from Binary account.
 * 
 */
public class Mt5DepositSend implements Serializable
{

    @SerializedName("mt5_deposit")
    @Expose
    private Integer mt5Deposit;
    /**
     * Binary account loginid to transfer money from
     * 
     */
    @SerializedName("from_binary")
    @Expose
    private String fromBinary;
    /**
     * MT5 account login to deposit money to
     * 
     */
    @SerializedName("to_mt5")
    @Expose
    private String toMt5;
    /**
     * Amount to deposit. Min 1, max 20000.
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
    private final static long serialVersionUID = 667856283444566719L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5DepositSend() {
    }

    /**
     * 
     * @param amount
     * @param mt5Deposit
     * @param toMt5
     * @param passthrough
     * @param fromBinary
     * @param reqId
     */
    public Mt5DepositSend(Integer mt5Deposit, String fromBinary, String toMt5, Double amount, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5Deposit = mt5Deposit;
        this.fromBinary = fromBinary;
        this.toMt5 = toMt5;
        this.amount = amount;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getMt5Deposit() {
        return mt5Deposit;
    }

    public void setMt5Deposit(Integer mt5Deposit) {
        this.mt5Deposit = mt5Deposit;
    }

    /**
     * Binary account loginid to transfer money from
     * 
     */
    public String getFromBinary() {
        return fromBinary;
    }

    /**
     * Binary account loginid to transfer money from
     * 
     */
    public void setFromBinary(String fromBinary) {
        this.fromBinary = fromBinary;
    }

    /**
     * MT5 account login to deposit money to
     * 
     */
    public String getToMt5() {
        return toMt5;
    }

    /**
     * MT5 account login to deposit money to
     * 
     */
    public void setToMt5(String toMt5) {
        this.toMt5 = toMt5;
    }

    /**
     * Amount to deposit. Min 1, max 20000.
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount to deposit. Min 1, max 20000.
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
        return new HashCodeBuilder().append(mt5Deposit).append(fromBinary).append(toMt5).append(amount).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5DepositSend) == false) {
            return false;
        }
        Mt5DepositSend rhs = ((Mt5DepositSend) other);
        return new EqualsBuilder().append(mt5Deposit, rhs.mt5Deposit).append(fromBinary, rhs.fromBinary).append(toMt5, rhs.toMt5).append(amount, rhs.amount).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
