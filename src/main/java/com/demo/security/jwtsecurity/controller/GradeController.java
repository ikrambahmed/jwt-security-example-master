package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.dao.Gradedao;
import com.demo.security.jwtsecurity.model.grade;

@RestController
@RequestMapping("/listgrade")
@CrossOrigin
public class GradeController {

	@Autowired
	Gradedao gradedao;
	
	@GetMapping
	public List<grade> getAllgrades(){
		return gradedao.findAll();
	}

}
