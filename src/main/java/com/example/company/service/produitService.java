package com.example.company.service;

import java.util.List;
import java.util.Optional;

import com.example.company.DAO.produitDAO;
import com.example.company.DAO.produitRepository;
import com.example.company.entity.frais;
import com.example.company.entity.produit;



public class produitService implements produitDAO {

	private produitRepository repository;
	
	public produitService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<produit> getProduit() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public produit saveProduit(produit theProduit) {
		// TODO Auto-generated method stub
		return repository.save(theProduit);

	}

	@Override
	public Optional<produit> getProduit(int theId) {
		// TODO Auto-generated method stub
		return repository.findById(theId);
	}

	@Override
	public void deleteProduit(int theId) {
		// TODO Auto-generated method stub
		repository.deleteById(theId);

	}
	
	
	@Override
	public produit putProduit(int id,produit theProduit) {
		// TODO Auto-generated method stub
		produit produitToUpdate = repository.getOne(id);
		produitToUpdate = theProduit;
		return repository.save(produitToUpdate);
	}

}
