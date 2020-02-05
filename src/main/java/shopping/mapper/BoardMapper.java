package shopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import shopping.vo.Customer_BoardVO;

@Mapper
public interface BoardMapper {

	void insertCBoard(Customer_BoardVO vo);

}
