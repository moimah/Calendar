package app_main;

import controller.CalendarioController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalendarioApp extends Application {

	private CalendarioController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CalendarioController();
		
		Scene scene = new Scene(controller.getView());
		primaryStage.setResizable(false);
		primaryStage.setTitle("Calendario");
		primaryStage.setScene(scene);		
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
