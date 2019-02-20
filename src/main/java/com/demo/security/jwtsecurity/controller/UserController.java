package com.demo.security.jwtsecurity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.metier.IUser;
import com.demo.security.jwtsecurity.model.JwtUser;



@RestController
public class UserController {
	@Autowired
    private IUser iuser ;
    
	


    @RequestMapping(value="liste", method=RequestMethod.GET)
    public List<JwtUser> list(){
    	return iuser.list();
    }
    
    @GetMapping(value="lista")
    public List<JwtUser> lista(@RequestParam(name="code",defaultValue="")String code)
    {
    	return iuser.lista(code) ; 
    }
    
    @GetMapping(value="oneUser")
    public List<JwtUser> oneUser(@RequestParam(name="username",defaultValue="")String username, @RequestParam(name="password",defaultValue="")String password)
    {
    	return iuser.oneUser(username, password) ; 
    }
    
   
}
