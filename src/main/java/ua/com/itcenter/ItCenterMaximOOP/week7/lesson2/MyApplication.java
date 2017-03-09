package week7.lesson2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		 stage.setTitle("MyApplication");
		 stage.setScene(stageCreator());
		 stage.show();
		
		
	}
	
	public Scene stageCreator(){
		return null;
	}
	
}
