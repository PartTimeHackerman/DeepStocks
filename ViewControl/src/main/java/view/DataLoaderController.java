package view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import model.StocksLoader;

import java.util.Observable;
import java.util.Observer;

public class DataLoaderController implements Observer{
	
	@FXML
	private Label loadSave;
	
	@FXML
	private Label stockName;
	
	@FXML
	private Label done;
	
	@FXML
	private Label total;
	
	@FXML
	private ProgressBar progressBar;
	
	private Integer doneData = 0;
	
	private Integer totalData = 0;
	
	
	private StocksLoader stocksLoader;
	
	@FXML
	public void initialize(StocksLoader stocksLoader){
		stockName.setText("");
		done.setText("");
		total.setText("");
		
		this.stocksLoader = stocksLoader;
		stocksLoader.addObserver(this);
		
	}
	
	public void setStockName(String stockName) {
		this.stockName.setText(stockName);
	}
	
	public void setDone(Integer done) {
		this.done.setText(done.toString());
		doneData = done;
		progressBar.setProgress((float)doneData / totalData);
	}
	
	public void setTotal(Integer total) {
		this.total.setText(total.toString());
		totalData = total;
	}
	
	private void updateView(){
		setStockName(stocksLoader.getCurrentStock());
		setTotal(stocksLoader.getTotal());
		setDone(stocksLoader.getDone());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Platform.runLater(this::updateView);
		
	}
}