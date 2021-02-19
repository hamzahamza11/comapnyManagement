package com.example.company.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.company.entity.dossier;



@Repository

public class dossierDAOImpl implements dossierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public dossierDAOImpl() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<dossier> getDossier() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<dossier> theQuery = 
				currentSession.createQuery("from dossier",
											dossier.class);
		
		// execute query and get result list
		List<dossier> dossiers = theQuery.getResultList();
				
		// return the results		
		return dossiers;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDossier(dossier theDossier) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theDossier);
		// TODO Auto-generated method stub

	}

	@Override
	public dossier getDossier(int theId) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		dossier theDossier = currentSession.get(dossier.class, theId);
		
		return theDossier;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDossier(int theId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// delete object with primary key
				Query theQuery = 
						currentSession.createQuery("delete from Customer where id=:dossierId");
				theQuery.setParameter("dossierId", theId);
				
				theQuery.executeUpdate();
		// TODO Auto-generated method stub

	}

}
