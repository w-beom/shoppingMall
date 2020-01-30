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
<<<<<<< HEAD
	@RequestMapping("Detail.do")
	public String detail() {
		return "Detail";
		
	}
	@RequestMapping("acc.do")
	public String acc() {
		return "Acc";
		
	}
	@RequestMapping("dress.do")
	public String dress() {
		return "Dress";
		
	}
	@RequestMapping("inner.do")
	public String inner() {
		return "Inner&Season";
		
	}
	@RequestMapping("blouse.do")
	public String blouse() {
		return "Blouse&Shirt";
		
	}
	@RequestMapping("pants.do")
	public String pants() {
		return "Pants";
		
	}
	@RequestMapping("skirt.do")
	public String skirt() {
		return "Skirt";
		
	}
	@RequestMapping("outer.do")
	public String outer() {
		return "Outer";
		
	}
	@RequestMapping("bag.do")
	public String bag() {
		return "Bag&Shoes";
		
=======
	@RequestMapping("login.do")
	public String login() {
		return "login";
	}
	@RequestMapping("mypage.do")
		public String myPage() {
		return "myPage";
>>>>>>> 836514de7ba19b66e6f29872f18836b52e3db0b7
	}
}
