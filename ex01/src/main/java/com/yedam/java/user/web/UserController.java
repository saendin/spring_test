package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;


@Controller
public class UserController {
	//뷰 페이지 만드는 방식
//	@RequestMapping("/inputForm") //주소 매핑 //=> /inputForm으로 들어갔을 때
	@RequestMapping(value="inputForm", method={RequestMethod.GET, RequestMethod.POST})
	public String inputForm() {
		
		return "inputForm"; //호출할 뷰 페이지 /=>이 뷰페이지를 실행해라 == jsp파일명과 같아야 함.
//		return "home"; //-> ex) inputForm이라는 주소를 쳤을 때 home.jsp뷰를 실행함
	}
	
	//
	//@RequestMapping(value = "/", method = RequestMethod.GET) // = @GetMapping 직접 호출방식(get, post)도 지정해보기 
	/*	@RequestMapping("/users") //경로만 지정
	public String process(UserVO userVO) { 
	System.out.println(userVO.getName());
	System.out.println(userVO.getAge());
	return ""; //임의로 뷰 막아놓은 것
	}
	*/
	
	//매개변수 써보기
	/*@RequestMapping("/users")
	public String process(@RequestParam String name, @RequestParam int age) { //request에서 보내는 파람명과 jsp에서 받는 param명이 같아야함 ==> 내가 정해주는 이름으로 쓰려면 다음과 같이 써주면 됨. @RequestParam("name") String newName,
		System.out.println(name + ", " + age);
		return "";
	}
	*/
	
	//VO를 쓰지 않고 Map을 사용해 requestParam 써보기
	@RequestMapping("/users")
	public String process(@RequestParam Map<String, Object> map) { // Map<String, Object> 보통 값으로 integer들어올 일 잘 없으므로 String타입의 객체를 받는다고 선언해주면 됨.
		System.out.println(map.get("name") + ", " + map.get("age"));
		return "";
	}
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList(); //값을 받기위해 리스트 가져와서
		for(UserVO vo : userList) { //찍어보기
			System.out.println(vo.getName() + ", " + vo.getAge());
		}
		return "";
	}
	
	@RequestMapping("/nameList")
	public String listProcess(@RequestParam List<String> name) {
		
		for(String temp : name) { //찍어보기
			System.out.println(temp);
		}
		return "";
	}
}
