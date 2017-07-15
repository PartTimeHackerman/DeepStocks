package model.binaryAPI.commands.trading_times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode
public class Market implements Serializable{
	
	@SerializedName("name")
	@Expose
	private String name;
	
	@SerializedName("submarkets")
	@Expose
	private List<SubMarket> subMarkets;
}
