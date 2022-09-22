package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.jUnit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class) //사용할 클래스 뭘지 지정해주는것 여기선 스프링에서 제공하는 클래스사용할거라 이렇게 써줌. test용으로 일시적 컨테이너가 만들어지는 상황 연출하는것. 실제로는 이렇게 안씀
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestClass {

	@Autowired
	ApplicationContext context;
	
	//1. 첫번째 방식
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
		//2. 두번째 방식
		//Restaurant res = context.getBean(Restaurant.class);
		res.open();
	}
}
