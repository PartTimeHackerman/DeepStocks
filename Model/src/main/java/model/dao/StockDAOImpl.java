package model.dao;

import model.data.Stock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class StockDAOImpl {
	
	private final SessionFactory sessionFactory;
	
	@Autowired
	public StockDAOImpl(EntityManagerFactory entityManagerFactory) {
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	public Stock load(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Stock stock = session.find(Stock.class, id);
		session.getTransaction().commit();
		session.close();
		return stock;
	}
	
	public void save(Stock stock) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(stock);
		session.getTransaction().commit();
		session.close();
	}
}
