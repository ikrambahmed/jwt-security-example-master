package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.security.jwtsecurity.model.groupe;
import com.demo.security.jwtsecurity.repository.GroupeRepository;

@Service
public class Groupedao {

	
	
	@Autowired
	GroupeRepository grouperepository;
	
	public List<groupe> findAll(){
		return grouperepository.findAll();
	}


}
