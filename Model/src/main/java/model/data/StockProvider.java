package model.data;

import java.util.HashMap;
import java.util.Map;

public enum StockProvider {
	BINARY(1),
	YAHOO(2),
	GOOGLE(3);
	
	private static final Map<Integer, StockProvider> lookup = new HashMap<>();
	
	static {
		for (StockProvider p : StockProvider.values())
			lookup.put(p.getValue(), p);
	}
	
	StockProvider(Integer value){
		this.value = value;
	}
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public static StockProvider get(int value) {
		return lookup.get(value);
	}
	}
