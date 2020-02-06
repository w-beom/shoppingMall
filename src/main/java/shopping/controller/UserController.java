package shopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//회원가입
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	public String signup(UserVO vo) {
		userService.insertUser(vo);
		return "index";
		
	}
	//로그인
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(String id,String pw,HttpServletRequest request) {
		Boolean result=userService.loginUser(id,pw);
		if(result==true) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			return "index";
		}
		else
			return "login";
	}
	//로그아웃
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "index";
	}
	//ID중복체크
	@ResponseBody
	@RequestMapping(value = "/idChk", method = RequestMethod.POST)
	public Boolean idChk(@RequestParam String id) {
		Boolean result=userService.idChk(id);
		System.out.println(result);
		return result;
	}
}
