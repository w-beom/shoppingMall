package shopping.service;

import java.util.List;

import shopping.vo.Customer_BoardVO;

public interface BoardService {

	void insertCBoard(Customer_BoardVO vo);

	List<Customer_BoardVO> selectCBoradList();

	Customer_BoardVO selectBoardDetail(int no);

	void deleteBoard(int no);

	void editBoard(Customer_BoardVO vo);

}
