package model.dao;

import model.data.Candle;
import model.data.Stock;
import model.utils.DigitsUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CandleDAO extends CrudRepository<Candle, Candle.CandlePK> {
	
	Page<Candle> findAll(Pageable pageable);
	
	Candle findTopByStockOrderByEpoch(Stock stock);
	
	List<Candle> findByStockAndEpochBetween(Stock stockId, Long epoch1, Long epoch2);
	
	default List<Candle> findByStockAndEpochBetweenWithMillis(Stock stockId, Long epoch1, Long epoch2) {
		return findByStockAndEpochBetween(stockId,
										  DigitsUtil.removeLastNDigits(epoch1, 3),
										  DigitsUtil.removeLastNDigits(epoch2, 3));
	}
	
	List<Candle> findByStockIdAndEpochBetweenOrderByEpochDesc(Long stockId, Long epoch1, Long epoch2, Pageable pageable);
	
	default List<Candle> findByStockIdAndEpochBetweenOrderByEpochDescWithMillis(Long stockId, Long epoch1, Long epoch2, Pageable pageable) {
		return findByStockIdAndEpochBetweenOrderByEpochDesc(stockId,
															DigitsUtil.removeLastNDigits(epoch1, 3),
															DigitsUtil.removeLastNDigits(epoch2, 3),
															pageable);
	}
	
	@Query(value = "SELECT * FROM candles c WHERE c.stockid=:stockid ORDER BY c.epoch DESC LIMIT :limit", nativeQuery = true)
	List<Candle> findTopLimitByStockidOrderByEpoch(@Param("stockid") Long stockid, @Param("limit") Integer limit);
	
	@Query(value =
			"WITH " +
					"candlesOrdered AS (SELECT *" +
					"                     FROM candles c                      " +
					"                     WHERE stockid = :stockid AND epoch BETWEEN :start AND :end " +
					"               	  ORDER BY epoch)" +
					", candlesTemp AS (SELECT *, ROW_NUMBER() OVER() AS row FROM candlesOrdered)" +
					", maxRow AS (SELECT max(candlesTemp.row) " +
					"             FROM candlesTemp)" +
					"SELECT c.epoch, c.close, c.high, c.low, c.open, c.volume, c.stockid, c.row FROM candlesTemp c " +
					"WHERE " +
					"CASE WHEN ((cast((SELECT * FROM maxRow) AS FLOAT)/:granularity)>=1) " +
					"THEN ( row % ((SELECT * FROM maxRow)/:granularity)=0 OR row = (SELECT * FROM maxRow) OR row = 1) " +
					"    ELSE TRUE END " +
					"ORDER BY c.epoch ASC"
			, nativeQuery = true)
	List<Candle> findByStockIdAndEpochBetweenOrderByEpochDescWithGranularity(
			@Param("stockid") Long stockId, @Param("start") Long start, @Param("end") Long end, @Param("granularity") Integer granularity);
}
