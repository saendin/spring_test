package com.yedam.java.todolist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todolist.mapper.TodoMapper;
import com.yedam.java.todolist.service.TodoService;
import com.yedam.java.todolist.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	
	@Autowired(required=false)
	TodoMapper mapper;
	
	@Override
	public int getNo() {
		TodoVO vo = mapper.getNo();
		return vo.getNo();
	}
	
	@Override
	public List<TodoVO> getTodoList() {
		return mapper.getTodolist();
	}

	@Override
	public int insertTodo(TodoVO todoVO) {
		return mapper.insertTodo(todoVO);
	}

	@Override
	public int updateTodo(TodoVO todoVO) {
		return mapper.updateTodo(todoVO);
	}

	@Override
	public int deleteTodo(int no) {
		return mapper.deleteTodo(no);
	}


}
