package ru.isu.math.zvereva.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DelController {
    @FXML
    private Button del;

    @FXML
    void delClick(ActionEvent event) {
        Stage stage = (Stage) del.getScene().getWindow();
        stage.close();
    }
}
