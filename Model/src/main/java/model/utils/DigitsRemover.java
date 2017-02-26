package model.utils;

public class DigitsRemover {
	
	public static <T extends Number> T removeLastNDigits(T number, Integer nDigits){
		Long newNum = number.longValue();
		for (int i = 0; i < nDigits; i++) {
			newNum /= (int)10;
		}
		return (T)newNum;
	}
}
