package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//스프링 방식
		/*
		 * 기존 자바방식처럼 new연산자 사용해서 새로운 인스턴스를 생성하는 것이 아닌,
		 * 빈에서 꺼내쓰는 스프링방식. getBean
		 */
		TV samsungTv = (TV)context.getBean("tv"); //방법1. beans에 등록된 id값 사용
		TV tv = (TV)context.getBean(SamsungTV.class); //방법2. 직접 클래스명 적어 사용
		
		TV lgTv = (TV)context.getBean("TV");
		
		lgTv.on();
		
		samsungTv.on();
		tv.on();
		context.close();
	}
}
