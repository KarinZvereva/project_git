package ru.isu.math.zvereva.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddController {
    @FXML
    private Button add;

    @FXML
    void addClick(ActionEvent event) {
        Stage stage = (Stage) add.getScene().getWindow();
        stage.close();
    }
}
