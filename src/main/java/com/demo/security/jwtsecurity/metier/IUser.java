package com.demo.security.jwtsecurity.metier;

import java.util.List;

import com.demo.security.jwtsecurity.model.JwtUser;


public interface IUser {
	public List<JwtUser> list();
	public List<JwtUser> lista (String code) ;
	public List<JwtUser> oneUser(String username, String password);
}
