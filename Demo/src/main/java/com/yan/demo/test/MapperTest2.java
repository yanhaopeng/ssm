package com.yan.demo.test;

import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yan.demo.bean.Dictionary;
import com.yan.demo.bean.OnClass;
import com.yan.demo.bean.Person;
import com.yan.demo.bean.Personclass;
import com.yan.demo.dao.DictionaryMapper;
import com.yan.demo.dao.OnClassMapper;
import com.yan.demo.dao.PersonMapper;
import com.yan.demo.dao.PersonclassMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest2 {
	@Autowired
	PersonMapper personMapper;
	@Autowired
	OnClassMapper onClassMapper;
	@Autowired
	PersonclassMapper personClassMapper;
	@Autowired
	DictionaryMapper dictionaryMapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testSelect(){
		dictionaryMapper.insertSelective(new Dictionary(101,1,"b"));
		dictionaryMapper.insertSelective(new Dictionary(201,2,"hanzu"));
		dictionaryMapper.insertSelective(new Dictionary(301,3,"daxuekecheng"));
		dictionaryMapper.insertSelective(new Dictionary(302,4,"gaozhongkecheng"));
		dictionaryMapper.insertSelective(new Dictionary(401,5,"kexue"));
		dictionaryMapper.insertSelective(new Dictionary(402,6,"bukexue"));

		personMapper.insertSelective(new Person(1, "zhangsan", 101, 201));

		onClassMapper.insertSelective(new OnClass(1, "huaxue", 301, 401));
		onClassMapper.insertSelective(new OnClass(2, "yuwen", 302, 402));

		personClassMapper.insertSelective(new Personclass(1, 1, 1, 99));
		personClassMapper.insertSelective(new Personclass(2, 1, 2, 88));
	}

}
