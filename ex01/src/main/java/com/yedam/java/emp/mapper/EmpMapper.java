package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//전체조회
	public List<EmpVO> getEmpList();
	//단건조회 : 조회조건 - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	//사원등록
	public int insertEmp(EmpVO empVO);
	//수정 : 연봉 10% 인상
	public int updateSalary(@Param("empId")int employeeId); //@Param("empId") : sql문에서 내가 사용하고자 하는 이름으로 정해주고 싶을 때 사용(매개변수가 두개 이상일 때 유리)
	//수정 : 사원정보를 넘겨받아서 이름과 성, 이메일 수정할 수 있는 메소드 작성
	public int updateEmpInfo(EmpVO empVO);
	//사원삭제
	public int deleteEmp(int employeeId);
}
