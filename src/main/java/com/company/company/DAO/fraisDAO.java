package com.company.company.DAO;

import java.util.List;

import com.company.company.entity.dossier;
import com.company.company.entity.frais;

public interface fraisDAO {
	
	public void saveFrais(frais theFrais);

	public frais getFrais(int theId);

	public void deleteFrais(int theId);

}
