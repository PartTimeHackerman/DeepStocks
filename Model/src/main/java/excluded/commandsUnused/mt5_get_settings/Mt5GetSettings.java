
package data.binaryAPI.commandsUnused.mt5_get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * 
 * <p>
 * MT5 user account details
 * 
 */
public class Mt5GetSettings implements Serializable
{

    /**
     * Login of new MT5 account
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
    /**
     * The group where account belongs to
     * 
     */
    @SerializedName("group")
    @Expose
    private String group;
    /**
     * Email address
     * 
     */
    @SerializedName("email")
    @Expose
    private String email;
    /**
     * Client's name. The maximum length of a client's symbol name is 128 characters. Optional field.
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
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
     *  2-letter country code. Optional field.
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
     * User's phone number. Optional field.
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
     * Account balance
     * 
     */
    @SerializedName("balance")
    @Expose
    private String balance;
    private final static long serialVersionUID = -578053722498734899L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5GetSettings() {
    }

    /**
     * 
     * @param leverage
     * @param zipCode
     * @param country
     * @param address
     * @param city
     * @param login
     * @param phonePassword
     * @param balance
     * @param phone
     * @param name
     * @param company
     * @param state
     * @param email
     * @param group
     */
    public Mt5GetSettings(String login, String group, String email, String name, String leverage, String address, String state, String city, String zipCode, String country, String company, String phone, String phonePassword, String balance) {
        super();
        this.login = login;
        this.group = group;
        this.email = email;
        this.name = name;
        this.leverage = leverage;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.company = company;
        this.phone = phone;
        this.phonePassword = phonePassword;
        this.balance = balance;
    }

    /**
     * Login of new MT5 account
     * 
     */
    public String getLogin() {
        return login;
    }

    /**
     * Login of new MT5 account
     * 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * The group where account belongs to
     * 
     */
    public String getGroup() {
        return group;
    }

    /**
     * The group where account belongs to
     * 
     */
    public void setGroup(String group) {
        this.group = group;
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
     * Client's name. The maximum length of a client's symbol name is 128 characters. Optional field.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Client's name. The maximum length of a client's symbol name is 128 characters. Optional field.
     * 
     */
    public void setName(String name) {
        this.name = name;
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
     *  2-letter country code. Optional field.
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     *  2-letter country code. Optional field.
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
     * User's phone number. Optional field.
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * User's phone number. Optional field.
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
     * Account balance
     * 
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Account balance
     * 
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(login).append(group).append(email).append(name).append(leverage).append(address).append(state).append(city).append(zipCode).append(country).append(company).append(phone).append(phonePassword).append(balance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5GetSettings) == false) {
            return false;
        }
        Mt5GetSettings rhs = ((Mt5GetSettings) other);
        return new EqualsBuilder().append(login, rhs.login).append(group, rhs.group).append(email, rhs.email).append(name, rhs.name).append(leverage, rhs.leverage).append(address, rhs.address).append(state, rhs.state).append(city, rhs.city).append(zipCode, rhs.zipCode).append(country, rhs.country).append(company, rhs.company).append(phone, rhs.phone).append(phonePassword, rhs.phonePassword).append(balance, rhs.balance).isEquals();
    }

}
