package com.yedam.java.user.service;

import lombok.Data;

@Data
public class UserVO {
	private String name;
	private Integer age; //map에 들어갈때 object클래스 형태가 되어야 하기 때문에
}
