package shopping.service;

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

}
