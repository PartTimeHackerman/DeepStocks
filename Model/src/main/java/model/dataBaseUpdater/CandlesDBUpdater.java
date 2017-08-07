package model.dataBaseUpdater;

import model.dao.CandleDAO;
import model.data.Candle;
import model.utils.Interval;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vaer.Vaer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class CandlesDBUpdater implements DataBaseUpdater<Collection<Candle>> {
	
	private final CandleDAO candleDAO;
	private final ExecutorService threadExecutor = Executors.newFixedThreadPool(10);
	private final Collection<Candle> candles = new ArrayList<>();
	private final AtomicInteger jobs = new AtomicInteger();
	private final Integer flushSize = 10000;
	private final AtomicInteger inserted = new AtomicInteger();
	private final AtomicLong lastFlushTime = new AtomicLong(0);
	
	@Autowired
	public CandlesDBUpdater(CandleDAO candleDAO) {
		this.candleDAO = candleDAO;
		Vaer.get().group(getClass().getSimpleName()).variable("Candles Database updater queue size").setVariableGetter(candles::size);
		Vaer.get().group(getClass().getSimpleName()).variable("Jobs").setVariableGetter(jobs::get);
		Vaer.get().group(getClass().getSimpleName()).variable("Inserted").setVariableGetter(inserted::get);
		
		Interval.doEvery(5L, TimeUnit.SECONDS, () -> {
			if (jobs.get() == 0 && candles.size() > 0 && System.currentTimeMillis() - lastFlushTime.get() > 5000) {
				saveCandles(candles);
				candles.clear();
			}
		});
	}
	
	@Override
	public void update(Collection<Candle> newCandles) {
		candles.addAll(newCandles);
		if (candles.size() >= flushSize || jobs.get() == 0) {
			newCandles.clear();
			newCandles.addAll(candles);
			candles.clear();
			threadExecutor.submit(() -> {
				jobs.incrementAndGet();
				saveCandles(newCandles);
				jobs.decrementAndGet();
			});
			
		}
	}
	
	private synchronized void saveCandles(Collection<Candle> candles) {
		inserted.addAndGet(candles.size());
		try {
			candleDAO.save(candles);
		} catch (Exception e) {
			MainLogger.log(this).warn(e);
			candles.removeIf(candle -> candleDAO.exists(candle.getCandlePK()));
			candleDAO.save(candles);
		}
		lastFlushTime.set(System.currentTimeMillis());
	}
}
