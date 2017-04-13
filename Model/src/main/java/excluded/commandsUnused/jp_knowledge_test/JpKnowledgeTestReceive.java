
package data.binaryAPI.commandsUnused.jp_knowledge_test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Japan Knowledge Test Receive
 * <p>
 * Receive message for Japan Knowledge Test
 * 
 */
public class JpKnowledgeTestReceive implements Serializable, Message
{

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    @SerializedName("echo_req")
    @Expose
    private Object echoReq;
    /**
     * Japan Knowledge Test
     * <p>
     * Knowledge Test for Japan real money account opening
     * 
     */
    @SerializedName("jp_knowledge_test")
    @Expose
    private JpKnowledgeTest jpKnowledgeTest;
    /**
     * jp_knowledge_test
     * (Required)
     * 
     */
    @SerializedName("msg_type")
    @Expose
    private String msgType;
    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    @SerializedName("req_id")
    @Expose
    private Integer reqId;
    private final static long serialVersionUID = 4885242289742843181L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JpKnowledgeTestReceive() {
    }

    /**
     * 
     * @param msgType
     * @param echoReq
     * @param jpKnowledgeTest
     * @param reqId
     */
    public JpKnowledgeTestReceive(Object echoReq, JpKnowledgeTest jpKnowledgeTest, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.jpKnowledgeTest = jpKnowledgeTest;
        this.msgType = msgType;
        this.reqId = reqId;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public Object getEchoReq() {
        return echoReq;
    }

    /**
     * Echo request
     * <p>
     * Echo of the request made
     * (Required)
     * 
     */
    public void setEchoReq(Object echoReq) {
        this.echoReq = echoReq;
    }

    /**
     * Japan Knowledge Test
     * <p>
     * Knowledge Test for Japan real money account opening
     * 
     */
    public JpKnowledgeTest getJpKnowledgeTest() {
        return jpKnowledgeTest;
    }

    /**
     * Japan Knowledge Test
     * <p>
     * Knowledge Test for Japan real money account opening
     * 
     */
    public void setJpKnowledgeTest(JpKnowledgeTest jpKnowledgeTest) {
        this.jpKnowledgeTest = jpKnowledgeTest;
    }

    /**
     * jp_knowledge_test
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * jp_knowledge_test
     * (Required)
     * 
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
     * 
     */
    public Integer getReqId() {
        return reqId;
    }

    /**
     * Optional field send in request to map to response, present only when request contains req_id
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
        return new HashCodeBuilder().append(echoReq).append(jpKnowledgeTest).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JpKnowledgeTestReceive) == false) {
            return false;
        }
        JpKnowledgeTestReceive rhs = ((JpKnowledgeTestReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(jpKnowledgeTest, rhs.jpKnowledgeTest).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
