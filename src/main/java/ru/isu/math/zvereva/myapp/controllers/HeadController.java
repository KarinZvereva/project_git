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

public class HeadController {
    @FXML
    private Button exit;

    @FXML
    private Label data;

    @FXML
    private Button conclude;

    @FXML
    private Button change;

    @FXML
    private Button trip;

    @FXML
    void initialize() {
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'head.fxml'.";
        assert conclude != null : "fx:id=\"conclude\" was not injected: check your FXML file 'head.fxml'.";
        assert change != null : "fx:id=\"change\" was not injected: check your FXML file 'head.fxml'.";
        assert trip != null : "fx:id=\"trip\" was not injected: check your FXML file 'head.fxml'.";
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("E dd.MM.yyyy");
        String str = format1.format(d);
        data.setText(""+str+"");

    }

    @FXML
    void  changeClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Head/change_data.fxml"));
        stage.setTitle("Change data");
        stage.setScene(new Scene(root, 700, 600));
        stage.show();
    }

    @FXML
    void concludeClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Head/contract.fxml"));
        stage.setTitle("All trips");
        stage.setScene(new Scene(root, 529, 694));
        stage.show();
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
    void tripClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Head/trips.fxml"));
        stage.setTitle("All trips");
        stage.setScene(new Scene(root, 700, 500));
        stage.show();
    }

}
