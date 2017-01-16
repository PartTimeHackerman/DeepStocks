package spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {
	
	@RequestMapping(value = "/test")
	public String springTest(@RequestParam(value = "name", required = false, defaultValue = "xDD") String name, Model model){
		model.addAttribute("name", name);
		return "test";
	}
	
}
