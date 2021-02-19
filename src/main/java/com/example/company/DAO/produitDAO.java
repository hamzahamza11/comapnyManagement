package com.example.company.DAO;

import java.util.List;

import com.example.company.entity.dossier;

public interface produitDAO {
	public List<dossier> getDossier();

	public void saveDossier(dossier theCustomer);

	public dossier getDossier(int theId);

	public void deleteDossier(int theId);

}
