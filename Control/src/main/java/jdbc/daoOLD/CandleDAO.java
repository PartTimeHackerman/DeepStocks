package jdbc.daoOLD;

import binaryAPI.commands.ticks_history.Candle;
import jdbc.DBConnectionFactory;
import jdbc.mapper.CandleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CandleDAO implements ObjectDAO<Candle> {
	
	private Connection connection;
	
	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public CandleDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		try {
			connection = DBConnectionFactory.get().getConnection();
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	@Override
	public void insert(Candle candle) {
		String sql = "INSERT INTO candles (stockId, epoch, open, close, high, low, volume) VALUES (?, ?, ?, ?, ?, ?, ?)  ON DUPLICATE KEY UPDATE id=id;";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			setParams(candle, preparedStatement);
			preparedStatement.execute();
			connection.commit();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void insertAll(List<Candle> candles) {
		try {
			
			String sql = "INSERT INTO candles (stockId, epoch, open, close, high, low, volume) VALUES (?, ?, ?, ?, ?, ?, ?)  ON DUPLICATE KEY UPDATE id=id;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			for (int i = 0; i < candles.size(); i++) {
				Candle candle = candles.get(i);
				setParams(candle, preparedStatement);
				preparedStatement.addBatch();
				if (i % 1000 == 0 || i == candles.size() - 1) {
					preparedStatement.executeBatch();
					connection.commit();
				}
			}
			preparedStatement.close();
			//connection.setAutoCommit(true);
			//connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*String sql = "INSERT INTO candles (stockId, epoch, open, close, high, low, volume) VALUES (:stockId, :epoch, :open, :close, :high, :low, :volume)" +
				" ON DUPLICATE KEY UPDATE id=id;";

		Map<String, Object>[] paramsArr = new HashMap[candles.size()];

		for (int i = 0; i < candles.size(); i++) {
			Candle candle = candles.get(i);
			paramsArr[i] = setParams(candle);
		}

		namedParameterJdbcTemplate.batchUpdate(sql, paramsArr);*/
		
		/*String sql = "INSERT INTO candles (stockId, epoch, open, close, high, low, volume) VALUES (?, ?, ?, ?, ?, ?, ?)" +
				" ON DUPLICATE KEY UPDATE stockId = ?, epoch = ?, open = ?, close = ?, high = ?, low = ?, volume = ?";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Candle c = candles.get(i);
				ps.setInt(1, c.getStockId());
				ps.setLong(2, c.getEpoch());
				ps.setDouble(3, c.getOpen());
				ps.setDouble(4, c.getClose());
				ps.setDouble(5, c.getHigh());
				ps.setDouble(6, c.getLow());
				ps.setDouble(7, c.getVolume() == null ? 0D : c.getVolume());
				
				ps.setInt(8, c.getStockId());
				ps.setLong(9, c.getEpoch());
				ps.setDouble(10, c.getOpen());
				ps.setDouble(11, c.getClose());
				ps.setDouble(12, c.getHigh());
				ps.setDouble(13, c.getLow());
				ps.setDouble(14, c.getVolume() == null ? 0D : c.getVolume());
			}
			
			@Override
			public int getBatchSize() {
				return candles.size();
			}
		});*/
	}
	
	@Override
	public Candle findById(int id) {
		String sql = "SELECT * FROM candles WHERE id = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(sql, params, new CandleMapper());
	}
	
	public Candle findLatest(int stockId) {
		String sql = "SELECT * FROM candles WHERE stockId = :stockId ORDER BY epoch DESC LIMIT 1";
		Map<String, Object> params = new HashMap<>();
		params.put("stockId", stockId);
		return namedParameterJdbcTemplate.queryForObject(sql, params, new CandleMapper());
	}
	
	public List<Candle> findListByStockId(int stockId, Long from, Long to) {
		String sql = "SELECT * FROM candles WHERE stockId = :stockId AND epoch BETWEEN :from AND :to";
		Map<String, Object> params = new HashMap<>();
		params.put("stockId", stockId);
		
		params.put("from", from);
		params.put("to", to);
		return namedParameterJdbcTemplate.query(sql, params, new CandleMapper());
	}
	
	public List<Candle> findListByStockId(int stockId) {
		String sql = "SELECT * FROM candles WHERE stockId = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, stockId);
			ResultSet rs = preparedStatement.executeQuery();
			connection.commit();
			List<Candle> candles = new ArrayList<>();
			CandleMapper cm = new CandleMapper();
			while (rs.next()){
					candles.add(cm.mapRow(rs,0));
			}
			return candles;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<Candle> findAll() {
		String sql = "SELECT * FROM candles";
		return namedParameterJdbcTemplate.queryForList(sql, new HashMap<>(), Candle.class);
	}
	
	@Override
	public int total() {
		String sql = "SELECT COUNT(*) FROM candles";
		return namedParameterJdbcTemplate.queryForObject(sql, new HashMap<>(), Integer.class);
	}
	
	private void setParams(Candle candle, PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.setInt(1, candle.getStockId());
		preparedStatement.setLong(2, candle.getEpoch());
		preparedStatement.setDouble(3, candle.getOpen());
		preparedStatement.setDouble(4, candle.getClose());
		preparedStatement.setDouble(5, candle.getHigh());
		preparedStatement.setDouble(6, candle.getLow());
		preparedStatement.setDouble(7, candle.getVolume() == null ? 0D : candle.getVolume());
	}
}
