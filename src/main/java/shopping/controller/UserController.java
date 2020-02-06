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
import org.springframework.web.servlet.ModelAndView;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	HttpSession session;
	
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
			session = request.getSession();
			session.setAttribute("id", id);
			return "index";
		}
		else
			return "login";
	}
	//로그아웃
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		session = request.getSession();
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
	
	//mypage 회원정보 뿌리기
	@RequestMapping(value = "/mypage",method = RequestMethod.GET)
	public ModelAndView mypage(HttpServletRequest request) {
		session=request.getSession();
		String id = (String) session.getAttribute("id");
		UserVO user= userService.selectUser(id);
		ModelAndView mv = new ModelAndView("mypage");
		mv.addObject("user",user);
		
		return mv;
		
	}
}
