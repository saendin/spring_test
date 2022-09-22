package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.SamsungTV;
import com.yedam.java.TV;

//jUnit방식(가장 기본이 되는 방식임)
public class JavaClass {
	
	@Test
	public void javaTest() {
		TV tv = new SamsungTV();
		tv.on();
	}
	
	@Test
	public void method() {
		System.out.println("테스트");
	}
}