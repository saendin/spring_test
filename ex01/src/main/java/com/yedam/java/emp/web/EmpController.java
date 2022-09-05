package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmpService empService;
	

	
	//전체조회
	@GetMapping("/allList") // /java/emp/allList
	public String getEmpList(Model model) {
		model.addAttribute("empList",empService.getEmpList()); //model.addAttribute(뷰에서 사용할 이름,실제 값)
		return "emp/empList";
	}
	
	//단건조회
	@GetMapping("/getEmp") // /java/emp/setEmp
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo",empService.getEmp(empVO)); //model.addAttribute(뷰에서 사용할 이름,실제 값)
		return "emp/empInfo";
	}
	
	//사원등록
	@PostMapping("/insertInfo") // /java/emp/insertInfo
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO); //model.addAttribute(뷰에서 사용할 이름,실제 값)
		return "redirect:allList"; //경로 보내주기
	}
	
	//사원정보수정
	@PostMapping("/updateInfo") // /java/emp/updateInfo
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO); //model.addAttribute(뷰에서 사용할 이름,실제 값)
		return "redirect:allList"; //경로 보내주기
	}
	//사원삭제
	@GetMapping("/deleteInfo/{employeeId}") // /java/emp/deleteInfo/{employeeId}
	public String deleteEmpInfo(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
	}
	
}
