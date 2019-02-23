package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.dao.Categoriedao;
import com.demo.security.jwtsecurity.model.Categorie;

@RestController
@RequestMapping("/listcategorie")
@CrossOrigin
public class CategorieController {
	
	@Autowired
	Categoriedao categoriedao;
	
	@GetMapping("/allcat")
	public List<Categorie> getAllCategories(){
		return categoriedao.findAll();
	}

}
