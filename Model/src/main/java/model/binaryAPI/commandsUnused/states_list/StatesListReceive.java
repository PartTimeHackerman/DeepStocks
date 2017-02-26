
package data.binaryAPI.commandsUnused.states_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * States List Receive
 * <p>
 * A message with States List
 * 
 */
public class StatesListReceive implements Serializable, Message
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
     * List of states
     * <p>
     * List of states.
     * 
     */
    @SerializedName("states_list")
    @Expose
    private List<StatesList> statesList = new ArrayList<StatesList>();
    /**
     * states_list
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
    private final static long serialVersionUID = -6332116772945429773L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatesListReceive() {
    }

    /**
     * 
     * @param msgType
     * @param statesList
     * @param echoReq
     * @param reqId
     */
    public StatesListReceive(Object echoReq, List<StatesList> statesList, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.statesList = statesList;
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
     * List of states
     * <p>
     * List of states.
     * 
     */
    public List<StatesList> getStatesList() {
        return statesList;
    }

    /**
     * List of states
     * <p>
     * List of states.
     * 
     */
    public void setStatesList(List<StatesList> statesList) {
        this.statesList = statesList;
    }

    /**
     * states_list
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * states_list
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
        return new HashCodeBuilder().append(echoReq).append(statesList).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatesListReceive) == false) {
            return false;
        }
        StatesListReceive rhs = ((StatesListReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(statesList, rhs.statesList).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
