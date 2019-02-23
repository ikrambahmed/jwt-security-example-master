package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.demo.security.jwtsecurity.model.fonction;

import com.demo.security.jwtsecurity.repository.FonctionRepository;

@Service
public class Fonctiondao {

	
	
	@Autowired
	FonctionRepository fonctionrepository;
	
	public List<fonction> findAll(){
		return fonctionrepository.findAll();
	}


}
