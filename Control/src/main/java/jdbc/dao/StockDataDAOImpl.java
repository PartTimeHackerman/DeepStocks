package jdbc.dao;

import data.StockData;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class StockDataDAOImpl {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public StockDataDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	public StockData load(Long id){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		StockData stock = session.find(StockData.class, id);
		session.getTransaction().commit();
		session.close();
		return stock;
	}
	
	public void save(StockData stock) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(stock);
		session.getTransaction().commit();
		session.close();
	}
}
