package oop_week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */
public class Testlayout extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button okBtn = new Button("OK");
        Scene scene = new Scene(okBtn,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test JavaFX Layout");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
