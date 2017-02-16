package data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import binaryAPI.commands.active_symbols.ActiveSymbol;
import binaryAPI.commands.ticks_history.Candle;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.*;

@Entity
@Data
@EqualsAndHashCode
@ToString
@Table(name = "stocks")
public class StockData implements Serializable {
	
	@Id
	@SerializedName("id")
	@Expose
	private Long id;
	
	@Column(name = "name")
	@SerializedName("name")
	@Expose
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("symbols")
	@Expose
	private List<Symbol> symbols;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "stock")
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("binaryData")
	@Expose
	private ActiveSymbol binaryData;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("stockCandles")
	@Expose
	private List<Candle> stockCandles;
	
	public StockData() {}
	
	public StockData(String name) {
		setName(name);
		setSymbols(new ArrayList<>());
		setStockCandles(new ArrayList<>());
	}
	
	public void setBinaryData(ActiveSymbol binaryData) {
		binaryData.setStock(this);
		this.binaryData = binaryData;
	}
	
	public void addSymbol(Symbol symbol){
		symbol.setStock(this);
		symbols.add(symbol);
	}
	
	public void addCandle(Candle candle){
		candle.setStock(this);
		stockCandles.add(candle);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		this.id = (long) name.hashCode();
	}
	
	@Data
	@EqualsAndHashCode
	public static class StockDataPK {
		
		private Long id;
		
		private String name;
		
		public StockDataPK(){}
		
	}
}
