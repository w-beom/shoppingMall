package shopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	public String signup(UserVO vo) {
		userService.insertUser(vo);
		return "index";
		
	}
	
	/*
	 * @RequestMapping(value = "/login",method = RequestMethod.POST) public String
	 * login(UserVO vo) { Boolean result=userService.loginUser(vo); if(result==true)
	 * return "index"; else return "login.do"; }
	 */
	
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
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "index";
	}
}
