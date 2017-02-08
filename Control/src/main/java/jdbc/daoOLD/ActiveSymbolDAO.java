package jdbc.daoOLD;

import binaryAPI.commands.active_symbols.ActiveSymbol;
import jdbc.mapper.ActiveSymbolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ActiveSymbolDAO implements ObjectDAO<ActiveSymbol> {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public void insert(ActiveSymbol activeSymbol) {
		String sql = "INSERT INTO sbinary (stockId, intradayIntervalMinutes, symbolType, exchangeIsOpen, exchangeName, delayAmount, spot, spotTime, isTradingSuspended, quotedCurrencySymbol, spotAge, market, submarket, pip)" +
				" VALUES (:stockId, :intradayIntervalMinutes, :symbolType, :exchangeIsOpen, :exchangeName, :delayAmount, :spot, :spotTime, :isTradingSuspended, :quotedCurrencySymbol, :spotAge, :market, :submarket, :pip)" +
				" ON DUPLICATE KEY UPDATE stockId = :stockId, intradayIntervalMinutes= :intradayIntervalMinutes, symbolType = :symbolType, exchangeIsOpen = :exchangeIsOpen, exchangeName = :exchangeName, delayAmount = :delayAmount, spot = :spot, spotTime = :spotTime, isTradingSuspended = :isTradingSuspended, quotedCurrencySymbol = :quotedCurrencySymbol, spotAge = :spotAge, market = :market, submarket = :submarket, pip = :pip";
		namedParameterJdbcTemplate.update(sql, getParams(activeSymbol));
	}
	
	@Override
	public void insertAll(List<ActiveSymbol> activeSymbols) {
		String sql = "INSERT INTO sbinary (stockId, intradayIntervalMinutes, symbolType, exchangeIsOpen, exchangeName, delayAmount, spot, spotTime, isTradingSuspended, quotedCurrencySymbol, spotAge, market, submarket, pip)" +
				" VALUES (:stockId, :intradayIntervalMinutes, :symbolType, :exchangeIsOpen, :exchangeName, :delayAmount, :spot, :spotTime, :isTradingSuspended, :quotedCurrencySymbol, :spotAge, :market, :submarket, :pip)" +
				" ON DUPLICATE KEY UPDATE stockId = :stockId, intradayIntervalMinutes= :intradayIntervalMinutes, symbolType = :symbolType, exchangeIsOpen = :exchangeIsOpen, exchangeName = :exchangeName, delayAmount = :delayAmount, spot = :spot, spotTime = :spotTime, isTradingSuspended = :isTradingSuspended, quotedCurrencySymbol = :quotedCurrencySymbol, spotAge = :spotAge, market = :market, submarket = :submarket, pip = :pip";
		
		Map<String, Object>[] paramsArr = new HashMap[activeSymbols.size()];
		
		for (int i = 0; i < activeSymbols.size(); i++) {
			ActiveSymbol activeSymbol = activeSymbols.get(i);
			paramsArr[i] = getParams(activeSymbol);
		}
		
		namedParameterJdbcTemplate.batchUpdate(sql, paramsArr);
	}
	
	@Override
	public ActiveSymbol findById(int id) {
		String sql = "SELECT * FROM sbinary WHERE stockId = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return namedParameterJdbcTemplate.queryForObject(sql, params, new ActiveSymbolMapper());
	}
	
	@Override
	public List<ActiveSymbol> findAll() {
		String sql = "SELECT * FROM sbinary";
		return namedParameterJdbcTemplate.queryForList(sql, new HashMap<>(), ActiveSymbol.class);
	}
	
	@Override
	public int total() {
		String sql = "SELECT COUNT(*) FROM sbinary";
		return namedParameterJdbcTemplate.queryForObject(sql, new HashMap<>(), Integer.class);
	}
	
	private Map<String, Object> getParams(ActiveSymbol activeSymbol) {
		Map<String, Object> params = new HashMap<>();
		params.put("stockId", activeSymbol.getStockId());
		params.put("intradayIntervalMinutes", activeSymbol.getIntradayIntervalMinutes());
		params.put("symbolType", activeSymbol.getSymbolType());
		params.put("exchangeIsOpen", activeSymbol.getExchangeIsOpen());
		params.put("exchangeName", activeSymbol.getExchangeName());
		params.put("delayAmount", activeSymbol.getDelayAmount());
		params.put("spot", activeSymbol.getSpot());
		params.put("spotTime", activeSymbol.getSpotTime());
		params.put("isTradingSuspended", activeSymbol.getIsTradingSuspended());
		params.put("quotedCurrencySymbol", activeSymbol.getQuotedCurrencySymbol());
		params.put("spotAge", activeSymbol.getSpotAge());
		params.put("market", activeSymbol.getMarket());
		params.put("submarket", activeSymbol.getSubmarket());
		params.put("pip", activeSymbol.getPip());
		return params;
	}
}
