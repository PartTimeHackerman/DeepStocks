package jdbc.mapper;

import binaryAPI.commands.ticks_history.Candle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CandleMapper implements RowMapper<Candle> {
	@Override
	public Candle mapRow(ResultSet rs, int rowNum) throws SQLException {
		Candle candle = new Candle();
		
		candle.setEpoch(rs.getLong("epoch"));
		candle.setOpen(rs.getDouble("open"));
		candle.setClose(rs.getDouble("close"));
		candle.setHigh(rs.getDouble("high"));
		candle.setLow(rs.getDouble("low"));
		candle.setVolume(rs.getInt("volume"));
		
		return candle;
	}
}
