package com.company.company.DAO;

import java.util.List;

import com.company.company.entity.dossier;



public interface dossierDAO {
	
	public List<dossier> getDossier();

	public void saveDossier(dossier theCustomer);

	public dossier getDossier(int theId);

	public void deleteDossier(int theId);

}
