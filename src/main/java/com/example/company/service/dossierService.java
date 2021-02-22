package com.example.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.company.DAO.dossierDAO;
import com.example.company.DAO.dossierRepository;
import com.example.company.entity.dossier;

public class dossierService implements dossierDAO {
	
	@Autowired
	
	private dossierRepository repository;

	public dossierService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<dossier> getDossier() {
		return repository.findAll();
		
	}

	@Override
	public dossier saveDossier(dossier theDossier) {
		return  repository.save(theDossier);

	}

	@Override
	public Optional<dossier> getDossier(int theId) {
		// TODO Auto-generated method stub
		return repository.findById(theId);
	}

	@Override
	public void deleteDossier(int theId) {
		repository.deleteById(theId);

	}

	@Override
	public dossier putDossier(int id,dossier theDossier) {
		// TODO Auto-generated method stub
		dossier dossierToUpdate = repository.getOne(id);
		dossierToUpdate = theDossier;
		return repository.save(dossierToUpdate);
	}

}
