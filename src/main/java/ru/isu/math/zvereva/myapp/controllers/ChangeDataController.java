package ru.isu.math.zvereva.myapp.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeDataController {
    @FXML
    void addCustomer(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/Head/addCustomer.fxml"));
        stage.setTitle("Add customer");
        stage.setScene(new Scene(root, 529, 509));
        stage.show();
    }

}
