package model.jdbc.dao;

import model.data.Candle;
import model.data.Stock;
import org.hibernate.secure.spi.GrantedPermission;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;
import java.util.List;
import java.util.stream.Stream;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

@Repository
@Transactional
public interface CandleDAO extends CrudRepository<Candle, Candle.CandlePK> {
	
	Page<Candle> findAll(Pageable pageable);
	
	Candle findTopByStockOrderByEpoch(Stock stock);
	
	List<Candle> findByStockAndEpochBetween(Stock stockId, Long epoch1, Long epoch2);
	
	List<Candle> findByStockIdAndEpochBetweenOrderByEpochDesc(Long stockId, Long epoch1, Long epoch2, Pageable pageable);
	
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
					"THEN ( row % ((select * from maxRow)/:granularity)=0 OR row = (select * from maxRow) OR row = 1) " +
					"    ELSE TRUE END " +
					"ORDER BY c.epoch ASC"
			, nativeQuery = true)
	List<Candle> findByStockIdAndEpochBetweenOrderByEpochDescWithGranularity(
			@Param("stockid") Long stockId, @Param("start") Long start, @Param("end") Long end, @Param("granularity") Integer granularity);
}
