package com.example.company.DAO;

import java.util.List;

import com.example.company.entity.dossier;
import com.example.company.entity.frais;

public interface fraisDAO {
	
	public void saveFrais(frais theFrais);

	public frais getFrais(int theId);

	public void deleteFrais(int theId);

}
