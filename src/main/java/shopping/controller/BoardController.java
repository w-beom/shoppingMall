package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/board.do";
	}	
	@RequestMapping("board.do")
	public ModelAndView board() {
		List<Customer_BoardVO> board = boardService.selectCBoradList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board");
		mv.addObject("board", board);
		return mv;
	}
}
