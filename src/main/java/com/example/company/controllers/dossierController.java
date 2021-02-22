package com.example.company.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.dossier;
import com.example.company.service.dossierService;


@RestController

public class dossierController {

	
	@Autowired
	private dossierService dossierService;
	
	@PostMapping("/dossier")
	public dossier  addDossier(@RequestBody dossier theDossier) {
		
	return	dossierService.saveDossier(theDossier);

	}
	
	@GetMapping("/dossiers")
	public List<dossier>  getDossiers() {
		
	return	dossierService.getDossier();

	}
	
	@PutMapping("/dossier/{id}")
	public dossier  putDossier(@PathVariable int id,@RequestBody dossier theDossier) {
		
	return	dossierService.putDossier(id,theDossier);

	}
	
	@DeleteMapping("/dossier/{id}")
	public void deleteDossier(@PathVariable int id) {
		
		dossierService.deleteDossier(id);

	}
	
	
	
	

}
