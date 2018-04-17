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

public class AdminController {

    @FXML
    private Label prof;

    @FXML
    private Label date;

    @FXML
    private Button exit;


    @FXML
    void initialize() {
        assert prof != null : "fx:id=\"prof\" was not injected: check your FXML file 'admin.fxml'.";
        assert date != null : "fx:id=\"data\" was not injected: check your FXML file 'admin.fxml'.";
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("E dd.MM.yyyy");
        String str = format1.format(d);
        date.setText(""+str+"");
    }

    @FXML
    void addClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Admin/add.fxml"));
        stage.setTitle("Add new user");
        stage.setScene(new Scene(root, 410, 505));
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
    void delClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Admin/del.fxml"));
        stage.setTitle("Delete user");
        stage.setScene(new Scene(root, 600, 292));
        stage.show();
    }


}
