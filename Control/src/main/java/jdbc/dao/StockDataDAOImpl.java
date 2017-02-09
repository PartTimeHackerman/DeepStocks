package jdbc.dao;

import data.StockData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StockDataDAOImpl {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void save(StockData stock)
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(stock);
	}
}
