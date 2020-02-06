package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.mapper.BoardMapper;
import shopping.vo.Customer_BoardVO;

@Service
public class BoardServiceimpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public void insertCBoard(Customer_BoardVO vo) {
		boardMapper.insertCBoard(vo);
		
	}

	@Override
	public List<Customer_BoardVO> selectCBoradList() {
		return boardMapper.selectCBoardList();
		
	}

	@Override
	public Customer_BoardVO selectBoardDetail(int no) {
		return boardMapper.selectBoardDetail(no);
	}

	@Override
	public void deleteBoard(int no) {
		boardMapper.deleteBoard(no);
		
	}

	@Override
	public void editBoard(Customer_BoardVO vo) {
		boardMapper.editBoard(vo);
		
	}

}
