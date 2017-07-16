package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode
public class SubMarket implements Serializable {
	
	@SerializedName("name")
	@Expose
	private String name;
	
	@SerializedName("symbols")
	private List<TradingTimesSymbol> symbols;
	
}
