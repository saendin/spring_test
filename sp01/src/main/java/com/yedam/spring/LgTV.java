package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("TV") //component에 적은 아이디를 찾아감 -> Main의 lgTv 아이디값과 동일
public class LgTV implements TV {
	
	@Override
	public void on() {
		System.out.println("스프링으로 엘지 티비를 켭니다");
	}
}
