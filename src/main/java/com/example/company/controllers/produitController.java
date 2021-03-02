package com.example.company.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.produit;

import com.example.company.service.produitService;


@RestController
public class produitController {
	
	@Autowired
	private produitService produitService;

	public produitController() {
		// TODO Auto-generated constructor stub
	}
		
		@PostMapping("/produit")
		public produit  addProduit(@RequestBody produit theProduit) {
			
		return	produitService.saveProduit(theProduit);

		}
		
		
		
		@PutMapping("/produit/{id}")
		public produit  putProduit(@PathVariable int id,@RequestBody produit theProduit) {
			
		return	produitService.putProduit(id,theProduit);

		}
		
		@DeleteMapping("/produit/{id}")
		public void deleteProduit(@PathVariable int id) {
			
			produitService.deleteProduit(id);

		}
		
		@GetMapping("/produit/{id}")
		public Optional<produit> getProduit(@PathVariable int id) {
			
			return produitService.getProduit(id);

		}
	}


