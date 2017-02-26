package jdbc.daoOLD;

import data.Symbol;
import jdbc.mapper.SymbolsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SymbolsDAO implements ObjectDAO<Symbol> {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public void insert(Symbol symbol) {
		String sql = "INSERT INTO symbols (stockId, stockProvider, symbol) VALUES (:stockId,:stockProvider, :symbol) ON DUPLICATE KEY UPDATE stockId = :stockId, stockProvider = :stockProvider, symbol = :symbol";
		namedParameterJdbcTemplate.update(sql, getParams(symbol));
	}
	
	@Override
	public void insertAll(List<Symbol> symbols) {
		String sql = "INSERT INTO symbols (stockId, stockProvider, symbol) VALUES (:stockId,:stockProvider, :symbol) ON DUPLICATE KEY UPDATE stockId = :stockId, stockProvider = :stockProvider, symbol = :symbol";
		
		Map<String, Object>[] paramsArr = new HashMap[symbols.size()];
		
		for (int i = 0; i < symbols.size(); i++) {
			Symbol symbol = symbols.get(i);
			paramsArr[i] = getParams(symbol);
		}
		
		namedParameterJdbcTemplate.batchUpdate(sql, paramsArr);
	}
	
	@Override
	public Symbol findById(int id) {
		String sql = "SELECT * FROM symbols WHERE id = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(sql, params, new SymbolsMapper());
	}
	
	public List<Symbol> findListById(int id) {
		String sql = "SELECT * FROM symbols WHERE stockId = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return namedParameterJdbcTemplate.query(sql, params, new SymbolsMapper());
	}
	
	@Override
	public List<Symbol> findAll() {
		String sql = "SELECT * FROM symbols";
		return namedParameterJdbcTemplate.queryForList(sql, new HashMap<>(), Symbol.class);
	}
	
	@Override
	public int total() {
		String sql = "SELECT COUNT(*) FROM symbols";
		return namedParameterJdbcTemplate.queryForObject(sql, new HashMap<>(), Integer.class);
	}
	
	private Map<String, Object> getParams(Symbol symbol){
		Map<String, Object> params = new HashMap<>();
		params.put("stockId", symbol.getStockId());
		params.put("stockProvider", symbol.getProviderValue());
		params.put("symbol", symbol.getSymbol());
		return params;
	}
}
