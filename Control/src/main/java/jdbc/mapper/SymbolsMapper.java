package jdbc.mapper;

import data.StockProvider;
import data.Symbol;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SymbolsMapper implements RowMapper<Symbol> {
	@Override
	public Symbol mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Symbol(StockProvider.get(rs.getInt("stockProvider")), rs.getString("symbol"));
	}
}
