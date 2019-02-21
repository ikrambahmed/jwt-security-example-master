package com.demo.security.jwtsecurity.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class deptgen {

	
	@Id
	private int code;
	private String liba;
	private String libfr;
	private String type;
	
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLiba() {
		return liba;
	}
	public void setLiba(String liba) {
		this.liba = liba;
	}
	public String getLibfr() {
		return libfr;
	}
	public void setLibfr(String libfr) {
		this.libfr = libfr;
	}
	
	

	@OneToMany(mappedBy="dept")
	private Collection<Missionaire> missionnaire;
	
	
	
}
