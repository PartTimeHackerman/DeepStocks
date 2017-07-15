package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode
public class SymbolTradingTimes implements Serializable {
	
	@SerializedName("close")
	@Expose
	private List<String> close;
	
	@SerializedName("open")
	@Expose
	private List<String> open;
	
	@SerializedName("settlement")
	@Expose
	private String settlement;
	
}
