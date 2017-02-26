
package data.binaryAPI.commandsUnused.buy_contract_for_multiple_accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Buy a Contract for multiple Accounts Send
 * <p>
 * Buy a Contract for multiple Accounts specified by the 'tokens' parameter. Note, although this is an authorized call, the contract is not bought for the authorized account.
 * 
 */
public class BuyContractForMultipleAccountsSend implements Serializable
{

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    @SerializedName("buy_contract_for_multiple_accounts")
    @Expose
    private String buyContractForMultipleAccounts;
    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("tokens")
    @Expose
    private List<String> tokens = new ArrayList<String>();
    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
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
    private final static long serialVersionUID = -1884621033419877465L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuyContractForMultipleAccountsSend() {
    }

    /**
     * 
     * @param buyContractForMultipleAccounts
     * @param price
     * @param passthrough
     * @param tokens
     * @param parameters
     * @param reqId
     */
    public BuyContractForMultipleAccountsSend(String buyContractForMultipleAccounts, Double price, List<String> tokens, Parameters parameters, Passthrough passthrough, Integer reqId) {
        super();
        this.buyContractForMultipleAccounts = buyContractForMultipleAccounts;
        this.price = price;
        this.tokens = tokens;
        this.parameters = parameters;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    public String getBuyContractForMultipleAccounts() {
        return buyContractForMultipleAccounts;
    }

    /**
     * Either the id received from a Price Proposal (proposal) call, or 1 if contract buy parameters are passed in the parameters field
     * 
     */
    public void setBuyContractForMultipleAccounts(String buyContractForMultipleAccounts) {
        this.buyContractForMultipleAccounts = buyContractForMultipleAccounts;
    }

    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Maximum price at which to purchase the contract.
     * 
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Optional field, used to pass the parameters for contract buy
     * 
     */
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
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
        return new HashCodeBuilder().append(buyContractForMultipleAccounts).append(price).append(tokens).append(parameters).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuyContractForMultipleAccountsSend) == false) {
            return false;
        }
        BuyContractForMultipleAccountsSend rhs = ((BuyContractForMultipleAccountsSend) other);
        return new EqualsBuilder().append(buyContractForMultipleAccounts, rhs.buyContractForMultipleAccounts).append(price, rhs.price).append(tokens, rhs.tokens).append(parameters, rhs.parameters).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
