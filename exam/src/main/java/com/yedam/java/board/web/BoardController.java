package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;

@Controller
@RequestMapping("/board")//컨트롤러에 이렇게 경로를 정해주면("/board") 밑에있는 메소드들은 이 경로룰 무조건 거쳐가게 됨. -> /board/list
public class BoardController {
	@Autowired
	BoardService service;
	
	@GetMapping("/list")// board와 list를 구분하는 /가 무조건 있어야함. 만약에 여기 /안붙여주면 @GetMapping("list")-> /boardlist와 같아짐.
	public String boardList(Model model) { 
		model.addAttribute("boardList", service.getAllBoardList()); //Model의 Response 객체의 값을 담는다는 의미 -> 값을 넘길때는 Attribute가 가진 타입은 모르겠고 그 이름만 가지고 속성을 가져오는거라 속성명을 잘 설정해야함.
		return "board/list";
	}
	
	@PostMapping("/list")
	public String boardInsert() {
		return "board/list";
	}
}
