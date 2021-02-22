package com.example.company.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.company.entity.dossier;

@RepositoryRestResource

public interface dossierRepository extends JpaRepository<dossier,Integer> {
	

}
