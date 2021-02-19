package com.example.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.company.DAO.dossierDAO;
import com.example.company.entity.dossier;



public class dossierService {
	
	@Autowired
	private dossierDAO dossierDAO;

	public dossierService() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void saveDossier(dossier theDossier) {

		dossierDAO.saveDossier(theDossier);
	}
}
