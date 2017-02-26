
package data.binaryAPI.commandsUnused.get_settings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Japan real money account status
 * <p>
 * Japan real money account status, only applicable for Japan virtual money account client.
 * 
 */
public class JpAccountStatus implements Serializable
{

    /**
     * Status of Japan real money account opening, any of the above.
     * 
     */
    @SerializedName("status")
    @Expose
    private JpAccountStatus.Status status;
    /**
     * Optional field. When status equals 'jp_knowledge_test_fail', this shows last knowledge test taken time in epoch.
     * 
     */
    @SerializedName("last_test_epoch")
    @Expose
    private Integer lastTestEpoch;
    /**
     * Optional field. When status equals 'jp_knowledge_test_pending' or 'jp_knowledge_test_fail', this shows next available knowledge test time in epoch.
     * 
     */
    @SerializedName("next_test_epoch")
    @Expose
    private Integer nextTestEpoch;
    private final static long serialVersionUID = 8703870023948922033L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JpAccountStatus() {
    }

    /**
     * 
     * @param lastTestEpoch
     * @param nextTestEpoch
     * @param status
     */
    public JpAccountStatus(JpAccountStatus.Status status, Integer lastTestEpoch, Integer nextTestEpoch) {
        super();
        this.status = status;
        this.lastTestEpoch = lastTestEpoch;
        this.nextTestEpoch = nextTestEpoch;
    }

    /**
     * Status of Japan real money account opening, any of the above.
     * 
     */
    public JpAccountStatus.Status getStatus() {
        return status;
    }

    /**
     * Status of Japan real money account opening, any of the above.
     * 
     */
    public void setStatus(JpAccountStatus.Status status) {
        this.status = status;
    }

    /**
     * Optional field. When status equals 'jp_knowledge_test_fail', this shows last knowledge test taken time in epoch.
     * 
     */
    public Integer getLastTestEpoch() {
        return lastTestEpoch;
    }

    /**
     * Optional field. When status equals 'jp_knowledge_test_fail', this shows last knowledge test taken time in epoch.
     * 
     */
    public void setLastTestEpoch(Integer lastTestEpoch) {
        this.lastTestEpoch = lastTestEpoch;
    }

    /**
     * Optional field. When status equals 'jp_knowledge_test_pending' or 'jp_knowledge_test_fail', this shows next available knowledge test time in epoch.
     * 
     */
    public Integer getNextTestEpoch() {
        return nextTestEpoch;
    }

    /**
     * Optional field. When status equals 'jp_knowledge_test_pending' or 'jp_knowledge_test_fail', this shows next available knowledge test time in epoch.
     * 
     */
    public void setNextTestEpoch(Integer nextTestEpoch) {
        this.nextTestEpoch = nextTestEpoch;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(lastTestEpoch).append(nextTestEpoch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JpAccountStatus) == false) {
            return false;
        }
        JpAccountStatus rhs = ((JpAccountStatus) other);
        return new EqualsBuilder().append(status, rhs.status).append(lastTestEpoch, rhs.lastTestEpoch).append(nextTestEpoch, rhs.nextTestEpoch).isEquals();
    }

    public enum Status {

        @SerializedName("activated")
        ACTIVATED("activated"),
        @SerializedName("jp_knowledge_test_pending")
        JP_KNOWLEDGE_TEST_PENDING("jp_knowledge_test_pending"),
        @SerializedName("jp_knowledge_test_fail")
        JP_KNOWLEDGE_TEST_FAIL("jp_knowledge_test_fail"),
        @SerializedName("jp_activation_pending")
        JP_ACTIVATION_PENDING("jp_activation_pending"),
        @SerializedName("disabled")
        DISABLED("disabled");
        private final String value;
        private final static Map<String, JpAccountStatus.Status> CONSTANTS = new HashMap<String, JpAccountStatus.Status>();

        static {
            for (JpAccountStatus.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static JpAccountStatus.Status fromValue(String value) {
            JpAccountStatus.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
