package model.binaryAPI.commands.ticks_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Tick History Response
 * <p>
 * Historic tick data for a given symbol
 */
public class History implements Serializable {
	
	private static final long serialVersionUID = 9178697272924872699L;
	@SerializedName("times")
	@Expose
	private List<Object> times = new ArrayList<Object>();
	@SerializedName("prices")
	@Expose
	private List<Object> prices = new ArrayList<Object>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public History() {
	}
	
	/**
	 * @param times
	 * @param prices
	 */
	public History(List<Object> times, List<Object> prices) {
		super();
		this.times = times;
		this.prices = prices;
	}
	
	public List<Object> getTimes() {
		return times;
	}
	
	public void setTimes(List<Object> times) {
		this.times = times;
	}
	
	public List<Object> getPrices() {
		return prices;
	}
	
	public void setPrices(List<Object> prices) {
		this.prices = prices;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(times).append(prices).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof History) == false) {
			return false;
		}
		History rhs = ((History) other);
		return new EqualsBuilder().append(times, rhs.times).append(prices, rhs.prices).isEquals();
	}

}
