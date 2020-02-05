package shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.mapper.UserMapper;
import shopping.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void insertUser(UserVO vo) {
		System.out.println("여기까지와지나");
		userMapper.insertUser(vo);
	}

}
