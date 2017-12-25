package com.yan.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.demo.bean.Employee;
import com.yan.demo.bean.Personclass;
import com.yan.demo.service.AllViewService;
import com.yan.demo.service.PersonClassService;

@Controller
public class SelectController {
	@Autowired
	AllViewService allViewService;
	
	/**
	 * 查询所有员工
	 * 
	 * */
	@RequestMapping("/select")
	public String getSelect(@RequestParam(value="pn", defaultValue="1") Integer pn,Model model){
		//引入pageHelper
		PageHelper.startPage(pn, 10);
		List<Map<String, Object>> list = allViewService.selectAll();
		//用PageInfo对结果进行包装
		PageInfo page = new PageInfo(list,5);
		model.addAttribute("pageInfo",page);
		model.addAttribute("list",list);
		System.out.println("查询所有信息成功");
		for (Map<String, Object> maps : list) {
			System.out.println(maps);
		}
		return "list";
	}
	
	
}
