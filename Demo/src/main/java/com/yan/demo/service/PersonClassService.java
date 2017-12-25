package com.yan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.demo.bean.Personclass;
import com.yan.demo.dao.PersonclassMapper;
@Service
public class PersonClassService {
	@Autowired
	PersonclassMapper personClassMapper;
	
	public List<Personclass> getAll() {
		return personClassMapper.selectAll();
		
	}
	public List<Personclass> selectByExample() {
		return personClassMapper.selectByExample(null);
		
	}

}
