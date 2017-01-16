package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class StockInfo {
	
	@FXML
	private Label name;
	
	@FXML
	private Label type;
	
	@FXML
	private Label spot;
	
	@FXML
	private Label open;
	
	@FXML
	private Label submarket;
	
	@FXML
	private Label currency;
	
	@FXML
	private Label pip;
	
	@FXML
	private Label spotTime;
	
	@FXML
	private Label exName;
	
	@FXML
	private TableView<String> symbolsTable;
	
}
