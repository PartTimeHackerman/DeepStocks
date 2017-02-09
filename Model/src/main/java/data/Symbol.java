package data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "symbols")//, uniqueConstraints = @UniqueConstraint(columnNames = {"stockId", "provider", "symbol"}))
//@SQLInsert(sql = "insert into symbols (provider, stock_id, symbol, stockId) values (?, ?, ?, ?) ON DUPLICATE KEY UPDATE stockId = stockId;")
@IdClass(Symbol.SymbolPK.class)
public class Symbol implements Serializable{
	
	@Id
	//@GeneratedValue(generator = "foreigngen")
	//@GenericGenerator(strategy = "foreign", name = "foreigngen", parameters = @org.hibernate.annotations.Parameter(name = "property", value = "stock"))
	@Column(name = "stockId", insertable=false, updatable=false)
	private Long stockId;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = StockData.class)
	//@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="stockId", referencedColumnName="id")
	private StockData stock;
	
	@Id
	@Column(name = "provider")
	private StockProvider provider;
	
	@Id
	@Column(name = "symbol")
	private String symbol;
	
	public Symbol(){}
	
	public Symbol(StockProvider stockProvider, String symbol) {
		provider = stockProvider;
		this.symbol = symbol;
	}
	
	public StockProvider getProvider() {
		return provider;
	}
	
	public Integer getProviderValue() {
		return provider.getValue();
	}
	
	public void setProvider(StockProvider provider) {
		this.provider = provider;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public Long getStockId() {
		return stockId;
	}
	
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	
	@Override
	public boolean equals(Object o){
		return o instanceof Symbol && ((Symbol) o).getProvider() ==  provider && ((Symbol) o).getSymbol().equals(symbol);
	}
	
	public StockData getStock() {
		return stock;
	}
	
	public void setStock(StockData stock) {
		this.stock = stock;
	}
	
	@EqualsAndHashCode
	public static class SymbolPK implements Serializable{
		private Long stockId;
		private StockProvider provider;
		private String symbol;
		
		public SymbolPK(){}
		
		public Long getStockId() {
			return stockId;
		}
		
		public void setStockId(Long stockId) {
			this.stockId = stockId;
		}
		
		public StockProvider getProvider() {
			return provider;
		}
		
		public void setProvider(StockProvider provider) {
			this.provider = provider;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
	}
}
