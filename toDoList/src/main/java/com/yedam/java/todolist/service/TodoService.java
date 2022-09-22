package com.yedam.java.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {

	//번호 조회
	public int getNo();
	
	//전체 목록
	public List<TodoVO> getTodoList();
	
	//등록
	public int insertTodo(TodoVO vo);
	
	//수정(완료)
	public int updateTodo(TodoVO vo);
	
	//삭제
	public int deleteTodo(int no);
}
