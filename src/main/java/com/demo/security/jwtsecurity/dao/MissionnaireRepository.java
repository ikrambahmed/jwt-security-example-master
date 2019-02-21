package com.demo.security.jwtsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.security.jwtsecurity.model.Missionaire;

@Repository
public interface MissionnaireRepository extends JpaRepository<Missionaire , String>{

	
	
	
}
