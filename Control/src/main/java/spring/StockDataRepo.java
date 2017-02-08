package spring;

import data.StockTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface StockDataRepo {//extends CrudRepository<StockTest, Long> {
	
	//List<StockTest> findByName(String name);
}
