package model.utils;

public class EpochUtil {
	
	public static final Long FirstJanuary2016 = 1451606400L;
	
	public static Long getCurrentTime() {
		return DigitsRemover.removeLastNDigits(System.currentTimeMillis(), 3);
	}
	
}
