package com.demo.security.jwtsecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.model.JwtUser;
import com.demo.security.jwtsecurity.security.JwtGenerator;

@RestController
@RequestMapping("/token")
@CrossOrigin

public class TokenController {


    private JwtGenerator jwtGenerator;

    
    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    
    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }
}
