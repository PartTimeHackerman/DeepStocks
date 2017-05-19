package model.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.jdbc.dao.CandleDAO;
import model.jdbc.resourceProcessor.ReverseResourceRelation;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(exclude = {"binaryData", "symbols", "stockCandles"})
@ToString(exclude = {"binaryData", "stockCandles"})
@Table(name = "stocks")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock implements Serializable{
	
	@Id
	@SerializedName("id")
	@Expose
	private Long id;
	
	@Column(name = "name")
	@SerializedName("name")
	@Expose
	private String name;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "stock")
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("binaryData")
	@Expose
	@JsonIgnore
	@ReverseResourceRelation
	private BinaryData binaryData;
	
	@OneToMany(mappedBy = "stock")
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("symbols")
	@Expose
	@JsonIgnore
	@ReverseResourceRelation
	private List<Symbol> symbols;
	
	@Transient
	@OneToMany(mappedBy = "stock")
	@SerializedName("stockCandles")
	@Expose
	@JsonIgnore
	@ReverseResourceRelation
	private List<Candle> stockCandles;
	
	@Transient
	@JsonIgnore
	private CandleDAO candleDAO;
	
	public Stock(CandleDAO candleDAO){
		this.candleDAO = candleDAO;
	}
	
	public Stock(){
	}
	
	public Stock(String name) {
		setName(name);
		setSymbols(new ArrayList<>());
		setStockCandles(new ArrayList<>());
	}
	
	
	@OneToMany(mappedBy = "stock", fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.TRUE)
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@OrderBy("epoch")
	@BatchSize(size = 1000)
	//@Where(clause= "DATE_PART('day', to_timestamp((SELECT max(c.epoch) FROM candles c)) - to_timestamp(epoch)) <= 7)")
	//@Where(clause = "epoch in (SELECT epoch from candles order by epoch desc limit 1000)")
	private List<Candle> getStockCandlesByAnnotations(){
		return stockCandles;
	}
	
	public List<Candle> getStockCandles(){
		if(stockCandles != null)
			return stockCandles;
		
		if(candleDAO == null)
			return getStockCandlesByAnnotations();
		
		stockCandles = candleDAO.findTopLimitByStockidOrderByEpoch(id, 1440);
		Collections.reverse(stockCandles);
		return stockCandles;
	}
	
	
	
	public void setBinaryData(BinaryData binaryData) {
		if (this.binaryData != null) {
			this.binaryData.replace(binaryData);
		} else {
			this.binaryData = binaryData;
			binaryData.setStock(this);
			binaryData.setStockId(this.id);
		}
	}
	
	public void addSymbol(Symbol symbol) {
		symbol.setStock(this);
		symbol.setStockId(this.id);
		symbols.add(symbol);
	}
	
	public void addCandle(Candle candle) {
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
}
