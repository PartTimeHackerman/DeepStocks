package spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@RequestMapping("/")
	public String index(){
		return "Test start";
	}
	
}
