package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class) //Beans 호출
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {
	@Autowired
	EmpMapper empMapper;
	
	//@Test
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	@Test
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		
		info.setEmployeeId("200");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
		assertEquals("TEST실패시 다음을 출력 : ",findVO.getEmail(), null);
	}
	//@Test
	public void empInsertTest() {
		EmpVO info = new EmpVO();
//		info.setEmployeeId("");
		info.setFirstName("プ");
		info.setLastName("ぷり");
		info.setEmail("saa@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		empMapper.insertEmp(info);
		assertEquals("테스트에 실패할 시 출력",info.getEmployeeId(), "207");
	}
	//@Test
	public void empUpdateSalaryTest() {
		
		//public int updateSalary(@Param("empId")int employeeId);의 리턴값을 int형으로 하는 이유? resultSet의 반환값을 의미
		int result = empMapper.updateSalary(200);//값이 잘 반영되었다면 1을 반환하고, 아니면 0을 반환
		assertEquals(result, 1);
	}
	@Test
	public void empUpdateEmpInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("207");
		info.setFirstName("냠냠");
//		info.setLastName("탱글탱글"); //set if 써줬기 때문에 필요한 값이 없어도 알아서 거르고 나머지만 시행됨
		info.setEmail("neverMind@naver.com");
		empMapper.updateEmpInfo(info);
		
		assertEquals("테스트에 실패할 시 출력", info.getEmployeeId(), "207");
	}
}
