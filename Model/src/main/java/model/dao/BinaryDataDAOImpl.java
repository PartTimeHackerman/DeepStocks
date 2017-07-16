package model.dao;

import model.data.BinaryData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class BinaryDataDAOImpl {
	
	private final SessionFactory sessionFactory;
	
	@Autowired
	public BinaryDataDAOImpl(EntityManagerFactory entityManagerFactory) {
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	public BinaryData load(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		BinaryData activeSymbol = session.find(BinaryData.class, id);
		session.getTransaction().commit();
		session.close();
		return activeSymbol;
	}
	
	public void save(BinaryData activeSymbol) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.merge(activeSymbol);
		
		session.getTransaction().commit();
		session.close();
	}
}
