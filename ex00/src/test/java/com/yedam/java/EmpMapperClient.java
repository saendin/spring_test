package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {
	@Autowired
	EmpMapper empMapper;
	
	@Test
	public void getEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
//		vo.setLast_name("King");
		EmpVO findVO = empMapper.getEmp(vo);
		
		assertEquals("테스트가 실패하면 이 메세지 표시 ",findVO.getLastName(),"King"); //  assertEquals("테스트가 실패하면 이 메세지 표시 " ,expected,actual) == expected가 actual과 같으면 출력되고 아니라면 failure에 "테스트가 실패하면 이 메세지 표시 "가 표시됨
//		assertEquals("테스트가 실패하면 이 메세지 표시 ",findVO.getFirst_name(),"Steven");
		
		System.out.println("Employee_id: " + findVO.getEmployeeId() + "| Last_name: " + findVO.getLastName() + "| First_name: " + findVO.getFirstName()  + "| Department_id: " +findVO.getDepartmentId() + "| Email: " + findVO.getEmail() + "| Hire_date: " + findVO.getHireDate() + "| Salary: " + findVO.getSalary());
		System.out.println(findVO);
		
	}
}
