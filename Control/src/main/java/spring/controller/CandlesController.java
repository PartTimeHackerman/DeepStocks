package spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.data.Candle;
import model.jdbc.dao.CandleDAO;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/data")
@Transactional
@CrossOrigin(allowedHeaders = {"Access-Control-Allow-Origin"})
public class CandlesController {
	
	private final CandleDAO candleDAO;
	
	private final JdbcTemplate jdbcTemplate;
	
	private final ObjectMapper objectMapper;
	
	@Autowired
	public CandlesController(CandleDAO candleDAO, JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
		this.candleDAO = candleDAO;
		this.jdbcTemplate = jdbcTemplate;
		this.objectMapper = objectMapper;
	}
	
	@RequestMapping(value = "/candles/{stockId}", method = RequestMethod.GET)
	public List<Candle> getCandles(
			@PathVariable("stockId") Long stockId,
			@RequestParam(value = "start", defaultValue = "0", required = false) Long start,
			@RequestParam(value = "end", defaultValue = "0x7fffffffffffffff", required = false) Long end,
			Pageable pageable) throws IOException {
		List<Candle> candles = candleDAO.findByStockIdAndEpochBetweenOrderByEpochDesc(stockId, start, end, pageable);
		return candles;
	}
	
	@RequestMapping(value = "/candles/{stockId}/granularity", method = RequestMethod.GET)//, produces = {"application/json"})
	public List<Candle> getCandlesWithGranularity(
			@PathVariable("stockId") Long stockId,
			@RequestParam(value = "start", defaultValue = "0", required = false) Long start,
			@RequestParam(value = "end", defaultValue = "0x7fffffffffffffff", required = false) Long end,
			@RequestParam(value = "granularity", defaultValue = "1000", required = false) Integer granularity) throws IOException {
		Long time = System.currentTimeMillis();
		List<Candle> candles = candleDAO.findByStockIdAndEpochBetweenOrderByEpochDescWithGranularity(stockId, start, end, granularity);
		MainLogger.log().debug("getCandlesWithGranularity: {} ms", System.currentTimeMillis() - time);
		return candles;
	}
	
}
