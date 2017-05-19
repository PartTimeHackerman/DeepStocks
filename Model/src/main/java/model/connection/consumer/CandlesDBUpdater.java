package model.connection.consumer;

import model.connection.packetHandler.TicksHistoryHandler;
import model.data.Candle;
import model.data.Stock;
import model.jdbc.dao.CandleDAOImpl;
import model.utils.Interval;
import model.utils.MainLogger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaer.Vaer;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CandlesDBUpdater implements HandlerConsumer<TicksHistoryHandler.StockCandlesWrapper>, Subscriber<TicksHistoryHandler.StockCandlesWrapper> {
	
	private final CandleDAOImpl candleDAO;
	
	private final ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
	private final AtomicLong executorQueueSize = new AtomicLong();
	
	@Autowired
	public CandlesDBUpdater(CandleDAOImpl candleDAO) {
		this.candleDAO = candleDAO;
		Vaer.get().group(getClass().getSimpleName()).variable("Candles Database updater queue size").setVariableGetter(executorQueueSize::get);
	}
	
	@Override
	public void consume(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		executorQueueSize.incrementAndGet();
		threadExecutor.submit(() -> {
			addToDB(stockCandlesWrapper);
			executorQueueSize.decrementAndGet();
		});
	}
	
	private void addToDB(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		List<Candle> candles = stockCandlesWrapper.getCandles();
		Stock stock = stockCandlesWrapper.getStock();
		
		//MainLogger.log(this).info("Adding candles to DB");
		candles.forEach(candle -> candle.setStock(stock));
		candleDAO.getCrudDAO().save(candles);
	}
	
	@Override
	public void onSubscribe(Subscription s) {
		MainLogger.log(this).debug("{} subscribed", this);
		s.request(Long.MAX_VALUE);
	}
	
	@Override
	public void onNext(TicksHistoryHandler.StockCandlesWrapper stockCandlesWrapper) {
		consume(stockCandlesWrapper);
	}
	
	@Override
	public void onError(Throwable t) {
		MainLogger.log(this).error(t);
	}
	
	@Override
	public void onComplete() {
		MainLogger.log(this).error("{} completed", this);
	}
}
