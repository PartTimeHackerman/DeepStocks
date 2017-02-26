
package data.binaryAPI.commandsUnused.new_account_real;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Create real account Send
 * <p>
 * This call opens a new real-money account. Note: you must be authenticated to a virtual-money account to call this function.
 * 
 */
public class NewAccountRealSend implements Serializable
{

    /**
     * Must be 1
     * 
     */
    @SerializedName("new_account_real")
    @Expose
    private Integer newAccountReal;
    /**
     * Accept any value in enum list.
     * 
     */
    @SerializedName("salutation")
    @Expose
    private NewAccountRealSend.Salutation salutation;
    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    @SerializedName("first_name")
    @Expose
    private String firstName;
    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    @SerializedName("last_name")
    @Expose
    private String lastName;
    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    @SerializedName("residence")
    @Expose
    private String residence;
    @SerializedName("address_line_1")
    @Expose
    private String addressLine1;
    /**
     * Optional field, within 70 characters.
     * 
     */
    @SerializedName("address_line_2")
    @Expose
    private String addressLine2;
    /**
     * Within 35 characters
     * 
     */
    @SerializedName("address_city")
    @Expose
    private String addressCity;
    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    @SerializedName("address_state")
    @Expose
    private String addressState;
    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    @SerializedName("address_postcode")
    @Expose
    private String addressPostcode;
    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * Accept any value in enum list.
     * 
     */
    @SerializedName("secret_question")
    @Expose
    private NewAccountRealSend.SecretQuestion secretQuestion;
    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    @SerializedName("secret_answer")
    @Expose
    private String secretAnswer;
    /**
     * Affiliate token, within 32 characters.
     * 
     */
    @SerializedName("affiliate_token")
    @Expose
    private String affiliateToken;
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
    private final static long serialVersionUID = 8280465078232361240L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewAccountRealSend() {
    }

    /**
     * 
     * @param secretQuestion
     * @param lastName
     * @param addressPostcode
     * @param dateOfBirth
     * @param addressState
     * @param secretAnswer
     * @param reqId
     * @param newAccountReal
     * @param firstName
     * @param phone
     * @param passthrough
     * @param addressLine1
     * @param addressLine2
     * @param salutation
     * @param residence
     * @param affiliateToken
     * @param addressCity
     */
    public NewAccountRealSend(Integer newAccountReal, NewAccountRealSend.Salutation salutation, String firstName, String lastName, String dateOfBirth, String residence, String addressLine1, String addressLine2, String addressCity, String addressState, String addressPostcode, String phone, NewAccountRealSend.SecretQuestion secretQuestion, String secretAnswer, String affiliateToken, Passthrough passthrough, Integer reqId) {
        super();
        this.newAccountReal = newAccountReal;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.residence = residence;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostcode = addressPostcode;
        this.phone = phone;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.affiliateToken = affiliateToken;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    /**
     * Must be 1
     * 
     */
    public Integer getNewAccountReal() {
        return newAccountReal;
    }

    /**
     * Must be 1
     * 
     */
    public void setNewAccountReal(Integer newAccountReal) {
        this.newAccountReal = newAccountReal;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public NewAccountRealSend.Salutation getSalutation() {
        return salutation;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public void setSalutation(NewAccountRealSend.Salutation salutation) {
        this.salutation = salutation;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Within 2-30 characters, use only letters, spaces, hyphens, full-stops or apostrophes.
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of birth format: yyyy-mm-dd.
     * 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    public String getResidence() {
        return residence;
    }

    /**
     *  2-letter country code, possible value receive from residence_list call.
     * 
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Optional field, within 70 characters.
     * 
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Optional field, within 70 characters.
     * 
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Within 35 characters
     * 
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Within 35 characters
     * 
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Optional field, possible value receive from states_list call.
     * 
     */
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * Optional field, within 20 characters and may not contain '+'.
     * 
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Within 6-35 digits, allowing '+' in front, numbers or space.
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public NewAccountRealSend.SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    /**
     * Accept any value in enum list.
     * 
     */
    public void setSecretQuestion(NewAccountRealSend.SecretQuestion secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    public String getSecretAnswer() {
        return secretAnswer;
    }

    /**
     * Answer to secret question, within 4-50 characters.
     * 
     */
    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public String getAffiliateToken() {
        return affiliateToken;
    }

    /**
     * Affiliate token, within 32 characters.
     * 
     */
    public void setAffiliateToken(String affiliateToken) {
        this.affiliateToken = affiliateToken;
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
        return new HashCodeBuilder().append(newAccountReal).append(salutation).append(firstName).append(lastName).append(dateOfBirth).append(residence).append(addressLine1).append(addressLine2).append(addressCity).append(addressState).append(addressPostcode).append(phone).append(secretQuestion).append(secretAnswer).append(affiliateToken).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountRealSend) == false) {
            return false;
        }
        NewAccountRealSend rhs = ((NewAccountRealSend) other);
        return new EqualsBuilder().append(newAccountReal, rhs.newAccountReal).append(salutation, rhs.salutation).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(dateOfBirth, rhs.dateOfBirth).append(residence, rhs.residence).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2).append(addressCity, rhs.addressCity).append(addressState, rhs.addressState).append(addressPostcode, rhs.addressPostcode).append(phone, rhs.phone).append(secretQuestion, rhs.secretQuestion).append(secretAnswer, rhs.secretAnswer).append(affiliateToken, rhs.affiliateToken).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum Salutation {

        @SerializedName("Mr")
        MR("Mr"),
        @SerializedName("Mrs")
        MRS("Mrs"),
        @SerializedName("Ms")
        MS("Ms"),
        @SerializedName("Miss")
        MISS("Miss");
        private final String value;
        private final static Map<String, NewAccountRealSend.Salutation> CONSTANTS = new HashMap<String, NewAccountRealSend.Salutation>();

        static {
            for (NewAccountRealSend.Salutation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Salutation(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountRealSend.Salutation fromValue(String value) {
            NewAccountRealSend.Salutation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SecretQuestion {

        @SerializedName("Mother's maiden name")
        MOTHER_S_MAIDEN_NAME("Mother's maiden name"),
        @SerializedName("Name of your pet")
        NAME_OF_YOUR_PET("Name of your pet"),
        @SerializedName("Name of first love")
        NAME_OF_FIRST_LOVE("Name of first love"),
        @SerializedName("Memorable town/city")
        MEMORABLE_TOWN_CITY("Memorable town/city"),
        @SerializedName("Memorable date")
        MEMORABLE_DATE("Memorable date"),
        @SerializedName("Favourite dish")
        FAVOURITE_DISH("Favourite dish"),
        @SerializedName("Brand of first car")
        BRAND_OF_FIRST_CAR("Brand of first car"),
        @SerializedName("Favourite artist")
        FAVOURITE_ARTIST("Favourite artist");
        private final String value;
        private final static Map<String, NewAccountRealSend.SecretQuestion> CONSTANTS = new HashMap<String, NewAccountRealSend.SecretQuestion>();

        static {
            for (NewAccountRealSend.SecretQuestion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SecretQuestion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NewAccountRealSend.SecretQuestion fromValue(String value) {
            NewAccountRealSend.SecretQuestion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
