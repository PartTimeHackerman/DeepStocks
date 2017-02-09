package data;

import model.StocksLoader;
import utils.*;

import java.io.IOException;
import java.util.List;

public class test {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		utils.Serializer kryo = new utils.Serializer(new utils.KryoSerializer());
		utils.Serializer zstd = new utils.Serializer(new utils.ZstdSerializer());
		utils.Serializer lz4 = new utils.Serializer(new utils.LZ4Serializer());
		
		StocksLoader kstocksLoader = new StocksLoader(new utils.KryoSerializer());
		StocksLoader zstocksLoader = new StocksLoader(new utils.ZstdSerializer());
		
		List<StockData> data = kstocksLoader.loadStocksData("stocksSER");
		
		zstocksLoader.saveStocksData(data, "stocksZstd");
		
		/*
		lz4.serialize(airbus, "stocksZstd", "Airbus3");
		MainLogger.log().info("LZ4 C.Time: {}", System.currentTimeMillis() - curr);
		curr = System.currentTimeMillis();
		
		airbus1 = kryo.deserialize(StockData.class, "stocksSER", "Airbus.ser");
		MainLogger.log().info("K D.Time: {}", System.currentTimeMillis() - curr);
		curr = System.currentTimeMillis();
		
		airbus2 = zstd.deserialize(StockData.class, "stocksZstd", "Airbus2.ser");
		MainLogger.log().info("Zstd D.Time: {}", System.currentTimeMillis() - curr);
		curr = System.currentTimeMillis();
		
		airbus3 = lz4.deserialize(StockData.class, "stocksZstd", "Airbus3.ser");
		MainLogger.log().info("LZ4 D.Time: {}", System.currentTimeMillis() - curr);
		curr = System.currentTimeMillis();*/
		/*
		/*
		List<StockData> data;
		
		PacketStream packetStream = new PacketStream()
				.addHandler(new ActiveSymbolsHandler(data))
				.addHandler(new TicksHistoryHandler(data));
		
		Request messageRequest = new Request(packetStream);
		
		BinaryCandlesGather binaryCandlesGather = new BinaryCandlesGather(messageRequest);
		
		Long curr = System.currentTimeMillis();
	
		*/
		
		/*DefaultHighLowDataset dataset;
		
		
		Integer dataSize = airbus.getStockCandles().size();
		
		Date[] dates = new Date[dataSize];
		double[] high = new double[dataSize];
		double[] low = new double[dataSize];
		double[] open = new double[dataSize];
		double[] close = new double[dataSize];
		double[] volume = new double[dataSize];
		
		int i = 0;
		for(Map.Entry<Long, Candle> entry : airbus.getStockCandles().entrySet()){
			Candle candle = entry.getValue();
			dates[i] = new Date(candle.getEpoch());
			high[i] = candle.getHigh();
			low[i] = candle.getLow();
			open[i] = candle.getOpen();
			close[i] = candle.getClose();
			volume[i] = 0;
			i++;
		}
		
		dataset = new DefaultHighLowDataset("test",dates, high, low, open, close, volume);
		
		CandlestickDemo candlestick = new CandlestickDemo("Airbus", dataset);
		
		candlestick.pack();
		
		candlestick.setVisible(true);*/
		
		System.in.read();
		
		//serializer.saveStocksData(data);
		
		
		
		/*BinaryAPI api = new BinaryAPI();
		api.init();
		
		BinaryStocksDataGather g = new BinaryStocksDataGather(data,api);
		g.gather();
		
		CandlesGather cg = new CandlesGather();
		for(StockData stock : data)
			cg.gatherLastestCandles(stock);
		
		GsonSerializer.saveStocksData(data);*/
	}
}
