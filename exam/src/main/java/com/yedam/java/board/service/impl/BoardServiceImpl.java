package com.yedam.java.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Service //BoardService 인터페이스를 구현할 클래스 / 빈을 제대로 못불러온다면 -> ex) @Service("Board")식으로 이름을 부여해서 불러와볼 것
public class BoardServiceImpl implements BoardService {

	@Autowired //기준이 필드명? 타입? 둘 다 빈을 불러올 때 기준이 될 수 있음. 기본은 타입이나, 반드시 타입을 기준으로만 불러오는 것은 아님. 별도의 Bean 이름을 필드로 사용할 수도 있음.
	BoardMapper mapper;
	
	@Override
	public int getBoardNo() {
		return mapper.getBoardNo();
	}

	@Override
	public int putBoard(BoardVO boardVO) {
		return mapper.insertBoard(boardVO);
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		return mapper.selectAllBoardList();
	}

}
