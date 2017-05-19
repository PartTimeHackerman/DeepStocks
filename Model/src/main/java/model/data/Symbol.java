package model.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.jdbc.resourceProcessor.ReverseResourceRelation;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "symbols")
@Data
@EqualsAndHashCode
@ToString(exclude = "stock")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Symbol implements Serializable {
	
	@Id
	@Column(name = "stockId")
	private Long stockId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "stockId")
	@JsonIgnore
	@ReverseResourceRelation
	private Stock stock;
	
	@Column(name = "provider")
	private StockProvider provider;
	
	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "excluded")
	private Boolean excluded = false;
	
	public Symbol() {
	}
	
	public Symbol(StockProvider stockProvider, String symbol) {
		provider = stockProvider;
		this.symbol = symbol;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Symbol && ((Symbol) o).getProvider() == provider && ((Symbol) o).getSymbol().equals(symbol);
	}
}
