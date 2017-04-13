
package data.binaryAPI.commandsUnused.login_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Login History Response
 * <p>
 * Recent login/logout history records
 * 
 */
public class LoginHistoryReceive implements Serializable, Message
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
     * list of details of login activity
     * <p>
     * Array of login/logout activities
     * 
     */
    @SerializedName("login_history")
    @Expose
    private List<LoginHistory> loginHistory = new ArrayList<LoginHistory>();
    /**
     * login_history
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
    private final static long serialVersionUID = -694465956458801178L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoginHistoryReceive() {
    }

    /**
     * 
     * @param msgType
     * @param loginHistory
     * @param echoReq
     * @param reqId
     */
    public LoginHistoryReceive(Object echoReq, List<LoginHistory> loginHistory, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.loginHistory = loginHistory;
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
     * list of details of login activity
     * <p>
     * Array of login/logout activities
     * 
     */
    public List<LoginHistory> getLoginHistory() {
        return loginHistory;
    }

    /**
     * list of details of login activity
     * <p>
     * Array of login/logout activities
     * 
     */
    public void setLoginHistory(List<LoginHistory> loginHistory) {
        this.loginHistory = loginHistory;
    }

    /**
     * login_history
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * login_history
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
        return new HashCodeBuilder().append(echoReq).append(loginHistory).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginHistoryReceive) == false) {
            return false;
        }
        LoginHistoryReceive rhs = ((LoginHistoryReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(loginHistory, rhs.loginHistory).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
