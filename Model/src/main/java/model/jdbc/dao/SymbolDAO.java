package model.jdbc.dao;

import model.data.Symbol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface SymbolDAO extends CrudRepository<Symbol, Long> {
	
	Symbol findBySymbol(String symbol);
	
}
