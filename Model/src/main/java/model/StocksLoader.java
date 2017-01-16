package model;

import data.StockData;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import utils.ISerializer;
import utils.KryoSerializer;
import utils.MainPool;
import utils.Serializer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Observable;

public class StocksLoader extends Observable {
	
	private Serializer serializer;
	
	public final static String defaultPath = "stocksSER";
	
	private String currentStock;
	
	private Integer total;
	
	private Integer done = 0;
	
	public StocksLoader(ISerializer dataSerializer) {
		serializer = new Serializer(dataSerializer);
	}
	
	public List<StockData> loadStocksData() {
		return MainPool.getInstance().sendTask(() -> loadStocksData(defaultPath), false);
	}
	
	public List<StockData> loadStocksData(String path) {
		List<StockData> stocks = new ArrayList<>();
		createDir(path);
		Collection<File> files = FileUtils.listFiles(new File(path), new WildcardFileFilter("*.ser"), null);
		total = files.size();
		done = 0;
		files.forEach(file -> {
			stocks.add(loadStock(path, file));
		});
		return stocks;
	}
	
	private StockData loadStock(String path, File file) {
		currentStock = file.getName();
		StockData stock = serializer.deserialize(StockData.class, path, file.getName());
		done++;
		System.out.println(done + currentStock);
		setChanged();
		notifyObservers();
		return stock;
	}
	
	public void saveStocksData(List<StockData> stocksData) {
		saveStocksData(stocksData, defaultPath);
	}
	
	public void saveStocksData(List<StockData> stocksData, String path) {
		total = stocksData.size();
		done = 0;
		for (StockData stock : stocksData) {
			saveStock(path, stock);
		}
	}
	
	private void saveStock(String path, StockData stock) {
		currentStock = stock.getName();
		serializer.serialize(stock, path, stock.getName().replace("/", "_"));
		done++;
		setChanged();
		notifyObservers();
	}
	
	private void createDir(String dir) {
		File file = new File(dir);
		if (!file.exists())
			file.mkdirs();
	}
	
	public String getCurrentStock() {
		return currentStock;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public Integer getDone() {
		return done;
	}
}
