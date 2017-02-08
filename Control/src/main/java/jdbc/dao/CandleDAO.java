package jdbc.dao;

import binaryAPI.commands.ticks_history.Candle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CandleDAO extends CrudRepository<Candle, Long> {
}
