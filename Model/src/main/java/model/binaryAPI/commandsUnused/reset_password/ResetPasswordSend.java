
package data.binaryAPI.commandsUnused.reset_password;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Reset Password Request
 * <p>
 * Reset Password.
 * 
 */
public class ResetPasswordSend implements Serializable
{

    @SerializedName("reset_password")
    @Expose
    private String resetPassword;
    /**
     * New password for validation (length within 6-25 chars, accepts any printable ASCII characters, need to include capital and lowercase letters with numbers). Password strength is evaluated with: http://archive.geekwisdom.com/js/passwordmeter.js
     * 
     */
    @SerializedName("new_password")
    @Expose
    private String newPassword;
    /**
     * Date of birth format: yyyy-mm-dd. Only required for clients with real-money accounts.
     * 
     */
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    /**
     * Email verification code (received from a verify_email call, which must be done first)
     * 
     */
    @SerializedName("verification_code")
    @Expose
    private String verificationCode;
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
    private final static long serialVersionUID = -59273093232990251L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResetPasswordSend() {
    }

    /**
     * 
     * @param resetPassword
     * @param passthrough
     * @param newPassword
     * @param dateOfBirth
     * @param verificationCode
     * @param reqId
     */
    public ResetPasswordSend(String resetPassword, String newPassword, String dateOfBirth, String verificationCode, Passthrough passthrough, Integer reqId) {
        super();
        this.resetPassword = resetPassword;
        this.newPassword = newPassword;
        this.dateOfBirth = dateOfBirth;
        this.verificationCode = verificationCode;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public String getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(String resetPassword) {
        this.resetPassword = resetPassword;
    }

    /**
     * New password for validation (length within 6-25 chars, accepts any printable ASCII characters, need to include capital and lowercase letters with numbers). Password strength is evaluated with: http://archive.geekwisdom.com/js/passwordmeter.js
     * 
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * New password for validation (length within 6-25 chars, accepts any printable ASCII characters, need to include capital and lowercase letters with numbers). Password strength is evaluated with: http://archive.geekwisdom.com/js/passwordmeter.js
     * 
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * Date of birth format: yyyy-mm-dd. Only required for clients with real-money accounts.
     * 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of birth format: yyyy-mm-dd. Only required for clients with real-money accounts.
     * 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        return new HashCodeBuilder().append(resetPassword).append(newPassword).append(dateOfBirth).append(verificationCode).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResetPasswordSend) == false) {
            return false;
        }
        ResetPasswordSend rhs = ((ResetPasswordSend) other);
        return new EqualsBuilder().append(resetPassword, rhs.resetPassword).append(newPassword, rhs.newPassword).append(dateOfBirth, rhs.dateOfBirth).append(verificationCode, rhs.verificationCode).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

}
