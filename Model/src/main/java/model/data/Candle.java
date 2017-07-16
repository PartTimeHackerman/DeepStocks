package model.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString(exclude = "stock")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candles")
@IdClass(Candle.CandlePK.class)
@JsonIgnoreProperties(value = {"candlePK", "stockId", "stock"}, ignoreUnknown = true)
public class Candle implements Serializable, Comparable<Candle> {
	
	private static final long serialVersionUID = -8683231578361442030L;
	@EmbeddedId
	private CandlePK candlePK = new CandlePK();
	@Column(name = "stockId", insertable = false, updatable = false)
	private Long stockId;
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "stockId")
	private Stock stock;
	@Column(name = "epoch", insertable = false, updatable = false)
	@SerializedName("epoch")
	@Expose
	private Long epoch;
	/**
	 * It is the open price value for the given time
	 */
	@SerializedName("open")
	@Expose
	private Float open;
	/**
	 * It is the high price value for the given time
	 */
	@SerializedName("high")
	@Expose
	private Float high;
	/**
	 * It is the low price value for the given time
	 */
	@SerializedName("low")
	@Expose
	private Float low;
	/**
	 * It is the close price value for the given time
	 */
	@SerializedName("close")
	@Expose
	private Float close;
	@SerializedName("volume")
	@Expose
	private Integer volume;
	
	public void setStock(Stock stock) {
		this.stock = stock;
		setStockId(stock.getId());
	}
	
	@Override
	public int compareTo(Candle o) {
		return (int) (getEpoch() - o.getEpoch());
	}
	
	@Embeddable
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	public static class CandlePK implements Serializable {
		
		@Column(name = "stockId", insertable = false, updatable = false)
		private Long stockId;
		
		@Column(name = "epoch", insertable = false, updatable = false)
		private Long epoch;
	}
}
