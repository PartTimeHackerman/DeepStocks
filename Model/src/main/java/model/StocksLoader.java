package model;

import model.data.Stock;
import model.utils.ISerializer;
import model.utils.MainPool;
import model.utils.Serializer;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Observable;

@Deprecated
public class StocksLoader extends Observable {
	
	public static final String defaultPath = "stocksSER";
	private final Serializer serializer;
	private String currentStock;
	
	private Integer total;
	
	private Integer done = 0;
	
	public StocksLoader(ISerializer dataSerializer) {
		serializer = new Serializer(dataSerializer);
	}
	
	public List<Stock> loadStocksData() {
		return MainPool.getInstance().sendTask(() -> loadStocksData(defaultPath), false);
	}
	
	public List<Stock> loadStocksData(String path) {
		List<Stock> stocks = new ArrayList<>();
		createDir(path);
		Collection<File> files = FileUtils.listFiles(new File(path), new WildcardFileFilter("*.ser"), null);
		total = files.size();
		done = 0;
		files.forEach(file ->
							  stocks.add(loadStock(path, file))
					 );
		return stocks;
	}
	
	private Stock loadStock(String path, File file) {
		currentStock = file.getName();
		Stock stock = serializer.deserialize(Stock.class, path, file.getName());
		done++;
		System.out.println(done + currentStock);
		setChanged();
		notifyObservers();
		return stock;
	}
	
	public void saveStocksData(List<Stock> stocksData) {
		saveStocksData(stocksData, defaultPath);
	}
	
	public void saveStocksData(List<Stock> stocksData, String path) {
		total = stocksData.size();
		done = 0;
		for (Stock stock : stocksData) {
			saveStock(path, stock);
		}
	}
	
	private void saveStock(String path, Stock stock) {
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
