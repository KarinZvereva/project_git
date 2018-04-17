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

public class AccountantController {

    @FXML
    private Button exit;

    @FXML
    private Label date;

    @FXML
    private Button salary;

    @FXML
    private Button income;

    @FXML
    void initialize() {
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'accountant.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'accountant.fxml'.";
        assert salary != null : "fx:id=\"salary\" was not injected: check your FXML file 'accountant.fxml'.";
        assert income != null : "fx:id=\"income\" was not injected: check your FXML file 'accountant.fxml'.";
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
    void incomeClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Accountant/count_income.fxml"));
        stage.setTitle("Count income");
        stage.setScene(new Scene(root, 700, 500));
        stage.show();
    }

    @FXML
    void salaryClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Accountant/count_salary.fxml"));
        stage.setTitle("Count salary");
        stage.setScene(new Scene(root, 700, 500));
        stage.show();
    }
}
