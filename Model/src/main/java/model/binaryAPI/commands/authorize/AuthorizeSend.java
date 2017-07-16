package model.binaryAPI.commands.authorize;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Authorize Request
 * <p>
 * Authorize current WebSocket session to act on behalf of the owner of a given userToken. Must precede request thats needs to access client account, for example purchasing and selling contracts or viewing portfolio
 */
public class AuthorizeSend implements Serializable, BinaryMessage {
	
	private static final long serialVersionUID = 7341078747778889980L;
	/**
	 * Authentication userToken. May be retrieved from https://www.binary.com/en/user/security/api_tokenws.html
	 */
	@SerializedName("authorize")
	@Expose
	private String authorize;
	/**
	 * Optional field, send this when you use api tokens for authorization and want to track activity using login_history call
	 */
	@SerializedName("add_to_login_history")
	@Expose
	private Integer addToLoginHistory;
	/**
	 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
	 */
	@SerializedName("passthrough")
	@Expose
	private Passthrough passthrough;
	/**
	 * Optional field to map request to response
	 */
	@SerializedName("req_id")
	@Expose
	private Integer reqId;
	
	/**
	 * No args constructor for use in serialization
	 */
	public AuthorizeSend() {
	}
	
	public AuthorizeSend(String authorize) {
		super();
		this.authorize = authorize;
		addToLoginHistory = 1;
	}
	
	/**
	 * @param addToLoginHistory
	 * @param passthrough
	 * @param authorize
	 * @param reqId
	 */
	public AuthorizeSend(String authorize, Integer addToLoginHistory, Passthrough passthrough, Integer reqId) {
		super();
		this.authorize = authorize;
		this.addToLoginHistory = addToLoginHistory;
		this.passthrough = passthrough;
		this.reqId = reqId;
	}
	
	/**
	 * Authentication userToken. May be retrieved from https://www.binary.com/en/user/security/api_tokenws.html
	 */
	public String getAuthorize() {
		return authorize;
	}
	
	/**
	 * Authentication userToken. May be retrieved from https://www.binary.com/en/user/security/api_tokenws.html
	 */
	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}
	
	/**
	 * Optional field, send this when you use api tokens for authorization and want to track activity using login_history call
	 */
	public Integer getAddToLoginHistory() {
		return addToLoginHistory;
	}
	
	/**
	 * Optional field, send this when you use api tokens for authorization and want to track activity using login_history call
	 */
	public void setAddToLoginHistory(Integer addToLoginHistory) {
		this.addToLoginHistory = addToLoginHistory;
	}
	
	/**
	 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
	 */
	public Passthrough getPassthrough() {
		return passthrough;
	}
	
	/**
	 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
	 */
	public void setPassthrough(Passthrough passthrough) {
		this.passthrough = passthrough;
	}
	
	/**
	 * Optional field to map request to response
	 */
	public Integer getReqId() {
		return reqId;
	}
	
	/**
	 * Optional field to map request to response
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
		return new HashCodeBuilder().append(authorize).append(addToLoginHistory).append(passthrough).append(reqId).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof AuthorizeSend) == false) {
			return false;
		}
		AuthorizeSend rhs = ((AuthorizeSend) other);
		return new EqualsBuilder().append(authorize, rhs.authorize).append(addToLoginHistory, rhs.addToLoginHistory).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
	}

}
