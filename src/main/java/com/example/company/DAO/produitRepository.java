package com.example.company.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.company.entity.produit;

public interface produitRepository extends JpaRepository<produit, Integer> {

}
