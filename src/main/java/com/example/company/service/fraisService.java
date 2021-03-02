package com.example.company.service;

import java.util.Optional;

import com.example.company.DAO.fraisDAO;
import com.example.company.DAO.fraisRepository;
import com.example.company.entity.frais;


public class fraisService implements fraisDAO {

	private fraisRepository repository;
	public fraisService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public frais saveFrais(frais theFrais) {
		return repository.save(theFrais);
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<frais> getFrais(int theId) {
		return repository.findById(theId);
	}

	@Override
	public void deleteFrais(int theId) {
		repository.deleteById(theId);
		
		// TODO Auto-generated method stub

	}
	
	@Override
	public frais putFrais(int id,frais theFrais) {
		// TODO Auto-generated method stub
		frais fraisToUpdate = repository.getOne(id);
		fraisToUpdate = theFrais;
		return repository.save(fraisToUpdate);
	}

}
