package com.company.company.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.company.entity.frais;


public class fraisDAOImpl implements fraisDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public fraisDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveFrais(frais theFrais) {
		 Session currentSession = sessionFactory.getCurrentSession();
			
			
			currentSession.saveOrUpdate(theFrais);

	}

	@Override
	public frais getFrais(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
frais theFrais = currentSession.get(frais.class, theId);
		
		return theFrais;
	}

	@Override
	public void deleteFrais(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from frais where id=:fraisId");
		theQuery.setParameter("fraisId", theId);
		
		theQuery.executeUpdate();
// TODO Auto-generated method stub
		

	}

}
