package com.demo.security.jwtsecurity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.security.jwtsecurity.model.JwtUser;



public  interface UserRepository extends JpaRepository<JwtUser,String> {

	@Query("select o from JwtUser o")
	public List<JwtUser> list() ; 
	
	@Query("select o from JwtUser o where o.userName=:x")
	public List<JwtUser> lista(@Param("x")String code) ;
	
	@Query("select o from JwtUser o where o.userName=:x and o.id=:y")
	public List<JwtUser> oneUser(@Param("x")String username,@Param("y") String password); 

	
	
}
