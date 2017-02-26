package model.jdbc.dao;

import model.data.Candle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Component
public class CandleDAOImpl {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	private CandleDAO crudDAO;
	
	@Autowired
	public CandleDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	public void save(Candle candle) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(candle);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public CandleDAO getCrudDAO() {
		return crudDAO;
	}
}