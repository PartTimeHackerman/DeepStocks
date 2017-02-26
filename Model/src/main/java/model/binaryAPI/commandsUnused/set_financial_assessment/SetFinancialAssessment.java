
package data.binaryAPI.commandsUnused.set_financial_assessment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Financial Assessment Details
 * <p>
 * Financial Assessment score and appropriate status
 * 
 */
public class SetFinancialAssessment implements Serializable
{

    /**
     * Financial assessment score based on answers
     * 
     */
    @SerializedName("score")
    @Expose
    private Integer score;
    /**
     * On the basis of the information provided in relation to the client's knowledge and experience, we mark whether client is professional or not. 1: professional, 0: not professional
     * 
     */
    @SerializedName("is_professional")
    @Expose
    private Integer isProfessional;
    private final static long serialVersionUID = 1608397158526420029L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SetFinancialAssessment() {
    }

    /**
     * 
     * @param score
     * @param isProfessional
     */
    public SetFinancialAssessment(Integer score, Integer isProfessional) {
        super();
        this.score = score;
        this.isProfessional = isProfessional;
    }

    /**
     * Financial assessment score based on answers
     * 
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Financial assessment score based on answers
     * 
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * On the basis of the information provided in relation to the client's knowledge and experience, we mark whether client is professional or not. 1: professional, 0: not professional
     * 
     */
    public Integer getIsProfessional() {
        return isProfessional;
    }

    /**
     * On the basis of the information provided in relation to the client's knowledge and experience, we mark whether client is professional or not. 1: professional, 0: not professional
     * 
     */
    public void setIsProfessional(Integer isProfessional) {
        this.isProfessional = isProfessional;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(score).append(isProfessional).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetFinancialAssessment) == false) {
            return false;
        }
        SetFinancialAssessment rhs = ((SetFinancialAssessment) other);
        return new EqualsBuilder().append(score, rhs.score).append(isProfessional, rhs.isProfessional).isEquals();
    }

}
