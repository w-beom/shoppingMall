package shopping.service;

import shopping.vo.UserVO;

public interface UserService {

	void insertUser(UserVO vo);

	//Boolean loginUser(UserVO vo);
	Boolean loginUser(String id, String pw);
	

}
