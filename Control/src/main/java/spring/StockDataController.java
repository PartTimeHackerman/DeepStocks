package spring;

import model.StocksLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import utils.KryoSerializer;

import java.util.Collection;

//@Component
//@RestController
@RequestMapping("/stocks")
public class StockDataController{// implements CommandLineRunner {
	/*
	//@Autowired
	private StockDataRepo repo;
	
	private StocksLoader stocksLoader;
	
	@Override
	public void run(String... args) throws Exception {
		stocksLoader = new StocksLoader(new KryoSerializer());
		//repo.deleteAll();
		//repo.save(new StockTest("XD", 12));
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<StockTest>> getAllStocks() {
		return new ResponseEntity<>((Collection<StockTest>) repo.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<StockTest> fingById(@PathVariable Long id) {
		return new ResponseEntity<StockTest>(repo.findOne(id), HttpStatus.OK);
	}*/
	/*
	@RequestMapping(method = RequestMethod.GET, params = {"name"})
	public ResponseEntity<Collection<StockTest>> findByName(@RequestParam(value = "name") String name) {
		return new ResponseEntity<StockTest>(repo.findByName(name), HttpStatus.OK);
	}*/
	
	
}
