package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
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
	}
	@RequestMapping("login.do")
	public String login() {
		return "login";
	}
	@RequestMapping("mypage.do")
		public String myPage() {
		return "myPage";
	}
	
	@RequestMapping("/signup")
	public String signup2(@RequestParam UserVO vo) {
		System.out.println("아이디 : "+vo.getId());
		System.out.println("패스워드 : "+vo.getPw());
		System.out.println("이름 : "+vo.getName());
			
		//userService.insertUser(vo);
		return "index";
		
	}
}
