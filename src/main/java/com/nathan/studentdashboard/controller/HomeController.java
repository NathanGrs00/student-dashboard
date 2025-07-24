package com.nathan.studentdashboard.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private GridPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        var cssResource = getClass().getResource("/com/nathan/studentdashboard/css/home.css");
        if (cssResource != null) {
            root.getStylesheets().add(cssResource.toExternalForm());
        }
    }
}
