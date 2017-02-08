package jdbc.mapper;

import data.StockData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDataMapper implements RowMapper<StockData> {
	
	@Override
	public StockData mapRow(ResultSet rs, int rowNum) throws SQLException {
		StockData stock = new StockData();
		stock.setId(rs.getLong("id"));
		stock.setName(rs.getString("name"));
		return stock;
	}
}
