package ru.isu.math.zvereva.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreateContractController {

    @FXML
    private Button save;

    @FXML
    void saveClick(ActionEvent event) {
        Stage stag = (Stage) save.getScene().getWindow();
        stag.close();
    }


}
