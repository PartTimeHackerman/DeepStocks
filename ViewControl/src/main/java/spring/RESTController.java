package spring;

import data.StockData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@RequestMapping("/stock")
	public StockData index() {
		return new StockData("TEST");
	}
	
}
