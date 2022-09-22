package com.yedam.java.board.service;

import java.util.List;

public interface BoardService {
	//게시글 번호 조회
	public int getBoardNo();
	
	// 게시글 등록
	public int putBoard(BoardVO boardVO); //BoardMapper.java와 이름 같게 써도 되지만 달라도 무관하므로 여기서는 일부러 다르게 써본다.

	// 게시글 전체 조회
	public List<BoardVO> getAllBoardList();
}
