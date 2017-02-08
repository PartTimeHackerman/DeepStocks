package jdbc.mapper;

import binaryAPI.commands.active_symbols.ActiveSymbol;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActiveSymbolMapper implements RowMapper<ActiveSymbol> {
	@Override
	public ActiveSymbol mapRow(ResultSet rs, int rowNum) throws SQLException {
		ActiveSymbol activeSymbol = new ActiveSymbol();
		
		activeSymbol.setIntradayIntervalMinutes(rs.getInt("intradayIntervalMinutes"));
		activeSymbol.setSymbolType(rs.getString("symbolType"));
		activeSymbol.setExchangeIsOpen(rs.getBoolean("exchangeIsOpen"));
		activeSymbol.setExchangeName(rs.getString("exchangeName"));
		activeSymbol.setDelayAmount(rs.getInt("delayAmount"));
		activeSymbol.setSpot(rs.getDouble("spot"));
		activeSymbol.setSpotTime(rs.getLong("spotTime"));
		activeSymbol.setIsTradingSuspended(rs.getBoolean("isTradingSuspended"));
		activeSymbol.setQuotedCurrencySymbol(rs.getString("quotedCurrencySymbol"));
		activeSymbol.setSpotAge(rs.getLong("spotAge"));
		activeSymbol.setMarket(rs.getString("market"));
		activeSymbol.setSubmarket(rs.getString("submarket"));
		activeSymbol.setPip(rs.getDouble("pip"));
		
		return activeSymbol;
	}
}
