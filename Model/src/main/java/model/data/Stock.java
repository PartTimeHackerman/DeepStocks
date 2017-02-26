package model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(exclude = {"binaryData", "symbols", "stockCandles"})
@ToString(exclude = {"binaryData", "stockCandles"})
@Table(name = "stocks")
public class Stock implements Serializable {
	
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
	private BinaryData binaryData;
	
	@OneToMany(mappedBy = "stock")
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@SerializedName("symbols")
	@Expose
	private List<Symbol> symbols;
	
	
	@OneToMany(mappedBy = "stock", fetch = FetchType.LAZY)
	//@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@OrderBy("epoch")
	@Where(clause = "DATE_PART('day', NOW() - to_timestamp(epoch)) <= 7")
	@SerializedName("stockCandles")
	@Expose
	private List<Candle> stockCandles;
	
	public Stock() {
	}
	
	public Stock(String name) {
		setName(name);
		setSymbols(new ArrayList<>());
		setStockCandles(new ArrayList<>());
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
