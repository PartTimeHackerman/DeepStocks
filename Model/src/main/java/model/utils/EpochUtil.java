package model.utils;

public class EpochUtil {
	
	public static final Long FirstJanuary2016 = 1451606400L;
	
	public static final Long FirstMay2017 = 1493596800L;
	
	public static Long getCurrentTimeSeconds() {
		return DigitsRemover.removeLastNDigits(System.currentTimeMillis(), 3);
	}
	
	public static Long getWeekAgoTimeSeconds() {
		return getCurrentTimeSeconds() - 604800L;
	}
	
}
