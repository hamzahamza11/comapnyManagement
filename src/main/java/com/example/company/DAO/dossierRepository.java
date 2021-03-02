package com.example.company.DAO;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.company.entity.dossier;

@RepositoryRestResource

public interface dossierRepository extends JpaRepository<dossier,Integer> {
	

}
