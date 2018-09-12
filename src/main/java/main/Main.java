package main;



import java.util.ArrayList;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/GUI.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("gxfgh");
		primaryStage.show();
		
		
	}
	
	public static void main (String[] args) {
		launch(args);
		

		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(0,1);
		lista.add(0,2);
		lista.add(0,3);
		lista.add(0,4);
		lista.add(0,5);
		lista.add(0,6);
		lista.add(0,7);

		
		for(int i=0; i<lista.size(); i++) {
			
			System.out.println(lista.get(i));
			
		}
		
		
	}
	
}