package ru.isu.math.zvereva.myapp;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    static Stage curStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/main.fxml"));
        curStage = primaryStage;
        primaryStage.setTitle("LOGIN");
        primaryStage.setScene(new Scene(root, 508, 362));
        primaryStage.show();
    }
}
