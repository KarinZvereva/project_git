package ru.isu.math.zvereva.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManagerController {
    @FXML
    private Button exit;

    @FXML
    private Button cost;

    @FXML
    private Button price;

    @FXML
    private Label date;

    @FXML
    void initialize() {
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'manager.fxml'.";
        assert cost != null : "fx:id=\"cost\" was not injected: check your FXML file 'manager.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'manager.fxml'.";
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("E dd.MM.yyyy");
        String str = format1.format(d);
        date.setText(""+str+"");
    }

    @FXML
    void exitClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/main.fxml"));
        stage.setTitle("LOGIN");
        stage.setScene(new Scene(root, 508, 362));
        stage.show();
        Stage stag = (Stage) exit.getScene().getWindow();
        stag.close();
    }

    @FXML
    void costClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Manager/cost_trips.fxml"));
        stage.setTitle("Cost of trips");
        stage.setScene(new Scene(root, 600, 606));
        stage.show();
    }

    @FXML
    void priceClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Manager/price.fxml"));
        stage.setTitle("Count price");
        stage.setScene(new Scene(root, 700, 605));
        stage.show();
    }
}
