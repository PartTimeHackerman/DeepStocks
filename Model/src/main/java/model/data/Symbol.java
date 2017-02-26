package model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "symbols")
@Data
@ToString(exclude = "stock")
public class Symbol implements Serializable{
	
	@Id
	@Column(name = "stockId")
	private Long stockId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "stockId")
	private Stock stock;
	
	@Column(name = "provider")
	private StockProvider provider;
	
	@Column(name = "symbol")
	private String symbol;
	
	public Symbol(){}
	
	public Symbol(StockProvider stockProvider, String symbol) {
		provider = stockProvider;
		this.symbol = symbol;
	}
	
	@Override
	public boolean equals(Object o){
		return o instanceof Symbol && ((Symbol) o).getProvider() ==  provider && ((Symbol) o).getSymbol().equals(symbol);
	}
	
	@Data
	@EqualsAndHashCode
	public static class SymbolPK implements Serializable {
		
		@ManyToOne
		@JoinColumn(name="stockId", referencedColumnName="id", insertable = false, updatable = false)
		private Stock stock;
		
		private StockProvider provider;
		
		private String symbol;
		
		public SymbolPK(){}
	}
}
