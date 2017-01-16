package data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import data.binaryAPI.commands.active_symbols.ActiveSymbol;
import data.binaryAPI.commands.ticks_history.Candle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StockData implements Serializable{
	
	@SerializedName("name")
	@Expose
	private String name;
	
	@SerializedName("symbols")
	@Expose
	private Map<StockProvider, String> symbols;
	
	@SerializedName("binaryData")
	@Expose
	private ActiveSymbol binaryData;
	
	@SerializedName("stockCandles")
	@Expose
	private TreeMap<Long, Candle> stockCandles;
	
	public StockData(){}
	
	public StockData(String name){
		setName(name);
		setSymbols(new HashMap<>());
		setStockCandles(new TreeMap<>());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<StockProvider, String> getSymbols() {
		return symbols;
	}
	
	public void setSymbols(HashMap<StockProvider, String> symbols) {
		this.symbols = symbols;
	}
	
	public ActiveSymbol getBinaryData() {
		return binaryData;
	}
	
	public void setBinaryData(ActiveSymbol binaryData) {
		this.binaryData = binaryData;
	}
	
	public TreeMap<Long, Candle> getStockCandles() {
		return stockCandles;
	}
	
	public void setStockCandles(TreeMap<Long, Candle> stockCandles) {
		this.stockCandles = stockCandles;
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
		if ((other instanceof Candle) == false) {
			return false;
		}
		Candle rhs = ((Candle) other);
		return this.hashCode() == rhs.hashCode();
	}
}
