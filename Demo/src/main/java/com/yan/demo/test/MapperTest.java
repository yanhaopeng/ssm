package com.yan.demo.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yan.demo.bean.Department;
import com.yan.demo.bean.Employee;
import com.yan.demo.dao.DepartmentMapper;
import com.yan.demo.dao.EmployeeMapper;

/**
 * spring项目推荐使用spring的单元测试，可以自动注入我们需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定spring文件的位置
 * 3.直接使用autowired要使用的组件
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD(){
		System.out.println(111);
		//1.创建springioc容器
		//ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从容器中获取mapper
		//DepartmentMapper dept = ioc.getBean(DepartmentMapper.class);
		//EmployeeMapper emp = ioc.getBean(EmployeeMapper.class);
		//SqlSession sqlSession =ioc.getBean(SqlSession.class);
		//System.out.println(dept);
		System.out.println(departmentMapper);
		departmentMapper.insertSelective(new Department(null, "11部1"));
		departmentMapper.insertSelective(new Department(null, "测试部"));
		employeeMapper.insertSelective(new Employee(null, "yanhaopeng","n","yanhaupeng@163.com",1));
		employeeMapper.insertSelective(new Employee(null, "daiq啊啊","n","daiwei@163.com",2));
//		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//		for(int i = 0; i<1000; i++){
//			String uid = UUID.randomUUID().toString().substring(0,5)+i;
//			mapper.insertSelective(new Employee(null, uid, "n", uid+"@163.com", 1));
//		}
		System.out.println("批量完成");
	}
}
