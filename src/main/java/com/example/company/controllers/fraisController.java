package com.example.company.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.company.entity.frais;
import com.example.company.service.fraisService;

public class fraisController {
	
	@Autowired
	private fraisService fraisService;

	public fraisController() {
		// TODO Auto-generated constructor stub
	}

	
	
	@PostMapping("/frais")
	public frais  addDossier(@RequestBody frais theFrais) {
		
	return	fraisService.saveFrais(theFrais);

	}
	
	
	
	@PutMapping("/frais/{id}")
	public frais  putDossier(@PathVariable int id,@RequestBody frais theFrais) {
		
	return	fraisService.putFrais(id,theFrais);

	}
	
	@DeleteMapping("/frais/{id}")
	public void deleteFrais(@PathVariable int id) {
		
		fraisService.deleteFrais(id);

	}
	
	@GetMapping("/frais/{id}")
	public Optional<frais> getFrais(@PathVariable int id) {
		
		return fraisService.getFrais(id);

	}
	
	
	

}
