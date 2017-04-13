
package data.binaryAPI.commandsUnused.mt5_new_account;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Create MT5 account
 * <p>
 * This call creates new MT5 user, either demo or real money user.
 * 
 */
public class Mt5NewAccountSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_new_account")
    @Expose
    private Integer mt5NewAccount;
    /**
     * Account type
     * 
     */
    @SerializedName("account_type")
    @Expose
    private Mt5NewAccountSend.AccountType accountType;
    /**
     * Email address
     * 
     */
    @SerializedName("email")
    @Expose
    private String email;
    /**
     * Client's name. The maximum length of name is 128 characters.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * the master password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    @SerializedName("mainPassword")
    @Expose
    private String mainPassword;
    /**
     * the investor password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    @SerializedName("investPassword")
    @Expose
    private String investPassword;
    /**
     * Client leverage (from 1 to 500).
     * 
     */
    @SerializedName("leverage")
    @Expose
    private String leverage;
    /**
     * The address of the user. The maximum length of the address is 128 characters. Optional field.
     * 
     */
    @SerializedName("address")
    @Expose
    private String address;
    /**
     * User's state (region) of residence. Optional field.
     * 
     */
    @SerializedName("state")
    @Expose
    private String state;
    /**
     * User's city of residence. Optional field.
     * 
     */
    @SerializedName("city")
    @Expose
    private String city;
    /**
     * User's zip code. Optional field.
     * 
     */
    @SerializedName("zipCode")
    @Expose
    private String zipCode;
    /**
     *  2-letter country code (value received from residence_list call). Optional field.
     * 
     */
    @SerializedName("country")
    @Expose
    private String country;
    /**
     * Name of the client's company. The maximum length of the company name is 64 characters. Optional field.
     * 
     */
    @SerializedName("company")
    @Expose
    private String company;
    /**
     * User's phone number. Optional field. Max length 50
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * the user's phone password.
     * 
     */
    @SerializedName("phonePassword")
    @Expose
    private String phonePassword;
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
    private final static long serialVersionUID = -1273201637330168278L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5NewAccountSend() {
    }

    /**
     * 
     * @param leverage
     * @param zipCode
     * @param country
     * @param mt5NewAccount
     * @param mainPassword
     * @param address
     * @param city
     * @param accountType
     * @param reqId
     * @param phonePassword
     * @param investPassword
     * @param phone
     * @param name
     * @param passthrough
     * @param company
     * @param state
     * @param email
     */
    public Mt5NewAccountSend(Integer mt5NewAccount, Mt5NewAccountSend.AccountType accountType, String email, String name, String mainPassword, String investPassword, String leverage, String address, String state, String city, String zipCode, String country, String company, String phone, String phonePassword, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5NewAccount = mt5NewAccount;
        this.accountType = accountType;
        this.email = email;
        this.name = name;
        this.mainPassword = mainPassword;
        this.investPassword = investPassword;
        this.leverage = leverage;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.company = company;
        this.phone = phone;
        this.phonePassword = phonePassword;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5NewAccount() {
        return mt5NewAccount;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5NewAccount(Integer mt5NewAccount) {
        this.mt5NewAccount = mt5NewAccount;
    }

    /**
     * Account type
     * 
     */
    public Mt5NewAccountSend.AccountType getAccountType() {
        return accountType;
    }

    /**
     * Account type
     * 
     */
    public void setAccountType(Mt5NewAccountSend.AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Email address
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Email address
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Client's name. The maximum length of name is 128 characters.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Client's name. The maximum length of name is 128 characters.
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * the master password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    public String getMainPassword() {
        return mainPassword;
    }

    /**
     * the master password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    public void setMainPassword(String mainPassword) {
        this.mainPassword = mainPassword;
    }

    /**
     * the investor password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    public String getInvestPassword() {
        return investPassword;
    }

    /**
     * the investor password of the account. The password must contain at least two of three types of characters (lower case, upper case and digits) and meet the minimum length requirements set for the group. This field is required.
     * 
     */
    public void setInvestPassword(String investPassword) {
        this.investPassword = investPassword;
    }

    /**
     * Client leverage (from 1 to 500).
     * 
     */
    public String getLeverage() {
        return leverage;
    }

    /**
     * Client leverage (from 1 to 500).
     * 
     */
    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    /**
     * The address of the user. The maximum length of the address is 128 characters. Optional field.
     * 
     */
    public String getAddress() {
        return address;
    }

    /**
     * The address of the user. The maximum length of the address is 128 characters. Optional field.
     * 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * User's state (region) of residence. Optional field.
     * 
     */
    public String getState() {
        return state;
    }

    /**
     * User's state (region) of residence. Optional field.
     * 
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * User's city of residence. Optional field.
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * User's city of residence. Optional field.
     * 
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * User's zip code. Optional field.
     * 
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * User's zip code. Optional field.
     * 
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     *  2-letter country code (value received from residence_list call). Optional field.
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     *  2-letter country code (value received from residence_list call). Optional field.
     * 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Name of the client's company. The maximum length of the company name is 64 characters. Optional field.
     * 
     */
    public String getCompany() {
        return company;
    }

    /**
     * Name of the client's company. The maximum length of the company name is 64 characters. Optional field.
     * 
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * User's phone number. Optional field. Max length 50
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * User's phone number. Optional field. Max length 50
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * the user's phone password.
     * 
     */
    public String getPhonePassword() {
        return phonePassword;
    }

    /**
     * the user's phone password.
     * 
     */
    public void setPhonePassword(String phonePassword) {
        this.phonePassword = phonePassword;
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
        return new HashCodeBuilder().append(mt5NewAccount).append(accountType).append(email).append(name).append(mainPassword).append(investPassword).append(leverage).append(address).append(state).append(city).append(zipCode).append(country).append(company).append(phone).append(phonePassword).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5NewAccountSend) == false) {
            return false;
        }
        Mt5NewAccountSend rhs = ((Mt5NewAccountSend) other);
        return new EqualsBuilder().append(mt5NewAccount, rhs.mt5NewAccount).append(accountType, rhs.accountType).append(email, rhs.email).append(name, rhs.name).append(mainPassword, rhs.mainPassword).append(investPassword, rhs.investPassword).append(leverage, rhs.leverage).append(address, rhs.address).append(state, rhs.state).append(city, rhs.city).append(zipCode, rhs.zipCode).append(country, rhs.country).append(company, rhs.company).append(phone, rhs.phone).append(phonePassword, rhs.phonePassword).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum AccountType {

        @SerializedName("demo")
        DEMO("demo"),
        @SerializedName("gaming")
        GAMING("gaming"),
        @SerializedName("financial")
        FINANCIAL("financial");
        private final String value;
        private final static Map<String, Mt5NewAccountSend.AccountType> CONSTANTS = new HashMap<String, Mt5NewAccountSend.AccountType>();

        static {
            for (Mt5NewAccountSend.AccountType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccountType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Mt5NewAccountSend.AccountType fromValue(String value) {
            Mt5NewAccountSend.AccountType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
