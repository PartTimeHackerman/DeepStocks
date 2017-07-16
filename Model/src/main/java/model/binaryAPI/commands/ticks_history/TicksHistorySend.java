package model.binaryAPI.commands.ticks_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.binaryAPI.BinaryMessage;
import model.connection.UpdateMessage;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Tick History Request
 * <p>
 * Get historic tick data for a given symbol name
 */
public class TicksHistorySend implements Serializable, BinaryMessage, UpdateMessage {
	
	private static final long serialVersionUID = -1949828838796239505L;
	/**
	 * Short symbol name
	 */
	@SerializedName("ticks_history")
	@Expose
	private String ticksHistory;
	/**
	 * Epoch value representing the end-datetime of the ticks. If non-numeric value (e.g. "latest", the end-datetime will be the latest available timestamp.
	 */
	@SerializedName("end")
	@Expose
	private String end;
	/**
	 * Epoch value representing the start-datetime of the ticks (For styles: 'ticks', it will default to 1 day ago. For styles: 'candle', it will default to 1 day ago if count or granularity is undef )
	 */
	@SerializedName("start")
	@Expose
	private Long start;
	/**
	 * An upper limit on ticks to receive (default: 5000)
	 */
	@SerializedName("count")
	@Expose
	private Integer count = 5000;
	/**
	 * The tick-output style: must be one of 'ticks' or 'candles' (default: 'ticks')
	 */
	@SerializedName("style")
	@Expose
	private TicksHistorySend.Style style = TicksHistorySend.Style.fromValue("ticks");
	/**
	 * Provide for style: 'candles'. Candle time-dimension width setting. Allowed values 60, 120, 180, 300, 600, 900, 1800, 3600, 7200, 14400, 28800, 86400 (default: '60').
	 */
	@SerializedName("granularity")
	@Expose
	private Integer granularity = 60;
	/**
	 * If market is closed at the end time, or license limit is before end time, then move interval backwards.
	 */
	@SerializedName("adjust_start_time")
	@Expose
	private Integer adjustStartTime;
	/**
	 * Optional field, used to pass data through the websocket, which may be retrieved via the echo_req output field.
	 */
	@SerializedName("passthrough")
	@Expose
	private Passthrough passthrough;
	/**
	 * If set to 1, will send updates whenever the price changes
	 */
	@SerializedName("subscribe")
	@Expose
	private Integer subscribe;
	/**
	 * Optional field to map request to response
	 */
	@SerializedName("req_id")
	@Expose
	private Integer reqId;
	
	/**
	 * No args constructor for use in serialization
	 */
	public TicksHistorySend() {
	}
	
	/**
	 * @param adjustStartTime
	 * @param ticksHistory
	 * @param subscribe
	 * @param granularity
	 * @param start
	 * @param count
	 * @param passthrough
	 * @param end
	 * @param style
	 * @param reqId
	 */
	public TicksHistorySend(String ticksHistory, String end, Long start, Integer count, TicksHistorySend.Style style, Integer granularity, Integer adjustStartTime, Passthrough passthrough, Integer subscribe, Integer reqId) {
		super();
		this.ticksHistory = ticksHistory;
		this.end = end;
		this.start = start;
		this.count = count;
		this.style = style;
		this.granularity = granularity;
		this.adjustStartTime = adjustStartTime;
		this.passthrough = passthrough;
		this.subscribe = subscribe;
		this.reqId = reqId;
	}
	
	/**
	 * Short symbol name
	 */
	public String getTicksHistory() {
		return ticksHistory;
	}
	
	/**
	 * Short symbol name
	 */
	public void setTicksHistory(String ticksHistory) {
		this.ticksHistory = ticksHistory;
	}
	
	/**
	 * Epoch value representing the end-datetime of the ticks. If non-numeric value (e.g. "latest", the end-datetime will be the latest available timestamp.
	 */
	public String getEnd() {
		return end;
	}
	
	/**
	 * Epoch value representing the end-datetime of the ticks. If non-numeric value (e.g. "latest", the end-datetime will be the latest available timestamp.
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	
	/**
	 * Epoch value representing the start-datetime of the ticks (For styles: 'ticks', it will default to 1 day ago. For styles: 'candle', it will default to 1 day ago if count or granularity is undef )
	 */
	public Long getStart() {
		return start;
	}
	
	/**
	 * Epoch value representing the start-datetime of the ticks (For styles: 'ticks', it will default to 1 day ago. For styles: 'candle', it will default to 1 day ago if count or granularity is undef )
	 */
	public void setStart(Long start) {
		this.start = start;
	}
	
	/**
	 * An upper limit on ticks to receive (default: 5000)
	 */
	public Integer getCount() {
		return count;
	}
	
	/**
	 * An upper limit on ticks to receive (default: 5000)
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	
	/**
	 * The tick-output style: must be one of 'ticks' or 'candles' (default: 'ticks')
	 */
	public TicksHistorySend.Style getStyle() {
		return style;
	}
	
	/**
	 * The tick-output style: must be one of 'ticks' or 'candles' (default: 'ticks')
	 */
	public void setStyle(TicksHistorySend.Style style) {
		this.style = style;
	}
	
	/**
	 * Provide for style: 'candles'. Candle time-dimension width setting. Allowed values 60, 120, 180, 300, 600, 900, 1800, 3600, 7200, 14400, 28800, 86400 (default: '60').
	 */
	public Integer getGranularity() {
		return granularity;
	}
	
	/**
	 * Provide for style: 'candles'. Candle time-dimension width setting. Allowed values 60, 120, 180, 300, 600, 900, 1800, 3600, 7200, 14400, 28800, 86400 (default: '60').
	 */
	public void setGranularity(Integer granularity) {
		this.granularity = granularity;
	}
	
	/**
	 * If market is closed at the end time, or license limit is before end time, then move interval backwards.
	 */
	public Integer getAdjustStartTime() {
		return adjustStartTime;
	}
	
	/**
	 * If market is closed at the end time, or license limit is before end time, then move interval backwards.
	 */
	public void setAdjustStartTime(Integer adjustStartTime) {
		this.adjustStartTime = adjustStartTime;
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
	 * If set to 1, will send updates whenever the price changes
	 */
	public Integer getSubscribe() {
		return subscribe;
	}
	
	/**
	 * If set to 1, will send updates whenever the price changes
	 */
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
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
		return new HashCodeBuilder().append(ticksHistory).append(end).append(start).append(count).append(style).append(granularity).append(adjustStartTime).append(passthrough).append(subscribe).append(reqId).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TicksHistorySend) == false) {
			return false;
		}
		TicksHistorySend rhs = ((TicksHistorySend) other);
		return new EqualsBuilder().append(ticksHistory, rhs.ticksHistory).append(end, rhs.end).append(start, rhs.start).append(count, rhs.count).append(style, rhs.style).append(granularity, rhs.granularity).append(adjustStartTime, rhs.adjustStartTime).append(passthrough, rhs.passthrough).append(subscribe, rhs.subscribe).append(reqId, rhs.reqId).isEquals();
	}
	
	public enum Style {
		
		@SerializedName("candles")
		CANDLES("candles"),
		@SerializedName("ticks")
		TICKS("ticks");
		private static final Map<String, TicksHistorySend.Style> CONSTANTS = new HashMap<String, TicksHistorySend.Style>();
		
		static {
			for (TicksHistorySend.Style c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}
		
		private final String value;
		
		Style(String value) {
			this.value = value;
		}
		
		public static TicksHistorySend.Style fromValue(String value) {
			TicksHistorySend.Style constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}
		
		@Override
		public String toString() {
			return value;
		}
		
		public String value() {
			return value;
		}
		
	}
	
}
