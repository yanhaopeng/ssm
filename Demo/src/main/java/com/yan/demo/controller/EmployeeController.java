package com.yan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.demo.bean.Employee;
import com.yan.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * 查询所有
	 * 
	 * */
	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn", defaultValue="1") Integer pn,Model model){
		//引入pageHelper
		PageHelper.startPage(pn, 10);
		List<Employee> emps = employeeService.getAll();
		//用PageInfo对结果进行包装
		PageInfo page = new PageInfo(emps,5);
		model.addAttribute("pageInfo",page);
		System.out.println("查询所有员工信息成功");
		return "list";
	}
	
	
}
