package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.security.jwtsecurity.model.Categorie;
import com.demo.security.jwtsecurity.repository.CategorieRepository;

@Service
public class Categoriedao {
	
	
	@Autowired
	CategorieRepository categorierepository;
	
	public List<Categorie> findAll(){
		return categorierepository.findAll();
	}

}
