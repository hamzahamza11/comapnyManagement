package com.example.company.DAO;

import java.util.List;
import java.util.Optional;

import com.example.company.entity.produit;



public interface produitDAO {
	public List<produit> getProduit();

	public produit saveProduit(produit theProduit);

	public Optional<produit> getProduit(int theId);

	public void deleteProduit(int theId);

	produit putProduit(int id, produit theProduit);

}
