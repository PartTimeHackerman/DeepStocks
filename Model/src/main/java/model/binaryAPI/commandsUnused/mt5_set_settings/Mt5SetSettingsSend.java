
package data.binaryAPI.commandsUnused.mt5_set_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Update MT5 account details
 * <p>
 * This call update user details in MT5 system
 * 
 */
public class Mt5SetSettingsSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("mt5_set_settings")
    @Expose
    private Integer mt5SetSettings;
    /**
     * MT5 user login
     * 
     */
    @SerializedName("login")
    @Expose
    private String login;
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
     *  2-letter country code (value received from residence_list call)
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
    private final static long serialVersionUID = -8732507185384884634L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mt5SetSettingsSend() {
    }

    /**
     * 
     * @param leverage
     * @param zipCode
     * @param country
     * @param mt5SetSettings
     * @param address
     * @param city
     * @param login
     * @param reqId
     * @param phonePassword
     * @param phone
     * @param name
     * @param passthrough
     * @param company
     * @param state
     * @param email
     */
    public Mt5SetSettingsSend(Integer mt5SetSettings, String login, String email, String name, String leverage, String address, String state, String city, String zipCode, String country, String company, String phone, String phonePassword, Passthrough passthrough, Integer reqId) {
        super();
        this.mt5SetSettings = mt5SetSettings;
        this.login = login;
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
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getMt5SetSettings() {
        return mt5SetSettings;
    }

    /**
     * Must be 1
     * 
     */
    public void setMt5SetSettings(Integer mt5SetSettings) {
        this.mt5SetSettings = mt5SetSettings;
    }

    /**
     * MT5 user login
     * 
     */
    public String getLogin() {
        return login;
    }

    /**
     * MT5 user login
     * 
     */
    public void setLogin(String login) {
        this.login = login;
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
     *  2-letter country code (value received from residence_list call)
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     *  2-letter country code (value received from residence_list call)
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
        return new HashCodeBuilder().append(mt5SetSettings).append(login).append(email).append(name).append(leverage).append(address).append(state).append(city).append(zipCode).append(country).append(company).append(phone).append(phonePassword).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mt5SetSettingsSend) == false) {
            return false;
        }
        Mt5SetSettingsSend rhs = ((Mt5SetSettingsSend) other);
        return new EqualsBuilder().append(mt5SetSettings, rhs.mt5SetSettings).append(login, rhs.login).append(email, rhs.email).append(name, rhs.name).append(leverage, rhs.leverage).append(address, rhs.address).append(state, rhs.state).append(city, rhs.city).append(zipCode, rhs.zipCode).append(country, rhs.country).append(company, rhs.company).append(phone, rhs.phone).append(phonePassword, rhs.phonePassword).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
