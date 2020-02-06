package shopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shopping.vo.Customer_BoardVO;

@Mapper
public interface BoardMapper {

	void insertCBoard(Customer_BoardVO vo);

	List<Customer_BoardVO> selectCBoardList();

}
