package jdbc.daoOLD;

import data.StockData;
import data.Symbol;
import binaryAPI.commands.active_symbols.ActiveSymbol;
import binaryAPI.commands.ticks_history.Candle;
import jdbc.daoOLD.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Component
public class StockDataFacadeDAO implements ObjectDAO<StockData> {
	
	private final StockDataDAO stockDAO ;
	
	private final CandleDAO candleDAO;
	
	private final ActiveSymbolDAO activeSymbolDAO;
	
	private final SymbolsDAO symbolsDAO;
	
	@Autowired
	public StockDataFacadeDAO(ActiveSymbolDAO activeSymbolDAO, CandleDAO candleDAO, StockDataDAO stockDAO, SymbolsDAO symbolsDAO) {
		this.activeSymbolDAO = activeSymbolDAO;
		this.candleDAO = candleDAO;
		this.stockDAO = stockDAO;
		this.symbolsDAO = symbolsDAO;
	}
	
	@Override
	public void insert(StockData stock) {
		stockDAO.insert(stock);
		List<Candle> candles = (stock
				.getStockCandles()
				.entrySet()
				.stream()
				.map(Map.Entry::getValue)
				.collect(Collectors.toList()));
		
		candles.forEach(c -> c.setOwner(stock));
		candleDAO.insertAll(candles);
		ActiveSymbol activeSymbol = stock.getBinaryData();
		activeSymbol.setOwner(stock);
		activeSymbolDAO.insert(activeSymbol);
		
		List<Symbol> symbols = stock.getSymbols();
		
		symbols.forEach(s -> s.setOwner(stock));
		symbolsDAO.insertAll(symbols);
	}
	
	@Override
	public void insertAll(List<StockData> stocks) {
		List<Candle> candles = stocks.stream().map(s -> s.getStockCandles().entrySet().stream()
				.map(Map.Entry::getValue)
				.collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.toList());
		List<ActiveSymbol> activeSymbols = stocks
				.stream()
				.map(StockData::getBinaryData)
				.collect(Collectors.toList());
		
		candleDAO.insertAll(candles);
		activeSymbolDAO.insertAll(activeSymbols);
		
	}
	
	@Override
	public StockData findById(int id) {
		StockData stock = stockDAO.findById(id);
		stock.setBinaryData(activeSymbolDAO.findById(id));
		TreeMap<Long, Candle> candles = new TreeMap<>();
		List<Candle> candlesList = candleDAO.findListByStockId(id);
		candlesList.forEach(c -> candles.put(c.getEpoch(), c));
		stock.setStockCandles(candles);
		List<Symbol> symbols = symbolsDAO.findListById(id);
		stock.setSymbols(symbols);
		return stock;
	}
	
	@Override
	public List<StockData> findAll() {
		List<StockData> tmpStocks = stockDAO.findAll();
		List<StockData> stocks = new ArrayList<>();
		tmpStocks.forEach(s ->
								  stocks.add(findById(s.getId())));
		return stocks;
	}
	
	@Override
	public int total() {
		return stockDAO.total();
	}
}
