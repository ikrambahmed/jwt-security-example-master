package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import com.demo.security.jwtsecurity.model.grade;
import com.demo.security.jwtsecurity.repository.GradeRepository;

@Service
@Primary
public class Gradedao {

	
	@Autowired
	GradeRepository graderepository;
	
	public List<grade> findAll(){
		return graderepository.findAll();
	}


}
