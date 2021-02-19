package com.example.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.dossier;
import com.example.company.service.dossierService;


@RestController
@RequestMapping("/api")
public class dossierController {

	
	@Autowired
	private dossierService dossierService;
	
	@PostMapping("/dossier")
	public dossier  addDossier(@RequestBody dossier theDossier) {
		System.out.println("hey");
	
  System.out.println(theDossier);
		
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update
	
	theDossier.setId("hhhhhhhhh");
	
		dossierService.saveDossier(theDossier);
		
		return theDossier;
	}
	
	

}
