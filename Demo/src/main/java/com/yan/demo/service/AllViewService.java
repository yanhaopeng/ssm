package com.yan.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.demo.dao.AllViewMapper;

@Service
public class AllViewService {
	@Autowired
	AllViewMapper allViewMapper;
	
	public List<Map<String, Object>> selectAll() {
		return allViewMapper.allView();
		
	}
}
