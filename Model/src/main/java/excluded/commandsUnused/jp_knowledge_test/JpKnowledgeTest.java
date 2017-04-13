
package data.binaryAPI.commandsUnused.jp_knowledge_test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Japan Knowledge Test
 * <p>
 * Knowledge Test for Japan real money account opening
 * 
 */
public class JpKnowledgeTest implements Serializable
{

    /**
     * Test taken time in epoch, as store in database.
     * 
     */
    @SerializedName("test_taken_epoch")
    @Expose
    private Integer testTakenEpoch;
    private final static long serialVersionUID = 5075371967830268381L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JpKnowledgeTest() {
    }

    /**
     * 
     * @param testTakenEpoch
     */
    public JpKnowledgeTest(Integer testTakenEpoch) {
        super();
        this.testTakenEpoch = testTakenEpoch;
    }

    /**
     * Test taken time in epoch, as store in database.
     * 
     */
    public Integer getTestTakenEpoch() {
        return testTakenEpoch;
    }

    /**
     * Test taken time in epoch, as store in database.
     * 
     */
    public void setTestTakenEpoch(Integer testTakenEpoch) {
        this.testTakenEpoch = testTakenEpoch;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(testTakenEpoch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JpKnowledgeTest) == false) {
            return false;
        }
        JpKnowledgeTest rhs = ((JpKnowledgeTest) other);
        return new EqualsBuilder().append(testTakenEpoch, rhs.testTakenEpoch).isEquals();
    }

}
