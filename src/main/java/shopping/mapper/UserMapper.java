package shopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import shopping.vo.UserVO;

@Mapper
public interface UserMapper {

	public void insertUser(UserVO vo);

}
