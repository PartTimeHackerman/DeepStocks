package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

@Data
@EqualsAndHashCode
public class TradingTimesSymbol implements Serializable {

	@SerializedName("name")
	@Expose
	private String name;
	
	@SerializedName("symbol")
	@Expose
	private String symbol;
	
	@SerializedName("times")
	@Expose
	private SymbolTradingTimes times;
}
