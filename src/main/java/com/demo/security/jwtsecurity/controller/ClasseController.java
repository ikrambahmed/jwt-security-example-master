package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.security.jwtsecurity.dao.Classedao;

import com.demo.security.jwtsecurity.model.classe;

@RestController
@RequestMapping("/listclasse")
@CrossOrigin

public class ClasseController {
	
	
	@Autowired
	Classedao classedao;
	
	@GetMapping("/allclass")
	public List<classe> getAllclasses(){
		return classedao.findAll();
	}


}
