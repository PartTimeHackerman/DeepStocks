package model;

import model.utils.MainLogger;
import scraper.Scraper;

public class Test {
	
	public static void main(String[] args) {
		Scraper scraper = new Scraper(100, 10000, 0, false, 2, 2);
		
		MainLogger.log(Test.class).info("scraper created");
		
		scraper.dispose();
		
		MainLogger.log(Test.class).info("scraper disposed");
		
		
	}
	
}
