package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.security.jwtsecurity.model.classe;
import com.demo.security.jwtsecurity.repository.ClasseRepository;

@Service
public class Classedao {
	
	@Autowired
	ClasseRepository classerepository;
	
	public List<classe> findAll(){
		return classerepository.findAll();
	}


}
