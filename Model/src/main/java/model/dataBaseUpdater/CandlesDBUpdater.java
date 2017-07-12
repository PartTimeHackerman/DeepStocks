package model.dataBaseUpdater;

import model.dao.CandleDAO;
import model.data.Candle;
import model.utils.MainLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vaer.Vaer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class CandlesDBUpdater implements DataBaseUpdater<Collection<Candle>> {
	
	private final CandleDAO candleDAO;
	private final ExecutorService threadExecutor = Executors.newFixedThreadPool(10);
	private final Collection<Candle> candles = new ArrayList<>();
	private final AtomicInteger jobs = new AtomicInteger();
	private final Integer flushSize = 10000;
	
	@Autowired
	public CandlesDBUpdater(CandleDAO candleDAO) {
		this.candleDAO = candleDAO;
		Vaer.get().group(getClass().getSimpleName()).variable("Candles Database updater queue size").setVariableGetter(candles::size);
		Vaer.get().group(getClass().getSimpleName()).variable("Jobs").setVariableGetter(jobs::get);
	}
	
	@Override
	public void update(Collection<Candle> candles) {
		this.candles.addAll(candles);
		if (this.candles.size() >= flushSize || jobs.get() <= 1) {
			candles.clear();
			candles.addAll(this.candles);
			this.candles.clear();
			jobs.incrementAndGet();
			threadExecutor.submit(() -> {
				//stock.setLastCandle(candles.get(candles.size() - 1));
				try {
					candleDAO.save(candles);
				} catch (Exception e) {
					MainLogger.log(this).warn(e);
					candles.removeIf(candle -> candleDAO.exists(candle.getCandlePK()));
					candleDAO.save(candles);
				}
				jobs.decrementAndGet();
			});
			
		}
	}
}
