package model.utils;

public class DigitsUtil {
	
	public static <T extends Number> T removeLastNDigits(T number, Integer nDigits){
		Long newNum = number.longValue();
		for (int i = 0; i < nDigits; i++) {
			newNum /= (int)10;
		}
		return (T)newNum;
	}
	
	public static <T extends Number> T getLastNDigits(T number, Integer nDigits){
		Long newNum = number.longValue();
		Long result = newNum % (Math.round(Math.pow(10, nDigits)));
		return (T)(result);
	}
}
