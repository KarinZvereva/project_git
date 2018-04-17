package ru.isu.math.zvereva.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private TextField usename;


    @FXML
    void buttonClick(ActionEvent event) throws IOException {

        String path = "";
        String title = "Main";


        switch (usename.getText()){
            case "Admin":
                path = "views/Admin/admin.fxml";
                title = "Admin";
                break;
            case "Manager":
                path = "views/Manager/manager.fxml";
                break;
            case "Accountant":
                path = "views/Accountant/accountant.fxml";
                break;
            case "Head":
                path = "views/Head/head.fxml";
                break;
            default:
                path = "views/wrong.fxml";
                title = "Error";
                break;
        }
        //Stage s = (Stage)buttonClick.getScene().getWindow();
        //s.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(path));
        stage.setTitle(title);
        stage.setScene(new Scene(root, 700, 500));
        stage.show();

        Stage stag = (Stage) usename.getScene().getWindow();
        stag.close();


    }
}
