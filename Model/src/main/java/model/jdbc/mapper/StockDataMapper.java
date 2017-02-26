package jdbc.mapper;

import data.Stock;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDataMapper implements RowMapper<Stock> {
	
	@Override
	public Stock mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stock stock = new Stock();
		stock.setId(rs.getLong("id"));
		stock.setName(rs.getString("name"));
		return stock;
	}
}
