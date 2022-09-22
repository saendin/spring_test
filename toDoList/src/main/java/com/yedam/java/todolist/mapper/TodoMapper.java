package com.yedam.java.todolist.mapper;

import java.util.List;

import com.yedam.java.todolist.service.TodoVO;

public interface TodoMapper {
	
	// 번호 조회
	public TodoVO getNo();
	
	//전체목록
	public List<TodoVO> getTodolist();
	
	//단건조회
//	public TodolistVO getTodo(TodolistVO todolistVO);
	
	//등록
	public int insertTodo(TodoVO todoVO);
	
	//수정 : 할일 완료 (y:1/n:0)
	public int updateTodo(TodoVO todoVO);
	
	//삭제
	public int deleteTodo(int no);
}
