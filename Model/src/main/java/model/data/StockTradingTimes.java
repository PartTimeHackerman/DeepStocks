package model.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString(exclude = "stock")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trading_times")
@IdClass(StockTradingTimes.StockTradingTimesPK.class)
@JsonIgnoreProperties(value = {"stockTradingTimesPK", "stockId", "stock"}, ignoreUnknown = true)
public class StockTradingTimes implements Serializable {
	
	@EmbeddedId
	private StockTradingTimesPK stockTradingTimesPK = new StockTradingTimesPK();
	
	@Column(name = "stockId", insertable = false, updatable = false)
	private Long stockId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "stockId")
	private Stock stock;
	
	@Column(name = "dayEpoch", insertable = false, updatable = false)
	private Long dayEpoch;
	
	private Long openEpoch;
	
	private Long closeEpoch;
	
	public StockTradingTimes(Stock stock, Long dayEpoch, Long openEpoch, Long closeEpoch) {
		setStock(stock);
		setStockId(stock.getId());
		setDayEpoch(dayEpoch);
		setOpenEpoch(openEpoch);
		setCloseEpoch(closeEpoch);
	}
	
	@Embeddable
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	public static class StockTradingTimesPK implements Serializable {
		
		@Column(name = "stockId", insertable = false, updatable = false)
		private Long stockId;
		
		@Column(name = "dayEpoch", insertable = false, updatable = false)
		private Long dayEpoch;
	}
	
}
