package com.demo.security.jwtsecurity.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.demo.security.jwtsecurity.dao.MissionnaireRepository;
import com.demo.security.jwtsecurity.metier.IMissionnaire;
import com.demo.security.jwtsecurity.model.Missionaire;

@Service
@Primary
public class MissionaireService implements IMissionnaire {
    @Autowired
	private MissionnaireRepository missionnaireRepository ; 
	 
	@Override
	public List<Missionaire> getMissionnaires() {
		// TODO Auto-generated method stub
		return missionnaireRepository.findAll() ; 	}

	@Override
	public void addMissionaire(Missionaire missionaire) {
		missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void updateMissionaire(Missionaire missionaire) {
		
		
		missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void deleteteMissionaire(String cin) {
		
		Missionaire missionaire = new Missionaire() ; 
		missionaire.setCin(cin);
		missionnaireRepository.delete(missionaire);
	}

}
