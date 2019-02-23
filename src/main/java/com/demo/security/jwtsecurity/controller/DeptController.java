package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.dao.Deptdao;

import com.demo.security.jwtsecurity.model.deptgen;

@RestController
@RequestMapping("/listdept")
@CrossOrigin

public class DeptController {
	
	@Autowired
	Deptdao deptdao;
	
	@GetMapping("/alldept")
	public List<deptgen> getAlldept(){
		return deptdao.findAll();
	}


}
