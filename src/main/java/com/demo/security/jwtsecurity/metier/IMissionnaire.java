 package com.demo.security.jwtsecurity.metier;

import java.util.List;

import com.demo.security.jwtsecurity.model.Missionaire;

public interface IMissionnaire {
  
	List<Missionaire> getMissionnaires() ; 
	
	void addMissionaire(Missionaire missionaire) ; 
	
	void updateMissionaire(Missionaire missionaire) ; 
	
	void deleteteMissionaire(String cin) ; 
	

}
