
package data.binaryAPI.commandsUnused.jp_knowledge_test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Japan Knowledge Test Send
 * <p>
 * Store Japan Knowledge Test result in database. The 'Japan Knowledge Test' is a specific requirement under Japanese licensing regulations and does not apply to non-Japanese accounts.
 * 
 */
public class JpKnowledgeTestSend implements Serializable
{

    @SerializedName("jp_knowledge_test")
    @Expose
    private Integer jpKnowledgeTest;
    /**
     * Total score for knowledge test.
     * 
     */
    @SerializedName("score")
    @Expose
    private Integer score;
    /**
     * Result status of knowledge test, whether pass / fail.
     * 
     */
    @SerializedName("status")
    @Expose
    private JpKnowledgeTestSend.Status status;
    /**
     * Questions list
     * <p>
     * List of 20 questions presented to the client
     * 
     */
    @SerializedName("questions")
    @Expose
    private List<Question> questions = new ArrayList<Question>();
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
    private final static long serialVersionUID = -535148251036244675L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JpKnowledgeTestSend() {
    }

    /**
     * 
     * @param score
     * @param questions
     * @param passthrough
     * @param jpKnowledgeTest
     * @param status
     * @param reqId
     */
    public JpKnowledgeTestSend(Integer jpKnowledgeTest, Integer score, JpKnowledgeTestSend.Status status, List<Question> questions, Passthrough passthrough, Integer reqId) {
        super();
        this.jpKnowledgeTest = jpKnowledgeTest;
        this.score = score;
        this.status = status;
        this.questions = questions;
        this.passthrough = passthrough;
        this.reqId = reqId;
    }

    public Integer getJpKnowledgeTest() {
        return jpKnowledgeTest;
    }

    public void setJpKnowledgeTest(Integer jpKnowledgeTest) {
        this.jpKnowledgeTest = jpKnowledgeTest;
    }

    /**
     * Total score for knowledge test.
     * 
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Total score for knowledge test.
     * 
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Result status of knowledge test, whether pass / fail.
     * 
     */
    public JpKnowledgeTestSend.Status getStatus() {
        return status;
    }

    /**
     * Result status of knowledge test, whether pass / fail.
     * 
     */
    public void setStatus(JpKnowledgeTestSend.Status status) {
        this.status = status;
    }

    /**
     * Questions list
     * <p>
     * List of 20 questions presented to the client
     * 
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * Questions list
     * <p>
     * List of 20 questions presented to the client
     * 
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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
        return new HashCodeBuilder().append(jpKnowledgeTest).append(score).append(status).append(questions).append(passthrough).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JpKnowledgeTestSend) == false) {
            return false;
        }
        JpKnowledgeTestSend rhs = ((JpKnowledgeTestSend) other);
        return new EqualsBuilder().append(jpKnowledgeTest, rhs.jpKnowledgeTest).append(score, rhs.score).append(status, rhs.status).append(questions, rhs.questions).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
    }

    public enum Status {

        @SerializedName("pass")
        PASS("pass"),
        @SerializedName("fail")
        FAIL("fail");
        private final String value;
        private final static Map<String, JpKnowledgeTestSend.Status> CONSTANTS = new HashMap<String, JpKnowledgeTestSend.Status>();

        static {
            for (JpKnowledgeTestSend.Status c: values()) {
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

        public static JpKnowledgeTestSend.Status fromValue(String value) {
            JpKnowledgeTestSend.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
