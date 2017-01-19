package spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	@RequestMapping("/test")
	public String springTest() {
		return "test";
	}
	
	/*@RequestMapping("/error")
	public String error(){
		return "ERROR XD";
	}*/
	
}
