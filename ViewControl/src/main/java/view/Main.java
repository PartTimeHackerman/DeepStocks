package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.StocksLoader;

public class Main extends Application {
	
	private static StocksLoader stocksLoader;
	
	private DataLoaderController dataLoaderController;
	
	public static void main(String[] args) {
		
		stocksLoader = new StocksLoader();
		
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Stock Bot");
		
		primaryStage.setOnCloseRequest(e -> System.exit(0));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("dataLoader.fxml"));
		BorderPane loadPane = loader.load();
		dataLoaderController = loader.getController();
		
		dataLoaderController.initialize(stocksLoader);
		
		Scene scene = new Scene(loadPane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		stocksLoader.loadStocksData();
	}
}
