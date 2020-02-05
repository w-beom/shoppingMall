package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopping.service.UserService;
import shopping.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	public String signup2(UserVO vo) {
		System.out.println(vo);
		userService.insertUser(vo);
		return "index";
		
	}

}
