package shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("signup.do")
	public String signup() {
		return "signUp";
		
	}
	@RequestMapping("top.do")
	public String toppage() {
		return "top";
		
	}
	@RequestMapping("index.do")
	public String index() {
		return "index";
		
	}
}
