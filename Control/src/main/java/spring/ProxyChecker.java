package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProxyChecker {
	
	@ResponseBody
	@RequestMapping("/check")
	public String check(HttpServletRequest request) {
		if (request.getHeader("x-forwarded-for") == null && request.getHeader("via") == null && request.getHeader("proxy-connection") == null) {
			return "e";
		} else if (request.getHeader("x-forwarded-for") == null) {
			return "a";
		} else {
			return "t";
		}
	}
	
}
