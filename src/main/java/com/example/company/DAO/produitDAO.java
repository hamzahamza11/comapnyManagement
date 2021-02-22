package com.example.company.DAO;

import java.util.List;

import com.example.company.entity.produit;



public interface produitDAO {
	public List<produit> getProduit();

	public void saveDossier(produit theProduit);

	public produit getProduit(int theId);

	public void deleteProduit(int theId);

}
