package jdbc.daoOLD;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface ObjectDAO<T> {
	
	void insert(T T);
	
	void insertAll(List<T> T);
	
	T findById(int id);
	
	List<T> findAll();
	
	int total();
	
	default boolean exists(JdbcTemplate jdbcTemplate, String table, Long id) {
		String sql = "SELECT EXISTS(SELECT 1 FROM ? WHERE id = ? LIMIT 1)";
		return jdbcTemplate.queryForObject(sql, new Object[]{table, id}, Integer.class) == 1;
	}
}
