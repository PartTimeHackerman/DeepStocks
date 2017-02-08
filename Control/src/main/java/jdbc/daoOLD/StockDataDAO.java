package jdbc.daoOLD;

import data.StockData;
import jdbc.mapper.StockDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StockDataDAO implements ObjectDAO<StockData> {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(StockData stock) {
		String sql = "INSERT INTO stocks (name) VALUES (:name) ON DUPLICATE KEY UPDATE name = :name";
		namedParameterJdbcTemplate.update(sql, getParams(stock));
		
		if (stock.getId() == null) {
			sql = "SELECT id FROM stocks WHERE name = :name";
			Integer id = namedParameterJdbcTemplate.queryForObject(sql, getParams(stock), Integer.class);
			stock.setId(id);
		}
	}
	
	@Override
	public void insertAll(List<StockData> stocks) {
		String sql = "INSERT INTO stocks (name) VALUES (:name) ON DUPLICATE KEY UPDATE name = :name";
		
		Map<String, Object>[] paramsArr = new HashMap[stocks.size()];
		
		for (int i = 0; i < stocks.size(); i++) {
			StockData stock = stocks.get(i);
			paramsArr[i] = getParams(stock);
		}
		namedParameterJdbcTemplate.batchUpdate(sql, paramsArr);
	}
	
	@Override
	public StockData findById(int id) {
		String sql = "SELECT * FROM stocks WHERE id = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(sql, params, new StockDataMapper());
	}
	
	@Override
	public List<StockData> findAll() {
		String sql = "SELECT * FROM stocks";
		return namedParameterJdbcTemplate.queryForList(sql, new HashMap<>(), StockData.class);
	}
	
	@Override
	public int total() {
		String sql = "SELECT COUNT(*) FROM stocks";
		return namedParameterJdbcTemplate.queryForObject(sql, new HashMap<>(), Integer.class);
	}
	
	private Map<String, Object> getParams(StockData stock) {
		Map<String, Object> params = new HashMap<>();
		params.put("name", stock.getName());
		return params;
	}
}
