
package data.binaryAPI.commandsUnused.statement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Statement Receive
 * <p>
 * A summary of account statement is received
 * 
 */
public class StatementReceive implements Serializable, Message
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
     * statement list
     * <p>
     * Account statement.
     * 
     */
    @SerializedName("statement")
    @Expose
    private Statement statement;
    /**
     * statement
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
    private final static long serialVersionUID = 340453567103714225L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatementReceive() {
    }

    /**
     * 
     * @param msgType
     * @param statement
     * @param echoReq
     * @param reqId
     */
    public StatementReceive(Object echoReq, Statement statement, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.statement = statement;
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
     * statement list
     * <p>
     * Account statement.
     * 
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * statement list
     * <p>
     * Account statement.
     * 
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * statement
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * statement
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
        return new HashCodeBuilder().append(echoReq).append(statement).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatementReceive) == false) {
            return false;
        }
        StatementReceive rhs = ((StatementReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(statement, rhs.statement).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
