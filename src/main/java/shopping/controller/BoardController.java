package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shopping.service.BoardService;
import shopping.vo.Customer_BoardVO;


@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/write")
	public String c_boardWrite(Customer_BoardVO vo) {
		System.out.println(vo);
		boardService.insertCBoard(vo);
		return "board";
	}	

}
