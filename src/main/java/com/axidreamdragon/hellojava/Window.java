package com.axidreamdragon.hellojava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Window extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Label label = new Label("Hello JavaFX!");

		Scene scene = new Scene(label, 400, 200);

		stage.setScene(scene);
		stage.setTitle("Hello JavaFX");
		stage.show();
	}
}
