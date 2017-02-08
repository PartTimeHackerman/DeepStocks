package jdbc.dao;

import data.Symbol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface SymbolsDAO extends CrudRepository<Symbol, Long> {
}
