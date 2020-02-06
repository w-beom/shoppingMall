package shopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shopping.vo.Customer_BoardVO;

@Mapper
public interface BoardMapper {

	void insertCBoard(Customer_BoardVO vo);

	List<Customer_BoardVO> selectCBoardList();

	Customer_BoardVO selectBoardDetail(int no);

	void deleteBoard(int no);

	void editBoard(Customer_BoardVO vo);

	List<Customer_BoardVO> contentSearch(String search);

	List<Customer_BoardVO> subjectSearch(String search);

	List<Customer_BoardVO> nameSearch(String search);

}
