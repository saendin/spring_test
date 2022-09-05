package com.yedam.java.user.service;

import java.util.List;

import lombok.Data;

@Data
public class UserListVO { //리스트형태로 값을 받기위해 하나 더 만듦
		private List<UserVO> list; 
	
}
