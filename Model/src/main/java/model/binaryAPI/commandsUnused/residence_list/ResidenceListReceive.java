
package data.binaryAPI.commandsUnused.residence_list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Residence List Receive
 * <p>
 * A message with Residence List
 * 
 */
public class ResidenceListReceive implements Serializable, Message
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
     * Countries list
     * <p>
     * List of countries for account opening
     * 
     */
    @SerializedName("residence_list")
    @Expose
    private List<ResidenceList> residenceList = new ArrayList<ResidenceList>();
    /**
     * residence_list
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
    private final static long serialVersionUID = 1482229221305917463L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResidenceListReceive() {
    }

    /**
     * 
     * @param msgType
     * @param residenceList
     * @param echoReq
     * @param reqId
     */
    public ResidenceListReceive(Object echoReq, List<ResidenceList> residenceList, String msgType, Integer reqId) {
        super();
        this.echoReq = echoReq;
        this.residenceList = residenceList;
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
     * Countries list
     * <p>
     * List of countries for account opening
     * 
     */
    public List<ResidenceList> getResidenceList() {
        return residenceList;
    }

    /**
     * Countries list
     * <p>
     * List of countries for account opening
     * 
     */
    public void setResidenceList(List<ResidenceList> residenceList) {
        this.residenceList = residenceList;
    }

    /**
     * residence_list
     * (Required)
     * 
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * residence_list
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
        return new HashCodeBuilder().append(echoReq).append(residenceList).append(msgType).append(reqId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResidenceListReceive) == false) {
            return false;
        }
        ResidenceListReceive rhs = ((ResidenceListReceive) other);
        return new EqualsBuilder().append(echoReq, rhs.echoReq).append(residenceList, rhs.residenceList).append(msgType, rhs.msgType).append(reqId, rhs.reqId).isEquals();
    }

}
