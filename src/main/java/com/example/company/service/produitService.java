package com.example.company.service;

import java.util.List;

import com.example.company.DAO.produitDAO;
import com.example.company.DAO.produitRepository;
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
	public void saveDossier(produit theProduit) {
		// TODO Auto-generated method stub

	}

	@Override
	public produit getProduit(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int theId) {
		// TODO Auto-generated method stub

	}

}
