package shopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.mapper.UserMapper;
import shopping.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public void insertUser(UserVO vo) {
		userMapper.insertUser(vo);
	}

	@Override
	public Boolean loginUser(String id, String pw) {
		String id_chk = userMapper.loginUser(id,pw);
		if (id_chk != null)
			return true;
		else
			return false;
	}

	/*
	 * @Override public Boolean loginUser(UserVO vo) {
	 * 
	 * String id_chk=userMapper.loginUser(vo); if(id_chk!=null) return true; else
	 * return false;
	 * 
	 * 
	 * }
	 */

}
