package com.demo.security.jwtsecurity.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.security.jwtsecurity.model.Missionaire;
@Service
public class IMissionaireImpl implements IMissionnaire {

	private List<Missionaire> missionaires ; 
	
	public IMissionaireImpl()
	{
		missionaires = new ArrayList<Missionaire>() ; 
		
	}
	
	@Override
	public List<Missionaire> getMissionnaires() {
		// TODO Auto-generated method stub
		return missionaires;
	}

	@Override
	public void addMissionaire(Missionaire missionaire) {
               missionaires.add(missionaire)	 ; 	
	}

	@Override
	public void updateMissionaire(Missionaire missionaire) {
   missionaires.remove(missionaire) ; 
   missionaires.add(missionaire) ; 

	}

	@Override
	public void deleteteMissionaire(String cin) {
        Missionaire missionaire = new Missionaire() ; 
        missionaire.setCin(cin);
        missionaires.remove(missionaire) ; 
	}

}
