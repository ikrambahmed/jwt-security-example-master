package com.demo.security.jwtsecurity.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import com.demo.security.jwtsecurity.model.JwtUser;

@Component
public class JwtGenerator {

private boolean valid = true ; 
    
    public String generate(JwtUser jwtUser) {

   if (valid == false )
	   return "no username available" ; 
   else 
	   {System.out.print("available");
	   
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId", String.valueOf(jwtUser.getId()));
        claims.put("role", jwtUser.getRole());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
    }
    
}
