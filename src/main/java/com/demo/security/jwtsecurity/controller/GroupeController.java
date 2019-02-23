package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.security.jwtsecurity.dao.Groupedao;
import com.demo.security.jwtsecurity.model.groupe;

@RestController
@RequestMapping("/listgroupe")
@CrossOrigin

public class GroupeController {
	
	@Autowired
	Groupedao groupedao;
	
	@GetMapping("/allgroupes")
	public List<groupe> getAllgroupes(){
		return groupedao.findAll();
	}


}
