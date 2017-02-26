
package data.binaryAPI.commandsUnused.get_account_status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Account status details
 * 
 */
public class GetAccountStatus implements Serializable
{

    /**
     * Account status. Possible status: authenticated (client is fully authenticated), age_verification (client is age-verified), cashier_locked (cashier is locked), disabled (account is disabled), unwelcome (client cannot deposit or buy contracts, but can withdraw or sell contracts), withdrawal_locked (deposits allowed but withdrawals locked), ukgc_funds_protection (client has acknowledged UKGC funds protection notice), jp_knowledge_test_pending (Japan client who hasn't done knowledge test), jp_knowledge_test_fail (Japan client who has failed knowledge test), jp_activation_pending (Japan client who has passed knowledge test but real money account still pending activation)
     * (Required)
     * 
     */
    @SerializedName("status")
    @Expose
    private List<Object> status = new ArrayList<Object>();
    /**
     * Client risk classification: low, standard, high
     * (Required)
     * 
     */
    @SerializedName("risk_classification")
    @Expose
    private String riskClassification;
    private final static long serialVersionUID = 6673211457341531962L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetAccountStatus() {
    }

    /**
     * 
     * @param riskClassification
     * @param status
     */
    public GetAccountStatus(List<Object> status, String riskClassification) {
        super();
        this.status = status;
        this.riskClassification = riskClassification;
    }

    /**
     * Account status. Possible status: authenticated (client is fully authenticated), age_verification (client is age-verified), cashier_locked (cashier is locked), disabled (account is disabled), unwelcome (client cannot deposit or buy contracts, but can withdraw or sell contracts), withdrawal_locked (deposits allowed but withdrawals locked), ukgc_funds_protection (client has acknowledged UKGC funds protection notice), jp_knowledge_test_pending (Japan client who hasn't done knowledge test), jp_knowledge_test_fail (Japan client who has failed knowledge test), jp_activation_pending (Japan client who has passed knowledge test but real money account still pending activation)
     * (Required)
     * 
     */
    public List<Object> getStatus() {
        return status;
    }

    /**
     * Account status. Possible status: authenticated (client is fully authenticated), age_verification (client is age-verified), cashier_locked (cashier is locked), disabled (account is disabled), unwelcome (client cannot deposit or buy contracts, but can withdraw or sell contracts), withdrawal_locked (deposits allowed but withdrawals locked), ukgc_funds_protection (client has acknowledged UKGC funds protection notice), jp_knowledge_test_pending (Japan client who hasn't done knowledge test), jp_knowledge_test_fail (Japan client who has failed knowledge test), jp_activation_pending (Japan client who has passed knowledge test but real money account still pending activation)
     * (Required)
     * 
     */
    public void setStatus(List<Object> status) {
        this.status = status;
    }

    /**
     * Client risk classification: low, standard, high
     * (Required)
     * 
     */
    public String getRiskClassification() {
        return riskClassification;
    }

    /**
     * Client risk classification: low, standard, high
     * (Required)
     * 
     */
    public void setRiskClassification(String riskClassification) {
        this.riskClassification = riskClassification;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(riskClassification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountStatus) == false) {
            return false;
        }
        GetAccountStatus rhs = ((GetAccountStatus) other);
        return new EqualsBuilder().append(status, rhs.status).append(riskClassification, rhs.riskClassification).isEquals();
    }

}
