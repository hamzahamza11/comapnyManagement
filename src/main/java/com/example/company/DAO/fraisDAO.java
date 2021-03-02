package com.example.company.DAO;


import java.util.Optional;

import com.example.company.entity.frais;

public interface fraisDAO {
	
	public frais saveFrais(frais theFrais);

	public Optional<frais> getFrais(int theId);

	public void deleteFrais(int theId);
	
	public frais putFrais(int id,frais theFrais);

}
