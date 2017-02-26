
package model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.beanutils.PropertyUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

@Entity
@EqualsAndHashCode(exclude = "stock")
@ToString(exclude = "stock")
@Table(name = "sbinary")
@Data
public class BinaryData implements Serializable {
	
	@Id
	@Column(name = "stockId")
	private Long stockId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "stockId")
	private Stock stock;
	
	/**
	 * Binary.com symbol code for this underlying
	 */
	@SerializedName("symbol")
	@Expose
	private String symbol;
	
	/**
	 * Intraday interval minutes
	 */
	@SerializedName("intraday_interval_minutes")
	@Expose
	private Integer intradayIntervalMinutes;
	
	/**
	 * Symbol type (forex, commodities, etc)
	 */
	@SerializedName("symbol_type")
	@Expose
	private String symbolType;
	
	/**
	 * 1 or 0 - whether the market is currently open or closed
	 */
	@SerializedName("exchange_is_open")
	@Expose
	private Integer exchangeIsOpen;
	
	/**
	 * Exchange name (for underlyings listed on a Stock Exchange)
	 */
	@SerializedName("exchange_name")
	@Expose
	private String exchangeName;
	
	/**
	 * Amount the data feed is delayed (in minutes) due to Exchange licensing requirements
	 */
	@Column(name = "delayAmount")
	@SerializedName("delay_amount")
	@Expose
	private Integer delayAmount;
	
	/**
	 * Display name
	 */
	@SerializedName("display_name")
	@Expose
	private String displayName;
	
	/**
	 * Latest spot price of the underlying
	 */
	@SerializedName("spot")
	@Expose
	private Double spot;
	
	/**
	 * Latest spot epoch time
	 */
	@SerializedName("spot_time")
	@Expose
	private Long spotTime;
	
	/**
	 * 1 indicates that trading is currently suspended
	 */
	@SerializedName("is_trading_suspended")
	@Expose
	private Integer isTradingSuspended;
	
	/**
	 * For stocks and stock indices, the underlying currency for that instrument
	 */
	@SerializedName("quoted_currency_symbol")
	@Expose
	private String quotedCurrencySymbol;
	
	/**
	 * Number of seconds elapsed since the last spot price
	 */
	@SerializedName("spot_age")
	@Expose
	private Long spotAge;
	
	/**
	 * Market category (forex, indices etc)
	 */
	@SerializedName("market")
	@Expose
	private String market;
	
	/**
	 * Translated market name
	 */
	@SerializedName("market_display_name")
	@Expose
	private String marketDisplayName;
	
	/**
	 * Submarket name
	 */
	@SerializedName("submarket")
	@Expose
	private String submarket;
	
	/**
	 * Translated submarket name
	 */
	@SerializedName("submarket_display_name")
	@Expose
	private String submarketDisplayName;
	
	/**
	 * Pip size (i.e. minimum fluctuation amount)
	 */
	@SerializedName("pip")
	@Expose
	private Double pip;
	
	private final static long serialVersionUID = -237395603985977768L;
	
	public BinaryData() {}
	
	public BinaryData(String symbol, Integer intradayIntervalMinutes, String symbolType, Integer exchangeIsOpen, String exchangeName, Integer delayAmount, String displayName, Double spot, Long spotTime, Integer isTradingSuspended, String quotedCurrencySymbol, Long spotAge, String market, String marketDisplayName, String submarket, String submarketDisplayName, Double pip) {
		super();
		this.symbol = symbol;
		this.intradayIntervalMinutes = intradayIntervalMinutes;
		this.symbolType = symbolType;
		this.exchangeIsOpen = exchangeIsOpen;
		this.exchangeName = exchangeName;
		this.delayAmount = delayAmount;
		this.displayName = displayName;
		this.spot = spot;
		this.spotTime = spotTime;
		this.isTradingSuspended = isTradingSuspended;
		this.quotedCurrencySymbol = quotedCurrencySymbol;
		this.spotAge = spotAge;
		this.market = market;
		this.marketDisplayName = marketDisplayName;
		this.submarket = submarket;
		this.submarketDisplayName = submarketDisplayName;
		this.pip = pip;
	}
	
	//TODO
	public void replace(BinaryData binaryData){
		try {
			Stock stock = this.stock;
			Long stockId = this.stockId;
			PropertyUtils.copyProperties(this, binaryData);
			setStock(stock);
			setStockId(stockId);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
