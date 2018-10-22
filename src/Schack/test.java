package Schack;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		ChessBoard chess = new ChessBoard();
		
		Scene scene = new Scene(chess, 8*Square.SIZE, 8*Square.SIZE);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
