package jdbc.dao;

import binaryAPI.commands.active_symbols.ActiveSymbol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ActiveSymbolDAO extends CrudRepository<ActiveSymbol, Long>{
}
