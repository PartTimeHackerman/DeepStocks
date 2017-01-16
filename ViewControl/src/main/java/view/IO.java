package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import model.StocksContainer;
import model.StocksLoader;

import java.io.File;

public class IO {
	
	@FXML
	private Button loadData;
	
	@FXML
	private Button saveData;
	
	private DirectoryChooser chooser;
	
	private Stage tempStage = new Stage();
	
	private File initialDir = new File(".");
	
	private StocksLoader stocksLoader;
	
	private StocksContainer stocksContainer;
	
	private DataLoaderController dataLoaderController;
	
	@FXML
	public void initialize(StocksLoader stocksLoader, StocksContainer stocksContainer) throws Exception{
		this.stocksLoader = stocksLoader;
		this.stocksContainer = stocksContainer;
		chooser = new DirectoryChooser();
		chooser.setInitialDirectory(initialDir);
		
		saveData.setOnAction(event ->
								 saveFile());
		loadData.setOnAction(event ->
								 loadFile());
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("dataLoader.fxml"));
		BorderPane loadPane = loader.load();
		dataLoaderController = loader.getController();
		
		dataLoaderController.initialize(stocksLoader);
	}
	
	private void saveFile() {
		chooser.setTitle("Save file");
		File choosen = chooser.showDialog(tempStage);
		if (choosen != null)
			stocksLoader.saveStocksData(stocksContainer.getStocks(), choosen.getAbsolutePath());
	}
	
	private void loadFile() {
		chooser.setTitle("Load file");
		File choosen = chooser.showDialog(tempStage);
		if (choosen != null)
			stocksContainer.getStocks().addAll(stocksLoader.loadStocksData(choosen.getAbsolutePath()));
	}
}
