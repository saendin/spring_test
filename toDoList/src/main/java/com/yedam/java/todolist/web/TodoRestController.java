package com.yedam.java.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todolist.service.TodoService;
import com.yedam.java.todolist.service.TodoVO;

//@RequestMapping
@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class TodoRestController {
	@Autowired
	TodoService service;
	
	//할일 목록
	@GetMapping("/todo")
	public List<TodoVO> todoList() {
		return service.getTodoList();
	}
	//할일 등록
	@PostMapping("/todo")
	public TodoVO TodoInsert(@RequestBody TodoVO todoVO) {
		System.out.println(todoVO);
		service.insertTodo(todoVO);
		return todoVO;
	}
	//할일 업데이트
	@PutMapping("/todo")
	public TodoVO todoUpdate(@RequestBody TodoVO todoVO) {
		service.updateTodo(todoVO);
		return todoVO;
	}
	//할일 삭제
	@DeleteMapping("/todo/{no}")
	public TodoVO todoDelete(@PathVariable int no) {
		TodoVO todoVO = new TodoVO();
		todoVO.setNo(no);
		service.deleteTodo(no);
		return todoVO;
	}
	
	}
	
