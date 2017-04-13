package spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.data.Candle;
import model.jdbc.dao.CandleDAO;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rx.Observable;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	@Transactional(readOnly = true)
	@RequestMapping(value = "/candles/{stockId}", method = RequestMethod.GET)
	public List<Candle> getCandles(
			@PathVariable("stockId") Long stockId,
			@RequestParam(value = "start", defaultValue = "0", required = false) Long epoch1,
			@RequestParam(value = "end", defaultValue = "0x7fffffffffffffff", required = false) Long epoch2,
			Pageable pageable) throws IOException {
		List<Candle> candles = candleDAO.findByStockIdAndEpochBetweenOrderByEpochDesc(stockId, epoch1, epoch2, pageable);
		return candles;
	}
	
}
