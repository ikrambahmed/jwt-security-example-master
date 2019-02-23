package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.security.jwtsecurity.model.deptgen;

import com.demo.security.jwtsecurity.repository.DeptRepository;

@Service
public class Deptdao {
	
	@Autowired
	DeptRepository deptrepository;
	
	public List<deptgen> findAll(){
		return deptrepository.findAll();
	}


}
