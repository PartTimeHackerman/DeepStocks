package model.dao;

import model.data.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDAO extends CrudRepository<Stock, Long> {
	
	Page<Stock> findAll(Pageable pageable);
	
	Stock findByName(String name);
	
	Stock findBySymbols_Symbol(String symbol);
	
}
