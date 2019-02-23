package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.dao.Fonctiondao;

import com.demo.security.jwtsecurity.model.fonction;

@RestController
@RequestMapping("/listfonction")
@CrossOrigin

public class FonctionController {
	
	@Autowired
	Fonctiondao fonctiondao;
	
	@GetMapping("/allfonction")
	public List<fonction> getAllfonction(){
		return fonctiondao.findAll();
	}


}
