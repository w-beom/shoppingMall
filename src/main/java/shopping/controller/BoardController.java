package shopping.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shopping.service.BoardService;
import shopping.vo.Customer_BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping("boardwrite.do")
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
	@RequestMapping("boardDetail.do")
	public ModelAndView board_deatil(@RequestParam("no") int no) {
		Customer_BoardVO board=boardService.selectBoardDetail(no);
		System.out.println(board);
		ModelAndView mv=new ModelAndView("board_detail");
		mv.addObject("board",board);
		return mv;
	}
	@RequestMapping("boardDelete.do")
	public String deleteBoard(@RequestParam("no") int no) {
		boardService.deleteBoard(no);
		return "redirect:/board.do";
	}
	@RequestMapping("board_edit.do")
	public ModelAndView boardEdit(@RequestParam("no") int no) {
		System.out.println(no);
		Customer_BoardVO board=boardService.selectBoardDetail(no);
		ModelAndView mv=new ModelAndView("board_edit");
		mv.addObject("board",board);
		return mv;
	}
	@RequestMapping("editboard2.do")
	public String boardEdit(Customer_BoardVO vo) {
		System.out.println(vo);
		boardService.editBoard(vo);
		return "redirect:/boardDetail.do?no="+vo.getCustomer_id();
	}
	@RequestMapping("boardsearch.do")
	public ModelAndView boardsearch(@RequestParam("ch-box")String kind,@RequestParam("search")String search) {
		List<Customer_BoardVO> vo=null;
		if(kind.equals("customer_content")) {
			System.out.println("1");
			vo=boardService.contentSearch(search);
		}else if(kind.equals("customer_subject")) {
			System.out.println("2");
			vo=boardService.subjectSearch(search);
		}else if(kind.equals("id")) {
			System.out.println("3");
			vo=boardService.nameSearch(search);
		}
		System.out.println(search);
		System.out.println(kind);
		System.out.println(vo);
		ModelAndView mv=new ModelAndView("board");
		mv.addObject("board",vo);
		return mv;
	}
}
