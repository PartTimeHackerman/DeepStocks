package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Transient;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Trading Times Send
 * <p>
 * Receive a list of marketing opening times for a given date
 */
public class TradingTimesSend implements Serializable, BinaryMessage {
	
	private static final long serialVersionUID = -8040453978274868357L;
	/**
	 * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
	 */
	@SerializedName("trading_times")
	@Expose
	private String tradingTimes;
	@Transient
	private Long epoch;
	/**
	 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
	 */
	@SerializedName("passthrough")
	@Expose
	private Passthrough passthrough;
	/**
	 * Optional field toClass map request toClass response
	 */
	@SerializedName("req_id")
	@Expose
	private Integer reqId;
	
	/**
	 * No args constructor for use in serialization
	 */
	public TradingTimesSend() {
	}
	
	/**
	 * @param tradingTimes
	 */
	public TradingTimesSend(String tradingTimes) {
		super();
		this.tradingTimes = tradingTimes;
	}
	
	public TradingTimesSend(Long epoch) {
		super();
		setTradingTimesByEpoch(epoch);
	}
	
	/**
	 * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
	 */
	public String getTradingTimes() {
		return tradingTimes;
	}
	
	/**
	 * Trading date in yyyy-mm-dd format (or use 'today' for trading times for today's date).
	 */
	public void setTradingTimes(String tradingTimes) {
		this.tradingTimes = tradingTimes;
	}
	
	public void setTradingTimesByEpoch(Long epoch) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(epoch);
		tradingTimes = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
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
	 * Optional field toClass map request toClass response
	 */
	public Integer getReqId() {
		return reqId;
	}
	
	/**
	 * Optional field toClass map request toClass response
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
		return new HashCodeBuilder().append(tradingTimes).append(passthrough).append(reqId).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TradingTimesSend) == false) {
			return false;
		}
		TradingTimesSend rhs = ((TradingTimesSend) other);
		return new EqualsBuilder().append(tradingTimes, rhs.tradingTimes).append(passthrough, rhs.passthrough).append(reqId, rhs.reqId).isEquals();
	}
	
}
