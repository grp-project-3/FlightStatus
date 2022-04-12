package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Fare;

@Component
public class FareDAOImpl implements FareDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void modifyFare(Fare fare) {
			
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(fare);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

}
