package data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import binaryAPI.commands.active_symbols.ActiveSymbol;
import binaryAPI.commands.ticks_history.Candle;
import lombok.Data;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.*;

@Entity
@Data
@Table(name = "stocks")//, uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
//@SQLInsert( sql="INSERT INTO stocks(name) VALUES (?) ON DUPLICATE KEY UPDATE id = VALUES(id);")
public class StockData implements Serializable {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@SerializedName("id")
	@Expose
	private Long id;
	
	@Id
	@SerializedName("name")
	@Expose
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@SerializedName("symbols")
	@Expose
	private List<Symbol> symbols;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "stock")
	@SerializedName("binaryData")
	@Expose
	private ActiveSymbol binaryData;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
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
	}
	
	public List<Symbol> getSymbols() {
		return symbols;
	}
	
	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}
	
	public ActiveSymbol getBinaryData() {
		return binaryData;
	}
	
	public List<Candle> getStockCandles() {
		return stockCandles;
	}
	
	public void setStockCandles(List<Candle> stockCandles) {
		this.stockCandles = stockCandles;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof Candle)) {
			return false;
		}
		Candle rhs = ((Candle) other);
		return this.hashCode() == rhs.hashCode();
	}
}
