package com.example.tikemana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

//        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
//        Scene scene1 = new Scene(fxmlLoader1.load());
//        stage.setScene(scene1);
//        stage.show();
    }

}
