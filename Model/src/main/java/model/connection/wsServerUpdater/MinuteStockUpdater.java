package model.connection.wsServerUpdater;

import model.binaryAPI.BinaryCandlesGather;
import model.binaryAPI.BinaryDataGather;
import model.connection.websocketServer.STOMPStocksController;
import model.data.BinaryData;
import model.data.Candle;
import model.dataBaseUpdater.BinaryDataDBUpdater;
import model.dataBaseUpdater.CandlesDBUpdater;
import model.utils.DigitsUtil;
import model.utils.Interval;
import org.apache.commons.collections.collection.SynchronizedCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class MinuteStockUpdater {
	
	private final BinaryCandlesGather binaryCandlesGather;
	private final BinaryDataGather binaryDataGather;
	private final STOMPStocksController stompStocksController;
	private final BinaryDataDBUpdater binaryDataDBUpdater;
	private final CandlesDBUpdater candlesDBUpdater;
	
	private final Executor singleThreadUpdater;
	private Boolean running = false;
	private Boolean threadRunning = false;
	
	
	@Autowired
	public MinuteStockUpdater(BinaryCandlesGather binaryCandlesGather, BinaryDataGather binaryDataGather, STOMPStocksController stompStocksController, BinaryDataDBUpdater binaryDataDBUpdater, CandlesDBUpdater candlesDBUpdater) {
		this.binaryCandlesGather = binaryCandlesGather;
		this.binaryDataGather = binaryDataGather;
		this.stompStocksController = stompStocksController;
		this.binaryDataDBUpdater = binaryDataDBUpdater;
		this.candlesDBUpdater = candlesDBUpdater;
		this.singleThreadUpdater = Executors.newSingleThreadExecutor();
	}
	
	public void start() {
		if (running)
			return;
		running = true;
		if (!threadRunning)
			singleThreadUpdater.execute(() -> {
				threadRunning = true;
				update();
				try {
					Thread.sleep((65 - Calendar.getInstance().get(Calendar.SECOND)) * 1000L);
				} catch (InterruptedException ignored) {
				}
				Interval.doEvery(1L, TimeUnit.SECONDS, () -> {
					if (running)
						updateAndWait(60000L);
				});
			});
	}
	
	public void stop() {
		running = false;
	}
	
	private void updateAndWait(Long waitTime) {
		Long estEndTime = System.currentTimeMillis() + waitTime;
		update();
		Long endTime = System.currentTimeMillis();
		Long realWaitTime = estEndTime - endTime;
		if (realWaitTime >= 0) {
			try {
				Thread.sleep(realWaitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void update() {
		List<BinaryData> binaryDataCollection = binaryDataGather.fetchAndGetBinaryDatas();
		Vector<Candle> candles = new Vector<>();
		
		List<BinaryData> openBinaryDataList = binaryDataCollection.stream()
				.filter(binaryData -> binaryData.getExchangeIsOpen() == 1)
				.collect(Collectors.toList());
		
		openBinaryDataList.parallelStream()
				.map(binaryData -> binaryCandlesGather.getCandle(binaryData.getStock(), getSecondEpochMinuteFloor(binaryData.getSpotTime())))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.forEach(candles::add);
		
		candles.remove(null); //just in case
		
		stompStocksController.updateStockBinaryDataCollection(binaryDataCollection);
		stompStocksController.updateStockLastCandles(candles);
		
		binaryDataDBUpdater.update(binaryDataCollection);
		candlesDBUpdater.update(candles);
	}
	
	private Long getSecondEpochMinuteFloor(Long epoch) {
		Long epochSeconds = DigitsUtil.removeLastNDigits(epoch, 3);
		return epochSeconds - Calendar.getInstance().get(Calendar.SECOND);
	}
	
}
