package spring;

import model.data.Stock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@RequestMapping("/stock")
	public Stock index() {
		return new Stock("TEST");
	}
	
}
