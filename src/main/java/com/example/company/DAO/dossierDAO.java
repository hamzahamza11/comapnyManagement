package com.example.company.DAO;

import java.util.List;
import java.util.Optional;

import com.example.company.entity.dossier;



public interface dossierDAO {
	
	public List<dossier> getDossier();

	public dossier saveDossier(dossier theDossier);

	public Optional<dossier> getDossier(int theId);

	public void deleteDossier(int theId);
	
	public dossier putDossier(int id,dossier theDossier);

}
