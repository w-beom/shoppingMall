package shopping.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shopping.vo.UserVO;

@Mapper
public interface UserMapper {

	public void insertUser(UserVO vo);

	//public String loginUser(UserVO vo);
	public String loginUser(@Param("id") String id, @Param("pw")String pw);

	public String idChk(String id);

	public UserVO selectUser(String id);
	

}
