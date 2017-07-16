package model.dao;

import model.data.Candle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class CandleDAOImpl {
	
	private final SessionFactory sessionFactory;
	//private final CandleDAO crudDAO;
	
	@Autowired
	public CandleDAOImpl(EntityManagerFactory entityManagerFactory) {
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		//this.crudDAO = crudDAO;
	}
	
	public void save(Candle candle) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(candle);
		
		session.getTransaction().commit();
		session.close();
	}
	
/*
	public CandleDAO getCrudDAO() {
		return crudDAO;
	}
*/
}