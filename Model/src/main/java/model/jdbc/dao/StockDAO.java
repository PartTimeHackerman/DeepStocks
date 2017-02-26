package model.jdbc.dao;

import model.data.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface StockDAO extends CrudRepository<Stock, Integer> {
	
	Stock findById(Long id);
	
	Stock findByName(String name);
	
	Stock findBySymbols_Symbol(String symbol);
	
}
