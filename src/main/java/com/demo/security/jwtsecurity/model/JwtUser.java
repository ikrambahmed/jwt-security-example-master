package com.demo.security.jwtsecurity.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class JwtUser implements Serializable{
    @Id
	private String userName;
    private long id;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
