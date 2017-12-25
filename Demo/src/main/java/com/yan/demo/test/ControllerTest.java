package com.yan.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.demo.bean.Personclass;
import com.yan.demo.service.AllViewService;
import com.yan.demo.service.PersonClassService;

public class ControllerTest {

	public static void main(String[] args) {

		//1.创建springioc容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllViewService allViewService;
		allViewService = ioc.getBean(AllViewService.class);
		//引入pageHelper
				PageHelper.startPage(1, 10);
				List<Map<String, Object>> list = allViewService.selectAll();
				//用PageInfo对结果进行包装
				PageInfo page = new PageInfo(list,5);
				for (Map<String, Object> maps : list) {
					for (Entry<String, Object> map : maps.entrySet()) {
						System.out.println(map.getKey()+":"+map.getValue());
					}
				}

	}

}
