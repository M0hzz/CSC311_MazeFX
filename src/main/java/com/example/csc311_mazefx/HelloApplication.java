package com.example.csc311_mazefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        @Override
        public void start(Stage primaryStage) {
            Game game = new Game(primaryStage);
            game.startGame();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}