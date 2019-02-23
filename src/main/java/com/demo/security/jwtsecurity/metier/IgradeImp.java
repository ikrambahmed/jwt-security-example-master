package com.demo.security.jwtsecurity.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.security.jwtsecurity.model.Missionaire;
import com.demo.security.jwtsecurity.model.grade;

@Service
public class IgradeImp implements Igrade{
	private List<grade> grades ; 
	@Override
	public List<grade> findAll() {
		
		return grades;
	}

}
