package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shopping.service.BoardService;
import shopping.service.UserService;
import shopping.vo.Customer_BoardVO;
import shopping.vo.UserVO;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	BoardService boardService;
	
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
<<<<<<< HEAD
=======
	@RequestMapping("board.do")
	public String board() {
		return "board";
	}
	
>>>>>>> 73d822aec951d144b22f26ca4e2f5bc16ff42cde
	@RequestMapping("write.do")
	public String write() {
		return "board_write";
	}
<<<<<<< HEAD
=======
	
	
>>>>>>> 73d822aec951d144b22f26ca4e2f5bc16ff42cde
}
