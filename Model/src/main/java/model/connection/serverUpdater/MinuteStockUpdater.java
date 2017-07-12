package model.connection.serverUpdater;

import model.binaryAPI.BinaryCandlesGather;
import model.binaryAPI.BinaryDataGather;
import model.connection.websocketServer.STOMPStocksController;
import model.data.BinaryData;
import model.data.Candle;
import model.dataBaseUpdater.BinaryDataDBUpdater;
import model.dataBaseUpdater.CandlesDBUpdater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
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
	private Boolean ohBoiRefactorDisxD = false;
	
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
		if (!ohBoiRefactorDisxD)
			singleThreadUpdater.execute(() -> {
				ohBoiRefactorDisxD = true;
				while (true) { // XDDDD
					if (running)
						updateAndWait(5000L);
				}
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
		List<Candle> candles = new ArrayList<>();
		
		List<BinaryData> openBinaryDataList = binaryDataCollection.stream()
				.filter(binaryData -> binaryData.getExchangeIsOpen() == 1)
				.collect(Collectors.toList());
		
		openBinaryDataList.parallelStream()
				.map(binaryData -> binaryCandlesGather.getLatestCandle(binaryData.getStock()))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.forEach(candles::add);
		
		candles.remove(null); //just in case
		
		stompStocksController.updateStockBinaryDataCollection(binaryDataCollection);
		stompStocksController.updateStockLastCandles(candles);
		
		binaryDataDBUpdater.update(binaryDataCollection);
		candlesDBUpdater.update(candles);
	}
}
