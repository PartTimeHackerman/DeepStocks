package model.dao;

import model.data.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
public interface StockDAO extends CrudRepository<Stock, Long> {
	
	Page<Stock> findAll(Pageable pageable);
	
	Stock findByName(String name);
	
	Stock findBySymbols_Symbol(String symbol);
	
}
