package com.demo.security.jwtsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.jwtsecurity.metier.IMissionaireImpl;
import com.demo.security.jwtsecurity.model.Missionaire;
import com.demo.security.jwtsecurity.web.MissionaireService;

@RestController
@RequestMapping("/missionaire")
@CrossOrigin
public class MissionaireController {
	@Autowired
	private MissionaireService missionaireService ; 
	
	@GetMapping
	public List<Missionaire> getMissionaires() {
		return missionaireService.getMissionnaires() ; 
		
	}
	@PostMapping
	public void addMissionaire(@RequestBody Missionaire missionaire)
	{
		missionaireService.addMissionaire(missionaire);
	}
	
	@PutMapping
	public void updateMissionaire(@RequestBody Missionaire missionaire)
	{
		missionaireService.updateMissionaire(missionaire);
		
	}
	@DeleteMapping("/{cin}")
	public void deleteMissionaire(@PathVariable String cin)
	{
		missionaireService.deleteteMissionaire(cin);
	}
	
	
	
}
